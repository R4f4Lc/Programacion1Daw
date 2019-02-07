//Crea un programa que pida al usuario dos números 
//y muestre su división si el segundo no es cero, 
//o un mensaje de aviso en caso contrario.
//@author: Rafael López Cruz

public class Ejercicio4 {
	public static void main (String[] args) {
		String linea;
		
		//Se piden los números 
		System.out.print("Introduce el primer numero: ");
		double num1 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Introduce el segundo numero; ");
		double num2 = Double.parseDouble(System.console().readLine());
		
		//Ahora comparamos si num2 es igual que 0 y realizamos la division en caso
		//que num2 no se igual a 0.
		
		if (num2==0) {
			System.out.println("El segundo numero no puede ser 0");

		} else {
			System.out.println("La division es igual a " + num1 / num2);

		}
	}
}

	 

