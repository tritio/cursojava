package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PruebaEscrituraAppend {

	public static void main(String[] args) {

		String ruta = "c:\\miTemporal\\dias.txt";
		// SOLUCIÓN CLÁSICA
/*		FileOutputStream fos = null;
//		PrintStream out = null;
//		try {
//			 fos = new FileOutputStream(ruta, true); // true añada sobre lo que ya hay, con false sobreescribe
//			 out = new PrintStream(fos);
//			out.println("lunes");
//			out.println("martes");
//			out.println("miércoles");
//			out.println("jueves");
//			System.out.println("información añadida al fichero.");			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}  finally {  // este bloque se ejecuta siempre, haya no no excepción
//			try {
//				if(fos!=null) {
//					fos.close();
//				}
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} // no sería obligatoria esta línea mientras se cierre el out
//			if(out != null) {
//				out.close();
//			}
//			
		}*/
		// NUEVA FORMA DE TRY MÁS POTENTE. "TRY CON RECURSOS"
		try (FileOutputStream fos = new FileOutputStream(ruta, true);
				PrintStream out = new PrintStream(fos)){
			out.println("lunes");
			out.println("martes");
			out.println("miércoles");
			out.println("jueves");
			out.println("otro día");
			System.out.println("información añadida al fichero.");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}
}
