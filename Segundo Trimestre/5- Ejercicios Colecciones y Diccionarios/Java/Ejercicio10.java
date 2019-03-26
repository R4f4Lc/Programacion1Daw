import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 10
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 * 
 * @author RafaLpeC
 * 
 */
public class Ejercicio10 {
  
  /**
   * Diccionario
   * 
   * @param diccionario
   */
  private static void Diccionario(HashMap<String, String> diccionario) {
    diccionario.put("Edad", "Age");
    diccionario.put("Aire", "Air");
    diccionario.put("Respuesta", "Answer");
    diccionario.put("Arte", "Art");
    diccionario.put("Bebé", "Baby");
    diccionario.put("Pelota", "Ball");
    diccionario.put("Cuerpo", "Body");
    diccionario.put("Caja", "Box");
    diccionario.put("Circulo", "Circle");
    diccionario.put("Gato", "Cat");
    diccionario.put("Perro", "Dog");
    diccionario.put("Huevo", "Egg");
    diccionario.put("Escritorio", "Desk");
    diccionario.put("Pais", "Country");
    diccionario.put("Nube", "Cloud");
    diccionario.put("Vaca", "Cow");
    diccionario.put("Maiz", "Corn");
    diccionario.put("Vestido", "Dress");
    diccionario.put("Bicicleta", "Bicycle");
    diccionario.put("Ropa", "Clothes");
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    HashMap<String, String> diccionario = new HashMap<String, String>();

    Diccionario(diccionario);

    System.out.println("Introduzca una palabra en español: ");
    String palabra = s.nextLine();

    if (diccionario.containsKey(palabra)) {
      System.out.println(palabra + " en inglés es " + diccionario.get(palabra) + ".");
    } else {
      System.out.println("No existe la palabra introducida.");
    }

  }
}