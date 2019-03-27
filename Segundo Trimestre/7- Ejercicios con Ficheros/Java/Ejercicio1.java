import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat
 * Los números primos que hay entre 1 y 500.
 * 
 * @author RafaLpeC
 *
 */

public class Ejercicio1 {
  public static boolean esPrimo(int numero) {
    int contador = 2;
    boolean primo = true;
    while ((primo) && (contador!=numero)) {
      if (numero % contador == 0)
  primo = false;
      contador ++;
    }
    return primo;
  }
  
  public static void main(String[] args) {
    try {
    BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
    for(int i=1;i<=500;i++) {
      if(esPrimo(i)) {
        System.out.println(i);
        bw.write(i+"\n");
      }
    }
    bw.close();
  }
    catch(IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero.");
    }
  }
}