package principal;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Prueba3 {

	public static void main(String[] args) {
		LocalDate f1 = LocalDate.of(2023, 11,4);
		LocalDate f2 = LocalDate.of(2024,  3, 7);
		Period p = Period.between(f1, f2);
		System.out.println(p); // Formateado P4M3D -> Periodo 4 meses, 3 días
		System.out.println("meses: " + p.getMonths() + " días: " + p.getDays());
		long dias1 = ChronoUnit.DAYS.between(f1, f2);
		System.out.println("total días primer periodo: " + dias1); 
		
		
		
		
		//////
		LocalDate f3 = LocalDate.of(2023, 4,4);
		LocalDate f4 = LocalDate.of(2023,  8, 7);
		Period p2 = Period.between(f3, f4);				
		long dias2 = ChronoUnit.DAYS.between(f3, f4);
		System.out.println("Total días segundo periodo: " + dias2);

	}

}
