//Escribe un programa que lea un número e indique si es par o impar.
//@author: Rafael López Cruz


public class Ejercicio3 {
	public static void main (String[] args) {
		String linea;
		
		//Se pide el número 
		System.out.print("Introduce el numero: ");
		int num = Integer.parseInt(System.console().readLine());
		
		//Ahora se realizan los cálculos 
		int resto = num % 2;
		
		//Se muestran los resultados 
		if (resto==0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
	}
}
