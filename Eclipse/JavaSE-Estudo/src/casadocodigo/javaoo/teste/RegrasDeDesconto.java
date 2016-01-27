package casadocodigo.javaoo.teste;

import casadocodigo.javaoo.livraria.Autor;
import casadocodigo.javaoo.produtos.Ebook;
import casadocodigo.javaoo.produtos.LivroFisico;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		// Livro livro = new LivroFisico(autor);
		// livro.setValor(59.90);

		LivroFisico livro = new LivroFisico(autor);
		livro.setValor(39.90);

		if (!livro.aplicaDescontoDe(0.3)) {
			System.out
					.println("Desconto no livro não pode ser maior do que 30%");
		} else {
			System.out.println("Valor do livro com desconto: "
					+ livro.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);

		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out
					.println("Desconto no ebook não pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: "
					+ ebook.getValor());
		}

		System.out.println(livro.getValor());
	}
}
