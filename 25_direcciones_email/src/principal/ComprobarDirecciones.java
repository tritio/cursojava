package principal;

public class ComprobarDirecciones {

	public static void main(String[] args) {

		String emails="pepe@gmail.com,cachito@hotmail.com,tania@holaquetal.es,cc@gmail.com,"
				+ "carla@yahoo.es,aaa@gmail.com";
		
		// indicar cuantas direcciones hay de cada dominio (.es, .com)
		
		String [] direcciones = emails.split(",");
		int dominio_es = 0;
		int dominio_com = 0;
		
		for(String dominio: direcciones) {
			if(dominio.endsWith("es")) {
				dominio_es++;
			} else {
				dominio_com++;
			}
		}
		System.out.println("el número de dominios '.es': " + dominio_es + 
				" y el dominio '.com' :  " + dominio_com);
		

	}

}
