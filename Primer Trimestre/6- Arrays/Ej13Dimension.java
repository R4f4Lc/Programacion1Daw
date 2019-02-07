/**Escribe un programa que rellene un array de 100 elementos con números enteros
aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.
@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ej13Dimension { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int[] random = new int[100];
    int maximo = 0;
    int minimo = 100;
    int destacado = 0;
    int opcion;
    
    //Genera los numeros random e indica cual es el máximo y mínimo
    for (int i = 0; i < 100; i++) {
      random[i] = (int)(Math.random() * 501);
      
      if (random[i] > maximo)  {
        maximo = random[i];
      }
      
      if (random[i] < minimo) {
        minimo = random[i];
      }
      
    }

    //Mostramos el array para que el usuario elija
    for (int elemento : random) {
      System.out.print(elemento + ", ");
    }
    
    System.out.print("¿Qué número quieres destacar? Escriba Mínimo(1) o Máximo(2):");
    opcion = s.nextInt();

    //El número que vamos a destacar si es 1 es el minimo y 2 el maximo
    if (opcion == 1) {
      destacado = minimo;
    } 
    else {
      destacado = maximo;
    }
    
    //Imprimos por pantalla
    for (int elemento : random) {
      if (elemento == destacado) {
        System.out.print("**" + elemento + "**, ");
      } else {
        System.out.print(elemento + ", ");
      }
    }
  }      
}
