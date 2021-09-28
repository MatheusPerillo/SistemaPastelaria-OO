package modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import helper.Util;

public class Bebida extends Produto {

	private int volume;
	private String tipo;

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
				+ "\nDescrição: " + this.getDescricao() + "\nValor: " + Util.doubleParaString(this.getValor())
				+ "\nQtd em estoque: " + Integer.toString(getQtdEstoque());
	}

	



	

	

}
