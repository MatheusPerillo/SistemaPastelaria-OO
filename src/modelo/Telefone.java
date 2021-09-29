package modelo;

import helper.Util;

public class Telefone {
	private int ddd;
	private int numero;
	
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
	
	public Telefone(int ddd, int numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return  "(" + this.getDdd() + ") " + this.getNumero(); 
		
	}
	
}
