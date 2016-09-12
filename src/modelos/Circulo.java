package modelos;
import Interface.*;
import java.io.PrintWriter;

public class Circulo extends Ponto implements Persistivel{
	
	private int raio;
	private Ponto a;
	
	protected Circulo(Ponto p1, int raio){
	  this.a = p1;
	  this.raio = raio;
  }

	public int getRaio() {
		return raio;
	}

	public Ponto getA() {
		return a;
	}

	  public void persistir(PrintWriter out) {
		    out.println("CIRCULO");
		    out.println(""+a.getX());
		    out.println(""+a.getY());
		    out.println(""+this.raio);
		  }
	
}