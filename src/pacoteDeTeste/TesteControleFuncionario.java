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

class TesteControleFuncionario {

	ControleDados d = new ControleDados();
	ControleFuncionario f = new ControleFuncionario(d);

	@Test
	void testBuscarPorNome() {
		assertEquals("Perillo", f.buscarPorNome("Perillo").getNome());
		assertEquals("Perillo", f.buscarPorNome("perillo").getNome());
		assertNotEquals("Marcos", f.buscarPorNome("Perillo").getNome());
	}

	@Test
	void testBuscarPorNomeObjeto() {
		Funcionario kiara = d.getFuncionarios().get(2);
		Funcionario bernardo = new Funcionario("Bernardo",
				new Endereco("Distrito federal", "Brasília", "Ceilândia", "7112343", 244),
				new Telefone(61, 92312521), "bernardo@email.com", Cargo.Trainee, 1000.00, "24/02/2002", 2);
		
		assertEquals(kiara, f.buscarPorNome("Kiara"));
		assertEquals(kiara, f.buscarPorNome("kiara"));
		assertNotEquals(bernardo, f.buscarPorNome("Kiara"));
	}

}
