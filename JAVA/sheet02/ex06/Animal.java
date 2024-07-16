/*Ejercicio 6: Clases Abstractas
Ejercicio: Define una clase abstracta Animal con un método abstracto
hacerSonido . Crea clases Perro y Gato que hereden de Animal y sobrescriban el
método hacerSonido . Dirán “El perro hace: Guau guau” y “El gato hace: Miau
Miau”.
Hazte un main para probar tu ejercicio.*/

public abstract class Animal {
	public String sonido;
	
	public Animal(String sonido) {
		this.sonido = sonido;
	}

	public abstract void hacerSonido();
}
