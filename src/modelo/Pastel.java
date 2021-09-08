package modelo;

public class Pastel extends Produto{

	private String tamanho;
	private String sabor;
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public Pastel(int id, String nome, Float valor, String descricao, int qtdEstoque, String tamanho, String sabor) {
		super(id, nome, valor, descricao, qtdEstoque);
		this.tamanho = tamanho;
		this.sabor = sabor;
	}
	
	
}
