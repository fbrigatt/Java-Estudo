package com.casadocodigo.javaoo.teste;

import java.util.List;

import com.casadocodigo.javaoo.livraria.Autor;
import com.casadocodigo.javaoo.produtos.Ebook;
import com.casadocodigo.javaoo.produtos.LivroFisico;
import com.casadocodigo.javaoo.produtos.Produto;

public class RegistroDeVendas {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");

		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);

		if (fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora � " + fisico.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);

		// CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		CarrinhoDeComprasComArrayList carrinho = new CarrinhoDeComprasComArrayList();

		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);

		System.out.println("Total " + carrinho.getTotal());

		// Produto[] produtos = carrinho.getProdutos();
		List<Produto> produtos = carrinho.getProdutos();

		// for (int i = 0; i < produtos.length; i++) {
		// Produto produto = produtos[i];
		// if (produto != null) {
		// System.out.println(produto.getValor());
		// }
		// }

		// for (int i = 0; i <= produtos.length; i++) {
		// try {
		// Produto produto = produtos[i];
		// if (produto != null) {
		// System.out.println(produto.getValor());
		// }
		// // } catch (ArrayIndexOutOfBoundsException e) {
		// // System.out.println("deu exception no indice: " + i);
		// // } catch (NullPointerException e) {
		// // System.out.println("A array n�o foi instanciado!");
		// // }
		// } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
		// System.out.println("foi uma das duas");
		// }
		// }
		// System.out.println("Fui executado!");

		for (Produto produto : produtos) {
			if (produto != null) {
				System.out.println(produto.getValor());
			}
		}

		System.out.println("-----------------------");
		System.out.println("toString");
		System.out.println("-----------------------");
		System.out.println(ebook);
		System.out.println(fisico);

	}
}
