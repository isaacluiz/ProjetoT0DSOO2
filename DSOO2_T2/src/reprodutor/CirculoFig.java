package reprodutor;
import modelos.*;
import Interface.*;
import apliques.Quadro;

import  java.awt.*;

public class CirculoFig extends Circulo implements Fig {
	
	 Quadro quadro;
	 Color cor;
	 
	  public CirculoFig(Ponto p1, int raio, Quadro quadro2, Color cor)  {
	    super(p1, raio);
	    this.quadro = quadro2;
	    this.cor = cor;
	  }
	  
	  public void reproduzir(Graphics g) {
		  g.setColor(cor);
		  g.drawOval((this.getA().getX() - this.getRaio()), (this.getA().getY() - this.getRaio()), (2 * this.getRaio()), (2 * this.getRaio()));
		  }

}
