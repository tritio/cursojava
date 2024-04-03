package principal;

import java.util.ArrayList;

import model.Ciudad;

public class Prueba {

	public static void main(String[] args) {
		Ciudad ciudad = new Ciudad("prueba1", 20000, 10);
		ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
		ciudades.add(ciudad);
	}

}
