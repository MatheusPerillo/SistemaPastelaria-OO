package modelo;

import helper.Util;

public class Telefone {
	private String ddd;
	private String numero;
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Telefone(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return  "(" + this.getDdd() + ") " + this.getNumero(); 
		
	}
	
}
