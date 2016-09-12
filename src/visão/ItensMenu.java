package visão;

import java.awt.event.ActionListener;

import javax.swing.*;

public class ItensMenu {
	
	public ItensMenu(JMenuBar item, ActionListener t){
	
		adicionarItens(item, "Salvar", "SALVAR", t);

		adicionarItens(item, "Salvar Como...", "SALVAR_COMO", t);
		
		adicionarItens(item, "Carregar", "CARREGAR", t);
		
		adicionarItens(item, "Sair", "SAIR", t);

	}

	public void adicionarItens(JMenuBar arquivo, String nomeItem, String acaoItem, ActionListener t){
	
		JMenuItem item = new JMenuItem(nomeItem);
		JMenuBar menu = new JMenuBar();
		menu.add(item);
		
		item.setActionCommand(acaoItem);
		item.addActionListener(t);
		
	}
}
