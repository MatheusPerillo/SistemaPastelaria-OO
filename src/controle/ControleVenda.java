package controle;

import java.util.ArrayList;

import modelo.Venda;

/**
 * Esta classe contém os parâmetros e as funções necessários para o controle de dados da classe Venda.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleVenda {
	private ArrayList<Venda> v= new ArrayList<Venda>();

	/**
	 * Construtor para instanciação do objeto ControleBebida
	 * @param d Dados presente no sistema.
	 */
	public ControleVenda(ControleDados d) {
		v = d.getVendas();
	}

	/**
	 * Método para buscar um objeto pelo seu atributo nome 
	 * @param id int Id que será o parâmetro buscado
	 * @return Objeto cujo id é igual ao buscado 
	 */
	public Venda buscarPorId(int id) {
		boolean aux = false;
		try {
			for (Venda vend : v) {
				if (vend.getId() == id) {
					aux = true;
					return vend;
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
