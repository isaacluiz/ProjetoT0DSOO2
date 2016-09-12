package carregador;

import java.io.BufferedReader;
import java.io.IOException;

import modelos.Ponto;
import visão.CirculoFig;
import java.awt.*;

public class CarregarCirculo {
	
	Color cor_atual = null;
	
	public CarregarCirculo(BufferedReader in, apliques.Quadro quadro) throws IOException{
		  int
		      x1 = Integer.parseInt(in.readLine()),
		      y1 = Integer.parseInt(in.readLine()),
		      raio = Integer.parseInt(in.readLine());
		    
		quadro.addFig(new CirculoFig(
				   			new Ponto(x1,y1),
		                        raio, quadro, cor_atual));
		
	}
	


}
