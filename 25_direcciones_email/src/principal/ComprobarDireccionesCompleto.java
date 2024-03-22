package principal;

public class ComprobarDireccionesCompleto {

	public static void main(String[] args) {
		// mostrar cuántas direcciones de cada dominio existen 
		String emails="pepe@gmail.com,cachito@hotmail.com,tania@holaquetal.es,cc@gmail.com,"
				+ "carla@yahoo.es,aaa@gmail.com, ttt@previor.org, gracia@gcam.net";
		String [] direcciones = emails.split(",");	
		
		String [] resultado = dominios(direcciones);
		
		for(String r:resultado) {
			System.out.println("El dominio " + r + " aparece " + contarDominio(r, direcciones) + " veces");		
		}

	}
	
	// devuelva un array sólo de dominios sin duplicar
	static String [] dominios(String [] dirs) {		
		
		String dom = "";		
		
		  for(String dir:dirs) {
			  String dominio = dir.substring(dir.indexOf(".")+1,
			  dir.length()); if(dom.indexOf(dominio) == -1) { dom = dom + dominio + ","; }
		  }		 
		
	    dom = dom.substring(0, dom.length()-1);
		return dom.split(",");			
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
