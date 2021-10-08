package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControleDados;
import controle.ControleBebida;
import modelo.Bebida;

/**
 * Teste para verificar se os métodos de busca funcionam corretamente
 * @author João Victor Correia
 * @author Matheus Perillo
 * @version 1.0 (Out 2021)
 */
public class TesteControleBebida {
	
	ControleDados d = new ControleDados();
	ControleBebida b = new ControleBebida(d);
	
	/**
	 * Verifica se o nome fornecido no teste corresponde ao esperado
	 
	 */
	@Test
	public void testBuscarPorNome() {
		assertEquals("Caldo de cana", b.buscarPorNome("Caldo de cana").getNome());
		assertEquals("Caldo de cana", b.buscarPorNome("CALdo de cAna").getNome());
		assertNotEquals("Caldo de Cana", b.buscarPorNome("Suco").getNome());
	}

	/**
	 * Verifica se o objeto fornecido no teste corresponde ao objeto encontrado na busca pelo nome
	 */ 
	@Test
	public void testBuscarPorNomeObjeto() {
		Bebida coca = d.getBebidas().get(0);
		Bebida suco = new Bebida("Suco", 5.90, "suco de uva", 8, 300, "copo");
		
		assertEquals(coca, b.buscarPorNome("Coca-cola"));
		assertEquals(coca, b.buscarPorNome("Coca-ColA"));
		assertNotEquals(suco, b.buscarPorNome("Coca-cola"));
	}
}