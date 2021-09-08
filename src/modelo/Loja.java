package modelo;
import java.util.ArrayList;

public class Loja {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private ArrayList<Cliente> clientes;
	private  ArrayList<Funcionario>  funcionarios;	
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
	
	public void CadastrarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	public void CadastrarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	public void CadastrarVenda(Venda venda) {
		this.vendas.add(venda);
	}


	
}
