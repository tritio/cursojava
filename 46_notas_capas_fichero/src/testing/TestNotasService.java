package testing;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.NotasService;

class TestNotasService {
	static NotasService service = new NotasService();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		service.borrarNotas();
		// añadimos unas cuentas notas de prueba
		service.agregarNota(5.0);
		service.agregarNota(8.0);
		service.agregarNota(1.0);
		service.agregarNota(6.0);
	}

	@Test
	void testCalcularMedia() {
		assertEquals(5.0, service.calcularMedia());
	}

	@Test
	void testMax() {
		assertEquals(8.0, service.max());
	}

	@Test
	void testMin() {
		assertEquals(1.0, service.min());
	}

	@Test
	void testObtenerNotas() {
		assertEquals(4, service.obtenerNotas().size());
		 Double [] notas = new Double[] {5.0, 8.0, 1.0, 6.0};		
		 Double [] convertido = service.obtenerNotas().toArray(new Double[0]);
		 assertArrayEquals(notas, convertido);
	}

}
