package modelo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import java.util.Map;

import helper.Util;

public class Pedido {
	private static int contador = 1;
	private int id;
	private HashMap<Pastel, Integer> pasteis = new HashMap<>();
	private HashMap<Bebida, Integer> bebidas = new HashMap<>();
	private Double valorTotal;
	private Cliente cliente;
	private Funcionario vendedor;
	private Date dataPedido;

	public Pedido(Double valorTotal, Cliente cliente, Funcionario vendedor, Date dataPedido) {
		this.id = Pedido.contador;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.dataPedido = dataPedido;
		contador++;
	}

	public Pedido() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HashMap<Pastel, Integer> getPasteis() {
		return pasteis;
	}

	public void setPasteis(HashMap<Pastel, Integer> pasteis) {
		this.pasteis = pasteis;
	}

	public HashMap<Bebida, Integer> getBebidas() {
		return bebidas;
	}

	public void setBebidas(HashMap<Bebida, Integer> bebidas) {
		this.bebidas = bebidas;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Funcionario vendedor) {
		this.vendedor = vendedor;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public void pedirPastel(Pastel pastel, int qtd) {
		if (pastel.getQtdEstoque() >= qtd) {
			this.pasteis.put(pastel, qtd);
			pastel.setQtdEstoque(pastel.getQtdEstoque() - qtd);
			System.out.println("Pastel: " + pastel.getNome() + " Pedido com sucesso" + "\nQtd pedida: " + qtd);
			Util.pausar(1);
		} else {
			System.out.println("\nNão há produto em estoque suficiente para o pedido");
			Util.pausar(1);
		}

	}

	public void pedirBebida(Bebida bebida, int qtd) {
		if (bebida.getQtdEstoque() >= qtd) {
			this.bebidas.put(bebida, qtd);
			bebida.setQtdEstoque(bebida.getQtdEstoque() - qtd);
			System.out.println("Bebida: " + bebida.getNome() + " Pedida com sucesso" + "\nQtd pedida: " + qtd);
			Util.pausar(1);
		} else {
			System.out.println("\nNão há produto em estoque suficiente para o pedido");
			Util.pausar(1);
		}

	}

	public void listarPasteisPedidos() {
		System.out.println("\nPasteis pedidos: ");
		for (Map.Entry<Pastel, Integer> entrada : pasteis.entrySet()) {
			System.out.println(entrada.getKey() + "\nQtd Pedida: " + entrada.getValue());
		}

	}

	public void listarBebidasPedidas() {
		System.out.println("\nBebidas pedidas: ");
		for (Map.Entry<Bebida, Integer> entrada : bebidas.entrySet()) {
			System.out.println(entrada.getKey() + "\nQtd Pedida: " + entrada.getValue());
		}
	}

	public void exibir() {
		System.out.println("\nPedido: ");
		this.listarBebidasPedidas();
		this.listarPasteisPedidos();
		System.out.println("\nID do Pedido: " + this.id);
		System.out.println("Valor total: " + this.getValorTotal());
		System.out.println("Cliente: " + this.cliente.getNome() + " ID: " + this.cliente.getId());
		System.out.println("Funcionário: " + this.vendedor.getNome() + " ID: " + this.vendedor.getId());
		System.out.println("Data do pedido:" + Util.dateParaString(this.getDataPedido()));
		Util.pausar(2);
	}

	public void alterarPastelPedido(Pastel pastel, Pastel novoPastel) {
		for (Map.Entry<Pastel, Integer> entrada : pasteis.entrySet()) {
			if (pastel.equals(entrada.getKey())) {
				pasteis.remove(entrada.getKey());
				System.out.println("\nDigite a nova quantidade:");
				int qtd = Main.ler.nextInt();
				Main.ler.nextLine();
				this.pedirPastel(novoPastel, qtd);
			}
		}

	}

	public void alterarBebidaPedida(Bebida bebida, Bebida novaBebida) {
		for (Map.Entry<Bebida, Integer> entrada : bebidas.entrySet()) {
			if (bebida.equals(entrada.getKey())) {
				bebidas.remove(entrada.getKey());
				System.out.println("\nDigite a nova quantidade:");
				int qtd = Main.ler.nextInt();
				Main.ler.nextLine();
				this.pedirBebida(novaBebida, qtd);
			}
		}
	}

	public void calcularValorTotal() {
		double valorTotal = 0;
		double valorBebidas = 0;
		double valorPasteis = 0;
		for (Map.Entry<Bebida, Integer> entrada : bebidas.entrySet()) {
			valorPasteis += entrada.getValue() * entrada.getKey().getValor();
		}
		for (Map.Entry<Pastel, Integer> entrada : pasteis.entrySet()) {
			valorBebidas += entrada.getValue() * entrada.getKey().getValor();
		}
		valorTotal = valorBebidas + valorPasteis;
		this.setValorTotal(valorTotal);
		GregorianCalendar data = new GregorianCalendar();
		this.setDataPedido(data.getTime());
	}

	public void cadastrar() {
		System.out.println("\nQual o funcionário que realizou o pedido?");
		Main.perillao.listarFuncionarios();

		if (!Main.perillao.getFuncionarios().isEmpty()) {
			Funcionario f = Funcionario.buscarPorID(Main.perillao.getFuncionarios());
			this.setVendedor(f);
		}

		System.out.println("\nQual o cliente que realizou o pedido? ");
		Main.perillao.listarClientes();
		if (!Main.perillao.getClientes().isEmpty()) {
			Cliente c = Cliente.buscarPorID(Main.perillao.getClientes());
			this.setCliente(c);
		}
		int aux;
		do {
			System.out.println("\n1- Pedir pastel \n2-Sair");
			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			if (aux == 1) {
				System.out.println("\nEscolha um pastel da lista para realizar o pedido");
				Main.perillao.listarPasteis();
				Pastel p = Pastel.buscarPorNome(Main.perillao.getPasteis());

				System.out.println("Digite quantos pasteis foram pedidos: ");
				int qtdEstoque = Main.ler.nextInt();
				Main.ler.nextLine();
				this.pedirPastel(p, qtdEstoque);
				Util.pausar(1);
			} else if (aux > 2 || aux < 1) {
				System.out.println("\nOpção inválida");
				Util.pausar(1);
			}
		} while (aux != 2);
		do {
			System.out.println("\n1- Pedir bebida \n2-Sair");
			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			if (aux == 1) {
				System.out.println("\nEscolha uma bebida da lista para realizar o pedido");
				Main.perillao.listarBebidas();
				Bebida b = Bebida.buscarPorNome(Main.perillao.getBebidas());

				System.out.println("Digite quantas bebidas foram pedidas: ");
				int qtdEstoque = Main.ler.nextInt();
				Main.ler.nextLine();
				this.pedirBebida(b, qtdEstoque);
				Util.pausar(1);
			} else if (aux > 2 || aux < 1) {
				System.out.println("\nOpção inválida");
				Util.pausar(1);
			}
		} while (aux != 2);

		this.calcularValorTotal();
		System.out.println("\nValor total do pedido: ");
		System.out.println(this.getValorTotal());
		Util.pausar(1);
		System.out.println("\nPedido realizado com sucesso!");

	}

	public void editar() {
		System.out.println("1- Alterar pastel escolhido ");
		System.out.println("2- Alterar bebida escolhida ");
		System.out.println("3- Alterar tudo");

		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch (aux) {
		case 1:
			System.out.println("\nEscolha um pastel da lista para substituir o do pedido atual");
			Main.perillao.listarPasteis();
			Pastel p = Pastel.buscarPorNome(Main.perillao.getPasteis());
			p.setQtdEstoque(p.getQtdEstoque()+ p.getQtdEstoque());
			Pastel p2 = Pastel.buscarPorNome(this.pasteis);

			this.alterarPastelPedido(p2, p);
			System.out.println("\nPastel alterado com sucesso!");
			Util.pausar(1);

			break;

		case 2:
			System.out.println("\nEscolha uma bebida da lista para substituir a do pedido atual");
			Main.perillao.listarPasteis();
			Bebida b = Bebida.buscarPorNome(Main.perillao.getBebidas());
			b.setQtdEstoque(b.getQtdEstoque()+ b.getQtdEstoque());
			Bebida b2 = Bebida.buscarPorNome(this.bebidas);

			this.alterarBebidaPedida(b, b2);
			System.out.println("\nBebida alterada com sucesso!");
			Util.pausar(1);

			break;

		case 3:
			System.out.println("\nEscolha um pastel da lista para substituir o do pedido atual");
			Main.perillao.listarPasteis();
			p = Pastel.buscarPorNome(Main.perillao.getPasteis());
			p.setQtdEstoque(p.getQtdEstoque()+ p.getQtdEstoque());
			p2 = Pastel.buscarPorNome(this.pasteis);

			this.alterarPastelPedido(p2, p);
			Util.pausar(1);
			System.out.println("\nPastel alterado com sucesso!");
			System.out.println("\nEscolha uma bebida da lista para substituir a do pedido atual");
			Main.perillao.listarPasteis();
			b = Bebida.buscarPorNome(Main.perillao.getBebidas());

			b2 = Bebida.buscarPorNome(this.bebidas);

			this.alterarBebidaPedida(b, b2);
			Util.pausar(1);
			System.out.println("\nBebida alterada com sucesso!");
			break;

		default:
			System.out.println("\nOpção inválida");
			Util.pausar(2);
			this.editar();
			break;
		}

	}
}
