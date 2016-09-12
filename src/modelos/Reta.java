package modelos;

import java.io.PrintWriter;

import Interface.Persistivel;

public class Reta extends Ponto implements Persistivel{
	
	protected Ponto p1, p2;
	
	protected Reta(Ponto a, Ponto b){
		this.p1 = a;
		this.p2 = b;
	}

	public Ponto getP2() {
		return p2;
	}

	public Ponto getP1() {
		return p1;
	}

	  public void persistir(PrintWriter out) {
		    out.println("RETA");
			  out.println(""+p1.getX());
			  out.println(""+p1.getY());
			  out.println(""+p2.getX());
			  out.println(""+p2.getY());
		  }
}
