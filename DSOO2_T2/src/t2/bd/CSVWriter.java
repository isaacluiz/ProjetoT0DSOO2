package t2.bd;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import modelos.Figura;

public class CSVWriter {

	public static void writeFiguras(Figura figura) throws IOException {
		PrintWriter writer = new PrintWriter(new File(CSVUtils.FIGURAS));
		CSVUtils.writeLine(writer, Arrays.asList("Nome FIgura", "Quantidade de pontos", "Pontos"));
		
	}

}
