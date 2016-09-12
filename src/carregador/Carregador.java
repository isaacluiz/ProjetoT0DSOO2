package carregador;

import java.io.*;

public class Carregador {

	public void carregar(BufferedReader in, apliques.Quadro quadro)
			throws IOException {
		String s = null;

		s = in.readLine();

		while (s.length() > 0) {

			if (s.equals("RETANGULO")) {
				new CarregarRetangulo(in, quadro);
			}

			if (s.equals("CIRCULO")) {
				new CarregarCirculo(in, quadro);
			}

			if (s.equals("RETA")) {
				new CarregarReta(in, quadro);
			}

			if (s.equals("OVAL")) {
				new CarregarOval(in, quadro);
			}

			if (s.equals("TEXTO")) {
				new CarregarTexto(in, quadro);
			}

			// case "POLIGONO" : carregarPoligono(in, quadro);
			// break;

			s = in.readLine();

			if (s == null) {
				s = " ";
			}

		}
	}//
}