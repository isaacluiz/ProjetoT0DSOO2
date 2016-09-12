package editores;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

import Interface.Fig;
import carregador.Carregar;
import carregador.Salvar;

public class SelectEditor implements ActionListener {

	private Quadro3 quadro;
	private Font fonte_atual = new Font("TIMES NEW ROMAN", 1, 16);
	private Color cor_atual = Color.BLACK;
	private MouseListener editorAtual = null;
	Fig ultimaFigura;
	private String comando;

	public SelectEditor(Quadro3 quadro) {
		this.quadro = quadro;

	}

	public void actionPerformed(ActionEvent e) {
		quadro.removeMouseListener(editorAtual);
		comando = e.getActionCommand();
		if (comando.equals("UNDO")) {
			quadro.undo();
			quadro.repaint();
		}
		if (comando.equals("REDO")) {
			quadro.redo();
			quadro.repaint();
		} else if (comando.equals("SALVAR_COMO")) {

		}

		else if (comando.equals("SALVAR")) {
			new Salvar(quadro);
		}

		else if (comando.equals("CARREGAR")) {
			new Carregar(quadro);
		}

		else if (comando.equals("SAIR")) {
			String rsp = JOptionPane.showInputDialog("Você deseja sair?[s/n]");
			if (rsp.equals("s"))
				System.exit(0);
		}

		else if (comando.equals("COR")) {
			cor_atual = JColorChooser.showDialog(quadro,
					"Escolha a cor do lápis", Color.WHITE);
		}

		else if (comando.equals("RETANGULO")) {
			quadro.addMouseListener(editorAtual = new EditorRetangulo(quadro,
					cor_atual));
		}

		else if (comando.equals("CIRCULO")) {
			quadro.addMouseListener(editorAtual = new EditorCirculo(quadro,
					cor_atual));
		}

		else if (comando.equals("RETA")) {
			quadro.addMouseListener(editorAtual = new EditorReta(quadro,
					cor_atual));
		}

		else if (comando.equals("OVAL")) {
			quadro.addMouseListener(editorAtual = new EditorOval(quadro,
					cor_atual));
		}

		else if (comando.equals("TEXTO")) {
			quadro.addMouseListener(editorAtual = new EditorTexto(quadro,
					cor_atual, fonte_atual));
		}

		else if (comando.equals("POLIGONO")) {
			quadro.addMouseListener(editorAtual = new EditorPoligono(quadro,
					cor_atual));
		}

	}

}
