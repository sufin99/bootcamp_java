/*Ejercicio 7: Funciones
Escribe una función que tome dos números enteros como parámetros (no se le
pregunta al usuario) y devuelva su suma. Llama a esta función desde el método
main y muestra el resultado. Llama a la clase Funciones .*/

public class Funciones {
	public static void main(String[] args) {
		int s = 5;
		int z = 9;
		int total = sum(s, z);
		System.out.println("El total es: " + total);
	}

	public static int sum(int a, int b) {
		int y = a + b;
		return (y);
	}
}
