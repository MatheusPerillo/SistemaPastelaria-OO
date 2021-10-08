package modelo;

/**
 * Esta classe contém os parâmetros necessários para a classe abstrata Pessoa.
 * Portanto, ela contém os atributos de uma pessoa como 
 * nome, id, endereço, telefone e email. Além disso, 
 * ela gera um id para cada cadastro de uma pessoa.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public abstract class Pessoa {
	
	private int id;
	private static int contador=1;
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	private String email;
	
	/**
	 * Construtor para instanciação do objeto Pessoa.
	 * @param nome String para o nome da pessoa
	 * @param endereco String para o endereço 
	 * @param telefone Integer para o telefone
	 * @param email String para o email
	 */
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
