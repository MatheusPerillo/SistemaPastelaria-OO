package controle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import modelo.Pastel;

/**
 * Esta classe contém os parâmetros necessários para o controle de dados da classe Pastel.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControlePastel {
	private ArrayList<Pastel> p;

	/**
	 * 
	 * @param d
	 */
	public ControlePastel(ControleDados d) {
		p = d.getPasteis();
	}

	/**
	 * 
	 * @return
	 */
	public String[] getNomePasteis() {
		String[] s = new String[this.p.size()];
		for (int i = 0; i < this.p.size(); i++) {
			s[i] = p.get(i).getNome();
		}
		return s;
	}

	/**
	 * 
	 * @param lista
	 * @param nome
	 * @return
	 */
	public static Pastel buscarPorNome(HashMap<Pastel, Integer> lista, String nome) {
		try {
			Optional<Pastel> x = lista.keySet().stream()
					.filter(p -> p.getNome().toUpperCase().equals(nome.toUpperCase())).findFirst();
			return x.get();
		} catch (Exception e) {
			System.out.println("Pastel não encontrado");
		}
		return null;
	}

	/**
	 * 
	 * @param nome
	 * @return
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
