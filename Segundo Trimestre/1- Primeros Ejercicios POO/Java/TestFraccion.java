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
		double nu1, de1, nu2, de2;
		int salir = 0;
		System.out.println("Introduce el numerador de la primera fracción: ");
		nu1 = s.nextDouble();
		System.out.println("Introduce el denominador de la primera fracción");
		de1 = s.nextDouble();
		Fraccion frac1 = new Fraccion(nu1,de1);
		do {
			System.out.println("1. Obtener la fracción.");
			System.out.println("2. Modificar numerador y denominador. ");
			System.out.println("3. Resultado de la fracción.");
			System.out.println("4. Multiplicar un número a la fracción.");
			System.out.println("5. Multiplicar, sumar y restar dos fracciones. ");
			System.out.println("6. Salir.");
			System.out.println("Elige una opción: (1-6) ");
			int opcion = s.nextInt();
			switch(opcion){				
			case 1:
				System.out.println("La fracción es " + frac1.getNum() + "/" + frac1.getDen());
				break;
			case 2:
				System.out.println("Introduce el nuevo numerador de la primera fracción: ");
				nu1 = s.nextDouble();
				System.out.println("Introduce el nuevo denominador de la primera fracción: ");
				de1 = s.nextDouble();
				frac1.numerador = nu1;
				frac1.denominador = de1;
				break;
			case 3:
				if(frac1.getFraccion() == null) {
					System.out.println("La fracción tiene que tener un denominador mayor que 0");
					break;
				}
				else {
				System.out.println("La fracción es " + frac1.getFraccion());
				break;
				}
			case 4:
				System.out.println("Introduce el número a multiplicar: ");
				double num = s.nextDouble();
				System.out.println("El resultado es " + frac1.MultiplicaNum(num));
				break;
			case 5:
				System.out.println("Introduce el numerador de la segunda fracción: ");
				nu2 = s.nextDouble();
				System.out.println("Introduce el denominador de la segunda fracción");
				de2 = s.nextDouble();
				Fraccion frac2 = new Fraccion(nu2,de2);
				System.out.println("La multiplicación de las dos fracciones es igual a " + frac1.MultiplicaFrac(frac2));
				System.out.println("La suma de las dos fracciones es igual a " + frac1.SumaFrac(frac2));
				System.out.println("La resta de las dos fracciones es igual a " + frac1.RestarFrac(frac2));
				break;

			case 6:
				salir = 1;
			}
		}while(salir == 0);
	}
}
