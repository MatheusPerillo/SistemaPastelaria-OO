package modelo;

public class Cliente extends Pessoa {

	private String numCartao;

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public Cliente(int id, String nome, Endereco endereco, Telefone telefone, String email, String numCartao) {
		super(id, nome, endereco, telefone, email);
		this.numCartao = numCartao;
	}

	
}
