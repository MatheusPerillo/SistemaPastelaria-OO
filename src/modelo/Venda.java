package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import helper.Util;

/**
 * Esta classe cont�m os par�metros necess�rios para a classe Venda.
 * Portanto, ela cont�m os atributos de uma venda como 
 * id, pedido, forma de pagamento e a data do pagamento.
 * Al�m disso, ela gera um id para cada cadastro de uma venda.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Venda {
	private static int contador=1;
	private Integer Id;
	private Pedido pedido;
	private String formaPagamento;
	private Date dataPagamento;
	
	/**
	 * Construtor para instancia��o do objeto Venda.
	 * @param pedido Pedido a ser cadastrado.
	 * @param formaPagamento String para a forma de pagamento.
	 * @param dataPagamento Date para a data do pagamento.
	 */
	public Venda(Pedido pedido, String formaPagamento, Date dataPagamento) {
		this.Id= Venda.contador;
		this.pedido = pedido;
		this.formaPagamento = formaPagamento;
		this.dataPagamento = dataPagamento;
		Venda.contador++;
		this.pedido.getVendedor().setVendas(pedido.getVendedor().getVendas()+1);
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	@Override
	public String toString() {
		return "\nVenda: " +"\nID:" +Id  +"\nForma de Pagemento: " + formaPagamento + "\nDataPagamento: " + Util.dateParaString(dataPagamento);
	}
	
	
	

}
