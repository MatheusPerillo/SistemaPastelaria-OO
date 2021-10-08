package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import helper.Util;

/**
 * Esta classe cont�m os par�metros necess�rios para a classe pastel.
 * Portanto, ela cont�m os atributos exclusivos de um 
 * pastel como tamanho e sabor.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Pastel extends Produto {

	private String tamanho;
	private String sabor;

	/**
	 * Construtor para instancia��o do objeto Pastel.
	 * @param nome String para o nome do pastel.
	 * @param valor Double para o valor do pastel.
	 * @param descricao String para a descri��o.
	 * @param qtdEstoque Integer para a quantidade em estoque.
	 * @param tamanho String para o tamanho ("P, M, G, GG").
	 * @param sabor String para o sabor.
	 */
	public Pastel(String nome, Double valor, String descricao, int qtdEstoque, String tamanho, String sabor) {
		super(nome, valor, descricao, qtdEstoque);
		this.tamanho = tamanho;
		this.sabor = sabor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + "\nSabor: " + this.getSabor() + "\nTamanho: " + this.getTamanho()
				+ "\nDescri��o: " + this.getDescricao() + "\nValor: " + Util.doubleParaString(this.getValor())
				+ "\nQuantidade Em estoque: " + this.getQtdEstoque();
	}

}
