package pacoteDeTeste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import controle.ControleVenda;
import controle.ControleDados;
import modelo.Cargo;
import modelo.Cliente;
import modelo.Endereco;
import modelo.Funcionario;
import modelo.Pedido;
import modelo.Telefone;
import modelo.Venda;

class TesteControleVenda {

	ControleDados d = new ControleDados();
	ControleVenda v = new ControleVenda(d);

	@Test
	void testBuscarPorNome() {

		assertEquals("Dinheiro", v.buscarPorId(10).getFormaPagamento());
		assertEquals("Pix", v.buscarPorId(12).getFormaPagamento());
		assertNotEquals("Pix", v.buscarPorId(11).getFormaPagamento());

		assertEquals("Joao", v.buscarPorId(10).getPedido().getCliente().getNome());
		assertEquals("Perillo", v.buscarPorId(10).getPedido().getVendedor().getNome());
	}

	@Test
	void testBuscarPorNomeObjeto() {
		Venda v1 = d.getVendas().get(0);

		GregorianCalendar dataDeInscricao = new GregorianCalendar();
		Cliente eduardo = new Cliente("Eduardo", new Endereco("Alagoas", "Maceio", "Bairro 27", "71234274", 02),
				new Telefone(11, 92862329), "eduardo@dudu.com", "1233454");
		Funcionario kiara = new Funcionario("Kiara",
				new Endereco("Distrito federal", "Brasília", "Gama", "7175433", 02), new Telefone(61, 92312521),
				"kiara@email.com", Cargo.Vendedor, 2800.00, "16/09/2001", 7);
		Pedido pedido2 = new Pedido(44.0, eduardo, kiara, dataDeInscricao.getTime());

		Venda v2 = new Venda(pedido2, "Pix", dataDeInscricao.getTime());

		assertEquals(v1, v.buscarPorId(1));
		assertNotEquals(v2, v.buscarPorId(1));
	}

}
