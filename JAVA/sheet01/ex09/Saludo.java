/*Ejercicio 9: Entrada y Salida de Datos
Escribe un programa que tome el nombre del usuario como entrada (solicitado
al usuario) y lo salude con un mensaje personalizado.*/

import java.util.Scanner;

public class Saludo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("¿Como te llamas payaso?: ");
		String saludo = scan.nextLine();
		while (saludo.matches("[0-9]+")) {
			System.out.println("COMO TU NOMBRE VA A SER UN NUMERO O UN SIMBOLO");
			System.out.println("¿Como te llamas payaso?: ");
			saludo = scan.nextLine();
		}
		System.out.println("Hola, " + saludo + ". Eres un payaso");
	}
	
}
