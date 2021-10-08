package modelo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import java.util.Map;

import helper.Util;

/**
 * Esta classe contém os parâmetros necessários para a classe Pedido.
 * Além disso, ela gera um id para cada cadastro de um pedido.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class Pedido {
	
	private static int contador = 1;
	private int id;
	private HashMap<Pastel, Integer> pasteis = new HashMap<>();
	private HashMap<Bebida, Integer> bebidas = new HashMap<>();
	private Double valorTotal;
	private Cliente cliente;
	private Funcionario vendedor;
	private Date dataPedido;

	/**
	 * Construtor para instanciação do objeto Pedido.
	 * @param valorTotal Double para o valor total do pedido.
	 * @param cliente Cliente que fez o pedido.
	 * @param vendedor Funcionário que realizou o pedido.
	 * @param dataPedido Date que recebe a data que o pedido foi feito.
	 */
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

	/**
	 * Este método verifica se a quantidade em estoque é maior ou igual
	 * a quantidade pedida e insere o pastel no hashmap do pedido.
	 * @param pastel Objeto pastel a ser pedido.
	 * @param qtd Integer que recebe a quantidade pedida.
	 */
	public void pedirPastel(Pastel pastel, int qtd) {
		if (pastel.getQtdEstoque() >= qtd) {
			this.pasteis.put(pastel, qtd);
			pastel.setQtdEstoque(pastel.getQtdEstoque() - qtd);
		} else {
			throw new StringIndexOutOfBoundsException ();
		}

	}


	/**
	 * Este método verifica se a quantidade em estoque é maior ou igual
	 * a quantidade pedida e insere a bebida no hashmap do pedido.
	 * @param bebida Objeto bebida a ser pedido.
	 * @param qtd Integer que recebe a quantidade pedida.
	 */
	public void pedirBebida(Bebida bebida, int qtd) {
		if (bebida.getQtdEstoque() >= qtd) {
			this.bebidas.put(bebida, qtd);
			bebida.setQtdEstoque(bebida.getQtdEstoque() - qtd);
		} else {
			throw new StringIndexOutOfBoundsException ();
		}

	}

	/**
	 * Este método calcula o valor total do pedido de acordo com os valores dos atributos definidos
	 * dos pastéis e das bebidas pedidas. Ao calcular o atributo do objeto Pedido
	 * ele recebe o resultado do cálculo.
	 */
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
