package controle;

import java.util.ArrayList;

import modelo.Funcionario;

/**
 * Esta classe contém os parâmetros necessários para o controle de dados da classe Funcionário.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleFuncionario {
private static ArrayList<Funcionario> f;
	
	/**
	 * 
	 * @param d
	 */
	public ControleFuncionario(ControleDados d) {
		f = d.getFuncionarios();		
	}
	
	/**
	 * 
	 * @return
	 */
	public String[] getNomeFuncionarios() {
		String[] s = new String[this.f.size()];
		for(int i = 0; i < this.f.size(); i++) {
			s[i] = f.get(i).getNome();
		}
		
		return s;
	}
	
	/**
	 * 
	 * @param nome
	 * @return
	 */
	public  Funcionario buscarPorNome(String nome) {
		boolean aux = false;
		try {
			 for(Funcionario p: f) {
				 if(p.getNome().toUpperCase().equals(nome.toUpperCase())) {
					 aux = true;
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
