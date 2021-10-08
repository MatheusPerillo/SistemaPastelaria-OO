package modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import helper.Util;

/**
 * Esta classe cont�m os par�metros necess�rios para a classe Bebida.
 * Portanto, ela cont�m os atributos exclusivos de uma 
 * bebida como volume e tipo.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Bebida extends Produto {

	private int volume;
	private String tipo;

	/**
	 * Construtor para instancia��o do objeto Bebida.
	 * @param nome String para o nome do bebida.
	 * @param valor Double para o valor do bebida.
	 * @param descricao String para a descri��o.
	 * @param qtdEstoque Integer para a quantidade em estoque.
	 * @param volume String para o volume.
	 * @param tipo String para o tipo ("garrafa, copo").
	 */
	public Bebida(String nome, Double valor, String descricao, int qtdEstoque, int volume, String tipo) {
		super(nome, valor, descricao, qtdEstoque);
		this.volume = volume;
		this.tipo = tipo;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + "\nTipo: " + this.getTipo() + "\nVolume: " + Integer.toString(getVolume())
				+ "\nDescri��o: " + this.getDescricao() + "\nValor: " + Util.doubleParaString(this.getValor())
				+ "\nQtd em estoque: " + Integer.toString(getQtdEstoque());
	}

	



	

	

}
