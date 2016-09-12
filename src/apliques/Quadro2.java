package apliques;
import java.util.*;
import java.io.*;

import Interface.*;

public class Quadro2 extends QuadroUlt {
  public Quadro2(int lar, int alt) {
    super(lar,alt);
  }

  private static ArrayList<Persistivel> figs = new ArrayList<Persistivel>();
  
  public void addFig(Fig fig) {
    super.addFig(fig);
    figs.add(fig);
  }
  
  public void removeFig(Fig fig) {
    super.removeFig(fig);
    figs.remove(fig);
  }

  public static ArrayList<Persistivel> getFigs() {
	return figs;
  }

}//