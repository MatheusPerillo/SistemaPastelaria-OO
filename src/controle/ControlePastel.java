package controle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import modelo.Pastel;

public class ControlePastel {
	private ArrayList<Pastel> c;
	
	public ControlePastel(ControleDados d) {
		c = d.getPasteis();
	}
	
	public String[] getNomePasteis() {
		String [] s = new String[this.c.size()];
		for (int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNome();
		}
		return s;
	}
	
	public static Pastel buscarPorNome(HashMap <Pastel,Integer> lista,String nome) {
		try {
			 Optional<Pastel> x = lista.keySet().stream()
					.filter(p -> p.getNome().toUpperCase().equals(nome.toUpperCase())).findFirst();
			return x.get();
		} catch (Exception e) {
			System.out.println("Pastel não encontrado");
		}
		return null;
	}
	
	public static Pastel buscarPorNome(ArrayList<Pastel> lista,String nome) {
		try {
			 for(Pastel p: lista) {
				 if(p.getNome().toUpperCase().equals(nome.toUpperCase())) {
					 return p;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Pastel não encontrado");
		}
		return null;
	}
}
