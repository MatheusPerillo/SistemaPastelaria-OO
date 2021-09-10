package modelo;

import helper.Util;

public class Endereco {
	private String estado;
	private String cidade;
	private String bairro;
	private String cep;
	private String numero;
	
	public Endereco(String estado, String cidade, String bairro, String cep, String numero) {
		super();
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Estado: " + estado + ", Cidade: " + cidade + ", Bairro: " + bairro + ", CEP: " + cep + " Número: "
				+ numero  ;
	}
	
	public static Endereco cadastrarEndereco() {
		System.out.println("Informe o estado ");
		String estado = Main.ler.nextLine();

		System.out.println("Informe a cidade ");
		String cidade = Main.ler.nextLine();

		System.out.println("Informe o bairro");
		String bairro = Main.ler.nextLine();
		System.out.println("Informe o cep");
		String cep = Main.ler.nextLine();
		System.out.println("Informe o Número");
		String num = Main.ler.nextLine();
		
		 Endereco endereco = new Endereco(estado,cidade,bairro,cep,num);
		 return endereco;
	} 
	
	public void editar(Endereco endereco) {

		System.out.println("1- Editar Estado ");
		System.out.println("2- Editar Cidade ");
		System.out.println("3- Editar Bairro ");
		System.out.println("4- Editar CEP ");
		System.out.println("5- Editar Número ");
		System.out.println("6- Editar tudo ");

		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch (aux) {
		case 1:
			System.out.println("Informe o estado ");
			String estado = Main.ler.nextLine();
			endereco.setEstado(estado);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 2:
			System.out.println("Informe a Cidade");
			String cidade = Main.ler.nextLine();
			endereco.setCidade(cidade);;
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 3:
			System.out.println("Informe o bairro ");
			String bairro = Main.ler.nextLine();
			endereco.setBairro(bairro);;
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
		case 4:
			System.out.println("Informe o CEP ");
			String cep = Main.ler.nextLine();
			endereco.setCep(cep);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
		case 5:
			System.out.println("Informe o Número ");
			String num = Main.ler.nextLine();
			endereco.setNumero(num);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 6:
			System.out.println("Informe o estado ");
			estado = Main.ler.nextLine();

			System.out.println("Informe a cidade ");
			cidade = Main.ler.nextLine();

			System.out.println("Informe o bairro");
			bairro = Main.ler.nextLine();
			System.out.println("Informe o cep");
			cep = Main.ler.nextLine();
			System.out.println("Informe o Número");
			num = Main.ler.nextLine();
			
			endereco.setEstado(estado);
			endereco.setCidade(cidade);
			endereco.setBairro(bairro);
			endereco.setCep(cep);
			endereco.setNumero(num);
			
			System.out.println("Endereço alterado com sucesso");
			Util.pausar(2);
			//Main.menu();

			break;
		default:
			System.out.println("Opção inválida");
			Util.pausar(2);
			this.editar(endereco);
			break;
		}

	}
	
	

}
