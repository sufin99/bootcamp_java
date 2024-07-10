/*Ejercicio 10: Números Aleatorios
Escribe un programa que genere un número aleatorio entre 1 y 100 y le pida al
usuario que adivine el número. El programa debe indicar si el número ingresado
es mayor o menor que el número aleatorio hasta que el usuario lo adivine.*/

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatorios {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int random = is_random();
		System.out.println("Introduce un número: ");

		while (!scan.hasNextInt()) {
			System.out.println("Error: Solo se aceptan números");
			scan.next();
			System.out.println("Introduce un número: ");
		}
		int a = scan.nextInt();
		int equal = is_equal_random(random, a);

		while (equal != 1) {
			System.out.println("Introduce un número:");
			while (!scan.hasNextInt()) {
				System.out.println("Error: Solo se aceptan números");
				scan.next();
				System.out.println("Introduce un número: ");
			}
			a = scan.nextInt();
			equal = is_equal_random(random, a);
		}
		if (equal == 1) {
			System.out.println("Adivinaste el número!!");
		}
	}

	static int is_equal_random(int random, int a) {
		if (random != a) {
			if (random < a) {
				System.out.println("El número que has ingresado es mayor que el número generado.");
				return (0);
			}
			else {
				System.out.println("El número que has ingresado es menor que el número generado.");
				return (-1);
			}
		}
		return (1);
	}

	static int is_random() {
		Random rand = new Random();

		int numberRandom  = rand.nextInt(100);
		return (numberRandom);
	}
}
