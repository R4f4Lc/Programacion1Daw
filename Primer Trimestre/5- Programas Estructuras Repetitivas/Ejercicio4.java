/**Escribir un programa que imprima todos los números pares 
entre dos números que se le pidan al usuario.

@author: Rafael López Cruz
*/

import java.util.Scanner;
public class Ejercicio4 { 
	public static void main (String[] args) {
    //Pedimos los numeros
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el primer número ");
    int num1 = s.nextInt();
    System.out.print("Introduce el segundo número ");
    int num2 = s.nextInt();
    //Comprobamos si num1 es mayor que num2 y si no cambiamos valores
    if (num1 > num2){
      int medio = num1;
      num1 = num2;
      num2 = medio;
    }
    
    //Comprobamos si es Par o impar y si es impar le sumamos 1
    if (num1 % 2 != 0){
      num1 = num1+1;
      System.out.println(num1);
    }
    
    //Bucle que va mostrando por pantalla los numeros
    do {
    if (num1 < num2 && num1 % 2 == 0){
    num1 = num1+2;
    if (num1 < num2){
    System.out.println(num1);
    }}
    }while(num1 < num2);
      
      
    }
    
    
}
