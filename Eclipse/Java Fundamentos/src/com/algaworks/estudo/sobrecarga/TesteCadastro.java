package com.algaworks.estudo.sobrecarga;

public class TesteCadastro {

	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();

		Pessoa p = new Pessoa("Raphael", 27);

		cadastro.cadastrar(p);

		// -------------------------------

		cadastro.cadastrar("Maria", 25);
		;
	}
}
