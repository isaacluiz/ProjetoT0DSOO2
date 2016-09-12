package editores;
import Interface.Fig;
import apliques.Quadro;
import  java.awt.*;
import java.awt.event.*;

import modelos.Ponto;
import visão.OvalFig;

public class EditorOval implements MouseListener {
  
  private Quadro quadro;
  Fig fig, fig1;
  Color cor;
  private int q = 0;
  int raioLargura = 0, raioAltura = 0;
  private int x1, y1;
  
  public EditorOval(Quadro quadro, Color cor_atual)  {
	  this.cor = cor_atual;
	  this.quadro = quadro;
  }
   
  public void mouseClicked(MouseEvent e) {  
      int x, y; 
	  x = e.getX();
	  y = e.getY();

	  	if (this.q == 0) {
	  		x1 = x;   y1 = y;
	  		this.quadro.addFig(fig = new OvalFig(new Ponto(x, y), 5, 2, this.quadro, this.cor));
            this.q = 1;
            
	  	} else if (this.q == 1) {
	  			raioAltura = (int)Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2)) ;
	  			this.quadro.addFig(fig1 = new OvalFig(new Ponto(x, y), 5, 2, this.quadro, this.cor));      	  			
	  			this.q = 2;        
	  	
        } else if (this.q == 2) {
	  	        raioLargura =(int)Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2));
                this.quadro.addFig(new OvalFig(new Ponto(x1,y1), raioLargura, raioAltura, this.quadro, this.cor));
                quadro.removeFig(fig);
                quadro.removeFig(fig1);
                this.q=0;    
	  	}
	  	
	  this.quadro.repaint();
  
}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  
}
