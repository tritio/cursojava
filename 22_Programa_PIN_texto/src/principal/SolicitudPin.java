package principal;

import java.util.Scanner;

public class SolicitudPin {

	public static void main(String[] args) {
		// programa que solicite la introducción de un pin.
		// Si es correcto muestra un mensaje y el programa termina.
		// Si es incorrecto, informa de ello al usuario y lo vuelve a solicitar.
		// Si falla tres veces, muestra mensaje de error y sale del programa.
		
		int intentos = 0;
		String pin;
		final String PIN_VALIDO = "1234"; 
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduce pin ");
			pin=sc.nextLine();
			if (pin.equals(PIN_VALIDO)) {
				System.out.println("PIN CORRECTO");
				break;	
			} else {
				intentos++;
				System.out.println("PIN incorrecto");
				if(intentos == 3) {
					System.out.println("Fallaste tres veces. ");
				}
			}						
		}while(intentos < 3);
		
		
		

	}

}
