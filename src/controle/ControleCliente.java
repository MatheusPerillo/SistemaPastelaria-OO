package controle;

import java.util.ArrayList;

import modelo.Cliente;

/**
 * Esta classe contém os parâmetros e as funções necessários para o controle de dados da classe Cliente.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleCliente {
	private static ArrayList<Cliente> c;
	
	/**
	 * Construtor para instanciação do objeto ControleCliente
	 * @param d Dados presente no sistema.
	 */
	public ControleCliente(ControleDados d) {
		c = d.getClientes();		
	}
	
	/**
	 * Método para criação de um array com os nomes dos clientes cadastrados
	 * @return String[] Array de nomes dos clientes cadastrados
	 */
	public String[] getNomeClientes() {
		String[] s = new String[this.c.size()];
		for(int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNome();
		}
		
		return s;
	}
	
	/**
	 * Método para buscar um objeto pelo seu atributo nome 
	 * @param nome String nome que será o parâmetro buscado
	 * @return Objeto cujo nome é igual ao buscado 
	 */
	public  Cliente buscarPorNome(String nome) {
		boolean aux = false;
		try {
			 for(Cliente p: c) {
				 if(p.getNome().toUpperCase().equals(nome.toUpperCase())) {
					 aux=true;
					 return p;
				 } else {
						aux = false;
					}
				}
				if (aux == false) {
					throw new NullPointerException();
				}
			 
		} catch (Exception e) {
			return null;
		}
		return null;
	}
	
}
