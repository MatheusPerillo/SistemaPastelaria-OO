package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import helper.Util;

/**
 * Esta classe cont�m os par�metros necess�rios para a classe Funcion�rio.
 * Portanto, ela cont�m os atributos exclusivos de um 
 * funcion�rio como cargo, sal�rio, data de nascimento e o
 * n�mero de vendas, sendo que, essa quantidade come�a em 0 (zero)
 * quando um novo funcion�rio � cadastrado.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Funcionario extends Pessoa {

	private Cargo cargo;
	private Double salario;
	private String dateNasc;
	private int vendas = 0;

	/**
	 * Construtor para instancia��o do objeto Funcion�rio.
	 * @param nome String para o nome do funcion�rio.
	 * @param endereco String para o endere�o.
	 * @param telefone Integer para o telefone.
	 * @param email String para o email.
	 * @param cargo Enum para os cargos.
	 * @param salario Double para o sal�rio.
	 * @param dateNasc String para a data de nascimento.
	 * @param vendas Integer para a quantidade de vendas.
	 */
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
				+ this.getEmail() + "\nCargo: " + this.getCargo() + "\nSal�rio: " + this.getSalario()
				+ "\nVendas no m�s: " + this.getVendas();
	}
	
}
