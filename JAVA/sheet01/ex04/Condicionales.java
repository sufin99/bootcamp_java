/*Ejercicio 4: Condicionales
Escribe un programa que tome un número entero como entrada (solicitado al
usuario) y determine si es positivo, negativo o cero. Llama a la clase
Condicionales .*/

import java.util.Scanner;

public class Condicionales {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		while (!scann.hasNextInt()) {
			System.out.println("Error: Solo se aceptan números");
			scann.next();
			System.out.println("Introduce un número: ");
		}
		int a = scann.nextInt();

		if (a < 0) {
			System.out.println(a + " es un número negativo");
		}
		else if (a > 0) {
			System.out.println(a + " es un número positivo");
		}
		else {
			System.out.println(a + " es cero");
		}
	}
}
