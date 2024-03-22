package principal;

import java.util.Scanner;

public class ComprobarPresupuesto {

	public static void main(String[] args) {
		// dado una serie de precios de coches, se le pedirá al cliente cuál es su presupuesto
		// y el programa indicará a cuántos coches puede optar
		
		double [] precios = {12_500, 21_000, 23_450, 18_000, 24_500, 16_400};
		int contador = 0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Cuál es tu presupuesto?: ");
		double presupuesto = sc.nextDouble();	
		
		for (double precio:precios) {
			if(precio < presupuesto) {
				contador++;
			}
		}
		
		System.out.println("Puedes optar a un total de " + contador + " coches.");
		sc.close();
	}

}
