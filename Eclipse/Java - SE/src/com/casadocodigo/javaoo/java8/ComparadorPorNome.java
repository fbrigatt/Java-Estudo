package com.casadocodigo.javaoo.java8;

import java.util.Comparator;

import com.casadocodigo.javaoo.produtos.Livro;

public class ComparadorPorNome implements Comparator<Livro> {

	@Override
	public int compare(Livro l1, Livro l2) {
		return l1.getNome().compareTo(l2.getNome());
	}

}
