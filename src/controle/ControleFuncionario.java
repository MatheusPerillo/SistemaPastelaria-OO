package controle;

import java.util.ArrayList;

import modelo.Funcionario;


public class ControleFuncionario {
private static ArrayList<Funcionario> f;
	
	
	public ControleFuncionario(ControleDados d) {
		f = d.getFuncionarios();		
	}
	
	public String[] getNomeFuncionarios() {
		String[] s = new String[this.f.size()];
		for(int i = 0; i < this.f.size(); i++) {
			s[i] = f.get(i).getNome();
		}
		
		return s;
	}
	
	public  Funcionario buscarPorNome(String nome) {
		try {
			 for(Funcionario p: f) {
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
