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
			String dateNasc, int vendas) {
		super(nome, endereco, telefone, email);
		this.cargo = cargo;
		this.salario = salario;
		this.dateNasc = dateNasc;
		this.vendas = vendas;

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
	
}
