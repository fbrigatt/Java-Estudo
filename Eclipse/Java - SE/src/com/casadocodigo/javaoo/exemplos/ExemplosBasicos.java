package com.casadocodigo.javaoo.exemplos;

public class ExemplosBasicos {

	public static void main(String[] args) {

		double soma = 0;

		// WHILE
		// int contador = 0;
		// while (contador < 35) {
		// double valorDoLivro = 59.90;
		// soma += valorDoLivro;
		// contador += 1;
		// }

		// -------------------------------------------
		// FOR
		for (int contador = 0; contador < 35; contador++) {
			soma += 59.90;
		}

		// -------------------------------------------
		System.out.println("O total em estoque � " + soma);

		if (soma < 150) {
			System.out.println("Seu estoque est� muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque est� muito alto!");
		} else {
			System.out.println("Seu estoque est� bom");
		}

		// -------------------------------------------
		System.out.println("\nContinue");
		for (int i = 0; i <= 10; i++) {
			if (i == 7) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();

		// -------------------------------------------
		System.out.println("Break");
		for (int i = 0; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
	}
}
