package modelo;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import helper.Util;

public class Bebida extends Produto{

	private int volume;
	private String tipo;
	
	public Bebida( String nome, Double valor, String descricao, int qtdEstoque, int volume, String tipo) {
		super( nome, valor, descricao, qtdEstoque);
		this.volume = volume;
		this.tipo = tipo;
	}
	
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
	
	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + "\nTipo: " + this.getTipo() + "\nVolume: " + Integer.toString(getVolume())
				+ "\nDescrição: " + this.getDescricao() + "\nValor: " + Util.doubleParaString(this.getValor()) + "\nQtd em estoque: " 
				+ Integer.toString(getQtdEstoque());
	}
	
	public Bebida buscarBebidaPedido(Map <Bebida,Integer> lista) {
		System.out.println("Digite o nome da bebida");
		String nome= Main.ler.nextLine();
		try {
			 Optional<Bebida> x = lista.keySet().stream()
					.filter(p -> p.getNome().toUpperCase().equals(nome.toUpperCase())).findFirst();
			return x.get();
		} catch (Exception e) {
			System.out.println("Bebida não encontrada");
		}
		return null;
	}
	public Bebida buscarPorNome(ArrayList<Bebida> lista) {
		System.out.println("Digite o Nome");
		String nome= Main.ler.nextLine();
		try {
			 for(Bebida b: lista) {
				 if(b.getNome().equals(nome)) {
					 return b;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Bebida não encontrada");
		}
		return null;
	}

	public void editar(Bebida bebida) {
		System.out.println("1- Editar Nome");
		System.out.println("2- Editar Tipo");
		System.out.println("3- Editar Volume");
		System.out.println("4- Editar Descrição");
		System.out.println("5- Editar Valor");
		System.out.println("6- Editar Estoque");
		System.out.println("7- Editar Tudo");
		
		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch(aux) {
		case 1:
			System.out.println("Informe o Nome: ");
			String nome = Main.ler.nextLine();
			bebida.setNome(nome);
			System.out.println("Campo alterado com sucesso!");
			Util.pausar(2);
			break;
			
		case 2:
			System.out.println("Informe o Tipo: ");
			String tipo = Main.ler.nextLine();
			bebida.setTipo(tipo);
			System.out.println("Campo alterado com sucesso!");
			Util.pausar(2);
			break;
			
		case 3:
			System.out.println("Informe o Volume: ");
			int volume = Main.ler.nextInt();
			Main.ler.nextLine();
			bebida.setVolume(volume);
			System.out.println("Campo alterado com sucesso!");
			Util.pausar(2);
			break;
			
		case 4:
			System.out.println("Informe a Descrição: ");
			String descricao = Main.ler.nextLine();
			bebida.setDescricao(descricao);
			System.out.println("Campo alterado com sucesso!");
			Util.pausar(2);
			break;
			
		case 5:
			System.out.println("Informe o Valor: ");
			Double valor = Main.ler.nextDouble();
			Main.ler.nextLine();
			bebida.setValor(valor);
			System.out.println("Campo alterado com sucesso!");
			Util.pausar(2);	
			break;
			
		case 6:
			System.out.println("Informe o Estoque: ");
			int qtdEstoque = Main.ler.nextInt();
			Main.ler.nextLine();
			bebida.setQtdEstoque(qtdEstoque);
			System.out.println("Campo alterado com sucesso!");
			Util.pausar(2);
			break;
			
		case 7:
			System.out.println("Informe o Nome: ");
			nome = Main.ler.nextLine();
			
			System.out.println("Informe o Tipo: ");
			tipo = Main.ler.nextLine();
			
			System.out.println("Informe o Volume: ");
			volume = Main.ler.nextInt();
			Main.ler.nextLine();
			
			System.out.println("Informe a Descrição: ");
			descricao = Main.ler.nextLine();
			
			System.out.println("Informe o Valor: ");
			valor = Main.ler.nextDouble();
			Main.ler.nextLine();
			
			System.out.println("Informe o Estoque: ");
			qtdEstoque = Main.ler.nextInt();
			Main.ler.nextLine();
			
			bebida.setNome(nome);
			bebida.setTipo(tipo);
			bebida.setVolume(volume);
			bebida.setDescricao(descricao);
			bebida.setValor(valor);
			bebida.setQtdEstoque(qtdEstoque);
			
			System.out.println("Bebida alterada com sucesso!");
			Util.pausar(2);
			break;
			
		default:
			System.out.println("Opção inválida");
			Util.pausar(2);
			this.editar(bebida);
			break;
		}
			
	}
	
	
}
