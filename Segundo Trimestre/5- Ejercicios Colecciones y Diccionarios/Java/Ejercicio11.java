import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 11
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 * 
 * Realiza un programa que escoja al azar 5 palabras en español del
 * minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 * usuario teclee la traducción al inglés de cada una de las palabras y
 * comprobará si son correctas. Al final, el programa deberá mostrar cuántas
 * respuestas son válidas y cuántas erróneas.
 * 
 * @author RafaLpeC
 * 
 */
public class Ejercicio11 {

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
    ArrayList<String> diccionarioCompleto = new ArrayList<String>();
    ArrayList<String> palabrasAleatorioas = new ArrayList<String>();

    int aciertos = 0;
    int fallos = 0;
    int indice = 0;

    Diccionario(diccionario);

    diccionarioCompleto.addAll(diccionario.keySet());

    Collections.shuffle(diccionarioCompleto);

    for (int i = 0; i < 5; i++) {
      palabrasAleatorioas.add(diccionarioCompleto.remove(0));
    }

    for (String palabra : palabrasAleatorioas) {
      System.out.println("Introduzca la traducción de la palabra: - " + palabra + ": ");
      String respuesta = s.nextLine();

      if (respuesta.contains(diccionario.get(palabrasAleatorioas.get(indice)))) {
        aciertos++;
      } else {
        fallos++;
      }
      indice++;
    }
    System.out.println("Has acertado " + aciertos + " palabras.");
    System.out.println("Has fallado " + fallos + " palabras.");
  }
}
