package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import helper.Util;

public class Pastel extends Produto {

	private String tamanho;
	private String sabor;

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
				+ "\nDescrição: " + this.getDescricao() + "\nValor: " + Util.doubleParaString(this.getValor())
				+ "\nQuantidade Em estoque: " + this.getQtdEstoque();
	}

}
