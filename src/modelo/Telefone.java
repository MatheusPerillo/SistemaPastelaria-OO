package modelo;

import helper.Util;

public class Telefone {
	private String ddd;
	private String numero;
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Telefone(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return  "(" + this.getDdd() + ") " + this.getNumero(); 
		
	}
	
	public static Telefone cadastrarTelefone() {
		System.out.print("Informe o DDD: ");
		String ddd = Main.ler.nextLine();
		
		System.out.print("Informe o Número: ");
		String num = Main.ler.nextLine();
		
		Telefone tel = new Telefone(ddd,num);
		return tel;
		
		
	}
	
	public void editar(Telefone telefone) {

		System.out.println("\n1- Editar DDD ");
		System.out.println("2- Editar Número ");
		System.out.println("3- Editar Tudo ");
		

		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch (aux) {
		case 1:
			System.out.print("\nInforme o DDD: ");
			String ddd = Main.ler.nextLine();
			telefone.setDdd(ddd);
			System.out.println("\nCampo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 2:
			System.out.print("\nInforme o Número: ");
			String num = Main.ler.nextLine();
			telefone.setNumero(num);
			System.out.println("\nCampo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 3:
			System.out.print("\nInforme o DDD: ");
			ddd = Main.ler.nextLine();
			
			System.out.print("Informe o Número: ");
			num = Main.ler.nextLine();
			
			telefone.setDdd(ddd);
			telefone.setNumero(num);
			
			System.out.println("\nTelefone alterado com sucesso!");
			Util.pausar(2);
			//Main.menu();
			break;
			
		default:
			System.out.println("Opção inválida!");
			Util.pausar(2);
			this.editar(telefone);
			break;
		}

	}
	
}
