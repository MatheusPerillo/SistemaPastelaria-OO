package controle;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import modelo.Bebida;
import modelo.Cliente;

/**
 * Esta classe cont�m os par�metros necess�rios para o controle de dados da classe Bebida.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleBebida {
	private ArrayList<Bebida> b;
	
	/**
	 * Este m�todo 
	 * @param d Dados presente no sistema.
	 */
	public ControleBebida(ControleDados d) {
		b = d.getBebidas();
		}
	
	/**
	 * 
	 * @return
	 */
	public String[] getNomeBebidas() {
		String [] s = new String[this.b.size()];
		for (int i = 0; i < this.b.size(); i++) {
			s[i] = b.get(i).getNome();
		}
		return s;
	}
	
	/**
	 * Este m�todo 
	 * @param lista 
	 * @param nome 
	 * @return
	 */
	public static Bebida buscarPorNome(Map<Bebida, Integer> lista, String nome) {
		try {
			Optional<Bebida> x = lista.keySet().stream()
					.filter(p -> p.getNome().toUpperCase().equals(nome.toUpperCase())).findFirst();
			return x.get();
		} catch (Exception e) {
			System.out.println("\nBebida n�o encontrada");
		}
		return null;
	}

	/**
	 * 
	 * @param nome 
	 * @return
	 */
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
			return null;
		}
		return null;
	}
}
