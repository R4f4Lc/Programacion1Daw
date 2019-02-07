/**Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado deben aparecer entrecomillados.

@author: Rafael López Cruz
*/

import java.util.Scanner;

public class Ej7Dimension { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int[] random = new int[100];
    
    for (int i = 0; i<100; i++){
      random[i] = (int)(Math.random()*21);
      System.out.print(random[i] + " ");
    }

    System.out.print("Introduce el primer número: ");
    int num1 = s.nextInt();
    System.out.print("Introduce el segundo número: ");
    int num2 = s.nextInt();

    for (int i = 0; i<100; i++){
      if (num1 == random[i]){
        random[i] = num2;
        System.out.print("'" + random[i] + "' ");
      }
      else{
        System.out.print(random[i] + " "); 
      }
    }
}
}
