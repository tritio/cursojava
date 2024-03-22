package principal;

public class PruebaTexto {

	public static void main(String[] args) {
		
		// los objetos de tipo String son inmutables. 
		String n = "hello";
		n.toUpperCase();
		System.out.println(n);
		// sale igualmente en minúscula, no cambia
		String p = n.toUpperCase();
		System.out.println(p);
		
		String n1 ="hola que tal";
		System.out.println(n1.substring(0,n1.length()));

	}

}
