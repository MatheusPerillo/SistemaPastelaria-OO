package modelo;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;

import helper.Util;

public class Pedido {
	private int id;
	private static int contador;
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
			pastel.setQtdEstoque(pastel.getQtdEstoque()- 1);
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
		bebida.setQtdEstoque(bebida.getQtdEstoque()- 1);
		System.out.println("Bebida: " + bebida.getNome() + " Pedida com sucesso" + "\nQtd pedida: " + qtd);
		Util.pausar(1);
		}else {
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

	public void listarPedido() {
		System.out.println("\nPedido: ");
		this.listarBebidasPedidas();
		this.listarPasteisPedidos();
		System.out.println("\nID do Pedido: "+ this.id);
		System.out.println("Valor total: " +this.getValorTotal());
		System.out.println("Cliente: " + this.cliente.getNome() + " ID: " + this.cliente.getId());
		System.out.println("Funcionário: " + this.vendedor.getNome() + " ID: " + this.vendedor.getId());
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
	}

	public void cadastrarPedido() {
		System.out.println("Digite o nome do pastel escolhido: ");
		String nomePastel = Main.ler.nextLine();
		Util.pausar(1);
		System.out.println("Digite quantos pasteis foram pedidos: ");
		int qtdEstoque = Main.ler.nextInt();
		Main.ler.nextLine();
		this.pedirPastel(null, qtdEstoque);
		Util.pausar(1);

		System.out.println("Digite o nome da bebida escolhida: ");
		String nomeBebida = Main.ler.nextLine();
		Util.pausar(1);
		System.out.println("Digite quantas bebidas foram pedidas: ");
		qtdEstoque = Main.ler.nextInt();
		Main.ler.nextLine();
		this.pedirBebida(null, qtdEstoque);
		Util.pausar(1);

		System.out.println("Digite o nome do cliente que realizou o pedido: ");
		String nomeCliente = Main.ler.nextLine();
		Util.pausar(1);
		cliente.getNome();

		System.out.println("Digite o nome do funcionário que realizou o pedido: ");
		String nomeFuncionario = Main.ler.nextLine();
		Util.pausar(1);
		vendedor.getNome();

		System.out.println("Valor total do pedido: ");
		System.out.println(this.getValorTotal());
		Util.pausar(1);
		System.out.println("Pedido realizado com sucesso!");

	}

	public void editarPedido() {
		System.out.println("1- Alterar pastel escolhido ");
		System.out.println("2- Alterar bebida escolhida ");
		System.out.println("3- Alterar tudo");

		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch (aux) {
		case 1:
			System.out.println("Digite o novo pastel escolhido: ");
			String nomePastelNovo = Main.ler.nextLine();
			Util.pausar(1);
			//Pedido.AlterarPastelPedido(nomePastel, nomePastelNovo);
			System.out.println("Pastel alterado com sucesso!");
			
			// falta passar o novo valor

			break;

		case 2:
			System.out.println("Digite a nova bebida escolhida: ");
			String nomeBebidaNova = Main.ler.nextLine();
			Util.pausar(1);
			//Pedido.AlterarBebidaPedida(nomeBebida, nomeBebidaNova);
			System.out.println("Bebida alterada com sucesso!");
			
			// falta passar o novo valor

			break;

		case 3:
			System.out.println("Digite o novo pastel escolhido: ");
			nomePastelNovo = Main.ler.nextLine();
			Util.pausar(1);

			System.out.println("Digite a nova bebida escolhida: ");
			nomeBebidaNova = Main.ler.nextLine();

			//Pedido.AlterarPastelPedido(nomePastel, nomePastelNovo);
			//Pedido.AlterarBebidaPedida(nomeBebida, nomeBebidaNova);

			// falta passar o novo valor
			Util.pausar(1);
			System.out.println("Pedido alterado com sucesso!");
			break;

		default:
			System.out.println("Opção inválida");
			Util.pausar(2);
			this.editarPedido();
			break;
		}

	}
}
