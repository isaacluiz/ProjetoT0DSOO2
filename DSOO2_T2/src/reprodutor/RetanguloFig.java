package reprodutor;
import modelos.Ponto;
import apliques.Quadro;
import Interface.Fig;
import modelos.Retangulo;
import  java.awt.*;

public class RetanguloFig extends Retangulo implements Fig {
  
  Quadro quadro;
  Color cor;
  
  public RetanguloFig(Ponto p1, Ponto p2, Quadro quadro, Color cor)  {
    super(p1,p2);
    this.quadro = quadro;
    this.cor = cor;
  }

  public void reproduzir(Graphics g) {
	  g.setColor(this.cor);
	  g.drawRect(this.x0(), this.y0(), this.largura(), this.altura());
  }
  
}//
