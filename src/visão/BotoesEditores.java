package visão;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BotoesEditores {

	public BotoesEditores (JToolBar editores, ActionListener t){
		
		adicionarBotoes(editores, "Retangulo", "RETANGULO", t);

		adicionarBotoes(editores, "Circulo", "CIRCULO", t);

		adicionarBotoes(editores, "Reta", "RETA", t);

		adicionarBotoes(editores, "Oval", "OVAL", t);
		
		adicionarBotoes(editores, "Poligono", "POLIGONO", t);
		
		adicionarBotoes(editores, "Texto", "TEXTO", t);
		
		adicionarBotoes(editores, "Cor", "COR", t);
		
		adicionarBotoes(editores, "Salvar", "SALVAR", t);

		adicionarBotoes(editores, "Salvar Como...", "SALVAR_COMO", t);
		
		adicionarBotoes(editores, "Carregar", "CARREGAR", t);
		
		adicionarBotoes(editores, "Sair", "SAIR", t);

	}
	
	public void adicionarBotoes(JToolBar editor, String nomeBotao, String acaoBotao, ActionListener t){
		JButton criarBotoes = new JButton(nomeBotao);
		editor.add(criarBotoes);
		criarBotoes.setActionCommand(acaoBotao);
		criarBotoes.addActionListener(t);
		
	}
	
}
