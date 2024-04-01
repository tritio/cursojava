package principal;

import java.util.Arrays;
import java.util.Random;

public class Primitiva {

	public static void main(String[] args) {
		// realizar un programa que genere una combinación de la lotería 
		// primitiva seis números aleatorios del 1 al 49 ordenados de menor 
		// a mayor y que no se repitan.
		
		int [] generados = new int [6];
		int numero, totales = 0;
		
		
		
		do {				
			numero = (int)(Math.random()*49+1); 
			// if(repetido(generados, numero, totales)==false) {
			if(!repetido(generados, numero, totales)) {
				generados[totales]=numero;
				totales++;
			}
			
		}while(totales < 6);
		
		Arrays.sort(generados); // ordena array de menor a mayor
		
		for(int n:generados) {
			System.out.print(n + ",");
		}

	}
	
	static boolean repetido(int [] generados, int numero, int totales) {
		boolean resultado = false;
		for (int i = 0; i < totales; i++ ) {
			if(generados[i] == numero) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}

}
