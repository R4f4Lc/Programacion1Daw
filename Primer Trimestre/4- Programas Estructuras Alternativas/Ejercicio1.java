//Algoritmo que pida dos números e indique 
//si el primero es mayor que el segundo o no.
//@author: Rafael López Cruz 

public class Ejercicio1 {
	public static void main (String[] args) {
		String linea;
		
		//Se pide los numeros
		System.out.print("Introduce el primer numero: ");
		int num1 = Integer.parseInt(System.console().readLine());
		
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = Integer.parseInt(System.console().readLine());
		
		//Comprobamos con if si num1 es mayor que num2
		
		if (num1>num2) {
			System.out.println("El primer numero es mayor");
		} else {
			System.out.println("El primer numero no es mayor");
		}
	}
}
		
		
		
		
