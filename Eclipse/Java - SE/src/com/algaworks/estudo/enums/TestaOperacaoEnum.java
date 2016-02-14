package com.algaworks.estudo.enums;

public class TestaOperacaoEnum {

	public static void main(String[] args) {
		OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;

		int resultado1 = o1.operacao(5, 3);
		System.out.println("O resultado é: " + resultado1);

		for (OperacaoAritmetica oa : OperacaoAritmetica.values()) {
			System.out.println(oa + " -> " + oa.operacao(5, 3));
		}
	}
}