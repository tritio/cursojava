package principal;

public class BloquesTexto {

	public static void main(String[] args) {
		/*String tutorial = "Curso de \"HTML\" y ahora un salto de línea \n , seguimos escribiendo"
				+ "este lenguaje se emplea para formatear. Las etiquetas tienen la forma <>";*/
		
		// desde Java 14 existen los bloques de texto:
		
		String bloqueTexto = """ 
				El lenguaje "HTML":
				es un lenguaje para formatear. \
				Las etiquetas tienen la forma <>
				"""	;
		
		System.out.println(bloqueTexto);

	}

}
