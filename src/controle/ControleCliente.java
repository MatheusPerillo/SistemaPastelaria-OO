package controle;

import java.util.ArrayList;

import modelo.Cliente;

/**
 * Esta classe contém os parâmetros necessários para o controle de dados da classe Cliente.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleCliente {
	private static ArrayList<Cliente> c;
	
	/**
	 * 
	 * @param d
	 */
	public ControleCliente(ControleDados d) {
		c = d.getClientes();		
	}
	
	/**
	 * 
	 * @return
	 */
	public String[] getNomeClientes() {
		String[] s = new String[this.c.size()];
		for(int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNome();
		}
		
		return s;
	}
	
	/**
	 * 
	 * @param nome
	 * @return
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
