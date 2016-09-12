package visão;

import java.awt.*;

import apliques.Quadro2;
import javax.swing.*;

import editores.Quadro3;
import editores.SelectEditor;

public class CriarGUI {

	static Quadro3 quadro;
	private Container pane;
	private JToolBar editores;
	private JMenuBar arquivo;
	private JMenuBar editor;

	public CriarGUI() {

		JFrame f = new JFrame("Ed-G");
		pane = f.getContentPane();

		pane.add(quadro = new Quadro3(1400, 700));
		f.pack();
		f.setVisible(true);

		editores = new JToolBar();
		getEditores().setLayout(new GridLayout());
		pane.add(editores, BorderLayout.NORTH);

		apagarUlt();
	}

	public Quadro3 getQuadro() {
		return quadro;
	}

	public JToolBar getEditores() {
		return editores;
	}

	public JMenuBar getArquivo() {
		return arquivo;
	}

	static void apagarUlt() {
		quadro.apagarUlt();
		quadro.repaint();
	}

}
