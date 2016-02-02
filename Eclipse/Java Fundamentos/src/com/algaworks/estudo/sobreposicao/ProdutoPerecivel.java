package com.algaworks.estudo.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

	protected Date dataValidade;

	@Override
	public void identificar() {
		super.identificar();
		System.out.println("Minha data de validade é: " + dataValidade);
	}
}
