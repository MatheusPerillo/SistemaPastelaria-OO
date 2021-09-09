package modelo;


import java.util.Date;
import java.util.HashMap;

import java.util.Map;


public class Pedido {
	private int id;
	private static int contador;
	private HashMap<Pastel,Integer> pasteis = new HashMap<>();
	private HashMap<Bebida,Integer> bebidas = new HashMap<>();
	private Double valorTotal;
	private Cliente cliente;
	private Funcionario vendedor;
	private Date dataPedido;
	
	public Pedido( Double valorTotal,Cliente cliente, Funcionario vendedor, Date dataPedido) {
		this.id = Pedido.contador;		
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.dataPedido = dataPedido;
		contador++;
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
		if(pastel.getQtdEstoque() >= qtd) {
		this.pasteis.put(pastel, qtd);		
		System.out.println("Pastel: " + pastel.getNome()+ " Pedido com sucesso" + "\nQtd pedida: " + qtd  );
		}else {System.out.println("\nNão há produto em estoque suficiente para o pedido");}	
		
	}	
	public void pedirBebida(Bebida bebida, int qtd) {
		this.bebidas.put(bebida, qtd);
		System.out.println("Bebida: " + bebida.getNome()+ " Pedida com sucesso" + "\nQtd pedida: " + qtd  );
	}
	
	public void listarPasteisPedidos() {
		System.out.println("\nPasteis pedidos: ");
		for(Map.Entry<Pastel, Integer> entrada : pasteis.entrySet()) {
				System.out.println(entrada.getKey() + "\nQtd Pedida: " +entrada.getValue() );		
			}	
	}
	
	public void listarBebidasPedidas() {
		System.out.println("\nBebidas pedidas: ");
		for(Map.Entry<Bebida, Integer> entrada :bebidas.entrySet()) {
			System.out.println(entrada.getKey() + "\nQtd Pedida: " +entrada.getValue() );		
		}
	}
	
	public void listarProdutosPedidos() {
		this.listarBebidasPedidas();
		this.listarPasteisPedidos();
	}
	
	public void AlterarPastelPedido(Pastel pastel, Pastel novoPastel) {
		for(Map.Entry<Pastel, Integer> entrada : pasteis.entrySet()) {
				if(pastel.equals(entrada.getKey())) {
					pasteis.remove(entrada.getKey());
					System.out.println("\nDigite a nova quantidade:");
					int qtd = Main.ler.nextInt();
					Main.ler.nextLine();
					this.pedirPastel(novoPastel, qtd);
				}		
			}	
		
	}
	public void AlterarBebidaPedida(Bebida bebida, Bebida novaBebida) {
		for(Map.Entry<Bebida, Integer> entrada : bebidas.entrySet()) {
				if(bebida.equals(entrada.getKey())) {
					bebidas.remove(entrada.getKey());
					System.out.println("\nDigite a nova quantidade:");
					int qtd = Main.ler.nextInt();
					Main.ler.nextLine();
					this.pedirBebida(novaBebida, qtd);
				}		
			}	
	}
	public void calcularValorTotal() {
		double valorTotal=0;
		double valorBebidas=0;
		double valorPasteis=0;
		for(Map.Entry<Bebida, Integer> entrada : bebidas.entrySet()) {
			valorPasteis += entrada.getValue() * entrada.getKey().getValor();
		}
		for(Map.Entry<Pastel, Integer> entrada : pasteis.entrySet()) {
			valorBebidas += entrada.getValue() * entrada.getKey().getValor();
		}
		valorTotal=  valorBebidas + valorPasteis;
		this.setValorTotal( valorTotal);
	}
}
