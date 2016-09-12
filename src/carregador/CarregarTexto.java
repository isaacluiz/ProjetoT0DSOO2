package carregador;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import modelos.Ponto;
import visão.TextoFig;

public class CarregarTexto {
	
	   Color cor_atual = null;
	   Font fonte = null;
	  
	   public CarregarTexto(BufferedReader in, apliques.Quadro quadro) throws IOException {
		   
		    int x1 = Integer.parseInt(in.readLine()),
		    	y1 = Integer.parseInt(in.readLine());
		      String s = in.readLine();
		     
		quadro.addFig(new TextoFig(new Ponto(x1,y1), s, quadro, cor_atual, fonte));
		  }
	  
}
