/**
Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:

Si se cumple Pitágoras entonces es triángulo rectángulo
Si sólo dos lados del triángulo son iguales entonces es isósceles.
Si los 3 lados son iguales entonces es equilátero.
Si no se cumple ninguna de las condiciones anteriores, es escaleno.

author: Rafael López Cruz
*/ 

public class Ejercicio11 { 
	public static void main (String[] args) {
		String linea;
	
		//Pedimos los valores
		System.out.print("Indica el primer valor ");
		double A = Double.parseDouble(System.console().readLine()); 
		
		System.out.print("Indica el segundo valor ");
		double B = Double.parseDouble(System.console().readLine());
		
		System.out.print("Indica el tercer valor ");
		double C = Double.parseDouble(System.console().readLine());
	
		
		//Calculamos y mostramos que tipo de triangulo es
		
		if (Math.pow(A, 2) + Math.pow(B, 2)==Math.pow(C, 2)) {
			System.out.println("Es un triangulo rectangulo");
		} else {
			if (A==B && A!=C || C==B && C!=A) { 
				System.out.println("Es un triangulo isosceles");
			} else {
			if (A==B && A==C) {
				System.out.println("Es un triangulo equilatero");
			} else {
			System.out.println("Es un triangulo escaleno");
		}
		}
		}		
	}
}
