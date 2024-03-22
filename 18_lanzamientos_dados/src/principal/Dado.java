package principal;

import java.util.Random;

public class Dado {

	public static void main(String[] args) {
		
		/*
		 * int dado = (int)(Math.random()*6+1); System.out.println(dado);
		 */

		// lanzar el dado muchas veces y después mostrar los porcentajes de veces
		// que ha aparecido cada número
		
		final int LANZAMIENTOS = 100_000;
		double [] contadores = new double [6];
		
		for(int i = 0; i <LANZAMIENTOS; i++) {
			
			// int dado = (int)(Math.random()*6+1); 
			// otra opción usando el objeto RANDOM:
			var rdn = new Random();
			int dado = rdn.nextInt(6)+1;
			
			contadores[dado-1]++;			
			
		}
				
		for(int i = 0; i < contadores.length; i++) {
			System.out.println("El número " + (i+1) + " ha salido un " + (contadores[i]*100)/LANZAMIENTOS + " %");
		}
		
		
		
	}

}
