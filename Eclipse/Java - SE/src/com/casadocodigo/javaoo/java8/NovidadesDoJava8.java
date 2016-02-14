package com.casadocodigo.javaoo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.casadocodigo.javaoo.livraria.Autor;
import com.casadocodigo.javaoo.produtos.Livro;
import com.casadocodigo.javaoo.produtos.LivroFisico;

public class NovidadesDoJava8 {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");

		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Pr�tico");

		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");

		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);

		for (Livro livro : livros) {
			System.out.println(livro.getNome());
		}
		System.out.println("-----------------------");

		// Collections.sort(livros, new ComparadorPorNome());

		// Collections.sort(livros, new Comparator<Livro>() {
		// @Override
		// public int compare(Livro l1, Livro l2) {
		// return l1.getNome().compareTo(l2.getNome());
		// }
		// });

		// livros.sort(new Comparator<Livro>() {
		// @Override
		// public int compare(Livro l1, Livro l2) {
		// return l1.getNome().compareTo(l2.getNome());
		// }
		// });

		// livros.sort((Livro l1, Livro l2) -> {
		// return l1.getNome().compareTo(l2.getNome());
		// });

		livros.sort((l1, l2) -> l1.getNome().compareTo(l2.getNome()));

		// for (Livro livro : livros) {
		// System.out.println(livro.getNome());
		// }

		livros.forEach(livro -> System.out.println(livro.getNome()));

		System.out.println("-----------------------");

		List<Livro> filtrados = new ArrayList<>();
		for (Livro livro : livros) {
			if (livro.getNome().contains("Java")) {
				filtrados.add(livro);
			}
		}

		for (Livro livro : filtrados) {
			System.out.println(livro.getNome());
		}

		System.out.println("-----------------------");

		Stream<Livro> stream = livros.stream();

		livros.stream().filter(l -> l.getNome().contains("Java"))
				.forEach(l -> System.out.println(l.getNome()));

	}
}
