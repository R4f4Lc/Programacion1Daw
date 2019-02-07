/**Suponiendo que hemos introducido una cadena por teclado que representa una frase 
(palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.

@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ejercicio11 { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
		String cad;
		int cont;
		double longitud;
		int posicion;
		cont = 0;
		posicion = 0;
		System.out.print("Introduce una cadena:");
		cad = s.nextLine();
		while (cad.substring(posicion,posicion+1).equals(" ")) {
			posicion = posicion+1;
		}
		for (posicion=posicion;posicion<=cad.length()-1;posicion++) {
			if (cad.substring(posicion,posicion+1).equals(" ")) {
				cont = cont+1;
				while (cad.substring(posicion,posicion+1).equals(" ") && posicion<=cad.length()) {
					posicion = posicion+1;
				}
			}
		}
		if (!cad.substring(cad.length()-1,cad.length()).equals(" ")) {
			cont = cont+1;
		}
		System.out.println("La cadena contiene "+cont+" palabras.");
    }
      }
