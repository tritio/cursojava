package principal;

import java.util.Scanner;

public class Presupuesto {

	public static void main(String[] args) {
		// Dado los datos de coches, se le pedirá al cliente cuál es su presupuesto
		// y el programa le indicará los coches a los que puede optar
		
		var coches = new String[] {"volvo-19500", "seat-21000","Audi-40000", 
				"Toyota-14000", "Renault-15000", "mercedes-41500"};
		
		double presupuesto;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu presupuesto");
		presupuesto=sc.nextInt();
		int aux;
		
		/* Forma habitual:
		 * 
		 * for(int i = 0; i < coches.length; i++) { aux = coches[i].indexOf('-');
		 * 
		 * double puedo_comprar = Double.parseDouble(coches[i].substring(aux+1,
		 * coches[i].length())); String coche =(coches[i].substring(0, aux));
		 * if(puedo_comprar <= presupuesto) {
		 * System.out.println("Con el presupuesto de " + presupuesto +
		 * " €, puedes comprar el coche: " + coche + " que cuesta: " + puedo_comprar); }
		 * }
		 */	
		
		for(var coche:coches) {
			aux = coche.indexOf('-');
			
			double puedo_comprar = Double.parseDouble(coche.substring(aux+1, coche.length()));
			String vehiculo =(coche.substring(0, aux));			
			if(puedo_comprar <= presupuesto) {
				System.out.println("Con el presupuesto de " + presupuesto + 
						 " €, puedes comprar el coche: " + vehiculo + " que cuesta: " + puedo_comprar);
			}			
		}	

	}

}
