//Programa que lea una cadena por teclado 
//y compruebe si es una letra mayúscula.
//@author: Rafael López Cruz

public class Ejercicio6 {
	public static void main (String[] args) {
		String letra;
		
		//Se pide la letra 
		System.out.print("Introduce la letra:");
		letra = System.console().readLine();
		
		//Comparamos si la letra es igual a la misma letra en minuscula entonces es
		//mayuscula en caso contrario es minuscula.
		if (letra==letra.toUpperCase()) {
			System.out.println("Es una letra mayuscula");
		} else {
			System.out.println("Es una letra minuscula");
		}
	}
}
