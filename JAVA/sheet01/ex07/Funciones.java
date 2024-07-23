/*Ejercicio 7: Funciones
Escribe una función que tome dos números enteros como parámetros (no se le
pregunta al usuario) y devuelva su suma. Llama a esta función desde el método
main y muestra el resultado. Llama a la clase Funciones .*/

public class Funciones {
	public static int sum(String[] args) {
		int i = 0;
		int total = 0;
		while (i < args.length)
		{
			total += Integer.parseInt(args[i]);
			i++;
		}
		return (total);
	}
	public static void main(String[] args) {
		if (args.length < 2)
		{
			System.out.println("Introduce minimo 2 num.");
			return ;
		}
		int total = sum(args);
		System.out.println("El total es: " + total);
	}
}
