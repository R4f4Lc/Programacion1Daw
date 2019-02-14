/**
Escribe un programa que rellene un array de 20 elementos con
números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos). 
A continuación el programa mostrará el array y preguntará si el usuario 
quiere resaltar los múltiplos de 5 o los múltiplos de 7. 
Seguidamente se volverá a mostrar el array escribiendo los números que 
se quieren resaltar entre corchetes.
 
@author: Rafael López Cruz
*/

import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Definimos array
		int[] num = new int [20];

		//Bucle for que va a calcular los numeros random
		for (int i = 0; i < 20; i++) {
			num[i] = (int)(Math.random()*401);
			System.out.print(num[i] + ",");
		}
		
		//Bucle for que va a colocar entre corchetes los numeros
		//que sean primos
		System.out.println("");
		for (int i = 0; i < 20; i++) {
		if (num[i] % 5 == 0 || num[i] % 7 == 0) {
			System.out.print("["+num[i] + "],");
		}
		else {
			System.out.print(num[i] + ",");
		}
	}
}}