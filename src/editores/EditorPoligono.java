package editores;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import modelos.Ponto;
import visão.RetaFig;
import apliques.Quadro;
import Interface.Fig;

public class EditorPoligono implements MouseListener{
	private Quadro quadro;
	Fig fig;
	Color cor;
	int auxiliar = 0, pontoX, pontoY, pontoInicial;
	private int logicaDeProximoPonto = 0;
	int[] arrayPontosX = new int[100000];
	int[] arrayPontosY = new int[100000];
  
  public EditorPoligono(Quadro quadro, Color cor_atual)  {
	  this.cor = cor_atual;
	  this.quadro = quadro;
  }
   
  private void prox(){
    this.logicaDeProximoPonto = (this.logicaDeProximoPonto + 1) % 2;
  }
    
  public void fillarArray(){
	  Arrays.fill(arrayPontosX, 0);
	  Arrays.fill(arrayPontosY, 0);
  }
  
  public void mouseClicked(MouseEvent e) { 
	  pontoX = e.getX();
	  pontoY = e.getY();
	  
	  	if (this.logicaDeProximoPonto == 0) {
	  		pontoInicial  = auxiliar;
	  		this.arrayPontosX[auxiliar] = pontoX;   this.arrayPontosY[auxiliar] = pontoY;
	  		this.quadro.addFig(fig = new RetaFig(new Ponto(pontoX, pontoY), new Ponto(pontoX, pontoY), this.quadro, this.cor));
	  		 auxiliar++;
	  		 this.prox();
	  	}
	  	
	  	if (this.logicaDeProximoPonto == 1) {
	  		this.arrayPontosX[auxiliar] = pontoX;   this.arrayPontosY[auxiliar] = pontoY;
	  		this.quadro.addFig(new RetaFig(new Ponto(this.arrayPontosX[auxiliar-1],this.arrayPontosY[auxiliar-1]), new Ponto(pontoX, pontoY), this.quadro, this.cor));
	  		quadro.removeFig(fig);
	  		auxiliar++;
	  	}
	  	
	  	if (e.getClickCount() == 2){
	  		this.quadro.addFig(new RetaFig(new Ponto(this.arrayPontosX[pontoInicial], this.arrayPontosY[pontoInicial]), new Ponto(pontoX, pontoY), this.quadro, this.cor));
	  		this.prox();
	  	}
  
  this.quadro.repaint();
  
}
  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
  
}//
