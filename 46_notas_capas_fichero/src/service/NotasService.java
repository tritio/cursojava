package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class NotasService {
	String ruta = "c:\\miTemporal\\notas.txt";
	
	public void borrarNotas() {
		File file = new File(ruta);
		file.delete();
	}
	
	public void agregarNota(double nota) {
		
		try (FileOutputStream fos = new FileOutputStream(ruta, true);
				PrintStream out = new PrintStream(fos)){	
			out.println(nota);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public double calcularMedia() {		
		double media = 0;
		int contador = 0;

		try(FileReader fr = new FileReader(ruta); BufferedReader bf = new BufferedReader(fr)) {
			String linea = bf.readLine();
			while(linea!=null) {
				media+=Double.parseDouble(linea);
				linea = bf.readLine();
				contador++;
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return contador > 0 ? media/contador : 0;
			
	}
	
	public double max() {
		double mayor=0;
		try(FileReader fr = new FileReader(ruta); BufferedReader bf = new BufferedReader(fr)) {
			String linea = bf.readLine();
			while(linea!=null) {
				if(mayor < Double.parseDouble(linea)) {
					mayor = Double.parseDouble(linea);
				}
				linea = bf.readLine();
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return mayor;		
	}
	
	public double min() {
		double menor = 0;
		try(FileReader fr = new FileReader(ruta); BufferedReader bf = new BufferedReader(fr)) {
			String linea = bf.readLine();
			menor = Double.parseDouble(linea);
			while(linea!=null) {
				if(menor > Double.parseDouble(linea)) {
					menor = Double.parseDouble(linea);
				}
				linea = bf.readLine();
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return menor;		
	}
	
	public ArrayList<Double> obtenerNotas() {
		
		ArrayList<Double> notas = new ArrayList<>();
		try(FileReader fr = new FileReader(ruta); BufferedReader bf = new BufferedReader(fr)) {
			String linea = bf.readLine();
			while(linea!=null) {
				notas.add(Double.parseDouble(linea));
				linea = bf.readLine();
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return notas;
	}
}
