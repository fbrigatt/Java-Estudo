package com.casadocodigo.javaoo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author Raphael
 * @site O m�nimo que voc� deve saber de Java 8
 *       http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8/
 * 
 * @site Trabalhando com closures no Java 8
 *       http://blog.caelum.com.br/trabalhando-com-closures-no-java-8/
 */

public class NovidadesDoJava8SiteCaelum {

	public static void main(String[] args) {

		List<String> palavras = Arrays.asList("rodrigo", "paulo", "caelum");

		// Comparator<String> comparador = new Comparator<String>() {
		// public int compare(String s1, String s2) {
		// return Integer.compare(s1.length(), s2.length());
		// }
		// };

		// Comparator<String> comparador = (s1, s2) -> {
		// return Integer.compare(s1.length(), s2.length());
		// };

		// Comparator<String> comparador = (s1, s2) -> Integer.compare(
		// s1.length(), s2.length());
		//
		// Collections.sort(palavras, comparador);

		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// palavras.sort(Comparator.comparing(s -> s.length()));

		// palavras.sort(Comparator.comparing(String::length));

		palavras.sort(Comparator.comparingInt(String::length));

		// for (String string : palavras) {
		// System.out.println(string);
		// }

		palavras.forEach(s -> System.out.println(s));

		System.out.println("--------------------------");

		// Para filtrar as Strings com menos de 6 caracteres em nossa lista
		// podemos fazer
		palavras.stream().filter(s -> s.length() < 6)
				.forEach(System.out::println);

		System.out.println("--------------------------");

		// aplicar transforma��es em nossa lista sem a necessidade de vari�veis
		// intermedi�rias
		// Stream<Integer> stream = palavras.stream().map(String::length);

		IntStream intStream = palavras.stream().mapToInt(String::length);

		System.out.println("--------------------------");

		OptionalDouble media = palavras.stream().mapToInt(String::length)
				.average();

		System.out.println(media.orElse(0));

		System.out.println("--------------------------");

		List<String> resultado = palavras.stream().filter(s -> s.length() < 6)
				.collect(Collectors.toList());

		for (String s : resultado) {
			System.out.println(s);
		}
	}
}
