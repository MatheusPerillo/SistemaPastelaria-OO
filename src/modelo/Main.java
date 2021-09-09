package modelo;

import java.util.Scanner;

import modelo.Funcionario.Cargo;

public class Main {
	public static Scanner ler = new Scanner(System.in);
	
public static void main(String[] args) {
	
	
	Endereco end = new Endereco("Distrito federal","Brasília","Band","71710011","04");
	Telefone tel = new Telefone("61","99946-8480");
	Cliente joao = new Cliente("Joao",end,tel,"ui@ui.com","123");
	Pastel flango = new Pastel("frangod", 10.00, "frango de Deus", 0, "G", "frango");
	Bebida coca = new Bebida("coca", 7.99, "geladinha", 0, 2000, "garrafa");
	Funcionario perillo = new Funcionario("Perillo",end,tel,"email@email.com",Cargo.Gerente,3565.88,"24/02/2001",10);
	
<<<<<<< HEAD
	System.out.println(coca);
	coca.verifDisponiblidade();
	System.out.println(coca);
=======

	System.out.println(perillo);
	
	perillo.editar(perillo);;
	System.out.println(perillo);
>>>>>>> branch 'main' of https://github.com/MatheusPerillo/tp3CodeJava.git
	
}


}
