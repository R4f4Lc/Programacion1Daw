/**Pide una cadena y un carácter por teclado y 
muestra cuantas veces aparece el carácter en la cadena.

@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ejercicio10 { 
	public static void main (String[] args) {
    String cadena;
    String caracter;
    int contador=0;
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca una cadena de caracteres: ");
    cadena = s.nextLine();
    System.out.print("Introduzca el caracter para mostrar el numero de veces que se repite: ");
    caracter = s.nextLine();
    
    for (int i = 0; i < cadena.length(); i++){
      if (cadena.charAt(i)==caracter.charAt(0)){
          contador++;
      }
    }
    
    if (contador !=0){
      System.out.println("El caracter "+ caracter.charAt(0)+ " se repite " + contador + " veces");
    }
    else {
      System.out.println("El caracter no se encuentra en este texto");
    }
    }
      }


