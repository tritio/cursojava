package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Pedido;
import service.PedidoService;

public class PedidosView {

	static PedidoService service = new PedidoService();
	
	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		int opcion;		
		do {
			System.out.println("Seleccione opción: ");			
			presentarMenu();
			opcion = sc.nextInt();
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
				System.out.println("hasta luego");
				break;
			default: 
				System.out.println("opción no válida");
			}
		}while(opcion!=4);

	}
	
	static void presentarMenu() {
		System.out.println("""
				
				1.- Agregar pedido
				2.- Pedido más reciente
				3.- Pedidos entre dos fechas				
				4.- Salir
				""");
	
	}
	
	static void agregarPedido() throws ParseException {		
		Scanner sc = new Scanner(System.in);		
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");	
		System.out.println("Introduce producto: ");
		String producto = sc.nextLine();
		System.out.println("Introduce unidades de producto: ");
		int unidades = Integer.parseInt(sc.nextLine());
	    System.out.println("Introduce fecha del pedido: (dd/MM/yyyy) ");
		String fecha = sc.nextLine();			
		Date date=format.parse(fecha);
		Pedido pedido = new Pedido(producto, unidades, date);				
		
		service.nuevoPedido(pedido);
		
	}
	
	static void buscarMasReciente() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("El pedido más reciente es: " +
				service.pedidoMasReciente().getProducto() +
				" fecha pedido: " + sdf.format(service.pedidoMasReciente().getFechaPedido()) + 
				" unidades " + service.pedidoMasReciente().getUnidades());		
	}
	
	static void buscarDosFechas() throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");		
		System.out.println("Introduce las fecha inicial: (dd/MM/yyyy) ");
		String fecha1 = sc.nextLine();		
		Date date1=format.parse(fecha1);
		System.out.println("Introduce las fecha final: (dd/MM/yyyy) ");
		String fecha2 = sc.nextLine();	
		Date date2=format.parse(fecha2);
		
		ArrayList<Pedido> resultados = service.pedidosEntreFecha(date1, date2);
		
		for(Pedido p: resultados) {
			System.out.println(" Producto: " + p.getProducto() + " Unidades: " + p.getUnidades() + 
					" Fecha pedido: " + p.getFechaPedido());
		}
		
	}

}
