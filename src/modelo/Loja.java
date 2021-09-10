package modelo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class Loja {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private ArrayList<Cliente> clientes;
	private ArrayList<Funcionario>  funcionarios;
	private ArrayList<Pastel> pasteis;
	private ArrayList<Bebida> bebidas;	
	private ArrayList<Venda> vendas;	
		
	
	public Loja(String nome, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
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
	
	public ArrayList<Pastel> getPasteis() {
		return pasteis;
	}

	public void setPasteis(ArrayList<Pastel> pasteis) {
		this.pasteis = pasteis;
	}

	public ArrayList<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(ArrayList<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

	public void cadastrarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	public void listarClientes() {
		for(Cliente c: this.clientes) {
			System.out.println(c);
		}
	}
	public void removerCliente(Cliente cliente) {
		this.clientes.remove(cliente);
	}
	public void cadastrarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	public void listarFuncionarios() {
		for(Funcionario f: this.funcionarios) {
			System.out.println(f);
		}
	}
	public void removerFuncionario(Funcionario func) {
		this.funcionarios.remove(func);
	}
	public void cadastrarPastel(Pastel pastel) {
		this.pasteis.add(pastel);
	}
	public void listarPasteis() {
		for(Pastel p: this.pasteis) {
			System.out.println(p);
		}
	}
	public void removerPastel(Pastel pastel) {
		this.pasteis.remove(pastel);
	}

	public void cadastrarBebida(Bebida bebida) {
		this.bebidas.add(bebida);
	}
	public void listarBebidas() {
		for(Bebida b: this.bebidas) {
			System.out.println(b);
		}
	}
	
	public void removerBebida(Bebida bebida) {
		this.bebidas.remove(bebida);
	}
	public void cadastrarVenda(Venda venda) {
		this.vendas.add(venda);
	}
	public void listarVendas() {
		for(Venda v: this.vendas) {
			System.out.println(v);
			
		}
	}

	
	

	
	
	
	


	
}
