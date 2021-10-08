package controle;

import java.util.ArrayList;

import modelo.Cliente;

/**
 * Esta classe cont�m os par�metros e as fun��es necess�rios para o controle de dados da classe Cliente.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleCliente {
	private static ArrayList<Cliente> c;
	
	/**
	 * Construtor para instancia��o do objeto ControleCliente
	 * @param d Dados presente no sistema.
	 */
	public ControleCliente(ControleDados d) {
		c = d.getClientes();		
	}
	
	/**
	 * M�todo para cria��o de um array com os nomes dos clientes cadastrados
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
	 * M�todo para buscar um objeto pelo seu atributo nome 
	 * @param nome String nome que ser� o par�metro buscado
	 * @return Objeto cujo nome � igual ao buscado 
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
