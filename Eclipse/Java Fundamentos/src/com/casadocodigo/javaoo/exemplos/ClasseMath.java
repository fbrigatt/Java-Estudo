package com.casadocodigo.javaoo.exemplos;

import java.util.Random;

public class ClasseMath {

	public static void main(String[] args) {

		long round = Math.round(3.99);
		long max = Math.max(100, 10);
		int min = Math.min(100, 10);
		int abs = Math.abs(-5);
		double sqrt = Math.sqrt(4);

		System.out.println(round);
		System.out.println(max);
		System.out.println(min);
		System.out.println(abs);
		System.out.println(sqrt);

		Random random = new Random();
		System.out.println("Random: " + random.nextInt(10));
		System.out.println("Random: " + random.nextDouble());
		System.out.println("Random: " + random.nextBoolean());
	}
}
