package modelo;

import java.util.GregorianCalendar;
import java.util.Scanner;

import helper.Util;
import modelo.Funcionario.Cargo;

public class Main {
	public static Scanner ler = new Scanner(System.in);
	public static int aux;

	public static void main(String[] args) {
		int auxMenu;

		GregorianCalendar dataDeInscricao = new GregorianCalendar();
		Endereco end = new Endereco("Distrito federal", "Brasília", "Band", "71710011", "04");
		Telefone tel = new Telefone("61", "99946-8480");
		Loja perillao = new Loja("Os brasbos", end, tel);
		Cliente joao = new Cliente("Joao", end, tel, "ui@ui.com", "123");
		Pastel flango = new Pastel("frangod", 10.00, "frango de Deus", 4, "G", "frango");
		Pastel flango2 = new Pastel("frangod2", 20.00, "frango de Deus", 2, "G", "frango");
		Bebida coca = new Bebida("coca", 7.99, "geladinha", 2, 2000, "garrafa");
		Funcionario perillo = new Funcionario("Perillo", end, tel, "email@email.com", Cargo.Gerente, 3565.88,
				"24/02/2001", 10);
		Pedido pedido1 = new Pedido(200.0, joao, perillo, dataDeInscricao.getTime());

		// System.out.println(pedido1.getValorTotal());
		// pedido1.pedirBebida(coca, 2);
		// pedido1.pedirPastel(flango, 2);
		// pedido1.pedirPastel(flango2, 3);
		// pedido1.calcularValorTotal();

		// pedido1.listarBebidasPedidas();
		// pedido1.listarPasteisPedidos();

		// System.out.println("\n\n"+pedido1.getValorTotal());

		// --------------------------------- MENU INICIAL
		// ---------------------------------------

		do {
			System.out.println("MENU DE OPÇÕES\n");
			System.out.println("1. Cliente\n2. Funcionário\n" + "3. Pastel\n4. Bebida" + "\n5. Produtos\n"
					+ "6. Pedido\n7. Venda\n8. Sair");

			auxMenu = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (auxMenu) {

			case 1: // Cliente
				Main.menuClientes();

				break;

			case 2: // Funcionário
				Main.menuFuncionario();

				break;

			case 3: // Pastel
				Main.menuPastel();

				break;

			case 4: // Bebida
				Main.menuBebida();

				break;

			case 5: // Produto
				Main.menuProduto();

				break;

			case 6: // Pedido
				Main.menuPedido();

				break;

			case 7: // Venda
				Main.menuVenda();
				break;

			case 8: // Sair
				Main.menuSair();

				break;

			}

		} while (auxMenu != 8);

	}

// ------------------------------- MÉTODOS MENU --------------------------------

	public static void menuClientes() {

		do {
			System.out.println("\n1- Cadastrar \n2- Buscar \n3- Listar " + "\n4- Editar\n5- Excluir\n6- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro

				System.out.println("\nCadastro de cliente realizado com sucesso!");
				Util.pausar(1);
				break;

			case 2: // Buscar Cliente

				System.out.println("Digite o nome do cliente: ");
				Main.ler.nextLine();
				// Método buscar

				break;

			case 3: // Listar Cliente
				// Método listar

				break;

			case 4: // Editar
				// Método editar Cliente

				break;

			case 5: // Excluir

				System.out.println("Digite o ID do cliente a ser excluído");
				Main.ler.nextInt();
				Main.ler.nextLine();

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
			System.out.println("\n1- Cadastrar \n2- Buscar \n3- Listar " + "\n4- Editar\n5- Demitir\n6- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro

				System.out.println("\nCadastro de funcionário realizado com sucesso!");
				Util.pausar(1);
				break;

			case 2: // Buscar funcionario

				System.out.println("Digite o nome do funcionário: ");
				Main.ler.nextLine();
				// Método buscar

				break;

			case 3: // Listar funcionario
				// Método listar

				break;

			case 4: // Editar
				// Método editar funcionario

				break;

			case 5: // Demitir

				System.out.println("Digite o ID do funcionário a ser excluído");
				Main.ler.nextInt();
				Main.ler.nextLine();

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
			System.out.println("\n1- Cadastrar \n2- Buscar \n3- Listar " + "\n4- Editar\n5- Remover\n6- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro

				System.out.println("\nPastel cadastrado com sucesso!");
				Util.pausar(1);
				break;

			case 2: // Buscar pastel

				System.out.println("Digite o nome do pastel: ");
				Main.ler.nextLine();
				// Método buscar

				break;

			case 3: // Listar pastel
				// Método listar

				break;

			case 4: // Editar
				// Método editar pastel

				break;

			case 5: // Remover

				System.out.println("Digite o nome do pastel a ser excluído");
				Main.ler.nextInt();
				Main.ler.nextLine();

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
			System.out.println("\n1- Cadastrar \n2- Buscar \n3- Listar " + "\n4- Editar\n5- Remover\n6- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro

				System.out.println("\nBebida cadastrada com sucesso!");
				Util.pausar(1);
				break;

			case 2: // Buscar bebida

				System.out.println("Digite o nome da bebida: ");
				Main.ler.nextLine();
				// Método buscar

				break;

			case 3: // Listar bebida
				// Método listar

				break;

			case 4: // Editar
				// Método editar bebida

				break;

			case 5: // Remover

				System.out.println("Digite o nome da bebida a ser removida");
				Main.ler.nextInt();
				Main.ler.nextLine();

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
			System.out.println(
					"\n1- Lista de Pasteis e Bebidas\n2- Estoque dos produtos\n3- Reposição" + " de Produtos\n4- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Lista dos produtos
				break;

			case 2: // Estoque
				break;

			case 3: // Reposição
				break;

			case 4: // Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;

			}

		} while (aux != 4);
	}

	public static void menuPedido() {
		do {
			System.out.println("\n1- Cadastrar pedido\n2- Editar pedido\n3- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro
				break;

			case 2: // Editar
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
			System.out.println("\n1- Cadastrar\n2- Listar \n3- Editar\n4- Cancelar\n5- Sair");

			aux = Main.ler.nextInt();
			Main.ler.nextLine();
			switch (aux) {

			case 1: // Cadastro
				break;

			case 2: // Listar
				break;

			case 3: // Editar
				break;

			case 4: // Cancelar
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
