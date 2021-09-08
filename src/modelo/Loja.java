package modelo;
import java.util.ArrayList;

public class Loja {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private Funcionario funcionarios;
	private ArrayList<Cliente> clientes;
	private ArrayList<Venda> vendas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Funcionario getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario funcionarios) {
		this.funcionarios = funcionarios;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public ArrayList<Venda> getVendas() {
		return vendas;
	}
	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}
	
	public Loja(String nome, Endereco endereco, Telefone telefone, Funcionario funcionarios,
			ArrayList<Cliente> clientes, ArrayList<Venda> vendas) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.funcionarios = funcionarios;
		this.clientes = clientes;
		this.vendas = vendas;
	}

	
}
