package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import helper.Util;

public class Funcionario extends Pessoa {



	private Cargo cargo;
	private Double salario;
	private String dateNasc;
	private int vendas = 0;

	public Funcionario(String nome, Endereco endereco, Telefone telefone, String email, Cargo cargo, Double salario,
			String dateNasc) {
		super(nome, endereco, telefone, email);
		this.cargo = cargo;
		this.salario = salario;
		this.dateNasc = dateNasc;

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

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	@Override
	public String toString() {
		return "\nID:" + this.getId() + "\nNome: " + this.getNome() + "\nEndereco: " + this.getEndereco()
				+ "\nData de Nascimento: " + this.getDateNasc() + "\nTelefone: " + this.getTelefone() + "\nEmail: "
				+ this.getEmail() + "\nCargo: " + this.getCargo() + "\nSalário: " + this.getSalario()
				+ "\nVendas no mês: " + this.getVendas();
	}
	public void promover() {
		for (int i = 0; i < Cargo.list.size(); i++) {

			if (this.getCargo().equals(Cargo.Gerente)) {
				System.out.println("\nO funcionário já possui o cargo máximo");
				break;
			}
			if (Cargo.list.get(i).equals(this.getCargo()) && i < 2) {
				this.setCargo(Cargo.list.get(i + 1));
				System.out.println("Funcionário " + this.getNome() + " promovido com sucesso");
				break;
			}
		}

	}

	public void rebaixar() {
		for (int i = 0; i < Cargo.list.size(); i++) {

			if (this.getCargo().equals(Cargo.Trainee)) {
				System.out.println("\nO funcionário já possui o cargo mínimo");
				break;
			}
			if (Cargo.list.get(i).equals(this.getCargo()) && i > 0) {
				this.setCargo(Cargo.list.get(i - 1));
				System.out.println("Funcionário " + this.getNome() + " rebaixado com sucesso");
				break;
			}
		}

	}

	public static Funcionario buscarPorID(ArrayList<Funcionario> lista) {
		System.out.print("\nDigite o ID do funcionário: ");
		Integer id = Main.ler.nextInt();
		Main.ler.nextLine();
		try {
			for (Funcionario f : lista) {
				if (f.getId() == id) {
					return f;
				}
			}
		} catch (Exception e) {
			System.out.println("Funcionário não encontrado");
		}
		return null;
	}

}
