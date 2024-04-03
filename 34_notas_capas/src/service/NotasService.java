package service;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas = new ArrayList<>();
	
	public void agregarNota(double nota) {
		notas.add(nota);		
	}
	
	public double calcularMedia() {		
		double media = 0;
		for(double nota:notas) {
			media+=nota;
		}	
		return media/notas.size();
			
	}
	
	public double max() {
		double mayor = notas.get(0);
		for(double i:notas) {			
			if(mayor < i) {
				mayor = i;				
			}			
		}
		return mayor;
		
	}
	
	public double min() {
		double menor = notas.get(0);
		for(double i:notas) {
			
			if(menor > i) {
				menor = i;				
			}			
		}
		return menor;		
	}
	
	public Double[] obtenerNotas() {
		/*
		 * double [] todas = new double[notas.size()]; for(int i = 0; i < notas.size();
		 * i++) { todas[i] = notas.get(i); } return todas;
		 */
		return notas.toArray(new Double[0]);  // forma extraña pero más corta para convertir un ArrayList en un array. Pasando un array vacío del tipo que queremos.
			
	}
}
