import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/**
Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.

__author__ = 'R4f4Lc'

*/
public class Ejercicio1 {

  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int i = 0;
    int n = 0;
    List<Integer> numero = new ArrayList<Integer>();
    while(i!=6) {
      try {
        System.out.println("Introduce un número: ");
        n = s.nextInt();
        numero.add(n);
        i++;
      }
      catch (Exception e) {
      System.out.println("¡Introduce un número correcto!");
      s.next();
      }
    }
    Collections.sort(numero);
    System.out.println("El número introducido más pequeño es " + numero.get(0));
    System.out.println("El número más grande es " + numero.get(5));
  }
}
