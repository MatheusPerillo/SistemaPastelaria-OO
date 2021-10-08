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

/**
 * Teste para verificar se os métodos de busca funcionam corretamente
 * 
 * @author João Victor Correia
 * @author Matheus Perillo
 * @version 1.0 (Out 2021)
 */
public class TesteControlePastel {

	ControleDados d = new ControleDados();
	ControlePastel p = new ControlePastel(d);

	/**
	 * Verifica se o nome fornecido no teste corresponde ao esperado
	 * 
	 */
	@Test
	public void testBuscarPorNome() {

		assertEquals("ChocoLove", p.buscarPorNome("ChocoLove").getNome());
		assertEquals("ChocoLove", p.buscarPorNome("chocoLove").getNome());
		assertNotEquals("carne", p.buscarPorNome("chocoLove").getNome());

	}

	/**
	 * Verifica se o objeto fornecido no teste corresponde ao objeto encontrado na
	 * busca pelo nome
	 */
	@Test
	public void testBuscarPorNomeObjeto() {
		Pastel carne = d.getPasteis().get(0);
		Pastel queijo = new Pastel("Minas", 7.44, "Pastel de queijo", 9, "M", "frango");

		assertEquals(carne, p.buscarPorNome("Carnivoro"));
		assertEquals(carne, p.buscarPorNome("carniVorO"));
		assertNotEquals(queijo, p.buscarPorNome("Carnivoro"));
	}

}
