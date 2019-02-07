/**Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.

@author: Rafael López Cruz
*/

import java.util.Scanner;

public class Ej6Dimension { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[15];

    
    for (int i = 0; i<15; i++){
      System.out.print("Introduce un número: ");
      num[i] = s.nextInt();
    }
  
    int cambio = num[num.length-1];
    for (int i = (num.length - 1); i > 0; --i){
      num[i] = num[i-1];
    }
    num[0] = cambio;

    for (int i = 0; i < 15; i++){
      System.out.println("Número " + i + ": " + num[i]);
    }

}
}
