//Realiza un algoritmo que calcule la potencia, para ello 
//pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
//El exponente sea positivo, sólo tienes que imprimir la potencia.
//El exponente sea 0, el resultado es 1.
//El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

//@author: Rafael López Cruz

public class Ejercicio7 {
	public static void main (String[] args) {
		String linea;
		
		//Se piden los valores 
		System.out.print("Introduce la base: ");
		int base = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce el exponente: ");
		int exponente = Integer.parseInt(System.console().readLine());
		
		//Comprobamos si exponente es igual, mayor o menor que 0 y mostramos resultado.
		if (exponente>0) {
			System.out.println("La potencia correspondiente es " + Math.pow(base, exponente));
		} 
		if (exponente==0) {
			System.out.println("El resultado es 1");
		}
		if (exponente<0) { 
			System.out.println("La potencia correspondiente es " + Math.abs(1/Math.pow(base, exponente)));
		}
	}
} 
		
