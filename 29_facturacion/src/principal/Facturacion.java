package principal;

public class Facturacion {

	public static void main(String[] args) {
		// el programa deberá mostrar el nombre del departamento que más a facturado,
		// nombres de todos los departamentos, ordenados de menos a más facturación 
		
		String facturacion="ventas-20800,administracion-17900,"
				+ "informatica-35000,RRHH-10350";
		String [] datos = facturacion.split(",");
		
		ordenarFacturacion(datos);	
		
		System.out.println("Departamento con más facturación: " + datos[datos.length-1].split("-")[0]);
		
		for(String n:datos) {
			System.out.println(n.split("-")[0]);
		}
		
	}
	
	static void ordenarFacturacion(String [] datos) {
		String aux;
		for (int i = 0; i < datos.length; i++) {
			for(int j = i+1; j < datos.length; j++) {
				int numeroI = Integer.parseInt(datos[i].split("-")[1]);
				int numeroJ = Integer.parseInt(datos[j].split("-")[1]);
				if(numeroJ < numeroI) {
					aux = datos[j];					
					datos[j] = datos[i];
					datos[i] = aux;
				}	
			}						
		}		
		
	}

}
