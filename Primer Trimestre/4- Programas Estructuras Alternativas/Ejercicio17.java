/**
Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.

Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: numero incorrecto.

author: Rafael López Cruz
*/ 

public class Ejercicio17 { 
	public static void main (String[] args) {
		String linea;
	
		//Pedimos el numero 
		System.out.print("Introduce el numero correspondiente ");
		int num = Integer.parseInt(System.console().readLine()); 
		
		//Ahora se realizan los cálculos y se muestran los resultados 
		
		switch (num) { 
			case 1:
			System.out.print("seis");
			break;
			
			case 2:
			System.out.print("cinco");
			break;
			
			case 3:
			System.out.print("cuatro");
			break;
			
			case 4:
			System.out.print("tres");
			break;
			
			case 5:
			System.out.print("dos");
			break;
			
			case 6:
			System.out.print("uno");
			break;
			
			default:
			if (num>6 || num<1) {
				System.out.print("ERROR:numero incorrecto");
			}
		}
	}
}
