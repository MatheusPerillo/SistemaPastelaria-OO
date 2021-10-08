package modelo;

import helper.Util;

/**
 * Esta classe cont�m os par�metros necess�rios para a classe Endereco.
 * Portanto, ela cont�m os atributos de um endere�o como 
 * estado, cidade, bairro, cep e n�mero da resid�ncia.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Endereco {
	private String estado;
	private String cidade;
	private String bairro;
	private String cep;
	private int numero;

	/**
	 * Construtor para instancia��o do objeto Endereco.
	 * @param estado String para estado.
	 * @param cidade String para cidade
	 * @param bairro String para bairro.
	 * @param cep String para o cep.
	 * @param numero Integer para o n�mero da resid�ncia.
	 */
	public Endereco(String estado, String cidade, String bairro, String cep, int numero) {
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Estado: " + estado + ", Cidade: " + cidade + ", Bairro: " + bairro + ", CEP: " + cep + " N�mero: "
				+ numero;
	}


}
