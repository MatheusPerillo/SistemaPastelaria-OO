package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControleDados;
import controle.ControlePastel;
import modelo.Cargo;
import modelo.Endereco;
import modelo.Funcionario;
import modelo.Pastel;
import modelo.Telefone;

class TesteControlePastel {

	ControleDados d = new ControleDados();
	ControlePastel p = new ControlePastel(d);

	@Test
	void testBuscarPorNome() {

		assertEquals("ChocoLove", p.buscarPorNome("ChocoLove").getNome());
		assertEquals("ChocoLove", p.buscarPorNome("chocoLove").getNome());
		assertNotEquals("carne", p.buscarPorNome("chocoLove").getNome());
	}

	@Test
	void testBuscarPorNomeObjeto() {
		Pastel carne = d.getPasteis().get(0);
		Pastel queijo = new Pastel("Minas", 7.44, "Pastel de queijo", 9, "M", "frango");
		
		assertEquals(carne, p.buscarPorNome("Carnivoro"));
		assertEquals(carne, p.buscarPorNome("carniVorO"));
		assertNotEquals(queijo, p.buscarPorNome("Carnivoro"));
	}

}
