package principal;

import java.util.Scanner;

public class InvertirTexto {
	public static void main(String[] args) {
	
		// solicita la introducción de un texto y lo muestra invertido
		// tendremos un método invertir que recibe un string y lo devuelve invertido
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el texto");
		String texto =sc.nextLine();
		
		String resultado = invertir(texto);
		System.out.println(resultado);
		
		sc.close();
	}
	
	static String invertir(String texto) {
		StringBuilder cadena = new StringBuilder("");
		for(int i = texto.length()-1; i >= 0 ; i--) {
			cadena.append(texto.charAt(i));
		}
		return cadena.toString();
		
	}
	
}
