package principal;

import java.util.Arrays;

public class Ordenacion {

	public static void main(String[] args) {

		int [] edades = {19, 23, 18, 29, 21, 76, 54, 43, 20, 32};
		int aux;
		
		for (int i = 0; i < edades.length; i++) {
			for(int j = i+1; j < edades.length; j++) {
				if(edades[j]<edades[i]) {
					aux = edades[j];					
					edades[j] = edades[i];
					edades[i] = aux;
				}	
			}						
		}
		
		// en lugar del doble for se podría haber hecho esto: Arrays.sort(edades);
		
		for (int edad:edades) {
			System.out.print(edad + ", ");
		}
	}

}
