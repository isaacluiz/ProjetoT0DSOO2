package visão;
import modelos.Oval;
import Interface.Fig;
import apliques.Quadro;
import modelos.Ponto;
import  java.awt.*;

public class OvalFig extends Oval implements Fig {
	
	Quadro quadro;
	 Color cor;
	 
	  public OvalFig(Ponto p1, int raio1, int raio2, Quadro quadro, Color cor)  {
		    super(p1, raio1, raio2);
		    this.quadro = quadro;
		    this.cor = cor;
	  }
		  
		  public void reproduzir(Graphics g) {
			  g.setColor(this.cor);
			    g.drawOval((this.getA().getX() - this.getRaioAltura()), (this.getA().getY() - this.getRaioLargura()), (2 * this.getRaioAltura()), (2 * this.getRaioLargura()));
			  }

	}