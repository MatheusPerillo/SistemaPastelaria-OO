package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import helper.Util;


public class Funcionario extends Pessoa {
	
	public enum Cargo {
		Trainee,Vendedor,Gerente;
		
		static List<Cargo> list = Arrays.asList(Cargo.values());
		public static void listarCargos() {			
			for(int i=0; i<list.size();i++) {
				System.out.println(i+"- " + list.get(i));
			}
		}
	}
	
	private Cargo cargo;
	private Double salario;
	private String dateNasc;
	private int vendasMes;
	
	public Funcionario(String nome, Endereco endereco, Telefone telefone, String email, Cargo cargo,
			Double salario,String dateNasc, int vendasMes) {
		super(nome, endereco, telefone, email);
		this.cargo = cargo;
		this.salario = salario;
		this.dateNasc = dateNasc;
		this.vendasMes = vendasMes;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDateNasc() {
		return dateNasc;
	}

	public void setDateNasc(String dateNasc) {
		this.dateNasc = dateNasc;
	}

	public int getVendasMes() {
		return vendasMes;
	}

	public void setVendasMes(int vendasMes) {
		this.vendasMes = vendasMes;
	}
	
	public void promover() {
		for(int i=0; i<Cargo.list.size();i++) {
			
			if(this.getCargo().equals(Cargo.Gerente)) {
				System.out.println("\nO funcionário já possui o cargo máximo");
				break;
			}
			if(Cargo.list.get(i).equals( this.getCargo()) && i<2) {
				this.setCargo(Cargo.list.get(i+1));
				System.out.println("Funcionário " +this.getNome()+ " promovido com sucesso");
				break;
			}
		}
		
	}
	
	public void rebaixar() {
		for(int i=0; i<Cargo.list.size();i++) {
			
			if(this.getCargo().equals(Cargo.Trainee)) {
				System.out.println("\nO funcionário já possui o cargo mínimo");
				break;
			}
			if(Cargo.list.get(i).equals( this.getCargo()) && i>0) {
				this.setCargo(Cargo.list.get(i-1));	
				System.out.println("Funcionário " +this.getNome()+ " rebaixado com sucesso");
				break;
			}
		}	
		
	}
	
	

	@Override
	public String toString() {
		return "\nID:" + this.getId() + "\nNome: " + this.getNome() + "\nEndereco: " + this.getEndereco() 
		+"\nData de Nascimento: "+ this.getDateNasc()+ "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail() + "\nCargo: " + this.getCargo()
		+ "\nSalário: " + this.getSalario() + "\nVendas no mês: " + this.getVendasMes() ;
	}
	
	public void editarCargo() {
		System.out.println("Informe se deseja promover ou rebaixar o cargo ");
		System.out.println("\n1-Promover\n2-Rebaixar");
		 int aux = Main.ler.nextInt();
		Main.ler.nextLine();			
		if(aux ==1) { this.promover();
		}else if(aux==2) { this.rebaixar();
		}else {System.out.println("Opção inválida");
		Util.pausar(2);
		this.editar(this);}
	}
	
	public Funcionario buscarFuncionarioPorID(ArrayList<Funcionario> lista) {
		System.out.println("Digite o ID");
		Integer id = Main.ler.nextInt(); 
		Main.ler.nextLine();
		try {
			 for(Funcionario f: lista) {
				 if(f.getId() == id) {
					 return f;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Funcionário não encontrada");
		}
		return null;
	}
	
	
	public void editar(Funcionario funcionario) {

		System.out.println("\n1- Editar Nome ");
		System.out.println("2- Editar Endereço ");
		System.out.println("3- Editar Telefone ");
		System.out.println("4- Editar Email ");
		System.out.println("5- Editar Cargo ");
		System.out.println("6- Editar salário ");
		System.out.println("7- Editar data de nascimento ");
		System.out.println("8- Editar vendas no mês");
		System.out.println("9- Editar tudo");

		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch (aux) {
		case 1:
			System.out.println("Informe o Nome ");
			String nome = Main.ler.nextLine();
			funcionario.setNome(nome);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 2:
			funcionario.getEndereco().editar(funcionario.getEndereco());
			//Main.menu();
			break;
		case 3:
			funcionario.getTelefone().editar(funcionario.getTelefone());
			//Main.menu();
			break;
		case 4:
			System.out.println("Informe o Email ");
			String email = Main.ler.nextLine();
			funcionario.setEmail(email);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 5:
			
			funcionario.editarCargo();;
			//Main.menu();	
			break;
		case 6:
			System.out.println("Informe o salário ");
			Double sal = Main.ler.nextDouble();
			 Main.ler.nextLine();
			funcionario.setSalario(sal);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 7:
			System.out.println("Informe a data de nascimento ");
			String data = Main.ler.nextLine();
			funcionario.setDateNasc(data);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 8:
			System.out.println("Informe o número de vendas no mês ");
			int venda = Main.ler.nextInt();
			Main.ler.nextLine();
			funcionario.setVendasMes(venda);
			System.out.println("Campo alterado com sucesso");
			Util.pausar(2);
			//Main.menu();
			break;
		case 9:
			System.out.println("Informe o Nome ");
			nome = Main.ler.nextLine();
			funcionario.setNome(nome);
			funcionario.getEndereco().editar(funcionario.getEndereco());
			funcionario.getTelefone().editar(funcionario.getTelefone());
			
			System.out.println("Informe o Email ");
			email = Main.ler.nextLine();
			
			funcionario.editarCargo();
			
			System.out.println("Informe o salário");
			 sal = Main.ler.nextDouble();
			 Main.ler.nextLine();
			System.out.println("Informe a data de nascimento");
			data = Main.ler.nextLine();
			System.out.println("Informe o número de vendas no mês");
			venda = Main.ler.nextInt();
			Main.ler.nextLine();
			
			
			funcionario.setEmail(email);
			funcionario.setSalario(sal);
			funcionario.setDateNasc(data);
			funcionario.setVendasMes(venda);
			System.out.println("Funcionário alterado com sucesso");
			Util.pausar(2);
			//Main.menu();

			break;
		default:
			System.out.println("Opção inválida");
			Util.pausar(2);
			this.editar(funcionario);
			break;
		}

	}
	
	
	
}
