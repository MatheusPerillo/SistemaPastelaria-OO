package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControleCliente;
import controle.ControleDados;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Telefone;

class TesteControleCliente {
	ControleDados d = new ControleDados();
	ControleCliente c = new ControleCliente(d);

	@Test
	void testBuscarPorNome() {
		assertEquals("Joao", c.buscarPorNome("Joao").getNome());
		assertEquals("Joao", c.buscarPorNome("joao").getNome());
		assertNotEquals("Maria", c.buscarPorNome("Joao").getNome());
	}

	@Test
	void testBuscarPorNomeObjeto() {
		Cliente victor = d.getClientes().get(1);
		Cliente eduardo = new Cliente("Eduardo", new Endereco("Alagoas", "Maceio", "Bairro 27", "71234274", 02),
				new Telefone(11, 92862329), "eduardo@dudu.com", "1233454");
		
		assertEquals(victor, c.buscarPorNome("Victor"));
		assertEquals(victor, c.buscarPorNome("vicToR"));
		assertNotEquals(eduardo, c.buscarPorNome("Victor"));
	}

}
