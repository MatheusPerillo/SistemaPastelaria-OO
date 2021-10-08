package modelo;

import helper.Util;

/**
 * Esta classe contém os parâmetros necessários para a classe Endereco.
 * Portanto, ela contém os atributos de um endereço como 
 * estado, cidade, bairro, cep e número da residência.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Endereco {
	private String estado;
	private String cidade;
	private String bairro;
	private String cep;
	private int numero;

	/**
	 * Construtor para instanciação do objeto Endereco.
	 * @param estado String para estado.
	 * @param cidade String para cidade
	 * @param bairro String para bairro.
	 * @param cep String para o cep.
	 * @param numero Integer para o número da residência.
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
		return "Estado: " + estado + ", Cidade: " + cidade + ", Bairro: " + bairro + ", CEP: " + cep + " Número: "
				+ numero;
	}


}
