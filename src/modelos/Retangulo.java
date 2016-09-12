package modelos;
import static java.lang.Math.*;

import java.io.PrintWriter;

import Interface.*;

public class Retangulo implements Persistivel{
	
  private Ponto p1, p2;
  
  protected Retangulo(Ponto a, Ponto b) {
    this.p1 = a;
    this.p2 = b;
  }
  
  protected int x0() {
    if (p1.getX() < p2.getX())
    	return p1.getX();
    
    return p2.getX();
  }
  
  protected int y0() {
    if (p1.getY() < p2.getY()) 
    	return p1.getY();
    
    return p2.getY();
  }

  protected int largura() {
    return abs(p1.getX() - p2.getX());
  }
  
  protected int altura() {
   return abs(p1.getY() - p2.getY());
  }

  public void persistir(PrintWriter out) {
	    out.println("RETANGULO");
		  out.println(""+p1.getX());
		  out.println(""+p1.getY());
		  out.println(""+p2.getX());
		  out.println(""+p2.getY());
	  }
}
