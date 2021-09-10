package modelo;

import java.util.GregorianCalendar;
import java.util.Scanner;

import helper.Util;
import modelo.Funcionario.Cargo;

public class Main {
	public static Scanner ler = new Scanner(System.in);
	public static int aux;
	public static Pedido pedidoAtual = new Pedido();
	private static Endereco end = new Endereco("Distrito federal", "Brasília", "Guará", "71020274", "24");
	private static Telefone tel = new Telefone("61", "3086-2469");
	public static Loja perillao = new Loja("Perillão", end, tel);

	public static void main(String[] args) {
		int auxMenu;

		GregorianCalendar dataDeInscricao = new GregorianCalendar();
		Endereco end = new Endereco("Distrito federal", "Brasília", "Band", "71710011", "04");
		Telefone tel = new Telefone("61", "99946-8480");

		Cliente joao = new Cliente("Joao", end, tel, "ui@ui.com", "123");
		Pastel flango = new Pastel("frangod", 10.00, "frango de Deus", 4, "G", "frango");
		Pastel flango2 = new Pastel("frangod2", 20.00, "frango de Deus", 0, "G", "frango");
		Bebida coca = new Bebida("coca", 7.99, "geladinha", 2, 2000, "garrafa");
		Funcionario perillo = new Funcionario("Perillo", end, tel, "email@email.com", Cargo.Gerente, 3565.88,
				"24/02/2001");
		Pedido pedido1 = new Pedido(200.0, joao, perillo, dataDeInscricao.getTime());

		Main.perillao.getClientes().add(joao);
		Main.perillao.getFuncionarios().add(perillo);
		Main.perillao.getPasteis().add(flango2);
		Main.perillao.getBebidas().add(coca);
		Main.perillao.getPasteis().add(flango);

		do {
			System.out.println("MENU DE OPÇÕES\n");
			System.out.println("1.Loja \n2.Cliente\n3.Funcionário" + "\n4.Pastel\n5.Bebida" + "\n6.Produtos"
					+ "\n7.Pedido\n8.Venda\n9.Sair");

			auxMenu = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (auxMenu) {

			case 1: // Loja
				Main.menuLoja();
				break;
			case 2: // Cliente
				Main.menuClientes();

				break;

			case 3: // Funcionário
				Main.menuFuncionario();

				break;

			case 4: // Pastel
				Main.menuPastel();

				break;

			case 5: // Bebida
				Main.menuBebida();

				break;

			case 6: // Produto
				Main.menuProduto();

				break;

			case 7: // Pedido
				Main.menuPedido();

				break;

			case 8: // Venda
				Main.menuVenda();
				break;

			case 9: // Sair
				Main.menuSair();

				break;

			}

		} while (auxMenu != 9);

	}

// ------------------------------- MÉTODOS MENU --------------------------------

