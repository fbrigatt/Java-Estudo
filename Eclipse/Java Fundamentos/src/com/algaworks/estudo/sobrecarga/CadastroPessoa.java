package com.algaworks.estudo.sobrecarga;

public class CadastroPessoa {

	public void cadastrar(Pessoa p) {
		armazenar(p.getNome(), p.getIdade());
	}

	private void armazenar(String nome, int idade) {
		// salva no banco de dados
		System.out.println("Salvando: \"" + nome + "\" com " + idade + " anos.");
	}

	public void cadastrar(String nome, int idade) {
		armazenar(nome, idade);
	}
}