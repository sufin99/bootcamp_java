/*Ejercicio 3: Operaciones Aritméticas
Escribe un programa que tome dos números enteros como entrada (solicitando
esos números al usuario), realice operaciones aritméticas básicas (suma, resta,
multiplicación y división) y muestre los resultados. Quizás debas importar el
paquete de java.util.Scanner . Llama a la clase OperacionesAritmeticas .*/

import java.util.Scanner;

public class OperacionesAritméticas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("Introduce un número: ");
		while (!scan.hasNextInt()) {
			System.out.printf("\nError: Introduce un número\n");
			scan.next();
			System.out.printf("Introduce un número: ");
		}
		int a = scan.nextInt();
		System.out.printf("Introduce el segundo número: ");
		while (!scan.hasNextInt()) {
			System.out.printf("\nError: Introduce un número\n");
			scan.next();
			System.out.printf("Introduce un número: ");
		}
		int b = scan.nextInt();

		System.out.printf("\nLa suma es: %d", a + b);
		System.out.printf("\nLa resta es: %d", a - b);
		System.out.printf("\nLa multiplicación es: %d", a * b);
		if (b == 0) {
			System.out.printf("\nNo se puede dividir entre 0.");
		}
		else {
			float y = (float)a / (float)b;
			System.out.println("\nLa división es: " + y);
		}
	}
}
