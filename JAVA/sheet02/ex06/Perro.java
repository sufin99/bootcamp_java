
public class Perro extends Animal implements Ruido {

	public Perro(String sonido) {
		super(sonido);
	}

	@Override
	public void hacerSonido() {
		System.out.println("El perro hace: " + sonido);
	}
}
