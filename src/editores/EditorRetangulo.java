package editores;

import Interface.Fig;
import apliques.Quadro;	
import  java.awt.*;
import java.awt.event.*;
import modelos.Ponto;
import visão.RetanguloFig;

public class EditorRetangulo implements MouseListener {
  
  private Quadro quadro;
  private Color color;
  
  public EditorRetangulo(Quadro quadro, Color cor_atual)  {
    this.quadro = quadro;
    this.color = cor_atual;
  }
  
  private int q = 0;
  private void prox(){
    q = (q + 1)%2;
  }
  
  private int x1,y1;
  Fig fig;
  public void mouseClicked(MouseEvent e) {
    int x,y;
    x = e.getX();
    y = e.getY();
    	
    	if (q == 0) {
    		x1 = x;   y1 = y;
    		this.quadro.addFig(fig = new RetanguloFig(new Ponto(x1,y1), new Ponto(x1+3,y1-3), this.quadro, this.color));
    
    	} if (q == 1) {
    		this.quadro.addFig(new RetanguloFig(new Ponto(x1,y1), new Ponto(x,y), this.quadro, this.color));
    		quadro.removeFig(fig);
    }
    	
    this.prox();
    this.quadro.repaint();
    
  }

  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  
}//
