package modelo;

import helper.Util;

public abstract class Produto {

	private static int contador = 1;
	private int id;
	private String nome;
	private Double valor;
	private String descricao;
	private int qtdEstoque;

	public Produto(String nome, Double valor, String descricao, int qtdEstoque) {
		this.id = Produto.contador;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.qtdEstoque = qtdEstoque;
		Produto.contador++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

}
