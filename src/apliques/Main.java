package apliques;
import java.io.*;
import javax.swing.JMenuBar;

import vis�o.*;
import editores.SelectEditor;
import vis�o.CriarGUI;

class Main {
	
	public static void main(String[] pars) {
		
		CriarGUI interacao = new CriarGUI();

		new BotoesEditores(interacao.getEditores(), new SelectEditor(interacao.getQuadro()));
		
	}

}//