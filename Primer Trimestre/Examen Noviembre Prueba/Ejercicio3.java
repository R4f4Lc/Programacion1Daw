/**
Escribe un programa que rellene un array de 20 elementos con
n�meros enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos). 
A continuaci�n el programa mostrar� el array y preguntar� si el usuario 
quiere resaltar los m�ltiplos de 5 o los m�ltiplos de 7. 
Seguidamente se volver� a mostrar el array escribiendo los n�meros que 
se quieren resaltar entre corchetes.
 
@author: Rafael L�pez Cruz
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