import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author RafaLpeC
 *
 */
public class Ejercicio2 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      String linea = "";
      while (linea != null) {
      linea = br.readLine();
      System.out.println(linea);
      
      }
      br.close();
    } 
    catch (FileNotFoundException fnfe) {
      System.out.println("No se encuentra el fichero.");
      } 
    catch (IOException ioe) {
      System.out.println("No se puede leer el fichero.");
      }
  }
}
