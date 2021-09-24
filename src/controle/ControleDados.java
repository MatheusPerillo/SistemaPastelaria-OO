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
	
	public boolean inserirCliente(Cliente c) {
		try {
			this.getClientes().add(c);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean editarCliente(int i ,Cliente c) {
		try {
			this.getClientes().get(i).setNome(c.getNome());
			this.getClientes().get(i).setEmail(c.getEmail());
			this.getClientes().get(i).setNumCartao(c.getNumCartao());;
			this.getClientes().get(i).setEndereco(c.getEndereco());
			this.getClientes().get(i).setTelefone(c.getTelefone());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean removerCliente(int i) {
		try {
			this.getClientes().remove(i);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean inserirFuncionario(Funcionario f) {
		try {
			this.getFuncionarios().add(f);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
