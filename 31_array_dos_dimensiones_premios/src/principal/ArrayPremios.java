package principal;

public class ArrayPremios {

	public static void main(String[] args) {
		// Generar un array de dos dimensiones que debe tener cinco premios,
		// esto es, debe haber exactamente cinco "1" repartidos en el array aleatoriamente.
		
		int [][] panel = new int [10][10];
		int numero;
		
		for(int i = 0; i < panel.length; i++) {
			for (int j = 0; j < panel.length; j++) {
				generarPosicion();
				//panel[(int)(Math.random()*10+1)][(int)(Math.random()*10+1)] = 1;
			}
		}

	}
	
	static 

}
