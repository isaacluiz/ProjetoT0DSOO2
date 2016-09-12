package editores;
import java.awt.*;
import apliques.Quadro;
import Interface.Fig;
import java.awt.event.*;
import modelos.Ponto;
import visão.RetaFig;

public class EditorReta implements MouseListener{
 private Quadro quadro;
  Fig fig;
  Color cor;
  private int q = 0;
  private int x1, y1;
  
  public EditorReta(Quadro quadro, Color cor_atual)  {
	  this.cor = cor_atual;
	  this.quadro = quadro;
  }
   
  public void mouseClicked(MouseEvent e) {  
	  int x, y;
	  x = e.getX();
	  y = e.getY();
	  
	  	if (this.q == 0) {
	  		x1 = x;   y1 = y;
	  		this.quadro.addFig(fig = new RetaFig(new Ponto(x, y), new Ponto(x, y), this.quadro, this.cor));
	  		this.q = 1;
	  	}
	  	
	  	else if (this.q == 1) {
	  		this.quadro.addFig(new RetaFig(new Ponto(x1,y1), new Ponto(x, y), this.quadro, this.cor));
	  		quadro.removeFig(fig);
	  		this.q = 0;
	  	}
  
  this.quadro.repaint();
  
}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  
}//
