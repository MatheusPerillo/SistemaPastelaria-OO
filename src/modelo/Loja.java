package modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Optional;

import helper.Util;

public class Loja {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	

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



