package com.casadocodigo.javaoo.teste;

import java.util.HashSet;
import java.util.Set;

import com.casadocodigo.javaoo.produtos.GerenciadorDeCupons;

public class ConsultaDeCupons {

	public static void main(String[] args) {

		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

		// if (gerenciador.validaCupom("CUP1234")) {
		// System.out.println("Cupom de desconto valido.");// aplica o desconto
		// // desse cupom
		// } else {
		// System.out.println("Esse cupom n�o existe.");
		// }

		Double desconto = gerenciador.validaCupom("CUP74");
		if (desconto != null) {
			System.out.println("Cupom de desconto valido.");
			System.out.println("Valor " + desconto);
		} else {
			System.out.println("Esse cupom n�o existe.");
		}

		// Set - n�o existe repeti��es
		Set<String> set = new HashSet<String>();
		set.add("N�o h� repetic�o em Conjuntos");
		set.add("N�o h� repetic�o em Conjuntos");
		set.add("N�o h� repetic�o em Conjuntos");
		set.add("N�o h� repetic�o em Conjuntos");
		set.add("N�o h� repetic�o em Conjuntos");
		System.out.println(set.size());
	}
}
