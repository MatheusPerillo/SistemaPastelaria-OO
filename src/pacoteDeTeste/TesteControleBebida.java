package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControleDados;
import controle.ControleBebida;
import modelo.Bebida;

class TesteControleBebida {

	ControleDados d = new ControleDados();
	ControleBebida b = new ControleBebida(d);

	@Test
	void testBuscarPorNome() {
		assertEquals("Caldo de cana", b.buscarPorNome("Caldo de cana").getNome());
		assertEquals("Caldo de cana", b.buscarPorNome("CALdo de cAna").getNome());
		assertNotEquals("Caldo de Cana", b.buscarPorNome("Suco").getNome());
	}

	@Test
	void testBuscarPorNomeObjeto() {
		Bebida coca = d.getBebidas().get(0);
		Bebida suco = new Bebida("Suco", 5.90, "suco de uva", 8, 300, "copo");
		
		assertEquals(coca, b.buscarPorNome("Coca-cola"));
		assertEquals(coca, b.buscarPorNome("Coca-ColA"));
		assertNotEquals(suco, b.buscarPorNome("Coca-cola"));
	}
}
