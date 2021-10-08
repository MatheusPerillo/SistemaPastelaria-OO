package controle;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import modelo.Bebida;
import modelo.Cliente;

/**
 * Esta classe contém os parâmetros e as funções necessários para o controle de dados da classe Bebida.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleBebida {
	private ArrayList<Bebida> b;
	
	/**
	 * Construtor para instanciação do objeto ControleBebida
	 * @param d Dados presente no sistema.
	 */
	public ControleBebida(ControleDados d) {
		b = d.getBebidas();
		}
	
	/**
	 * Método para criação de um array com os nomes das bebidas cadastradas
	 * @return String[] Array de nomes das bebidas cadastradas
	 */
	public String[] getNomeBebidas() {
		String [] s = new String[this.b.size()];
		for (int i = 0; i < this.b.size(); i++) {
			s[i] = b.get(i).getNome();
		}
		return s;
	}
	
	/**
	 * Método para buscar um objeto pelo seu atributo nome 
	 * @param lista Map onde será feita a busca
	 * @param nome String nome que será o parâmetro buscado
	 * @return Objeto cujo nome é igual ao buscado 
	 */
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

	/**
	 * Método para buscar um objeto pelo seu atributo nome 
	 * @param nome String nome que será o parâmetro buscado
	 * @return Objeto cujo nome é igual ao buscado 
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
