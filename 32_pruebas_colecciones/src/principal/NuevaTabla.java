package principal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class NuevaTabla {

	public static void main(String[] args) {
		HashMap<String, Integer> ciudades = new HashMap<String, Integer>();
		ciudades.put("Madrid", 5000200);
		ciudades.put("Zaragoza", 3333200);
		ciudades.put("Caceres", 4700000);
		ciudades.put("Caceres", 100000);
		// System.out.println(ciudades.get("Caceres"));
		
		// recorrer las claves de un HashMap
		Set<String> claves = ciudades.keySet();
		for(String n:claves) {
			System.out.println(n);
		}
		
		// recorrer los valores de un HashMap()
		
		Collection<Integer> valores = ciudades.values();
		for(Integer n:valores) {
			System.out.println(n);
		}
		
	}

}
