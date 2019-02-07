/**Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.

@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ej2Bidimensional { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[10];
    int[] random = new int[10];
    int aux;
    int numeroIntroducido;
    boolean existe;
    //Genera los numeros random del array
    for (int i = 0; i < 10; i++) {
      random[i] = (int)(Math.random() * 381) + 20;
    }

    //Imprimos el array.
    System.out.println("\n_______________________________________________________________________");
    System.out.print("|  Numero |");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%7d |", i);
    }
    System.out.println("|\n_______________________________________________________________________");
    System.out.print("|  Valor  |");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%7d |",random[i]);
    }
    System.out.println("|\n_______________________________________________________________________");

    //Pedimos un numero.
    existe = false;
    do {
      System.out.print("Introduce uno de los números del array: ");
      numeroIntroducido = s.nextInt();
      
      //Comprobamos si el numero introducido está dentro del array.
      for (int elemento : random) {
        if (elemento == numeroIntroducido) {
          existe = true;
        }
      }
      
      if (!existe) {
        System.out.println("Ese número no se encuentra en el array.");
      }
    } while (!existe);
    
    // Rotamos hasta que el numero este en la posicion 0
    while (random[0] != numeroIntroducido) {
      aux = random[9];
      // Rotación a la derecha
      for (int i = 9; i > 0; i--) {
        random[i] = random[i -1];
      }
      random[0] = aux;
    }

    //Imprimimos por pantalla el resultado
    System.out.println("\n_______________________________________________________________________");
    System.out.print("|  Numero |");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%7d |",i);
    }
    System.out.println("|\n_______________________________________________________________________");
    System.out.print("|  Valor  |");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%7d |",random[i]);
    }
    System.out.println("|\n_______________________________________________________________________"); 
  }    
}
