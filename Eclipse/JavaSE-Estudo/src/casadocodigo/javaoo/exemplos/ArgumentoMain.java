package casadocodigo.javaoo.exemplos;
public class ArgumentoMain {

	public static void main(String[] args) {
		args = new String[3];
		args[0] = "1";
		args[1] = "2";
		args[2] = "3";

		for (String a : args) {
			System.out.println(a);
		}
	}
}
