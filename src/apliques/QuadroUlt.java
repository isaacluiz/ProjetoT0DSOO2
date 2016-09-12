package apliques;

import Interface.Fig;
import  poo.edgraf.reprodutor.gen.*;

class QuadroUlt extends Quadro {
  QuadroUlt(int lar, int alt) {
    super(lar,alt);
  }
  
  public void addFig(Fig fig) {
    super.addFig(fig);
    ult = fig;
  }
  
  Fig ult;
  public void apagarUlt() {
    this.removeFig(ult);
  }
  
}//
