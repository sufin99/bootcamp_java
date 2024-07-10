/*Ejercicio 8: Manejo de Cadenas
Escribe un programa que tome una cadena de texto como entrada (solicitada al
usuario) y determine si es un palíndromo (se lee igual de adelante hacia atrás).
Llama a la clase Palindromo .*/

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Introduce una palabra: ");
		while (!scan.hasNextLine()) {
			System.out.println("Error: no es una palabra");
			scan.next();
			System.out.println("Introduce una palabra: ");
		}
		String str = scan.nextLine();
		is_palindromo(str, str);
	}

	public static void is_palindromo(String str, String str2) {
		if (str.length() <= 1) {
			System.out.println(str2 + " es un palíndromo");
		}
		else {
			if (str.charAt(0) == str.charAt(str.length() - 1)) {
				is_palindromo(str.substring(1, str.length() - 1), str2);
			}
			else {
				System.out.println(str2 + " no es un palíndromo");
			}
		}
	}
}
