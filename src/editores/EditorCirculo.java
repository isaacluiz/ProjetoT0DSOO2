package editores;
import Interface.Fig;
import apliques.Quadro;	
import  java.awt.*;
import java.awt.event.*;
import modelos.Ponto;
import visão.CirculoFig;

public class EditorCirculo implements MouseListener {
  
  private Quadro quadro;
  Fig fig;
  Color cor;
  private int q = 0;
  private int x1, y1;
  
  	public EditorCirculo(Quadro quadro, Color cor_atual)  {
  		this.cor = cor_atual;
  		this.quadro = quadro;
  }
   
  	private void prox(){
  		this.q = (this.q + 1)%2;
  }
    
  public void mouseClicked(MouseEvent e) {  
	  int x, y;
	  x = e.getX();
	  y = e.getY();
	  
	  	if (this.q == 0) {
	  		x1 = x;   y1 = y;
	  		this.quadro.addFig((fig = new CirculoFig(new Ponto(x, y), 5, this.quadro, this.cor)));
	  	}
	  	
	  	if (this.q == 1) {
	  		int raio = (int)Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2));
	  		this.quadro.addFig(new CirculoFig(new Ponto(x1,y1), raio, this.quadro, this.cor));
	  		quadro.removeFig(fig);
	  	}
  
  this.prox();
  this.quadro.repaint();
  
}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  
}
