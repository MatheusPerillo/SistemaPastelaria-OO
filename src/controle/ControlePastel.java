package controle;

import java.util.ArrayList;

import modelo.Pastel;

public class ControlePastel {
	private ArrayList<Pastel> c;
	
	public ControlePastel(ControleDados d) {
		c = d.getPasteis();
	}
	
	public String[] getNomePasteis() {
		String [] s = new String[this.c.size()];
		for (int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNome();
		}
		return s;
	}
}
