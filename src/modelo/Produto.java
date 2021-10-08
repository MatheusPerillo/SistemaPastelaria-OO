package modelo;

import helper.Util;

/**
 * Cont�m os par�metros necess�rios para a classe abstrata Produto.
 * Portanto, ela cont�m os atributos de um produto como 
 * nome, id, valor, descri��o e a quantidade em estoque.
 * Al�m disso, ela gera um id para cada cadastro de um produto.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public abstract class Produto {

	private static int contador = 1;
	private int id;
	private String nome;
	private Double valor;
	private String descricao;
	private int qtdEstoque;

	/**
	 * Construtor para instancia��o do objeto Produto.
	 * @param nome String para o nome do produto.
	 * @param valor Double para o valor.
	 * @param descricao String para a descri��o.
	 * @param qtdEstoque Integer para a quantidade em estoque.
	 */
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
