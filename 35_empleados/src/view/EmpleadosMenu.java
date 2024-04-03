package view;

import java.util.Arrays;
import java.util.Scanner;

import service.EmpleadosService;

public class EmpleadosMenu {
	static EmpleadosService service = new EmpleadosService();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;		
		do {
			System.out.println("Seleccione opción: ");			
			presentarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				agregarEmpleado();
				break;
			case 2:
				buscarEmpleado();
				break;
			case 3:
				eliminarEmpleado();
				break;
			case 4:
				mostrarTodosEmpleados();
				break;
			case 5:
				System.out.println("hasta luego");
				break;
			default: 
				System.out.println("opción no válida");
			}
		}while(opcion!=5);

	}
	static void presentarMenu() {
		System.out.println("""
				
				1.- Agregar empleado
				2.- Buscar empleado
				3.- Borrar empleado
				4.- Mostrar todos los empleados
				5.- Salir
				""");
	
	}
	
	static void agregarEmpleado() {
		System.out.println("Introduce código empleado: ");
		Scanner sc = new Scanner(System.in);
		int cod_empleado = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce nombre empleado: ");
		String nom_empleado = sc.nextLine();		
		if(service.agregarEmpleado(cod_empleado, nom_empleado)) {				
			System.out.println("Empleado guardado correctamente");
		}else {
			System.out.println("El código de empleado ya existe");
		}
	}
	
	static void buscarEmpleado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce código empleado a buscar: ");
		int cod_empleado = sc.nextInt();
		String nombre = service.buscarEmpleado(cod_empleado);
		if(nombre == null) {
			System.out.println("No existe el empleado");
		}else {
			System.out.println("El empleado buscado es: " + nombre);
		}
	}
	
	static void eliminarEmpleado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el código del empleado a borrar: ");
		int cod_empleado = sc.nextInt();
		String nombre_borrado = service.eliminarEmpleado(cod_empleado);
		if(nombre_borrado == null) {
			System.out.println("No existe el empleado a borrar");
		}else {
			System.out.println("El empleado borrado es: " + nombre_borrado);
		}		
	}
	
	static void mostrarTodosEmpleados() {
		System.out.println("Las notas son: " + Arrays.toString(service.mostrarEmpleados()));
	}
	

}
