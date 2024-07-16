
public class Main {
	public static void main(String[] args) {
		Animal[] animales = {
			new Perro("Guau Guau"),
			new Gato("Miau Miau"),
		};

		int i = 0;
		while (i < animales.length) {
			animales[i].hacerSonido();
			i++;
		}
	}
}
