package model;

import java.util.ArrayList;
import java.util.List;

public class TesteMain {

	public static void main(String[] args) {
		Alimento a1 = new Alimento("refrigerante", Tipo.BEBIDAS);
		Alimento a2 = new Alimento("picanha", Tipo.CARNE);

		List<Alimento> alimentos = new ArrayList<>();
		alimentos.add(a1);
		alimentos.add(a2);

		for (Alimento a : alimentos) {
			System.out.println(a.nome + " - " + a.tipo.toString().toLowerCase());
		}
	}

}
