package com.algaworks.estudo.interfaces;

public class TesteInterface {

	public static void main(String[] args) {

		Imprimivel i = new NotaFiscal(1234);
		// NotaFiscal i = new NotaFiscal(1234);
		// i.enviar("aaaa");
		i.imprimir();

		// NotaFiscal n = (NotaFiscal) i;
		// n.adicionarPedido("");

		EnviavelPorEmail e = (EnviavelPorEmail) i;
		e.enviar("email@email.com");

		NotaFiscal n = (NotaFiscal) e;
		n.adicionarPedido("livro");

	}
}
