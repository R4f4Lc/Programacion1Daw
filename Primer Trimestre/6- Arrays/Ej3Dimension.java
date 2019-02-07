/**Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en
mostrarse y viceversa.

@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ej3Dimension { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[10];
    
    for (int i = 9; i>0; i--){
      System.out.print("Introduce un número: ");
      num[i] = s.nextInt();
    }
    for (int i = 0; i<10; i++){
      System.out.println("Número " + i + ": " + num[i]);
  }   
  }    
}
