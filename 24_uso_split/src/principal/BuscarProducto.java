package principal;

import java.util.Scanner;

public class BuscarProducto {

	public static void main(String[] args) {
		
		String cesta = "tomates,patatas,leche, aceite, huevos. vino, pan.patatas,pan , leche, leche";
		// se pide la introducción de un producto y el programa mostrará su stock
		
		Scanner sc = new Scanner(System.in);
		
		String producto;
		int stock = 0;
	//	String [] productos = cesta.split(",");
		String [] productos = cesta.split("[ ,.]"); // expresión regular, con esto busca esos separadores
		
		System.out.println("Introduce el producto a buscar: ");
		producto = sc.nextLine().trim();
		
		for(String p: productos) {
			if(p.trim().equals(producto)) {
				stock++;
			}
		}
		
		System.out.println("La cantidad de " + producto + " es " + stock);
		
	}

}
