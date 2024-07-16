/*Ejercicio 4: Polimorfismo
Ejercicio: Crea una clase Empleado que herede de Persona y sobrescribe el
método mostrarDetalles para incluir el salario . Usa el polimorfismo para mostrar
los detalles de una lista de personas que incluye estudiantes y empleados.*/

public class Empleado extends Persona implements Imprimible {
	public int salario;

	public Empleado(String nombre, int edad, int salario) {
		super(nombre, edad);
		this.salario = salario;
	}

	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Salario: " + salario);
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimiendo detalles del empleado: ");
		mostrarDetalles();
	}

/*	public static void main(String[] args) {
		Empleado persona1 = new Empleado("Lucas", 38, 5000);
		persona1.mostrarDetalles();
	}*/
}
