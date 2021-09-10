package modelo;

import java.util.ArrayList;
import java.util.List;

import helper.Util;

public class Cliente extends Pessoa {
	
	public Cliente(String nome, Endereco endereco, Telefone telefone, String email, String numCartao) {
		super(nome, endereco, telefone, email);
		this.numCartao = numCartao;
	}

	private String numCartao;

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	@Override
	public String toString() {
		return "\nID: " + this.getId() + "\nNome: " + this.getNome() + "\nEndereco: " + this.getEndereco() 
		+ "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail() + "\nNúmero do Cartao: " + this.getNumCartao();
	}
	
	public static Cliente buscarPorID(ArrayList<Cliente> lista) {
		System.out.print("\nDigite o ID do cliente: ");
		Integer id = Main.ler.nextInt(); 
		Main.ler.nextLine();
		try {
			 for(Cliente c: lista) {
				 if(c.getId() == id) {
					 return c;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Cliente não encontrada");
		}
		return null;
	}
	public static void cadastrar(List<Cliente> lista) {
		System.out.print("Digite o nome do cliente: ");
		String nome = Main.ler.nextLine();
		System.out.println();
		
		Endereco end = Endereco.cadastrar();
		Telefone tel= Telefone.cadastrarTelefone();
		
		System.out.print("Digite o email: ");
		String email= Main.ler.nextLine();
		
		System.out.print("Digite o número do Cartão: ");
		String numCartao= Main.ler.nextLine();
		Cliente cliente= new Cliente(nome,end,tel,email,numCartao);
		lista.add(cliente);
		
	}
	
	public static void remover(List<Cliente> lista) {
		Cliente c = Cliente.buscarPorID(Main.perillao.getClientes());
		if (c != null) {
			lista.remove(c);
			System.out.println("\nCliente removido com sucesso!");
		} else {
			System.out.println("\nCliente não encontrado");
		}
	}
	public static void editar(Cliente cliente) {

		System.out.println("\n1- Editar Nome ");
		System.out.println("2- Editar Endereço ");
		System.out.println("3- Editar Telefone ");
		System.out.println("4- Editar Email ");
		System.out.println("5- Editar Número do Cartão ");
		System.out.println("6- Editar tudo ");

		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch (aux) {
		case 1:
			System.out.print("\nInforme o Nome: ");
			String nome = Main.ler.nextLine();
			cliente.setNome(nome);
			System.out.println("\nCampo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 2:
			cliente.getEndereco().editar(cliente.getEndereco());
			//Main.menu();
			break;
		case 3:
			cliente.getTelefone().editar(cliente.getTelefone());
			//Main.menu();
			break;
		case 4:
			System.out.print("\nInforme o Email: ");
			String email = Main.ler.nextLine();
			cliente.setEmail(email);
			System.out.println("\nCampo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 5:
			System.out.print("\nInforme o Número do Cartão: ");
			String num = Main.ler.nextLine();
			cliente.setNumCartao(num);
			System.out.println("\nCampo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 6:
			System.out.print("\nInforme o Nome: ");
			nome = Main.ler.nextLine();
			
			cliente.getEndereco().editar(cliente.getEndereco());
			cliente.getTelefone().editar(cliente.getTelefone());
			
			System.out.print("\nInforme o Email: ");
			email = Main.ler.nextLine();
			
			System.out.print("\nInforme o Número do Cartão: ");
			num = Main.ler.nextLine();
			
			cliente.setNome(nome);
			cliente.setEmail(email);
			cliente.setNumCartao(num);
			
			System.out.println("\nCliente alterado com sucesso!");
			Util.pausar(2);
			//Main.menu();

			break;
		default:
			System.out.println("Opção inválida\n");
			Util.pausar(2);
			Cliente.editar(cliente);
			break;
		}

	}
		
	

	
}
