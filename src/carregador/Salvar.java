package carregador;
import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import apliques.Quadro2;

public class Salvar {
	
	public Salvar(Quadro2 quadro){
		
		try{ 
			JFileChooser salvar = new JFileChooser();
			salvar.setAcceptAllFileFilterUsed(false);
			File desktop = new File("C:\\Users\\debito.debito-PC\\Desktop");
			salvar.setCurrentDirectory(desktop);			
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos .txt", "txt");
	        salvar.setFileFilter(filtro);
		int salvado = salvar.showDialog(quadro, "Salvar");
			if(salvado == 0){
				String arquivo = salvar.getSelectedFile().getPath();
				salvando(arquivo+".txt");
			}
		}
	
	catch(IOException exe) {}
	
	}
	
	  public void salvando(String arquivo)  throws IOException {
	      PrintWriter out = new PrintWriter(
	                                new BufferedWriter(
	                                        new FileWriter(arquivo)));
	      
	    for(int i = 0; i<Quadro2.getFigs().size(); i++)
	    	Quadro2.getFigs().get(i).persistir(out);
	    
	    out.println();
	    out.close();
	    
	  }

}
