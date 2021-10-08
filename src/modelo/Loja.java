package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Optional;

import helper.Util;

/**
 * Esta classe contém os parâmetros necessários para a classe Loja.
 * Portanto, ela contém os atributos de uma loja como nome, endereço
 * e telefone.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Loja {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	
/**
 * Construtor para instanciação do objeto Loja.
 * @param nome String para o nome da loja.
 * @param endereco Endereço a ser cadastrado.
 * @param telefone Telefone a ser cadastrado.
 */
	public Loja(String nome, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	

	@Override
	public String toString() {
		return "Nome da loja: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
	}

}



