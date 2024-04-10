package view;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import curso.io.LectorTeclado;
import model.Pedido;
import service.PedidoService;

public class PedidosView {

	static PedidoService service = new PedidoService();
	
	public static void main(String[] args) throws ParseException {
		LectorTeclado lector = new LectorTeclado();
		
		//Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("Seleccione opción: ");			
			presentarMenu();
			try {
			opcion = lector.readInt();	
			
				switch (opcion) {
				case 1:
					agregarPedido();
					break;
				case 2:
					buscarMasReciente();
					break;
				case 3:
					buscarDosFechas();
					break;	
				case 4: 
					PedidoProximoFecha();
				case 5:
					System.out.println("hasta luego");
					break;
				default: 
					System.out.println("opción no válida");
				}
			} catch(NumberFormatException ex){
				System.out.println("Debe introducir un número ");	
			}			
			
		}while(opcion!=5);
		
		

	}
	
	static void presentarMenu() {
		System.out.println("""
				
				1.- Agregar pedido
				2.- Pedido más reciente
				3.- Pedidos entre dos fechas
				4.- Pedidos próximos a fechas			
				5.- Salir
				""");
	
	}
	
	static void agregarPedido()  {		
		
		//Scanner sc = new Scanner(System.in);		
		LectorTeclado lector = new LectorTeclado();
		DateTimeFormatter format= DateTimeFormatter.ofPattern("dd/MM/yyyy");	
			System.out.println("Introduce producto: ");
			String producto = lector.readString();
			System.out.println("Introduce unidades de producto: ");
			int unidades = lector.readInt();
		    System.out.println("Introduce fecha del pedido: (dd/MM/yyyy) ");
			String fecha = lector.readString();			
			LocalDate date=LocalDate.parse(fecha, format);		
			Pedido pedido = new Pedido(producto, unidades, date);	
			service.nuevoPedido(pedido);	
		
	}
	
	static void buscarMasReciente() {
		Pedido p = service.pedidoMasReciente();
		DateTimeFormatter sdf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("El pedido más reciente es: " +
				p.producto() +
				" fecha pedido: " + p.fechaPedido().format(sdf) + 
				" unidades " + p.unidades());		
	}
	
	static void buscarDosFechas() throws ParseException {
		LectorTeclado lector = new LectorTeclado();
		//Scanner sc = new Scanner(System.in);			
		DateTimeFormatter sdf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Introduce las fecha inicial: (dd/MM/yyyy) ");
		String fecha1 = lector.readString();		
		LocalDate date1=LocalDate.parse(fecha1, sdf);
		
		System.out.println("Introduce las fecha final: (dd/MM/yyyy) ");
		String fecha2 = lector.readString();	
		LocalDate date2=LocalDate.parse(fecha2, sdf);
		
		ArrayList<Pedido> resultados = service.pedidosEntreFecha(date1, date2);
		
		for(Pedido p: resultados) {
			System.out.println(" Producto: " + p.producto() + " Unidades: " + p.unidades() + 
					" Fecha pedido: " + p.fechaPedido().format(sdf));
		}
		
	}
	
	static void PedidoProximoFecha() {
	//	Scanner sc = new Scanner(System.in);
		LectorTeclado lector = new LectorTeclado();
		DateTimeFormatter sdf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Introduce las fecha a buscar: (dd/MM/yyyy) ");
		String fecha = lector.readString();	
		LocalDate date=LocalDate.parse(fecha, sdf);
		System.out.println("el producto más próximo a la fecha: " + fecha +  " es: " + 
		service.pedidoProximoFecha(date).producto());
		
		
	}

}
