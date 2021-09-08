package modelo;

import helper.Util;

public class Telefone {
	private int ddd;
	private String numero;
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Telefone(int ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return  this.getDdd() + " " + this.getNumero();
		
	}
	
	public void editar(Telefone telefone) {

		System.out.println("1- Editar DDD ");
		System.out.println("2- Editar N�mero ");
		System.out.println("3- Editar Tudo ");
		

		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch (aux) {
		case 1:
			System.out.println("Informe o DDD ");
			int ddd = Main.ler.nextInt();
			Main.ler.nextLine();
			telefone.setDdd(ddd);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 2:
			System.out.println("Informe o N�mero");
			String num = Main.ler.nextLine();
			telefone.setNumero(num);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 3:
			System.out.println("Informe o DDD ");
			ddd = Main.ler.nextInt();
			Main.ler.nextLine();
			
			System.out.println("Informe o N�mero ");
			num = Main.ler.nextLine();
			
			telefone.setDdd(ddd);
			telefone.setNumero(num);
			
			System.out.println("Telefone alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
		
		default:
			System.out.println("Op��o inv�lida");
			Util.pausar(2);
			this.editar(telefone);
			break;
		}

	}
	
}
