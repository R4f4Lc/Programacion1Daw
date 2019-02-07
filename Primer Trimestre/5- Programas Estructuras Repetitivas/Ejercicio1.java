/**Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. 
A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número 
(además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.

@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ejercicio1 { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    //Generamos el numero random
    int random = (int)(Math.random()*99 + 1);
    //Creamos el bucle de los 10 intentos
    for (int i = 1; i<11; i++){
      //Te va indicando el numero de intentos que te quedan
      System.out.println("Intento número " + i + ". Te quedan " + (10 - i));
      //Va preguntando el numero
      System.out.print("Introduce un número: ");
      int numero = s.nextInt();
      //Va comprobando si el numero es mayor, igual o menor y cuantos intentos hay
      if (numero==random){
        //Ganas y sale del for
        System.out.println("Ehnorabuena has acertado el número!");
        break;
      }
      
      else if (numero > random){
        System.out.println("El número introducido es mayor que el aleatorio");
      }
      
      else if (numero < random){
        System.out.println("El número introducido es menor que el aleatorio");
          }

     if (i>=10) {  
       //Pierdes y te muestra el numero
    System.out.println("Una pena no has acertado. El número era " + random);
      }
        }
      }
    }


