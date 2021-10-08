package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControleCliente;
import controle.ControleDados;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Telefone;

/**
 * Verifica se os dados fornecidos equivalem ao esperado pelo programa
 * @author João Victor Correia
 * @author Matheus Perillo
 * @version 1.0 (Out 2021)
 */
class TesteControleCliente {
	ControleDados d = new ControleDados();
	ControleCliente c = new ControleCliente(d);

	/**
	 * Verifica se o nome fornecido corresponde ao esperado
	 * @param nome uma string que contém o nome a ser verificado
	 * @return verdadeiro ou falso, indicando se o nome verificado corresponde ao esperado
	 */
	@Test
	void testBuscarPorNome() {
		assertEquals("Joao", c.buscarPorNome("Joao").getNome());
		assertEquals("Joao", c.buscarPorNome("joao").getNome());
		assertNotEquals("Maria", c.buscarPorNome("Joao").getNome());
	}

	/**
	 * Verifica se o objeto e seus atributos correspondem
	 * @param victor objeto que contém os atributos a serem vereficados
	 * @return verdadeiro ou falso, indicando se o atributo passado pertence ao objeto esperado
	 */ 
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
