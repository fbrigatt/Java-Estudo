package com.algaworks.estudo.debug;
import java.util.Scanner;

public class TestandoDebug {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int divisor = entrada.nextInt();

		for (int i = 100; i <= 120; i++) {
			if (i % divisor == 0) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("Fim do programa");

	}
}
