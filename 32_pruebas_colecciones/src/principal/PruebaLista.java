package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<String> cadenas = new ArrayList<>();		
		ArrayList<Integer> numeros = new ArrayList<>();		
		var decimales = new ArrayList<Double>(); // var dice que es de cualquier tipo
		
		System.out.println(cadenas.size());
		cadenas.add("lunes");
		cadenas.add("martes");
		cadenas.add(0, "miércoles");
		// cadenas.add(7, "jueves"); posición no existente, da error
		System.out.println(cadenas);
		System.out.println(cadenas.get(2));
		numeros.add(35);
		numeros.set(0, 67);
		System.out.println(numeros);
		
		cadenas.remove(1);
		System.out.println(cadenas);
		
		System.out.println(cadenas.contains("martes"));  // booleano true o false
		
		if(!cadenas.contains("martes")) {
			cadenas.add("martes");
		}
		
		for(int i =0; i<cadenas.size(); i++) {
			System.out.println(cadenas.get(i));
		}
		
		for(String i:cadenas) {
			System.out.println(i);
		}

	}

}
