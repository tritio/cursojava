package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNotas {

	public static void main(String[] args) {
//		Realizar un programa para solicitar al usuario las notas de 
//		un grupo de alumnos. Al iniciarse el programa, se le pide al usuario
//		que introduzca una nota y esta se guardará. Después, se le pregunta 
//		si quiere introducir una nueva nota, si dice que sí, se le pide otra 
//		nota y así sucesivamente hasta que diga que no. Cuando se hayan guardado 
//		todas las notas, el programa mostrará los siguientes datos: 
//		-Nota media -Aprobados -Nota más alta 
		
		double media = 0; 
		double suma = 0;
		double nota_mas_alta = 0;
		int aprobados = 0;
		String respuesta;
		
		Scanner sc=new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		
		String introducir = "";
		ArrayList<Double> notas = new ArrayList<>();
		
					
			do {
				System.out.println("Introduce la nota: ");
				// IMPORTANTE, NO SE PUEDE MEZCLAR EN EL MISMO SCANNER NEXTiNT CON NEXTlINE (CON NEXT SÍ SE PODRÍA)
				notas.add(Double.parseDouble(sc.nextLine()));
				System.out.println("¿Desea seguir introduciendo más notas?: (s/n): ");
				respuesta = sc.nextLine();					
			} while(respuesta.equalsIgnoreCase("s"));
			
			
			media = calcularMedia(notas);
			aprobados =  calcularNumeroAprobados(notas);
			nota_mas_alta =  darNotaMasAlta(notas);			

			
			System.out.println("- Número de aprobados: " + aprobados);
			System.out.println("- Nota media: " + media);
			System.out.println("- Nota más alta: " + nota_mas_alta);

	}
	
	static Double calcularMedia(ArrayList<Double> notas) {
		double suma = 0;
		double media = 0;
		for(Double i:notas) {
			suma+=i;			
		}		
		media = suma/notas.size();
		return media;
	}
	
	static int calcularNumeroAprobados(ArrayList<Double> notas) {
		int aprobados = 0;
		for(Double i:notas) {			
			if(i >= 5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
	static double darNotaMasAlta(ArrayList<Double> notas) {
		Double nota_mas_alta = 0.0;
		for(Double i:notas) {
			
			if(nota_mas_alta < i) {
				nota_mas_alta = i;				
			}			
		}
		return nota_mas_alta;
	}

}
