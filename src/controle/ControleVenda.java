package controle;

import java.util.ArrayList;

import modelo.Venda;

public class ControleVenda {
private ArrayList<Venda> v;
	
	public ControleVenda(ControleDados d) {
		v = d.getVendas();
	}
	

	public static Venda buscarPorId(ArrayList<Venda> lista, int id) {
		try {
			 for(Venda v: lista) {
				 if(v.getId() == id) {
					 return v;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Venda não encontrada");
		}
		return null;
	}
}
