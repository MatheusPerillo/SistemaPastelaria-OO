package controle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import modelo.Pastel;

public class ControlePastel {
	private ArrayList<Pastel> p;

	public ControlePastel(ControleDados d) {
		p = d.getPasteis();
	}

	public String[] getNomePasteis() {
		String[] s = new String[this.p.size()];
		for (int i = 0; i < this.p.size(); i++) {
			s[i] = p.get(i).getNome();
		}
		return s;
	}

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
			System.out.println("Pastel não encontrado");
		}
		return null;
	}
}
