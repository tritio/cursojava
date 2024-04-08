package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebaLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta ="c:\\miTemporal\\dias.txt";
		try(FileReader fr = new FileReader(ruta); BufferedReader bf = new BufferedReader(fr)) {
			String linea = bf.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea = bf.readLine();
			}
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
