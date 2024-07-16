
public class Main {
	public static void main(String[] args) {
		Persona[] personas = {
			new Estudiante("Ana", 20, "Ingeniería"),
			new Empleado("Luis", 30, 5000),
			new Persona("Marta", 40)
		};

		int i = 0;
		while (i < personas.length) {
			personas[i].mostrarDetalles();
			i++;
		}
	}
}
