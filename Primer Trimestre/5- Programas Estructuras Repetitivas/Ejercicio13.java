/**Realizar un programa que lea una cadena por teclado y convierta 
las mayúsculas a minúsculas y viceversa.

@author: Rafael López Cruz
*/

import java.util.Scanner;
public class Ejercicio13 { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
		String cad;
		String cad2 = "";

		System.out.print("Introduce una cadena:");
		cad = s.nextLine();
    
		for (int i=0;i<=cad.length()-1;i++) {
      String letra = cad.substring(i,i+1);
      if (letra.equals(letra.toUpperCase())) {
				cad2 += letra.toLowerCase();
			}
      
			else { 
				cad2 += letra.toUpperCase();
			}

		}
		System.out.println("La nueva cadena es " + cad2);
  }
}


