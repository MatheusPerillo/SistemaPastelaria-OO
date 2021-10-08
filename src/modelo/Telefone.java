package modelo;

import helper.Util;

/**
 * Cont�m os par�metros necess�rios para a classe Telefone.
 * Portanto, ela cont�m os atributos de um telefone como 
 * ddd e n�mero de telefone.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Telefone {
	private int ddd;
	private int numero;
	
	/**
	 * Construtor para instancia��o do objeto Telefone.
	 * @param ddd Integer que recebe o ddd do telefone
	 * @param numero Integer que recebe o n�mero do telefone
	 */
	public Telefone(int ddd, int numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return  "(" + this.getDdd() + ") " + this.getNumero(); 
		
	}
	
}
