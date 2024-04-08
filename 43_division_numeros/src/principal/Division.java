package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n1, n2, div;
		try {
			System.out.println("introduce un número: ");
			n1 = sc.nextInt();
			System.out.println("introduce otro número: ");
			n2 = sc.nextInt();
			div = n1/n2;
			System.out.println("la división es: " + div);
		}
		catch(InputMismatchException ex) {
			System.out.println("Debe ser un número");
		}
		catch(ArithmeticException ex) {
			System.out.println("la división entre 0 no es válida");
		}
//		catch(InputMismatchException|ArithmeticException ex) {
//			System.out.println("esto es un multicach");
//		}

	}

}
