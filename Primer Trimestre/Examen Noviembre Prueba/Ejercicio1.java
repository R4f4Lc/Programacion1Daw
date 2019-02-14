/**
Haz un programa en Java y Python que calcule el combinatorio de dos numeros. 
Si hay un error en la introducción debe indicarlos.

@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Declaramos variables
		int n;
		int m;
		int calcula;
		int factorial1;
		int factorial2;
		int factorial3;
		//Pedimos n y m
		System.out.print("Introduce n:");
		n = s.nextInt();
		
		System.out.print("Introduce m:");
		m = s.nextInt();
		//Declaramos valores de factorial
		factorial1 = n;
		factorial2 = m;
		factorial3 = factorial1-factorial2;	
		//Si es mayor n que m entra si no no
		if (n>m) {
			//Bucle for para calcular factorial de n
			for(int i = n-1; i > 0; i-- ) {
				n = n * i;

			}
			System.out.println(n);
			//Bucle for para calcular factorial de m
			for(int i = m-1; i > 0; i-- ) {
				factorial2 = m * i;
			}
			System.out.println(factorial2);

			//Bucle for para calcular factorial3
			for(int i = factorial3-1; i > 0; i-- ) {
				factorial3 = factorial3*i;
			}
			System.out.println(factorial3);

		//Calculamos el numero combinatorio
			calcula = n / (factorial3 * factorial2);
		
		
		System.out.println("El número combinatorio es "+ calcula);
		}
		else {
			System.out.print("N tiene que ser mayor que M");
		}
		}
		}
