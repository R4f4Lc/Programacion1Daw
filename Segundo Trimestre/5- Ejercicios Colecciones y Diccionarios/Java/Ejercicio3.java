/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author RafaLpeC
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
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
