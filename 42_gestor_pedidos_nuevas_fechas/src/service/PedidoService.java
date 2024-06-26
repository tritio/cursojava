package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import model.Pedido;

public class PedidoService {
	
		HashSet<Pedido> pedidos = new HashSet<Pedido>();
		
		public void nuevoPedido(Pedido pedido) {			
				pedidos.add(pedido);	
			}
		public Pedido pedidoMasReciente() {
			Pedido masReciente = null;
			LocalDate fMax = LocalDate.of(0, 01, 01);
			for(Pedido p:pedidos) {
				if(p.getFechaPedido().isAfter(fMax)) {
					masReciente = p;
					fMax = p.getFechaPedido();
				}
			}
			return masReciente;
		}
		public ArrayList<Pedido> pedidosEntreFecha(LocalDate f1, LocalDate f2) {
			ArrayList<Pedido> entreFechas = new ArrayList<Pedido>();
			for(Pedido p: pedidos) {
				if(p.getFechaPedido().compareTo(f1) >= 0 && 
						p.getFechaPedido().compareTo(f2) <= 0) {
				entreFechas.add(p);
				}
			}
			return entreFechas;
			
		}
		
		public Pedido pedidoProximoFecha(LocalDate fecha) {			
			Pedido pedido = new Pedido("", 0, LocalDate.of(0,1,1));
			for(Pedido p:pedidos) {
				if(Math.abs(ChronoUnit.DAYS.between(pedido.getFechaPedido(), fecha)) > Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))){				
					pedido = p;
				}			  
			}
			return pedido;
		}
}
		
		

	

	

