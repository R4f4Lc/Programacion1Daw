/**Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). 
El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.

@author: Rafael López Cruz
*/

import java.util.Scanner;
public class Ejercicio2 { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    //Introducimos las repeticiones
    System.out.print("Introduce un número de repeticiones que vas a introducir: ");
    int repetir = s.nextInt();
   
    //Bucle for con las repeticiones que ha indicado el usuario
    for (int i = 1; i<repetir+1; i++){
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    //Comprobamos que sea mayor igual o menor y muestra el mensaje.
    if (numero == 0){
    System.out.println("El número es igual a 0");
    }
    
    else if(numero > 0){
    System.out.println("El número " + numero + " es mayor que 0");
    }

    else{
    System.out.println("El número " + numero + " es menor que 0");
    }
      }}
    }
