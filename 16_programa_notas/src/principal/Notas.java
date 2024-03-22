package principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// realizar un programa que solicita una a una la introducción de seis notas (double)
		// que serán guardadas en un array.
		// El programa mostrará los siguientes datos:
		// Nota media, nota más alta, aprobados(cada nota que sea un aprobado)
		
		double [] notas = new double[6];
		double media = 0; 
		double suma = 0;
		double nota_mas_alta = 0;
		
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Introduce la nota: ");
			notas[i]=sc.nextDouble();			
		}		
		
		for(double n:notas) {
			// MEDIA
			suma +=n;
			media = suma / notas.length;
			if(nota_mas_alta < n) {
				nota_mas_alta = n;				
			}
			if (n >= 5) {
				System.out.println("Un aprobado: " + n);
			}
			
		}			
		
		System.out.println("La nota media es: " + media);
		System.out.println("La nota más alta es: " + nota_mas_alta);
		sc.close();
	}

}
