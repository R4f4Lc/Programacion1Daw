/**Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras máximo y mínimo al lado
del máximo y del mínimo respectivamente.

@author: Rafael López Cruz
*/
import java.util.Arrays;
import java.util.Scanner;

public class Ej5Dimension { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[10];
    
    for (int i = 0; i<10; i++){
      System.out.print("Introduce un número: ");
      num[i] = s.nextInt();
    }
    
    int min = Arrays.stream(num).min().getAsInt();
    int max = Arrays.stream(num).max().getAsInt();


    System.out.print("El número máximo es " + max + " y el número mínimo es " + min);  
  }    
}
