package controle;

import java.util.ArrayList;

import modelo.Funcionario;

/**
 * Esta classe cont�m os par�metros e as fun��es necess�rios para o controle de dados da classe Funcion�rio.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleFuncionario {
private static ArrayList<Funcionario> f;
	
/**
 * Construtor para instancia��o do objeto ControleFuncionario
 * @param d Dados presente no sistema.
 */
	public ControleFuncionario(ControleDados d) {
		f = d.getFuncionarios();		
	}
	
	/**
	 * M�todo para cria��o de um array com os nomes dos funcion�rios cadastrados
	 * @return String[] Array de nomes dos funcion�rios cadastrados
	 */
	public String[] getNomeFuncionarios() {
		String[] s = new String[this.f.size()];
		for(int i = 0; i < this.f.size(); i++) {
			s[i] = f.get(i).getNome();
		}
		
		return s;
	}
	
	/**
	 * M�todo para buscar um objeto pelo seu atributo nome 
	 * @param nome String nome que ser� o par�metro buscado
	 * @return Objeto cujo nome � igual ao buscado 
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
