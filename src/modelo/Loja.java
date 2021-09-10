package modelo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class Loja {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Funcionario>  funcionarios= new ArrayList<>();
	private ArrayList<Pastel> pasteis= new ArrayList<>();
	private ArrayList<Bebida> bebidas= new ArrayList<>();	
	private ArrayList<Venda> vendas= new ArrayList<>();	
		
	
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



	public ArrayList<Cliente> getClientes() {
		return clientes;
	}



	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}



	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}



	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
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



	public ArrayList<Venda> getVendas() {
		return vendas;
	}



	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}



	public void cadastrarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	public void listarClientes() {
		if(!this.clientes.isEmpty()) {
		for(Cliente c: this.clientes) {
			System.out.println(c);
		}
		}else {System.out.println("Não existem clientes cadastrados");}
	}
	public void removerCliente(Cliente cliente) {
		this.clientes.remove(cliente);
	}
	public void cadastrarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	public void listarFuncionarios() {
		if(!this.funcionarios.isEmpty()) {
			for(Funcionario f: this.funcionarios) {
				System.out.println(f);
			}
			}else {System.out.println("Não existem funcionários cadastrados");}
	}
	public void removerFuncionario(Funcionario func) {
		this.funcionarios.remove(func);
	}
	public void cadastrarPastel(Pastel pastel) {
		this.pasteis.add(pastel);
	}
	public void listarPasteis() {
		if(!this.pasteis.isEmpty()) {
			for(Pastel p: this.pasteis) {
				System.out.println(p);
			}
			}else {System.out.println("Não existem pastéis cadastrados");}
	}
	public void removerPastel(Pastel pastel) {
		this.pasteis.remove(pastel);
	}

	public void cadastrarBebida(Bebida bebida) {
		this.bebidas.add(bebida);
	}
	public void listarBebidas() {
		if(!this.bebidas.isEmpty()) {
			for(Bebida b: this.bebidas) {
				System.out.println(b);
			}
			}else {System.out.println("Não existem bebidas cadastradas");}
	}
	
	public void removerBebida(Bebida bebida) {
		this.bebidas.remove(bebida);
	}
	public void cadastrarVenda(Venda venda) {
		this.vendas.add(venda);
	}
	public void listarVendas() {
		if(!this.vendas.isEmpty()) {
			for(Venda v: this.vendas) {
				System.out.println(v);
			}
			}else {System.out.println("Não existem vendas cadastradas");}
	}

	@Override
	public String toString() {
		return "Nome da loja: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
	}

	
}
