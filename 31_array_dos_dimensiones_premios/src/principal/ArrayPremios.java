package principal;

public class ArrayPremios {

	public static void main(String[] args) {
		// Generar un array de dos dimensiones que debe tener cinco premios,
		// esto es, debe haber exactamente cinco "1" repartidos en el array aleatoriamente.
		
		final int FILAS = 5;
		final int COLUMNAS = 5;
		int [][] panel = new int [FILAS][COLUMNAS];		
		int contador = 0;
		
		for(int i = 0; i < panel.length; i++) {
			for (int j = 0; j < panel.length; j++) {
				if(panel[i][j]!=1 && contador < 5) {
					generarPosicion(panel, FILAS, COLUMNAS);	
					contador++;
				}							
			}
		}
		
		mostrarPanel(panel);

	}
	
	static int [][]generarPosicion(int [][] panel, int FILAS, int COLUMNAS) {
		panel[(int)(Math.random()*(FILAS))][(int)(Math.random()*(COLUMNAS))] = 1;
		return panel;
	}
	
	static void mostrarPanel(int [][] panel) {
		for (int i = 0; i < panel.length; i++) {			
			  System.out.print("fila " + i + " : ");
			for (int j = 0; j < panel[i].length; j++) {
			    System.out.print(panel[i][j] + "|");
			 }
		    System.out.println();
		   }
	}

}
