package modelo;

import helper.Util;

public abstract class Produto {

	private int id;
	private static int contador = 1;
	private String nome;
	private Double valor;
	private String descricao;
	private int qtdEstoque;

	public Produto(String nome, Double valor, String descricao, int qtdEstoque) {
		this.id = Produto.contador;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.qtdEstoque = qtdEstoque;
		Produto.contador++;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public void verifDisponiblidade() {

		if (getQtdEstoque() > 0) {
			System.out.println("Quantidade em estoque dispon�vel: " + this.getQtdEstoque());
		} else {
			System.out.println("\nNecessita-se de reposi��o");
			Util.pausar(1);
			System.out.println("\nDeseja repor a quantidade em estoque deste produto?\n1- Sim\n2- N�o");
			int aux1 = Main.ler.nextInt();
			Main.ler.nextLine();

			if (aux1 == 1) {
				this.repor();
			} else {
				System.out.println("\nOpera��o cancelada pelo usu�rio");
				Util.pausar(1);
			}

		}
	}

	public void repor() {
		System.out.println("\nDigite a quantidade para repor o produto: ");
		int rep = Main.ler.nextInt();
		Main.ler.nextLine();

		do {
			System.out.println("\nQuantidade inv�lida!");
			Util.pausar(1);
			System.out.println("\nDigite a quantidade para repor o produto: ");
			rep = Main.ler.nextInt();
			Main.ler.nextLine();

		} while (rep <= 0);

		this.setQtdEstoque(rep);
		System.out.println("\nReposi��o feita com sucesso!");
		Util.pausar(2);

	}

}
