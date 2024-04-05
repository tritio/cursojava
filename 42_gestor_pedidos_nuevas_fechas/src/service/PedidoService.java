package service;

import java.time.LocalDate;
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
}
		
		

	

	

