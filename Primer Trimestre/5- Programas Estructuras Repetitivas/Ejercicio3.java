/**Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ 
en caso contrario, el programa termina cuando se introduce un espacio.

@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ejercicio3 { 
	public static void main (String[] args) {
    //Pedimos el caracter
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un carácter: ");
    String caracter = s.nextLine();
    //Si está vacio salimos del bucle
    while (!caracter.isEmpty()){
    //Comprobamos si es vocal
    if(caracter.equals("a")||caracter.equals("e")||caracter.equals("i")||caracter.equals("o")||caracter.equals("u")||caracter.equals("A")||caracter.equals("E")||caracter.equals("I")||caracter.equals("O")||caracter.equals("U")){
      System.out.println("VOCAL");
      } 
    else{
      System.out.println("NO VOCAL");
      }
    //Preguntamos un nuevo carácter
    System.out.print("Introduce un carácter: ");
    caracter = s.nextLine();
  }
      
}
}
