package modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import helper.Util;

public class Venda {
	private static int contador=1;
	private Integer Id;
	private Pedido pedido;
	private String formaPagamento;
	private Date dataPagamento;
	
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

	public static Venda buscarPorId(ArrayList<Venda> lista, int id) {
		try {
			 for(Venda v: lista) {
				 if(v.getId() == id) {
					 return v;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Venda n�o encontrada");
		}
		return null;
	}
	
	
	@Override
	public String toString() {
		this.pedido.exibir();;
		return "\nVenda: "  +"\nForma de Pagemento: " + formaPagamento + "\nDataPagamento: " + Util.dateParaString(dataPagamento);
	}
	
	
	

}
