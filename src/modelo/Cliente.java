package modelo;

public class Cliente extends Pessoa {
	
	public Cliente(String nome, Endereco endereco, Telefone telefone, String email, String numCartao) {
		super(nome, endereco, telefone, email);
		this.numCartao = numCartao;
	}

	private String numCartao;

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	@Override
	public String toString() {
		return "\nID:" + this.getId() + "\nNome: " + this.getNome() + "\nEndereco: " + this.getEndereco() 
		+ "\nTelefone:" + this.getTelefone() + "\nEmail:" + this.getEmail() + "\nNúmero do Cartao: " + this.getNumCartao();
	}

	

	
}
