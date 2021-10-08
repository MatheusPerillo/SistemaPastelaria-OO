package controle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import modelo.Pastel;

/**
 * Esta classe cont�m os par�metros e as fun��es necess�rios para o controle de dados da classe Pastel.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControlePastel {
	private ArrayList<Pastel> p;

	/**
	 * Construtor para instancia��o do objeto ControlePastel
	 * @param d Dados presente no sistema.
	 */
	public ControlePastel(ControleDados d) {
		p = d.getPasteis();
	}

	/**
	 * M�todo para cria��o de um array com os nomes dos past�is cadastrados
	 * @return String[] Array de nomes dos past�is cadastrados
	 */
	public String[] getNomePasteis() {
		String[] s = new String[this.p.size()];
		for (int i = 0; i < this.p.size(); i++) {
			s[i] = p.get(i).getNome();
		}
		return s;
	}

	/**
	 * M�todo para buscar um objeto pelo seu atributo nome 
	 * @param lista Map onde ser� feita a busca
	 * @param nome String nome que ser� o par�metro buscado
	 * @return Objeto cujo nome � igual ao buscado 
	 */
	public static Pastel buscarPorNome(HashMap<Pastel, Integer> lista, String nome) {
		try {
			Optional<Pastel> x = lista.keySet().stream()
					.filter(p -> p.getNome().toUpperCase().equals(nome.toUpperCase())).findFirst();
			return x.get();
		} catch (Exception e) {
			System.out.println("Pastel n�o encontrado");
		}
		return null;
	}

	/**
	 * M�todo para buscar um objeto pelo seu atributo nome 
	 * @param nome String nome que ser� o par�metro buscado
	 * @return Objeto cujo nome � igual ao buscado 
	 */
	public Pastel buscarPorNome(String nome) {
		boolean aux = false;
		try {
			for (Pastel p : p) {
				if (p.getNome().toUpperCase().equals(nome.toUpperCase())) {
					aux = true;
					return p;
				}else {
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
