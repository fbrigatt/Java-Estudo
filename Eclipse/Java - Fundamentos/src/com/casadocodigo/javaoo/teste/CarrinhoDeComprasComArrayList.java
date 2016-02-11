package com.casadocodigo.javaoo.teste;

import java.util.ArrayList;
import java.util.List;

import com.casadocodigo.javaoo.produtos.Produto;

public class CarrinhoDeComprasComArrayList {

	private double total;
	private List<Produto> produtos;

	public CarrinhoDeComprasComArrayList() {
		this.produtos = new ArrayList<Produto>();
	}

	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}

	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}

	public double getTotal() {
		return total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
