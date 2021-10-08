package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.ControleCliente;
import controle.ControleDados;
import controle.ControleFuncionario;
import modelo.Cargo;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Funcionario;
import modelo.Telefone;

/**
 * Teste para verificar se os métodos de busca funcionam corretamente
 * 
 * @author João Victor Correia
 * @author Matheus Perillo
 * @version 1.0 (Out 2021)
 */
public class TesteControleFuncionario {

	ControleDados d = new ControleDados();
	ControleFuncionario f = new ControleFuncionario(d);

	/**
	 * Verifica se o nome fornecido no teste corresponde ao esperado
	 * 
	 */
	@Test
	public void testBuscarPorNome() {
		assertEquals("Perillo", f.buscarPorNome("Perillo").getNome());
		assertEquals("Perillo", f.buscarPorNome("perillo").getNome());
		assertNotEquals("Marcos", f.buscarPorNome("Perillo").getNome());
	}

	/**
	 * Verifica se o objeto fornecido no teste corresponde ao objeto encontrado na
	 * busca pelo nome
	 */
	@Test
	public void testBuscarPorNomeObjeto() {
		Funcionario kiara = d.getFuncionarios().get(2);
		Funcionario bernardo = new Funcionario("Bernardo",
				new Endereco("Distrito federal", "Brasília", "Ceilândia", "7112343", 244), new Telefone(61, 92312521),
				"bernardo@email.com", Cargo.Trainee, 1000.00, "24/02/2002", 2);

		assertEquals(kiara, f.buscarPorNome("Kiara"));
		assertEquals(kiara, f.buscarPorNome("kiara"));
		assertNotEquals(bernardo, f.buscarPorNome("Kiara"));
	}

}
