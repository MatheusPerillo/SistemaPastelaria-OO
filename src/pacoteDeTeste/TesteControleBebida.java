package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControleDados;
import controle.ControleBebida;
import modelo.Bebida;

/**
 * Verifica se os dados fornecidos equivalem ao esperado pelo programa
 * @author João Victor Correia
 * @author Matheus Perillo
 * @version 1.0 (Out 2021)
 */
class TesteControleBebida {
	
	ControleDados d = new ControleDados();
	ControleBebida b = new ControleBebida(d);
	
	/**
	 * Verifica se o nome fornecido corresponde ao esperado
	 * @param nome uma string que contém o nome a ser verificado
	 * @return verdadeiro ou falso, indicando se o nome verificado corresponde ao esperado
	 */
	@Test
	void testBuscarPorNome() {
		assertEquals("Caldo de cana", b.buscarPorNome("Caldo de cana").getNome());
		assertEquals("Caldo de cana", b.buscarPorNome("CALdo de cAna").getNome());
		assertNotEquals("Caldo de Cana", b.buscarPorNome("Suco").getNome());
	}

	/**
	 * Verifica se o objeto e seus atributos correspondem
	 * @param coca objeto que contém os atributos a serem vereficados
	 * @return verdadeiro ou falso, indicando se o atributo passado pertence ao objeto esperado
	 */
	@Test
	void testBuscarPorNomeObjeto() {
		Bebida coca = d.getBebidas().get(0);
		Bebida suco = new Bebida("Suco", 5.90, "suco de uva", 8, 300, "copo");
		
		assertEquals(coca, b.buscarPorNome("Coca-cola"));
		assertEquals(coca, b.buscarPorNome("Coca-ColA"));
		assertNotEquals(suco, b.buscarPorNome("Coca-cola"));
	}
}