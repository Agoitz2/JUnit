package eje3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class prueba {
	
	@Test
	void testleerM() {
		int resultado = multiplos.leerM(10);
		assertEquals(resultado, 11);
	}
	
	@Test
	void testleerN() {
		int resultado = multiplos.leerN();
		assertEquals(resultado, 10);
	}
	
	@Test
	void testSiguienteMultiplo() {
		fail("Not yet implemented");
	}
	
}
