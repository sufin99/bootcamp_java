
public class Gato extends Animal implements Ruido {

	public Gato(String sonido) {
		super(sonido);
	}

	@Override
	public void hacerSonido() {
		System.out.println("El gato hace: " + sonido);
	}
}
 