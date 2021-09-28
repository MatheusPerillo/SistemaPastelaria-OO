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

}
