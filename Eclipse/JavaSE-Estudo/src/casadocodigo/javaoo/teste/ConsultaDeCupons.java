package casadocodigo.javaoo.teste;

import java.util.HashSet;
import java.util.Set;

import casadocodigo.javaoo.produtos.GerenciadorDeCupons;

public class ConsultaDeCupons {

	public static void main(String[] args) {

		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

		// if (gerenciador.validaCupom("CUP1234")) {
		// System.out.println("Cupom de desconto valido.");// aplica o desconto
		// // desse cupom
		// } else {
		// System.out.println("Esse cupom não existe.");
		// }

		Double desconto = gerenciador.validaCupom("CUP74");
		if (desconto != null) {
			System.out.println("Cupom de desconto valido.");
			System.out.println("Valor " + desconto);
		} else {
			System.out.println("Esse cupom não existe.");
		}

		// Set - não existe repetições
		Set<String> set = new HashSet<String>();
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		set.add("Não há repeticão em Conjuntos");
		System.out.println(set.size());
	}
}
