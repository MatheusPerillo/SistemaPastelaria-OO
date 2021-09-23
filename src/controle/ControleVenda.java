package controle;

import java.util.ArrayList;

import modelo.Venda;

public class ControleVenda {
private ArrayList<Venda> c;
	
	public ControleVenda(ControleDados d) {
		c = d.getVendas();
	}
	
	public Integer[] getNumVendas() {
		Integer [] s = new Integer[this.c.size()];
		for (int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getId();
		}
		return s;
	}
}
