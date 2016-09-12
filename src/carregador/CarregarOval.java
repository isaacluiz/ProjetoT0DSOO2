package carregador;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import modelos.Ponto;
import visão.OvalFig;

public class CarregarOval {

	Color cor_atual = null;
	
	
	 public CarregarOval(BufferedReader in, apliques.Quadro quadro) throws IOException {
		    int
		      x1 = Integer.parseInt(in.readLine()),
		      y1 = Integer.parseInt(in.readLine()),
		      raioAltura = Integer.parseInt(in.readLine()),
		      raioLargura = Integer.parseInt(in.readLine());
		    
		quadro.addFig(new OvalFig(
				   			new Ponto(x1,y1),
		                        raioAltura, raioLargura,
		                        quadro, cor_atual));
		  }
	
}
