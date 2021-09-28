package controle;

import java.util.ArrayList;

import modelo.Cliente;


public class ControleCliente {
	private ArrayList<Cliente> c;
	
	
	public ControleCliente(ControleDados d) {
		c = d.getClientes();		
	}
	
	public String[] getNomeClientes() {
		String[] s = new String[this.c.size()];
		for(int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNome();
		}
		
		return s;
	}
	
	public static Cliente buscarPorNome(ArrayList<Cliente> lista,String nome) {
		try {
			 for(Cliente p: lista) {
				 if(p.getNome().toUpperCase().equals(nome.toUpperCase())) {
					 return p;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Cliente n�o encontrado");
		}
		return null;
	}
	
}