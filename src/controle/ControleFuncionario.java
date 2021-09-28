package controle;

import java.util.ArrayList;

import modelo.Funcionario;


public class ControleFuncionario {
private ArrayList<Funcionario> c;
	
	
	public ControleFuncionario(ControleDados d) {
		c = d.getFuncionarios();		
	}
	
	public String[] getNomeFuncionarios() {
		String[] s = new String[this.c.size()];
		for(int i = 0; i < this.c.size(); i++) {
			s[i] = c.get(i).getNome();
		}
		
		return s;
	}
	
	public static Funcionario buscarPorNome(ArrayList<Funcionario> lista,String nome) {
		try {
			 for(Funcionario p: lista) {
				 if(p.getNome().toUpperCase().equals(nome.toUpperCase())) {
					 return p;
				 }
			 }
		} catch (Exception e) {
			System.out.println("Funcionario não encontrado");
		}
		return null;
	}
}
