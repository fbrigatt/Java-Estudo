package com.algaworks.estudo.abstrata;

public class ProdutoPerecivel extends Produto {

	String descricao;
	String dataValidade;

	@Override
	public void imprimirDescricao() {
		// Digitar a logica
		System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);

	}

}