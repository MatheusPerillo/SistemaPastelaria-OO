package modelo;

import java.util.Scanner;

import modelo.Funcionario.Cargo;

public class Main {
	public static Scanner ler = new Scanner(System.in);
	
public static void main(String[] args) {
	System.out.println("Hello World");
	
	Endereco end = new Endereco("Distrito federal","Brasília","Band","71710011","04");
	Telefone tel = new Telefone(61,"99946-8480");
	Cliente joao = new Cliente("Joao",end,tel,"ui@ui.com","123");
	
	Funcionario perillo = new Funcionario("Perillo",end,tel,"email@email.com",Cargo.Gerente,3565.88,"24/02/2001",10);
	
	System.out.println(end);
	end.editar(end);
	System.out.println(end);
}


}
