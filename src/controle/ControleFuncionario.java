package controle;

import java.util.ArrayList;

import modelo.Funcionario;

/**
 * Esta classe contém os parâmetros e as funções necessários para o controle de dados da classe Funcionário.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleFuncionario {
private static ArrayList<Funcionario> f;
	
/**
 * Construtor para instanciação do objeto ControleFuncionario
 * @param d Dados presente no sistema.
 */
	public ControleFuncionario(ControleDados d) {
		f = d.getFuncionarios();		
	}
	
	/**
	 * Método para criação de um array com os nomes dos funcionários cadastrados
	 * @return String[] Array de nomes dos funcionários cadastrados
	 */
	public String[] getNomeFuncionarios() {
		String[] s = new String[this.f.size()];
		for(int i = 0; i < this.f.size(); i++) {
			s[i] = f.get(i).getNome();
		}
		
		return s;
	}
	
	/**
	 * Método para buscar um objeto pelo seu atributo nome 
	 * @param nome String nome que será o parâmetro buscado
	 * @return Objeto cujo nome é igual ao buscado 
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
