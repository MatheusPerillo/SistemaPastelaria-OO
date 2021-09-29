package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Dados {
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private ArrayList<Pastel> pasteis = new ArrayList<>();
	private ArrayList<Bebida> bebidas = new ArrayList<>();
	private ArrayList<Venda> vendas = new ArrayList<>();
	private Loja loja;
	private Pedido pedido= new Pedido();

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public ArrayList<Pastel> getPasteis() {
		return pasteis;
	}

	public void setPasteis(ArrayList<Pastel> pasteis) {
		this.pasteis = pasteis;
	}

	public ArrayList<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(ArrayList<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void gerarDados() {
		GregorianCalendar dataDeInscricao = new GregorianCalendar();

		Cliente joao = new Cliente("Joao", new Endereco("Distrito federal", "Brasília", "Bandeirante", "7171525", 04),
				new Telefone(61, 99863229), "joao@joao.com", "1234");
		Cliente victor = new Cliente("Victor", new Endereco("Pernambuco", "Petrolina", "Guaramirá", "71346274", 02),
				new Telefone(21, 82862329), "victor@victor.com", "1233454");
		Cliente eduardo = new Cliente("Eduardo", new Endereco("Alagoas", "Maceio", "Bairro 27", "71234274", 02),
				new Telefone(11, 92862329), "eduardo@dudu.com", "1233454");

		Pastel carne = new Pastel("Carnivoro", 7.44, "Pastel de carne", 14, "M", "carne");
		Pastel carne2 = new Pastel("Carnivoro Big", 9.75, "Pastel de carne", 14, "G", "carne");
		Pastel frango = new Pastel("Minas", 7.44, "Pastel de queijo", 9, "M", "frango");
		Pastel doce = new Pastel("ChocoLove", 12.50, "Pastel de chocolate com morango", 6, "M", "chocolate");
		Pastel frango2 = new Pastel("Minas de Ouro", 9.75, "Pastel de queijo", 3, "GG", "frango");

		Bebida coca = new Bebida("Coca-cola", 7.99, "Refrigerante 2L", 30, 2000, "garrafa");
		Bebida suco = new Bebida("Suco", 5.90, "suco de uva", 8, 300, "copo");
		Bebida caldo = new Bebida("Caldo de cana", 3.59, "Caldo de cana feito na hora", 15, 300, "copo");

		Funcionario perillo = new Funcionario("Perillo",
				new Endereco("Distrito federal", "Brasília", "Guara", "7365643", 14), new Telefone(61, 92312521),
				"perillo@email.com", Cargo.Gerente, 5565.88, "24/02/1999", 3);
		Funcionario josue = new Funcionario("Josué",
				new Endereco("Distrito federal", "Brasília", "Asa Sul", "7154643", 13), new Telefone(61, 9231-2521),
				"josue@email.com", Cargo.Vendedor, 2560.98, "03/07/1987", 5);
		Funcionario kiara = new Funcionario("Kiara",
				new Endereco("Distrito federal", "Brasília", "Gama", "7175433", 02), new Telefone(61, 92312521),
				"kiara@email.com", Cargo.Vendedor, 2800.00, "16/09/2001", 7);
		Funcionario bernardo = new Funcionario("Bernardo",
				new Endereco("Distrito federal", "Brasília", "Ceilândia", "7112343", 244),
				new Telefone(61, 92312521), "bernardo@email.com", Cargo.Trainee, 1000.00, "24/02/2002", 2);

		Pedido pedido1 = new Pedido(200.0, joao, perillo, dataDeInscricao.getTime());
		Pedido pedido2 = new Pedido(30.0, victor, josue, dataDeInscricao.getTime());
		Pedido pedido3 = new Pedido(44.0, eduardo, kiara, dataDeInscricao.getTime());

		Venda v = new Venda(pedido1, "Dinheiro", dataDeInscricao.getTime());
		Venda v2 = new Venda(pedido2, "Cartão de crédito", dataDeInscricao.getTime());
		Venda v3 = new Venda(pedido3, "Pix", dataDeInscricao.getTime());
		Venda v4 = new Venda(pedido3, "Dinheiro", dataDeInscricao.getTime());
		Venda v5 = new Venda(pedido2, "Cartão de débito", dataDeInscricao.getTime());
		Venda v6 = new Venda(pedido1, "Pix", dataDeInscricao.getTime());
		Venda v7 = new Venda(pedido3, "Dinheiro", dataDeInscricao.getTime());
		Venda v8 = new Venda(pedido3, "Pix", dataDeInscricao.getTime());
		
		

		Endereco end = new Endereco("Distrito federal", "Brasília", "Guará", "71020274", 24);
		Telefone tel = new Telefone(61, 30862469);
		Loja perillao = new Loja("Perillão", end, tel);
		this.loja = perillao;

		this.getClientes().add(joao);
		this.getClientes().add(victor);
		this.getClientes().add(eduardo);

		this.getFuncionarios().add(perillo);
		this.getFuncionarios().add(josue);
		this.getFuncionarios().add(kiara);
		this.getFuncionarios().add(bernardo);

		this.getPasteis().add(carne);
		this.getPasteis().add(carne2);
		this.getPasteis().add(frango);
		this.getPasteis().add(doce);
		this.getPasteis().add(frango2);

		this.getBebidas().add(coca);
		this.getBebidas().add(suco);
		this.getBebidas().add(caldo);

		this.getVendas().add(v);
		this.getVendas().add(v2);
		this.getVendas().add(v3);
		this.getVendas().add(v4);
		this.getVendas().add(v5);
		this.getVendas().add(v6);
		this.getVendas().add(v7);
		this.getVendas().add(v8);
		
		
		
	}
}
