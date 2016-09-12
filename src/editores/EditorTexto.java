package editores;
import apliques.Quadro;	
import  java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

import modelos.Ponto;
import visão.TextoFig;

public class EditorTexto implements MouseListener{
 private Quadro quadro;
  Color cor;
  Font fonte;
  
  public EditorTexto(Quadro quadro, Color cor_atual, Font fonte)  {
	  this.cor = cor_atual;
	  this.quadro = quadro;
	  this.fonte = fonte;
  }
   
  public void mouseClicked(MouseEvent e) {  
	  int x, y;
	  x = e.getX();
	  y = e.getY();
	  String s = JOptionPane.showInputDialog(null, "Digite seu texto aqui:");
	  	this.quadro.addFig(new TextoFig(new Ponto(x, y), s, this.quadro, this.cor, this.fonte));
	 
  this.quadro.repaint();
  
}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  
}//
