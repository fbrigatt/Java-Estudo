package com.casadocodigo.javaoo.teste;

import com.casadocodigo.javaoo.produtos.Produto;

public class CarrinhoDeCompras {

	private double total;
	private Produto[] produtos = new Produto[10];
	private int contador = 0;

	// public void adiciona(Produto produto) {
	// System.out.println("Adicionando: " + produto);
	// // produto.aplicaDescontoDe(0.16);
	// total += produto.getValor();
	// }

	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.produtos[contador] = produto;
		contador++;
		this.total += produto.getValor();
	}

	public double getTotal() {
		return total;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

}
