package controle;

import java.util.ArrayList;

import modelo.Venda;

public class ControleVenda {
	private ArrayList<Venda> v= new ArrayList<Venda>();

	public ControleVenda(ControleDados d) {
		v = d.getVendas();
	}

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
			System.out.println("Venda não encontrada");
		}
		return null;
	}
}
