package modelo;

import java.util.GregorianCalendar;
import java.util.Scanner;

import helper.Util;
import modelo.Funcionario.Cargo;

public class Main {
	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		int auxMenu;
		int aux1;
		int aux2;
		int aux3;
		int aux4;
		int aux5;
		int aux6;
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
		
		
	//System.out.println(pedido1.getValorTotal());
	//pedido1.pedirBebida(coca, 2);
	//pedido1.pedirPastel(flango, 2);
	//pedido1.pedirPastel(flango2, 3);
	//pedido1.calcularValorTotal();
	
	//pedido1.listarBebidasPedidas();
	//pedido1.listarPasteisPedidos();
	
	//System.out.println("\n\n"+pedido1.getValorTotal());
	
		
	//---------------------------------MENU DE INICIAL---------------------------------------
		
	do {
		System.out.println("MENU DE OPÇÕES\n");
		System.out.println("1. Cliente\n2. Funcionário\n"
				+ "3. Pastel\n4. Bebida\n5. Produtos\n"
				+ "6. Pedido\n7. Sair");
		
		auxMenu = Main.ler.nextInt();
		Main.ler.nextLine();
		switch(auxMenu) {
		
		case 1: //Cliente
			do {
				System.out.println("\n1- Cadastrar cliente\n2- Editar cliente\n3- Sair");
				
			aux1 = Main.ler.nextInt();
			Main.ler.nextLine();
			switch(aux1) {
			
			case 1: //Cadastro
				
				System.out.println("\nCadastro de cliente realizado com sucesso!");
				Util.pausar(1);
				break;
				
			case 2: //Editar
				
				break;
				
			case 3: //Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;
			
			}
				
			}while(aux1 != 3);
			
			break;
//----------------------------------------------------------------------------			
			
		case 2: //Funcionário
			do {
			System.out.println("\n1- Cadastrar funcionário\n2- Editar funcionário\n3- Sair");
			
			aux2 = Main.ler.nextInt();
			Main.ler.nextLine();
			switch(aux2) {
			
			case 1: //Cadastro
				
				System.out.println("\nCadastro de funcionário realizado com sucesso!");
				Util.pausar(1);
				break;
				
			case 2: //Editar
				break;
				
			case 3: //Sair
				System.out.println("\nAguarde..");
				Util.pausar(2);
				System.out.println("");
				break;
			
			}
			
			}while(aux2 != 3);
			
			break;
//------------------------------------------------------------------------------			
			
		case 3: //Pastel
			do {
				System.out.println("\n1- Cadastrar pastel\n2- Editar pastel\n3- Sair");
				
				aux3 = Main.ler.nextInt();
				Main.ler.nextLine();
				switch(aux3) {
				
				case 1: //Cadastro
					
					System.out.println("\nPastel cadastrado com sucesso!");
					Util.pausar(1);
					break;
					
				case 2: //Editar
					break;
					
				case 3: //Sair
					System.out.println("\nAguarde..");
					Util.pausar(2);
					System.out.println("");
					break;
				
				}
				
				}while(aux3 != 3);
			
			break;
//------------------------------------------------------------------------------
			
		case 4: //Bebida
			do {
				System.out.println("\n1- Cadastrar bebida\n2- Editar bebida\n3- Sair");
				
				aux4 = Main.ler.nextInt();
				Main.ler.nextLine();
				switch(aux4) {
				
				case 1: //Cadastro
					
					System.out.println("\nBebida cadastrada com sucesso!");
					Util.pausar(1);
					break;
					
				case 2: //Editar
					break;
					
				case 3: //Sair
					System.out.println("\nAguarde..");
					Util.pausar(2);
					System.out.println("");
					break;
				
				}
				
				}while(aux4 != 3);
			
			break;
//------------------------------------------------------------------------------	
			
		case 5: //Produto
			do {
				System.out.println("\n1- Lista de Pasteis e Bebidas\n2- Estoque dos produtos\n3- Reposição"
						+ " de Produtos\n4- Sair");
				
				aux5 = Main.ler.nextInt();
				Main.ler.nextLine();
				switch(aux5) {
				
				case 1: //Lista dos produtos
					break;
					
				case 2: //Estoque
					break;
					
				case 3: //Reposição
					break;
					
				case 4: //Sair
					System.out.println("\nAguarde..");
					Util.pausar(2);
					System.out.println("");
					break;
				
				}
				
				}while(aux5 != 4);
			
			break;
//------------------------------------------------------------------------------
			
		case 6: //Pedido
			do {
				System.out.println("\n1- Cadastrar pedido\n2- Editar pedido\n3- Sair");
				
				aux6 = Main.ler.nextInt();
				Main.ler.nextLine();
				switch(aux6) {
				
				case 1: //Cadastro
					break;
					
				case 2: //Editar
					break;
					
				case 3: //Sair
					System.out.println("\nAguarde..");
					Util.pausar(2);
					System.out.println("");
					break;
				
				}
				
				}while(aux6 != 3);
			
			break;
			
//------------------------------------------------------------------------------			
		case 7: //Sair
			System.out.println("\nAguarde..");
			Util.pausar(2);
			System.out.print("\nEncerrando em:"); Util.pausar(1); System.out.print(" 3.."); Util.pausar(1); System.out.print(" 2.."); Util.pausar(1); System.out.print(" 1..\n"); Util.pausar(1);
			System.out.println("\nPrograma encerrado!");
			
			break;
//------------------------------------------------------------------------------
			
		}
		
	} while(auxMenu != 7);
		

	}

}
