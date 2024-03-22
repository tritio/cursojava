package principal;

public class ContarVocales {

	public static void main(String[] args) {

		String cad = "En un lugar de la Mancha";
		// ¿Cuántas vocales tiene el texto?
		cad = cad.toLowerCase();
		
		int contador = 0;
		
		for (int i = 0; i < cad.length(); i++) {
//			if(cad.charAt(i)=='a' | cad.charAt(i)=='e' | cad.charAt(i)=='i'
//					| cad.charAt(i)=='o' | cad.charAt(i)=='u') {
//				contador++;
//			}
			switch(cad.charAt(i)) {
			case 'a', 'e', 'i', 'o', 'u':
				contador++;
			}
			
		}
		
		System.out.println("total de vocales: " + contador);
	}

}
