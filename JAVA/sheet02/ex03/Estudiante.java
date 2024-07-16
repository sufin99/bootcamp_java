/*Ejercicio 3: Herencia
Ejercicio: Crea una clase Estudiante que herede de Persona y añade un atributo
grado de tipo texto. Incluye un método para mostrar los detalles del estudiante,
incluyendo los detalles de la persona. La clase estudiante tendrá que tener un
constructor que llame al del padre. Al igual que una sobreescritura del método
mostrarDetalles.
Crea un Estudiante con nombre Ana de edad 20 y grado Ingeniería y muestra
los detalles del mismo.*/

public class Estudiante extends Persona {
	public String grado;

	public Estudiante(String nombre, int edad, String grado) {
		super(nombre, edad);
		this.grado = grado;
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Grado: " + grado);
	}

	public static void main(String[] args) {
		Estudiante persona1 = new Estudiante("Ana", 20, "Ingeniería");
		persona1.mostrarDetalles();
	}
}
