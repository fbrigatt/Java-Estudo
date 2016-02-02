package com.algaworks.estudo.strings;

public class TesteStrings {

	public static void main(String[] args) {
		// String, StringBuilder, StringBuffer
		String s = "Ola";
		s += " Pessoal ";
		System.out.println(s);

		StringBuilder sb = new StringBuilder("Ola");
		sb.append(" Pessoal");
		System.out.println(sb);

		String resultado = sb.toString();
		System.out.println(resultado);
	}
}
