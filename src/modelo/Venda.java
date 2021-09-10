package modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

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

	public static Venda buscarPorID(ArrayList<Venda> lista) {
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
	public static Venda cadastrarVenda(Pedido pedido) {
		System.out.println("\nDigite a forma de pagamento: ");
		String pag = Main.ler.nextLine(); 
		System.out.println();
		GregorianCalendar data = new GregorianCalendar();
		Venda v= new Venda(pedido,pag, data.getTime());
		return v;
	}
	
	public static void editarVenda(Venda v) {
		System.out.println("\nNão é permitido editar o pedido,caso deseje fazer isso exclua a venda e a cadastre novamente xD");
		System.out.println("\nDigite a nova forma de pagamento");
		String pag = Main.ler.nextLine();
		v.setFormaPagamento(pag);
	}
	
	@Override
	public String toString() {
		this.pedido.listarPedido();
		return "\nVenda: "  +"\nForma de Pagemento: " + formaPagamento + "\nDataPagamento: " + Util.dateParaString(dataPagamento);
	}
	
	
	

}
