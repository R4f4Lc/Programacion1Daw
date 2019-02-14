/**
Haz un programa en Java y Python que calcule el elemento N 
(se pide al usuario) de la serie de Fibonacci.

@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		//Pedimos numero de la serie de Fibonacci
		System.out.print("Introduce la serie de Fibonacci:");
		n = s.nextInt();
		
		//Declaro array
		int[] num = new int [n+1];
		num[0] = 0;
		num[1] = 1;
		
		//Ejecutamos bucle for que va a calcular el numero
		for (int i = 0; i <= n-2; i++) {
			num[i+2] = num[i]+num[i+1];
		}
		
		//Imprimimos
		System.out.println("El número de Fibonacci es "+ num[n-1]);
		}
}
