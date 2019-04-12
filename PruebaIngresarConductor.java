package UsuarioAdapter;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaIngresarConductor {

	@Test
	void test() {
		Usuario Ejemplo = new Conductor();
		Ejemplo.setLogin("login");
		Ejemplo.setPassword("123");
	assertTrue(Ejemplo.ingresar("login","123"));
	}

}
