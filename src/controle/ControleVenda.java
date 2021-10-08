package controle;

import java.util.ArrayList;

import modelo.Venda;

/**
 * Esta classe contém os parâmetros necessários para o controle de dados da classe Venda.
 * @author Matheus Perillo
 * @author João Victor Correia
 * @version 1.0 (Sep 2021)
 */
public class ControleVenda {
	private ArrayList<Venda> v= new ArrayList<Venda>();

	/**
	 * 
	 * @param d
	 */
	public ControleVenda(ControleDados d) {
		v = d.getVendas();
	}

	/**
	 * 
	 * @param id
	 * @return
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
