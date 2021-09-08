package modelo;

public class Endereco {
	private String estado;
	private String cidade;
	private String bairro;
	private String cep;
	private String numero;
	
	public Endereco(String estado, String cidade, String bairro, String cep, String numero) {
		super();
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Estado: " + estado + ", Cidade: " + cidade + ", Bairro: " + bairro + ", CEP: " + cep + " Número: "
				+ numero  ;
	}
	
	
	
	

}
