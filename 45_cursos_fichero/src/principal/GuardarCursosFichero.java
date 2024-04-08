package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class GuardarCursosFichero {

	public static void main(String[] args) {
		String [] cursos = {
				"java básico",
				"Python para principiantes",
				"Java EE",
				"Javascript en Front",
				"POO en Java", 
				"Python y Django",
				"Desarrollo web con ASP.NET",
				"Aplicaciones web con Python"
			};
		
		// solicitamos por teclado la introducción de un nombre y guadaremos en un fichero todos los 
		// cursos que contengan ese nombre
			
		String ruta ="c:\\miTemporal\\libros.txt";
		Scanner sc = new Scanner(System.in);
		System.out.println("Palabra a buscar: ");
		String palabra = sc.nextLine();
		guardarCursos(palabra, cursos);
		
	}
	
	static void guardarCursos(String palabra, String [] cursos) {
		String ruta ="c:\\miTemporal\\libros.txt";
		try (PrintStream out = new PrintStream(ruta)){
			for(String c:cursos) {
				if(c.contains(palabra)) {
					out.println(c);
				}
			}		
			System.out.println("información añadida al fichero.");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
 
}


