/**
Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por 400.

author: Rafael López Cruz
*/ 

public class Ejercicio12 { 
	public static void main (String[] args) {
		String linea;
	
		//Pedimos el año
		System.out.print("Introduce el periodo correspondiente ");
		int anio = Integer.parseInt(System.console().readLine()); 
		
		//Calculamos
		
		int calculo1 = anio % 4;
		int calculo2 = anio % 100;
		int calculo3 = anio % 400;
		
		//Comprobamos si el calculo1 es igual a 0 y el calculo2
		//es diferente de 0 entonces el año es bisiesto.
		//Si no si calculo1 es igual a 0, calculo2 es igual a 0 y
		//calculo3 es igual a 0 es bisiesto y si no es un año no
		//bisiesto.
		if (calculo1==0 && calculo2!=0) {
			System.out.println("Es bisiesto");
		} else {
			if (calculo1==0 && calculo2==0 && calculo3==0) { 
				System.out.println("Es bisiesto");
			} else {
				System.out.println("No es bisiesto");
			} 
		}
	}
}
