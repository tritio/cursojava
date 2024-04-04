package view;

import java.util.HashSet;
import java.util.Scanner;

import model.Direccion;

import service.BuscadorService;


public class BuscadorView {
	
	

	public static void main(String[] args) {
		
		BuscadorService service = new BuscadorService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la temática a buscar: ");
		String tematica = sc.nextLine();
		HashSet<Direccion> resultados = service.buscar(tematica);
		
		for(Direccion d: resultados) {
			System.out.println("URL: " + d.getUrl());
			System.out.println("Descripción: " + d.getDescripcion());
			System.out.println("Temática: " + d.getTematica());
			System.out.println(" ---------------------------- ");
		}

	}

}
