package controle;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import modelo.Bebida;
import modelo.Cliente;

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
		boolean aux = false;
		try {
			 for(Bebida beb: b) {
				 if(beb.getNome().toUpperCase().equals(nome.toUpperCase())) {
					 aux=true;
					 return beb;
				 } else {
						aux = false;
					}
				}
				if (aux == false) {
					throw new NullPointerException();
				}
			 
		} catch (Exception e) {
			System.out.println("Bebida não encontrada");
		}
		return null;
	}
}
