package controle;

import java.util.ArrayList;

import modelo.*;

public class ControleDados {
	private Dados d = new Dados();

	public ControleDados() {
		d.gerarDados();
	}

	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}
	
	public ArrayList<Cliente> getClientes() {
		return this.d.getClientes();
	}
	public ArrayList<Funcionario> getFuncionarios() {
		return this.d.getFuncionarios();
	}
	public ArrayList<Pastel> getPasteis() {
		return this.d.getPasteis();
	}
	public ArrayList<Bebida> getBebidas() {
		return this.d.getBebidas();
	}
	public ArrayList<Venda> getVendas() {
		return this.d.getVendas();
	}
}
