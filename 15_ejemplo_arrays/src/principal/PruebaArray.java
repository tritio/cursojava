package principal;

public class PruebaArray {

	public static void main(String[] args) {
		
		int [] notas = {4, 5, 3, 6, 8};
		// crear un programa que sume un punto a cada nota
		for (int i = 0; i < notas.length; i++) {
			 notas[i]++;
			// notas[i]+=1;			
		}
		for (int n:notas) {   // equivalente a for each
			System.out.println(n);
		}
		
	}

}
