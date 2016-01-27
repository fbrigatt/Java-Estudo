package casadocodigo.javaoo.exemplos;

public class ClassesWrappers {

	public static void main(String[] args) {

		Integer integer = new Integer(10);
		int valor = integer.intValue();
		System.out.println(valor);

		boolean resultado = Boolean.parseBoolean("false");
		System.out.println(resultado);

		byte parseByte = Byte.parseByte("1");
		short parseShort = Short.parseShort("10");
		int parseInt = Integer.parseInt("10");
		long parseLong = Long.parseLong("10");
		float parseFloat = Float.parseFloat("10.0");
		double parseDouble = Double.parseDouble("10.0");

		// transformar em String
		String numeroEmTexto = String.valueOf(10);
		System.out.println(numeroEmTexto);
	}

}
