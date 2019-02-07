/**Mostrar en pantalla los N primero número primos. 
Se pide por teclado la cantidad de números primos que queremos mostrar.

@author: Rafael López Cruz
*/
import java.util.Scanner;
import java.io.*;
public class Ejercicio9 { 
	public static void main (String[] args ) {
    Scanner s = new Scanner(System.in);
		int mostrar;
		int mostrados;
		int divisor;
		boolean primo;
		int num;

		do {
			System.out.println("Ingrese la cantidad de números primos a mostrar:");
			mostrar = s.nextInt();
		} while (mostrar<=0);
		System.out.println("1: 2");
		mostrados = 1;
		num = 3;
		while (mostrados<mostrar) {
			primo = true;
			for (divisor=3;divisor<=Math.sqrt(num);divisor+=2) {
				if (num%divisor==0) {
					primo = false;
				}
			}
			if (primo) {
				mostrados = mostrados+1;
				System.out.println(mostrados+": "+num);
			}
			num = num+2;
		}    

}}
