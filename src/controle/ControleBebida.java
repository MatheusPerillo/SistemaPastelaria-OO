package controle;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import modelo.Bebida;

public class ControleBebida {
	private ArrayList<Bebida> c;
	
	public ControleBebida(ControleDados d) {
		c = d.getBebidas();
		}
	
	public String[] getNomeBebidas() {
		String [] s = new String[this.c.size()];
		for (int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNome();
		}
		return s;
	}
	
	public static Bebida buscarPorNome(Map<Bebida, Integer> lista, String nome) {
		try {
			Optional<Bebida> x = lista.keySet().stream()
					.filter(p -> p.getNome().toUpperCase().equals(nome.toUpperCase())).findFirst();
			return x.get();
		} catch (Exception e) {
			System.out.println("\nBebida não encontrada");
		}
		return null;
	}

	public static Bebida buscarPorNome(ArrayList<Bebida> lista,String nome) {
		try {
			for (Bebida b : lista) {
				if (b.getNome().toUpperCase().equals(nome.toUpperCase())) {
					return b;
				}
			}
		} catch (Exception e) {
			System.out.println("Bebida não encontrada");
		}
		return null;
	}
}
