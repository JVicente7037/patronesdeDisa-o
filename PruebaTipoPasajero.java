package UsuarioAdapter;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaTipoPasajero {

	@Test
	void test() {
		Usuario Ejemplo = new Pasajero();
		Ejemplo.SetTipoUsuario("Pasajero");
		assertEquals(Ejemplo.getTipoUsuario(),"Pasajero");
	}

}
