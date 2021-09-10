package modelo;

import java.util.ArrayList;

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
	
	public Cliente buscarClientePorID(ArrayList<Cliente> lista) {
		System.out.println("Digite o ID");
		Integer id = Main.ler.nextInt(); 
		Main.ler.nextLine();
		try {
			 for(Cliente c: lista) {
				 if(c.getId() == id) {
					 return c;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Venda não encontrada");
		}
		return null;
	}
	
	public void editar(Cliente cliente) {

		System.out.println("1- Editar Nome ");
		System.out.println("2- Editar Endereço ");
		System.out.println("3- Editar Telefone ");
		System.out.println("4- Editar Email ");
		System.out.println("5- Editar Número do Cartão ");
		System.out.println("6- Editar tudo ");

		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch (aux) {
		case 1:
			System.out.println("Informe o Nome ");
			String nome = Main.ler.nextLine();
			cliente.setNome(nome);
			System.out.println("Campo alterado com sucesso");
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
			System.out.println("Informe o Email ");
			String email = Main.ler.nextLine();
			cliente.setEmail(email);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 5:
			System.out.println("Informe o Número do Cartão ");
			String num = Main.ler.nextLine();
			cliente.setNumCartao(num);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 6:
			System.out.println("Informe o Nome ");
			nome = Main.ler.nextLine();
			
			cliente.getEndereco().editar(cliente.getEndereco());
			cliente.getTelefone().editar(cliente.getTelefone());
			
			System.out.println("Informe o Email ");
			email = Main.ler.nextLine();
			
			System.out.println("Informe o Número do Cartão ");
			num = Main.ler.nextLine();
			
			cliente.setNome(nome);
			cliente.setEmail(email);
			cliente.setNumCartao(num);
			
			System.out.println("Cliente alterado com sucesso");
			Util.pausar(2);
			//Main.menu();

			break;
		default:
			System.out.println("Opção inválida");
			Util.pausar(2);
			this.editar(cliente);
			break;
		}

	}


	
}
