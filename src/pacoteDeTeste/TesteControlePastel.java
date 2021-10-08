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
 * Verifica se os dados fornecidos equivalem ao esperado pelo programa
 * @author João Victor Correia
 * @author Matheus Perillo
 * @version 1.0 (Out 2021)
 */
class TesteControlePastel {

	ControleDados d = new ControleDados();
	ControlePastel p = new ControlePastel(d);


	/**
	 * Verifica se o nome fornecido corresponde ao esperado
	 * @param nome uma string que contém o nome a ser verificado
	 * @return verdadeiro ou falso, indicando se o nome verificado corresponde ao esperado
	 */
	@Test
	void testBuscarPorNome() {

		assertEquals("ChocoLove", p.buscarPorNome("ChocoLove").getNome());
		assertEquals("ChocoLove", p.buscarPorNome("chocoLove").getNome());
		assertNotEquals("carne", p.buscarPorNome("chocoLove").getNome());

	}

	/**
	 * Verifica se o objeto e seus atributos correspondem
	 * @param carne objeto que contém os atributos a serem vereficados
	 * @return verdadeiro ou falso, indicando se o atributo passado pertence ao objeto esperado
	 */
	@Test
	void testBuscarPorNomeObjeto() {
		Pastel carne = d.getPasteis().get(0);
		Pastel queijo = new Pastel("Minas", 7.44, "Pastel de queijo", 9, "M", "frango");
		
		assertEquals(carne, p.buscarPorNome("Carnivoro"));
		assertEquals(carne, p.buscarPorNome("carniVorO"));
		assertNotEquals(queijo, p.buscarPorNome("Carnivoro"));
	}

}
