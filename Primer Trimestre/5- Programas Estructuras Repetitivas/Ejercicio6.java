/**Escribe un programa que dados dos números, uno real (base) 
y un entero positivo (exponente), saque por pantalla el resultado de la potencia. 
No se puede utilizar el operador de potencia.
@author: Rafael López Cruz
*/
import java.util.Scanner;
public class Ejercicio6 { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la base: ");
    int num1 = s.nextInt();
    System.out.print("Introduce el exponente final: ");
    int num2 = s.nextInt();
    int potencia;
    int exponente;
    for (int i = 1; i<=num2; i++){
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= num1;
      }
      
      System.out.println(num1 + "^" + i + " = " + potencia);
    }
    }
      }
