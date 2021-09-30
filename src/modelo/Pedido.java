package modelo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import java.util.Map;

import helper.Util;

public class Pedido {
	private static int contador = 1;
	private int id;
	private HashMap<Pastel, Integer> pasteis = new HashMap<>();
	private HashMap<Bebida, Integer> bebidas = new HashMap<>();
	private Double valorTotal;
	private Cliente cliente;
	private Funcionario vendedor;
	private Date dataPedido;

	public Pedido(Double valorTotal, Cliente cliente, Funcionario vendedor, Date dataPedido) {
		this.id = Pedido.contador;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.dataPedido = dataPedido;
		contador++;
	}

	public Pedido() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HashMap<Pastel, Integer> getPasteis() {
		return pasteis;
	}

	public void setPasteis(HashMap<Pastel, Integer> pasteis) {
		this.pasteis = pasteis;
	}

	public HashMap<Bebida, Integer> getBebidas() {
		return bebidas;
	}

	public void setBebidas(HashMap<Bebida, Integer> bebidas) {
		this.bebidas = bebidas;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Funcionario vendedor) {
		this.vendedor = vendedor;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public void pedirPastel(Pastel pastel, int qtd) {
		if (pastel.getQtdEstoque() >= qtd) {
			this.pasteis.put(pastel, qtd);
			pastel.setQtdEstoque(pastel.getQtdEstoque() - qtd);
		} else {
			throw new StringIndexOutOfBoundsException ();
		}

	}

	public void pedirBebida(Bebida bebida, int qtd) {
		if (bebida.getQtdEstoque() >= qtd) {
			this.bebidas.put(bebida, qtd);
			bebida.setQtdEstoque(bebida.getQtdEstoque() - qtd);
		} else {
			throw new StringIndexOutOfBoundsException ();
		}

	}

	
	public void calcularValorTotal() {
		double valorTotal = 0;
		double valorBebidas = 0;
		double valorPasteis = 0;
		for (Map.Entry<Bebida, Integer> entrada : bebidas.entrySet()) {
			valorPasteis += entrada.getValue() * entrada.getKey().getValor();
		}
		for (Map.Entry<Pastel, Integer> entrada : pasteis.entrySet()) {
			valorBebidas += entrada.getValue() * entrada.getKey().getValor();
		}
		valorTotal = valorBebidas + valorPasteis;
		this.setValorTotal(valorTotal);
		GregorianCalendar data = new GregorianCalendar();
		this.setDataPedido(data.getTime());
	}

	
}
