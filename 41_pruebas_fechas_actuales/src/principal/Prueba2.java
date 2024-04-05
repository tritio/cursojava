package principal;


import java.time.LocalDateTime;

public class Prueba2 {

	public static void main(String[] args) {
		// mostrar la fecha y hora que será dentro de 1 mes, 11 días y 4 horas
		
		LocalDateTime f1 = LocalDateTime.now();
		LocalDateTime f2  = f1.plusMonths(1).plusDays(11).plusHours(4);
		System.out.println(f2);
	}

}
