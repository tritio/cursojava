package principal;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SorteoPrimitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] combinacionGanadora;
		int [] combinacionNumerica;
		int aciertos;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce tu combinación (separada por comas): ");
		String combinacion = sc.next();
		
		// elimina duplicados en cadena:
		combinacion = Arrays.stream(combinacion.split(","))
				.distinct()
				.collect(Collectors.joining(","));
		 
		combinacionNumerica = generarCombinacion(combinacion);
		combinacionGanadora = combinacionGanadora();
		aciertos = comprobarGanadores(combinacionNumerica, combinacionGanadora);
		
	
		
		System.out.println(" la combinación ganadora es: " + Arrays.toString(combinacionGanadora));	

		System.out.println(" Tu combinación es: " + Arrays.toString(combinacionNumerica));
	
		System.out.println("Has acertado: " + aciertos + " números");

	}
	
	static int [] generarCombinacion(String comb) {
		String [] nuevoArray = comb.split(",");	
		int [] arrayNumerico = new int[nuevoArray.length];
						
		  for(int i = 0; i < nuevoArray.length; i++) {
			  	arrayNumerico[i] = Integer.parseInt(nuevoArray[i]);				  	
		  }
		  Arrays.sort(arrayNumerico);
		  return arrayNumerico;
	}
	
	static int [] combinacionGanadora() {
		int [] generados = new int [6];
		int numero, totales = 0;
		
		do {				
			numero = (int)(Math.random()*49+1); 			
			if(!repetido(generados, numero, totales)) {
				generados[totales]=numero;
				totales++;
			}
			
		}while(totales < 6);
		
		Arrays.sort(generados); // ordena array de menor a mayor
		
		return generados;
	}
	 
	static int comprobarGanadores(int [] combinacionNumerica, int [] combinacionGanadora) {
		 int aciertos = 0;
		 for (int i = 0; i < combinacionNumerica.length; i++) {
			 for(int j = 0; j < combinacionNumerica.length; j++) {
				 if(combinacionNumerica[i] == combinacionGanadora[j]) {
					 aciertos++;
					 break;
				 }
			 }
		 }		
		 return aciertos;		 
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
