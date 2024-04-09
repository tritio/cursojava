package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import model.Pedido;
import utilidades.Util;

public class PedidoService {	
	
		String fichero = "c:\\miTemporal\\pedidos.csv";  // producto,unidades,fechaPedido
		
		public void borrarPedidos() {
			File file = new File(fichero);
			file.delete();
		}
		
		public void nuevoPedido(Pedido pedido) {	
			try (FileOutputStream fos = new FileOutputStream(fichero, true);
					PrintStream out = new PrintStream(fos)){		
				out.println(Util.convertirPedidoACadena(pedido));
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		public Pedido pedidoMasReciente() {
			Pedido masReciente = null;
			LocalDate fMax = LocalDate.of(0, 01, 01);	
			try(FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr)) {
				String linea = bf.readLine();
				while(linea!=null) {
					Pedido producto = Util.convertirCadenaAPedido(linea);					
					if(producto.getFechaPedido().isAfter(fMax)) {
						masReciente = producto;
						//masReciente.setFechaPedido(producto.getFechaPedido());
						fMax = producto.getFechaPedido();
					}
					linea = bf.readLine();					
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			return masReciente;
		}
		public ArrayList<Pedido> pedidosEntreFecha(LocalDate f1, LocalDate f2) {
			ArrayList<Pedido> entreFechas = new ArrayList<Pedido>();
			DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");	
			try(FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr)) {
				String linea = bf.readLine();
				while(linea!=null) {
					Pedido pedido = Util.convertirCadenaAPedido(linea);
					if((pedido.getFechaPedido().compareTo(f1) >= 0 && pedido.getFechaPedido().compareTo(f2) <= 0)) {
						entreFechas.add(pedido);
					}
					linea = bf.readLine();					
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			return entreFechas;
			
		}
		
		public Pedido pedidoProximoFecha(LocalDate fecha) {			
			Pedido pedido = new Pedido("", 0, LocalDate.of(0,1,1));			
			try(FileReader fr = new FileReader(fichero); BufferedReader bf = new BufferedReader(fr)) {
				String linea = bf.readLine();
				while(linea!=null) {
					Pedido pedido2 = Util.convertirCadenaAPedido(linea);
					if(Math.abs(ChronoUnit.DAYS.between(pedido.getFechaPedido(), fecha)) > Math.abs(ChronoUnit.DAYS.between(pedido2.getFechaPedido(), fecha))){				
						pedido = pedido2;
					}
					linea = bf.readLine();					
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
			return pedido;
		}
		
		
}
		
		

	

	

