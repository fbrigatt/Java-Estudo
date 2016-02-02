package com.algaworks.estudo.interfaces;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail {

	private int numero;

	public NotaFiscal(int numero) {
		this.numero = numero;
	}

	@Override
	public void imprimir() {
		// aqui vai nossa implementacao
		System.out.println("Vamos imprimir essa nota fiscal de numero " + numero);
	}

	public void adicionarPedido(String produto) {

	}

	@Override
	public void enviar(String email) {
		System.out.println("Enviando a nota fiscal de numero " + numero + " para o email " + email);
	}

}