	public static void menuLoja() {
		do {
			System.out.println("\n1- Exibir dados \n2- Sair");
			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro

				System.out.println(Main.perillao);
				break;

			case 2: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;

			}

		} while (aux != 2);
	}

	public static void menuClientes() {

		do {

			System.out.println("\n=== Menu de clientes ===");
			System.out.println("\n1- Cadastrar \n2- Listar \n3- Buscar" + "\n4- Editar\n5- Excluir\n6- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro
				 Cliente.cadastrar(Main.perillao.getClientes());
				System.out.println("Cliente cadastrado com sucesso");
				Util.pausar(1);
				
				break;

			case 2: // Listar Cliente

				Main.perillao.listarClientes();
				Util.pausar(1);
				break;

			case 3: // Buscar Cliente
				Cliente c = Cliente.buscarPorID(Main.perillao.getClientes());
				if (c != null) {
					System.out.println(c);
				} else {
					System.out.println("\nCliente não encontrado");
				}
				Util.pausar(1);
				break;

			case 4: // Editar
				c = Cliente.buscarPorID(Main.perillao.getClientes());
				if (c != null) {
					Cliente.editar(c);
				} else {
					System.out.println("\nCliente não encontrado");
				}
				break;

			case 5: // Excluir
				Cliente.remover(Main.perillao.getClientes());

				break;

			case 6: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;

			}

		} while (aux != 6);

	}

	public static void menuFuncionario() {
		do {
			System.out.println("\n=== Menu de funcionário ===");
			System.out.println("\n1- Cadastrar \n2- Buscar \n3- Listar " + "\n4- Editar\n5- Demitir\n6- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro
				Funcionario.cadastrar(Main.perillao.getFuncionarios());
				System.out.println("\nCadastro de funcionário realizado com sucesso!");
				Util.pausar(1);
				break;

			case 2: // Buscar funcionario

				Funcionario f = Funcionario.buscarPorID(Main.perillao.getFuncionarios());
				if (f != null) {
					System.out.println(f);
				} else {
					System.out.println("\nFuncionário não encontrado");
				}
				Util.pausar(1);
				break;

			case 3: // Listar funcionario
				Main.perillao.listarFuncionarios();

				break;

			case 4: // Editar
				f = Funcionario.buscarPorID(Main.perillao.getFuncionarios());
				if (f != null) {
					Funcionario.editar(f);
				} else {
					System.out.println("\nFuncionário não encontrado");
				}
				break;

			case 5: // Demitir

				Funcionario.demitir(Main.perillao.getFuncionarios());

				break;

			case 6: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;

			}

		} while (aux != 6);
	}

	public static void menuPastel() {
		do {
			System.out.println("\n=== Menu de Pastel ===");
			System.out.println("\n1- Cadastrar \n2- Buscar \n3- Listar " + "\n4- Editar\n5- Remover\n6- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro

				 Pastel.cadastrar(Main.perillao.getPasteis());
				System.out.println("\nCadastro de pastel realizado com sucesso!");
				Util.pausar(1);
				break;

			case 2: // Buscar pastel

				Pastel p = Pastel.buscarPorNome(Main.perillao.getPasteis());
				if (p != null) {
					System.out.println(p);
				} else {
					System.out.println("\nPastel não encontrado");
				}
				Util.pausar(1);
				// Método buscar

				break;

			case 3: // Listar pastel
				Main.perillao.listarPasteis();

				break;

			case 4: // Editar pastel
				p = Pastel.buscarPorNome(Main.perillao.getPasteis());
				if (p != null) {
					Pastel.editar(p);
				} else {
					System.out.println("\nPastel não encontrado");
				}
				break;

			case 5: // Remover

				Pastel.remover(Main.perillao.getPasteis());

				break;

			case 6: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;
			}

		} while (aux != 6);
	}

	public static void menuBebida() {
		do {
			System.out.println("\n=== Menu de bebida ===");
			System.out.println("\n1- Cadastrar \n2- Buscar \n3- Listar " + "\n4- Editar\n5- Remover\n6- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro

				Bebida.cadastrar(Main.perillao.getBebidas());
				System.out.println("\nBebida cadastrada com sucesso");
				Util.pausar(1);
				break;

			case 2: // Buscar bebida

				Bebida b = Bebida.buscarPorNome(Main.perillao.getBebidas());
				if (b != null) {
					System.out.println(b);
				} else {
					System.out.println("\nBebida não encontrada");
				}
				Util.pausar(1);

				break;

			case 3: // Listar bebida
				Main.perillao.listarBebidas();

				break;

			case 4: // Editar
				b = Bebida.buscarPorNome(Main.perillao.getBebidas());
				if (b != null) {
					Bebida.editar(b);
				} else {
					System.out.println("\nBebida não encontrada");
				}
				break;

			case 5: // Remover
				Bebida.remover(Main.perillao.getBebidas());

				break;

			case 6: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;

			}

		} while (aux != 6);
	}

	public static void menuProduto() {
		do {
			System.out.println("\n=== Menu de produto ===");
			System.out.println(
					"\n1- Lista de Pastéis e Bebidas\n2- Estoque dos produtos\n3- Reposição" + " de Produtos\n4- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Lista dos produtos
				System.out.println("\nPastéis:");
				Main.perillao.listarPasteis();
				System.out.println("\nBebidas:");
				Main.perillao.listarBebidas();
				Util.pausar(1);
				break;

			case 2: // Estoque dos produtos
				for (Pastel p : Main.perillao.getPasteis()) {
					p.verifDisponiblidade();
				}
				for (Bebida b : Main.perillao.getBebidas()) {
					b.verifDisponiblidade();
				}
				break;

			case 3: // Reposição
				Main.menuReposicao();
				break;

			case 4: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;

			}

		} while (aux != 4);
	}

	public static void menuReposicao() {

		do {
			System.out.println("\n1- Repor Pasteln\n2- Repor Bebida\n3- Sair");
			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {
			case 1:
				Pastel p = Pastel.buscarPorNome(Main.perillao.getPasteis());
				if (p != null) {
					p.repor();
				} else {
					System.out.println("\nPastel não encontrado");
				}

				break;
			case 2:
				Bebida b = Bebida.buscarPorNome(Main.perillao.getBebidas());
				if (b != null) {
					b.repor();
				} else {
					System.out.println("\nPastel não encontrado");
				}

				break;
			case 3: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;
			}

		} while (aux != 3);
	}

	public static void menuPedido() {

		do {
			System.out.println("\n=== Menu de produto ===");
			System.out.println("\n1- Cadastrar pedido\n2- Editar pedido\n3- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro

				pedidoAtual.cadastrar();
				pedidoAtual.exibir();
				break;

			case 2:
				pedidoAtual.editar();

				break;

			case 3: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;

			}

		} while (aux != 3);
	}

	public static void menuVenda() {
		do {
			System.out.println("\n=== Menu de venda ===");
			System.out.println("\n1- Cadastrar\n2- Listar \n3- Editar\n4- Cancelar\n5- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1:
				System.out.println("Pedido a ser cadastrado na venda");
				pedidoAtual.exibir();
				Venda.cadastrar(pedidoAtual, Main.perillao.getVendas());
				break;

			case 2:
				Main.perillao.listarVendas();
				break;

			case 3: // Editar
				Venda v = Venda.buscarPorId(Main.perillao.getVendas());
				if (v != null) {
					Venda.editar(v);
				} else {
					System.out.println("\nVenda não encontrada");
				}
				break;
				

			case 4: // Cancelar
				Venda.cancelar(Main.perillao.getVendas());
				break;

			case 5: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;

			}

		} while (aux != 5);
	}

	public static void menuSair() {
		System.out.println("\nAguarde..");
		Util.pausar(2);
		System.out.print("\nEncerrando em:");
		Util.pausar(1);
		System.out.print(" 3..");
		Util.pausar(1);
		System.out.print(" 2..");
		Util.pausar(1);
		System.out.print(" 1..\n");
		Util.pausar(1);
		System.out.println("\nPrograma encerrado!");
	}
}
