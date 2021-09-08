package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private int id;
	private ArrayList<Pastel> pastel;
	private ArrayList<Bebida> bebida;
	private int qtdPedida;
	private Float valorTotal;
	private Cliente cliente;
	private Funcionario vendedor;
	private Date dataPedido;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Pastel> getPastel() {
		return pastel;
	}
	public void setPastel(ArrayList<Pastel> pastel) {
		this.pastel = pastel;
	}
	public ArrayList<Bebida> getBebida() {
		return bebida;
	}
	public void setBebida(ArrayList<Bebida> bebida) {
		this.bebida = bebida;
	}
	public int getQtdPedida() {
		return qtdPedida;
	}
	public void setQtdPedida(int qtdPedida) {
		this.qtdPedida = qtdPedida;
	}
	public Float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Float valorTotal) {
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
	
	public Pedido(int id, ArrayList<Pastel> pastel, ArrayList<Bebida> bebida, int qtdPedida, Float valorTotal,
			Cliente cliente, Funcionario vendedor, Date dataPedido) {
		this.id = id;
		this.pastel = pastel;
		this.bebida = bebida;
		this.qtdPedida = qtdPedida;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.dataPedido = dataPedido;
	}
	
	
}
