package modelo;

import java.util.GregorianCalendar;
import java.util.Scanner;

import modelo.Funcionario.Cargo;

public class Main {
	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		GregorianCalendar dataDeInscricao = new GregorianCalendar();
		Endereco end = new Endereco("Distrito federal", "Brasília", "Band", "71710011", "04");
		Telefone tel = new Telefone("61", "99946-8480");
		Loja perillao= new Loja("Os brasbos",end,tel);
		Cliente joao = new Cliente("Joao", end, tel, "ui@ui.com", "123");
		Pastel flango = new Pastel("frangod", 10.00, "frango de Deus", 4, "G", "frango");
		Pastel flango2 = new Pastel("frangod2", 20.00, "frango de Deus", 2, "G", "frango");
		Bebida coca = new Bebida("coca", 7.99, "geladinha", 2, 2000, "garrafa");
		Funcionario perillo = new Funcionario("Perillo", end, tel, "email@email.com", Cargo.Gerente, 3565.88,
				"24/02/2001", 10);
		Pedido pedido1 = new Pedido(200.0,joao,perillo,dataDeInscricao.getTime());
		
		
	System.out.println(pedido1.getValorTotal());
	pedido1.pedirBebida(coca, 2);
	pedido1.pedirPastel(flango, 2);
	pedido1.pedirPastel(flango2, 3);
	pedido1.calcularValorTotal();
	
	pedido1.listarBebidasPedidas();
	pedido1.listarPasteisPedidos();
	
	System.out.println("\n\n"+pedido1.getValorTotal());
	
		
		
		
		

	}

}
