package principal;

public class ComprobarDireccionesModular {

	public static void main(String[] args) {
		
		String emails="pepe@gmail.com,cachito@hotmail.com,tania@holaquetal.es,cc@gmail.com,"
				+ "carla@yahoo.es,aaa@gmail.com";
		
		// indicar cuantas direcciones hay de cada dominio (.es, .com)
		
		String [] direcciones = emails.split(",");
		int dominio_es = 0;
		int dominio_com = 0;
		
		dominio_es = contarDominio("es", direcciones);
		dominio_com = contarDominio("com", direcciones);
		
		System.out.println("el número de dominios '.es': " + dominio_es + 
				" y el dominio '.com' :  " + dominio_com);
		

	}
	
	static int contarDominio(String dominio, String [] dirs) {     // se pone static porque va a ser llamado por el main que también es static		
		int contador = 0;		
		for(String dir:dirs) {
			if(dir.endsWith(dominio)) {
				contador++;
			}
		}		
		return contador;		
	}

}
