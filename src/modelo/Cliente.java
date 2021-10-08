package modelo;

import java.util.ArrayList;
import java.util.List;

import helper.Util;

/**
 * Cont�m os par�metros necess�rios para a classe Cliente.
 * Portanto, ela cont�m os atributos exclusivos de um 
 * cliente como n�mero do cart�o.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Cliente extends Pessoa {
	
	/**
	 * Construtor para instancia��o do objeto Cliente
	 * @param nome String para o nome do cliente.
	 * @param endereco Endere�o a ser cadastrado.
	 * @param telefone Telefone a ser cadastrado.
	 * @param email String para o email.
	 * @param numCartao String para o n�mero do cart�o.
	 */
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
		+ "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail() + "\nN�mero do Cartao: " + this.getNumCartao();
	}

}
