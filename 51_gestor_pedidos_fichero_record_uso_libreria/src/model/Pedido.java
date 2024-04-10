package model;

import java.time.LocalDate;

public record Pedido(String producto, int unidades, LocalDate fechaPedido) {

	public Pedido() {
		this(null, 0, LocalDate.of(1,  1,  1));  // this() para llamar de un constructor a otro de la misma clase
	}
	
}
