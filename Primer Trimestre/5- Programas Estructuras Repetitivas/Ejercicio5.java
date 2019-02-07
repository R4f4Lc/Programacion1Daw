/**Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 

A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:

La suma de los números que están dentro del intervalo (intervalo abierto).
Cuantos números están fuera del intervalo.
Informa si hemos introducido algún número igual a los límites del intervalo.

@author: Rafael López Cruz
*/

import java.util.Scanner;
public class Ejercicio5 { 
	public static void main (String[] args) {
    //Pedimos los numeros
    int num1 = 1;
    int suma = 0;
    int igual = 0;
    int fuera = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el limite inferior: ");
    int lim1 = s.nextInt();
    System.out.print("Introduce el limite superior: ");
    int lim2 = s.nextInt();
    
    while(lim1 > lim2){
    System.out.print("Introduce el limite inferior: ");
    lim1 = s.nextInt();
    System.out.print("Introduce el limite superior: ");
    lim2 = s.nextInt();
    }
      
    do{
    System.out.print("Introduce un numero: ");
    num1 = s.nextInt();

    if (num1<lim2 && num1>lim2){
          suma+=num1;
      }
    
    if (num1 == lim1 || num1==lim2){
          igual++;
      }
      
    else{
          fuera++;
    }  
    }while(num1==0);
    
        System.out.println("La suma de los numeros del intervalo es  " + suma);
        System.out.println("Se han quedado fuera del rango un total de "+ fuera);
        System.out.println("Y han sido iguales al limite inferior y superior "+igual);

  }}
