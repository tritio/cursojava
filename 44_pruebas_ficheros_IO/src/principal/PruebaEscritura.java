package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PruebaEscritura {

	public static void main(String[] args) {

		String ruta = "c:\\miTemporal\\dias.txt";
		try {
			PrintStream out = new PrintStream(ruta);
			out.println("viernes");
			out.println("sábado");
			out.println("domingo");
			System.out.println("información añadida al fichero.");
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
