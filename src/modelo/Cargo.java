package modelo;

import java.util.Arrays;
import java.util.List;

/**
 * Esta classe cont�m os enumeradores utilizados para 
 * os cargos dos funcion�rios.
 * @author Matheus Perillo
 * @author Jo�o Victor Correia
 * @version 1.0 (Sep 2021)
 */
public enum Cargo {
	Trainee, Vendedor, Gerente;

	static List<Cargo> list = Arrays.asList(Cargo.values());
/**
 * M�todo para listar os enumeradores.
 */
	public static void listarCargos() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "- " + list.get(i));
		}
	}

}
