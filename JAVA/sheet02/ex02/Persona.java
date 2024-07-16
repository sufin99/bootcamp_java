/*Ejercicio 2: Métodos y Encapsulamiento
Ejercicio: Añade métodos get y set para los atributos de la clase Persona que
los tendrás que poner como privados. Usa estos métodos para modificar el
nombre por Carlos y la edad por 30 y obtener los valores de los atributos.*/



public class Persona {
	public String nombre;
	public int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	private String getNombre() {
		return (nombre);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int getEdad() {
		return (edad);
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrarDetalles() {
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
	}
	public static void main(String[] args) {

		Persona persona1 = new Persona ("Juan", 25);
		persona1.mostrarDetalles();

		persona1.getNombre();
		persona1.setNombre("Carlos");
		persona1.getEdad();
		persona1.setEdad(30);
		persona1.mostrarDetalles();
	}
}
