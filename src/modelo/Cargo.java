package modelo;

import java.util.Arrays;
import java.util.List;



public enum Cargo {
	Trainee, Vendedor, Gerente;

	static List<Cargo> list = Arrays.asList(Cargo.values());

	public static void listarCargos() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "- " + list.get(i));
		}
	}

	public static Cargo cadastrarCargo() {
		System.out.println("\nDigite o nº do cargo: ");
		Cargo.listarCargos();
		int aux = Main.ler.nextInt();
		Main.ler.nextLine();
		switch (aux) {
		case 0:
			return Cargo.Trainee;

		case 1:
			return Cargo.Vendedor;
		case 2:
			return Cargo.Gerente;
		default:
			return null;
		}
	}
}
