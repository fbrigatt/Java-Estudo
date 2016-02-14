package com.casadocodigo.javaoo.exemplos;

public class ClasseString {

	public static void main(String[] args) {
		String java = new String("java");

		String replace = java.replace("v", "c");
		String upperCase = java.toUpperCase();
		String lowerCase = "JAVA".toLowerCase();
		char charAt = java.charAt(0);
		boolean endsWith = java.endsWith("a");
		boolean startsWith = java.startsWith("s");
		boolean equals = java.equalsIgnoreCase("JAVA");

		System.out.println(replace);
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println(charAt);
		System.out.println(endsWith);
		System.out.println(startsWith);
		System.out.println(equals);
	}
}
