/**
El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

author: Rafael López Cruz
*/ 

public class Ejercicio15 { 
	public static void main (String[] args) {
		String linea;
	
		//Pedimos el numero de alumnos que van al viaje
		System.out.print("Numero de alumnos que van al viaje: ");
		double alumnos = Double.parseDouble(System.console().readLine()); 
		
		//Ahora se realizan los cálculos y se muestran los resultados
		
		if (alumnos>=100) {
			System.out.println("Cada alumno debe pagar 65 euros, y habra que pagar en total a la agencia " + (alumnos*65) + " euros");
		} else {
			if (alumnos<=99 && alumnos>=50) {
			System.out.println("Cada alumno debe pagar 70 euros, y habra que pagar en total a la agencia " + (alumnos*70) + " euros");
			} else {
				if (alumnos<=49 && alumnos>=39) {
			System.out.println("Cada alumno debe pagar 95 euros, y habra que pagar en total a la agencia " + (alumnos*90) + " euros");
			} else {
			System.out.println("Habra que pagar un total de 4000 euros");
		}
		}
		}
	}
}
