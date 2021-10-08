package controle;

import java.util.ArrayList;

import modelo.*;

/**
 * Esta classe contém os parâmetros e as funções necessários para o controle de dados da classe Dados.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleDados {
	private Dados d = new Dados();
/**
 * Construtor para instanciação do objeto ControleDados
 */
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
	public Pedido getPedido() {
		return this.d.getPedido();
	}
	

	/**
	 * Método para inserir um objeto Cliente no ArrayList de clientes do objeto Dados
	 * @param c - Cliente a ser inserido 
	 * @return Boolean que indicará se foi possível inserir ou não
	 */
	public boolean inserirCliente(Cliente c) {
		try {
			this.getClientes().add(c);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para editar um objeto Cliente no ArrayList de clientes do objeto Dados
	 * @param i - Posição do objeto no ArrayList
	 * @param c - Objeto Cliente com os atributos que serão alterados
	 * @return Boolean que indicará se foi possível editar ou não
	 */
	public boolean editarCliente(int i, Cliente c) {
		try {
			this.getClientes().get(i).setNome(c.getNome());
			this.getClientes().get(i).setEmail(c.getEmail());
			this.getClientes().get(i).setNumCartao(c.getNumCartao());
			;
			this.getClientes().get(i).setEndereco(c.getEndereco());
			this.getClientes().get(i).setTelefone(c.getTelefone());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para remover um objeto Cliente no ArrayList de clientes do objeto Dados
	 * @param i - Posição do objeto no ArrayList
	 * @return Boolean que indicará se foi possível remover ou não
	 */
	public boolean removerCliente(int i) {
		try {
			this.getClientes().remove(i);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para inserir um objeto Funcionário no ArrayList de funcionários do objeto Dados
	 * @param f - Funcionário a ser inserido 
	 * @return Boolean que indicará se foi possível inserir ou não
	 */
	public boolean inserirFuncionario(Funcionario f) {
		try {
			this.getFuncionarios().add(f);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para editar um objeto Funcionario no ArrayList de funcionários do objeto Dados
	 * @param i - Posição do objeto no ArrayList
	 * @param f - Objeto Funcionario com os atributos que serão alterados
	 * @return Boolean que indicará se foi possível editar ou não
	 */
	public boolean editarFuncionario(int i, Funcionario f) {
		try {
			this.getFuncionarios().get(i).setNome(f.getNome());
			this.getFuncionarios().get(i).setEmail(f.getEmail());
			this.getFuncionarios().get(i).setEndereco(f.getEndereco());
			this.getFuncionarios().get(i).setTelefone(f.getTelefone());
			this.getFuncionarios().get(i).setCargo(f.getCargo());
			this.getFuncionarios().get(i).setDateNasc(f.getDateNasc());
			this.getFuncionarios().get(i).setSalario(f.getSalario());
			this.getFuncionarios().get(i).setVendas(f.getVendas());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para remover um objeto Funcionario no ArrayList de funcionários do objeto Dados
	 * @param i - Posição do objeto no ArrayList
	 * @return Boolean que indicará se foi possível remover ou não
	 */
	public boolean removerFuncionario(int i) {
		try {
			this.getFuncionarios().remove(i);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para inserir um objeto Pastel no ArrayList de pastéis do objeto Dados
	 * @param p - Pastel a ser inserido 
	 * @return Boolean que indicará se foi possível inserir ou não
	 */
	public boolean inserirPastel(Pastel p) {
		try {
			this.getPasteis().add(p);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para editar um objeto Pastel no ArrayList de pastéis do objeto Dados
	 * @param i - Posição do objeto no ArrayList
	 * @param p - Objeto Pastel com os atributos que serão alterados
	 * @return Boolean que indicará se foi possível editar ou não
	 */
	public boolean editarPastel(int i, Pastel p) {
		try {
			this.getPasteis().get(i).setNome(p.getNome());
			this.getPasteis().get(i).setSabor(p.getSabor());
			this.getPasteis().get(i).setTamanho(p.getTamanho());
			this.getPasteis().get(i).setDescricao(p.getDescricao());
			this.getPasteis().get(i).setValor(p.getValor());
			this.getPasteis().get(i).setQtdEstoque(p.getQtdEstoque());

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para remover um objeto Pastel no ArrayList de pastéis do objeto Dados
	 * @param i - Posição do objeto no ArrayList
	 * @return Boolean que indicará se foi possível remover ou não
	 */
	public boolean removerPastel(int i) {
		try {
			this.getPasteis().remove(i);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para inserir um objeto Bebida no ArrayList de bebidas do objeto Dados
	 * @param b - Bebida a ser inserida 
	 * @return Boolean que indicará se foi possível inserir ou não
	 */
	public boolean inserirBebida(Bebida b) {
		try {
			this.getBebidas().add(b);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para editar um objeto Bebida no ArrayList de bebidas do objeto Dados
	 * @param i - Posição do objeto no ArrayList
	 * @param b - Objeto Bebida com os atributos que serão alterados
	 * @return Boolean que indicará se foi possível editar ou não
	 */
	public boolean editarBebida(int i, Bebida b) {
		try {
			this.getBebidas().get(i).setNome(b.getNome());
			this.getBebidas().get(i).setTipo(b.getTipo());
			this.getBebidas().get(i).setVolume(b.getVolume());
			this.getBebidas().get(i).setDescricao(b.getDescricao());
			this.getBebidas().get(i).setValor(b.getValor());
			this.getBebidas().get(i).setQtdEstoque(b.getQtdEstoque());

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Método para remover um objeto Bebida no ArrayList de bebidas do objeto Dados
	 * @param i - Posição do objeto no ArrayList
	 * @return Boolean que indicará se foi possível remover ou não
	 */
	public boolean removerBebida(int i) {
		try {
			this.getBebidas().remove(i);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Método para inserir um objeto Venda no ArrayList de vendas do objeto Dados
	 * @param v - Venda a ser inserido 
	 * @return Boolean que indicará se foi possível inserir ou não
	 */
	public boolean inserirVenda(Venda v) {
		try {
			this.getVendas().add(v);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Método para remover um objeto Venda no ArrayList de vendas do objeto Dados
	 * @param v  Objeto a ser removido do ArrayList
	 * @return Boolean que indicará se foi possível remover ou não
	 */
	public boolean removerVenda(Venda v) {
		try {
			this.getVendas().remove(v);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
