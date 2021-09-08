package modelo;


public abstract class Pessoa {

	private int id;
	private static int contador=1;
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private String email;
	
	public Pessoa(String nome, Endereco endereco, Telefone telefone, String email) {
		this.id = Pessoa.contador;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		Pessoa.contador++;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	
	

}
