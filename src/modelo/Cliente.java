package modelo;

import java.util.ArrayList;
import java.util.List;

import helper.Util;

/**
 * Contém os parâmetros necessários para a classe Cliente.
 * Portanto, ela contém os atributos exclusivos de um 
 * cliente como número do cartão.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Cliente extends Pessoa {
	
	/**
	 * Construtor para instanciação do objeto Cliente
	 * @param nome String para o nome do cliente.
	 * @param endereco Endereço a ser cadastrado.
	 * @param telefone Telefone a ser cadastrado.
	 * @param email String para o email.
	 * @param numCartao String para o número do cartão.
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
		+ "\nTelefone: " + this.getTelefone() + "\nEmail: " + this.getEmail() + "\nNúmero do Cartao: " + this.getNumCartao();
	}

}
