package carregador;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import modelos.Ponto;
import visão.RetanguloFig;


public class CarregarRetangulo {
	
	Color cor_atual = null;
	
	public CarregarRetangulo(BufferedReader in, apliques.Quadro quadro) throws IOException {
		  int
			      x1 = Integer.parseInt(in.readLine()),
			      y1 = Integer.parseInt(in.readLine()),
			      x2 = Integer.parseInt(in.readLine()),
			      y2 = Integer.parseInt(in.readLine());
			    

			quadro.addFig(new RetanguloFig(new Ponto(x1,y1), new Ponto(x2,y2), quadro, cor_atual));
			  }
	}
	
