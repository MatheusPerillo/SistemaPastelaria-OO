package modelo;

public class Bebida extends Produto{

	private int volume;
	private String tipo;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Bebida(int id, String nome, Float valor, String descricao, int qtdEstoque, int volume, String tipo) {
		super(id, nome, valor, descricao, qtdEstoque);
		this.volume = volume;
		this.tipo = tipo;
	}

	
}
