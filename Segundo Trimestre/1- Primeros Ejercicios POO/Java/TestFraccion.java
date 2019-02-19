/**
Crea una clase Fraccion (en Java yPython) de forma que podamos hacer las siguientes operaciones:

Contruir un objeto Fraccion pasándole al constructor el numerador y el denominador.
Obtener la fracción.
Obtener y modificar numerador y denominador. No se puede dividir por cero.
Obtener resultado de la fracción (número real).
Multiplicar la fracción por un número.
Multiplicar, sumar y restar fracciones.
Simplificar la fracción.

@author Rafael López | RafaLpeC
*/
import java.util.Scanner;
public class TestFraccion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double nu1, de1;
		int salir = 0;
		System.out.println("Introduce el numerador de la primera fracción: ");
		nu1 = s.nextDouble();
		System.out.println("Introduce el denominador de la primera fracción");
		de1 = s.nextDouble();
		do {
			System.out.println("Introduce el denominador de la primera fracción.(Tiene que ser diferente de 0)");
			de1 = s.nextDouble();
		}while(Fraccion.checkDenominador(de1));
		
		Fraccion frac1 = new Fraccion(nu1,de1);
		
		do {
			menu();
			int opcion = s.nextInt();
			switch(opcion){				
			case 1:
				System.out.println("La fracción es " + frac1.getNumerador() + "/" + frac1.getDenominador());
				break;
				
			case 2:
				opcion2(s, de1, frac1);
				break;
				
			case 3:
				opcion3(frac1);
				break;
			case 4:
				opcion4(s, frac1);
				break;
			case 5:
				opcion5(s, frac1);
				break;
			
			case 6:
				System.out.println("La fracción simplificada es " + frac1.simplificar());
				break;

			case 7:
				salir = 1;
			}
		}while(salir == 0);
	}

	
	private static void opcion2(Scanner s, double de1, Fraccion frac1) {
		System.out.println("Introduce el nuevo numerador de la primera fracción: ");
		frac1.setNumerador(s.nextDouble());
		do {
			System.out.println("Introduce el nuevo denominador de la primera fracción.(Tiene que ser diferente de 0)");
			frac1.setDenominador(s.nextDouble());
		}while(Fraccion.checkDenominador(frac1.getDenominador()));
	}
	
	
	private static void opcion3(Fraccion frac1) {
		if(frac1.getDenominador() == 0) {
			System.out.println("La fracción tiene que tener un denominador mayor que 0");
		}
		else {
		System.out.println("El resultado es " + frac1.getResultado());
		}
	}
	
	
	private static void opcion4(Scanner s, Fraccion frac1) {
		System.out.println("Introduce el número a multiplicar: ");
		double num = s.nextDouble();
		System.out.println("El resultado es " + frac1.MultiplicaNum(num));
	}

	
	private static void opcion5(Scanner s, Fraccion frac1) {
		double nu2;
		double de2;
		System.out.println("Introduce el numerador de la segunda fracción: ");
		nu2 = s.nextDouble();
		do {
			System.out.println("Introduce el denominador de la segunda fracción.(Tiene que ser diferente de 0)");
			de2 = s.nextDouble();
		}while(Fraccion.checkDenominador(de2));
		Fraccion frac2 = new Fraccion(nu2,de2);
		System.out.println("La multiplicación de las dos fracciones es igual a " + frac1.MultiplicaFrac(frac2));
		System.out.println("La suma de las dos fracciones es igual a " + frac1.SumaFrac(frac2));
		System.out.println("La resta de las dos fracciones es igual a " + frac1.RestarFrac(frac2));
	}

	private static void menu() {
		System.out.println("1. Obtener la fracción.");
		System.out.println("2. Modificar numerador y denominador. ");
		System.out.println("3. Resultado de la fracción.");
		System.out.println("4. Multiplicar un número a la fracción.");
		System.out.println("5. Multiplicar, sumar y restar dos fracciones. ");
		System.out.println("6. Simplificar la fracción. ");
		System.out.println("7. Salir.");
		System.out.println("Elige una opción: (1-7) ");
	}
	
}
