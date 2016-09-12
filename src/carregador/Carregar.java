package carregador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import apliques.Quadro2;

public class Carregar {

	public Carregar(Quadro2 quadro){
		try{ 
			JFileChooser carregar = new JFileChooser();
			carregar.setAcceptAllFileFilterUsed(false);
			File desktop = new File("C:\\Users\\debito.debito-PC\\Desktop");
			carregar.setCurrentDirectory(desktop);
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		            "Arquivos .txt", "txt");
		        carregar.setFileFilter(filter);
			int aprovado = carregar.showDialog(quadro, "Abrir");
				if(aprovado == 0){
					String carregado = carregar.getSelectedFile().getPath();
					load(carregado, quadro);
				}

		}
		catch(IOException exe) {}
	}
	
	
	  static void load(String narq, Quadro2 outroQuadro) throws IOException {
		    BufferedReader in = new BufferedReader (new FileReader(narq));
		    
		    Carregador carregador = new Carregador();
		    
		    carregador.carregar(in, outroQuadro);
		    
		    outroQuadro.repaint();
		    
		  }
}
