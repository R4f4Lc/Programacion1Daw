/**Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
sustituye la aparición del primer carácter en la cadena por el segundo carácter.

@author: Rafael López Cruz
*/

import java.util.Scanner;
public class Ejercicio12 { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
		String cad;
		String buscar;
		String sustituir;
		String cad2 = "";
		int posicion;
		System.out.print("Introduce una cadena:");
		cad = s.nextLine();
		do {
			System.out.print("Introduce el caracter a buscar:");
        buscar = s.nextLine();
		} while (buscar.length()!=1);
		do {
			System.out.print("Introduce el caracter a sustituir:");
			sustituir = s.nextLine();
		} while (sustituir.length()!=1);
		for (posicion=0;posicion<=cad.length()-1;posicion++) {
			if (cad.substring(posicion,posicion+1).equals(buscar)) {
          cad2 = cad2.concat(sustituir);
			} else {
          cad2 = cad2.concat(cad.substring(posicion,posicion+1));
			}
		}
		System.out.println("La nueva cadena es "+cad2);
    }
      }
