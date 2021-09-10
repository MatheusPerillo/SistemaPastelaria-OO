package modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import helper.Util;

public class Venda {
	private Integer Id;
	private static int contador=1;
	private Pedido pedido;
	private String formaPagamento;
	private Date dataPagamento;
	
	public Venda(Pedido pedido, String formaPagamento, Date dataPagamento) {
		this.Id= Venda.contador;
		this.pedido = pedido;
		this.formaPagamento = formaPagamento;
		this.dataPagamento = dataPagamento;
		Venda.contador++;
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

	public Venda buscarPorID(ArrayList<Venda> lista) {
		System.out.println("Digite o ID");
		Integer id = Main.ler.nextInt(); 
		Main.ler.nextLine();
		try {
			 for(Venda v: lista) {
				 if(v.getId() == id) {
					 return v;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Venda não encontrada");
		}
		return null;
	}
	
	@Override
	public String toString() {
		this.pedido.listarPedido();
		return "\nVenda: "  +"\nForma de Pagemento: " + formaPagamento + "\nDataPagamento: " + Util.dateParaString(dataPagamento);
	}
	
	
	

}
