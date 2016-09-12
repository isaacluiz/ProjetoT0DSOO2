package modelos;

import java.io.PrintWriter;

import Interface.Persistivel;

public class Oval extends Ponto implements Persistivel{
	
	private Ponto a;
	private int raioAltura;
	private int raioLargura;

	protected Oval (Ponto p, int raio1, int raio2){
		this.a = p;
		this.raioAltura = raio1;
		this.raioLargura = raio2;
	}

	public Ponto getA() {
		return a;
	}

	public int getRaioAltura(){
		return raioAltura;
	}
	
	public int getRaioLargura(){
		return raioLargura;
	}
	
	  public void persistir(PrintWriter out) {
		  out.println("OVAL");
		  out.println(""+a.getX());
		  out.println(""+a.getY());
		  out.println(""+this.raioAltura);
		  out.println(""+this.raioLargura);
		  }
}
