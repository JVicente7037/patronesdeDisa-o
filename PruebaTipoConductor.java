package UsuarioAdapter;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaTipoConductor {

	@Test
	void test() {
		Usuario Ejemplo = new Conductor();
		Ejemplo.SetTipoUsuario("Conductor");
		assertEquals(Ejemplo.getTipoUsuario(),"Conductor");
	}

}
