import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * @author RafaLpeC
 *
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("¡Pasa por parametro el fichero y la palabra a buscar!");
      System.exit(-1);
    }
        
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String palabra = args[1];
      String linea = "";
      int i = 0;
      int repeticiones = 0;
      
      while ((linea = br.readLine()) != null) {
        
        while ((i = linea.indexOf(palabra)) != -1) {
          linea = linea.substring(i + palabra.length(), linea.length());
          repeticiones++;
        }
      }
      
      br.close();
      
      System.out.println("La palabra " + palabra + " se repite " + repeticiones + " veces.");

    } catch (IOException ioe) {
      System.err.println(ioe.getMessage());
    }
  }
}
