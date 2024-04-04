package principal;

import java.util.HashSet;

public class PruebaConjunto {

	public static void main(String[] args) {
		// HashSet
		
		HashSet<Double> nums = new HashSet<Double>();
		nums.add(30.7); // es un objeto de la clase Double lo que estamos agregando
		nums.add(80.0);
		nums.add(21.3);
		
		for(Double s:nums) {
			s=s+1;			 // Double es inmutable, genera un nuevo objeto sumado
			System.out.println(s);
		}
		
		for(Double s:nums) {
			System.out.println(s);
		}
		

	}

}
