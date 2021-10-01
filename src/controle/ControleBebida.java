package controle;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import modelo.Bebida;

public class ControleBebida {
	private ArrayList<Bebida> b;
	
	public ControleBebida(ControleDados d) {
		b = d.getBebidas();
		}
	
	public String[] getNomeBebidas() {
		String [] s = new String[this.b.size()];
		for (int i = 0; i < this.b.size(); i++) {
			s[i] = b.get(i).getNome();
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

	public  Bebida buscarPorNome(String nome) {
		try {
			for (Bebida b : b) {
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
