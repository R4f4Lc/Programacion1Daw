package utilities;

import java.util.Scanner;


public class Teclado {
  static Scanner scanner = new Scanner(System.in);
  
  
  /**
   * Captura la entrada de teclado de un String
   * @return
   */
  static public String leerString() {
    String cadena;
    cadena = scanner.nextLine();
    return cadena;
  }
  
  /**
   * Recibe una cadena que muestra por pantalla y captura la entrada de teclado de
   * un String
   * 
   * @param pregunta
   * @return
   */
  static public String leerString(String pregunta) {
    System.out.println(pregunta);
    return leerString();
  }
  
  /**
   * Captura la entrada de teclado de un tipo int
   * 
   * @return
   * @throws TypeException
   */
  static public int leerInt() {
    do {
      try {
        return Integer.parseInt(leerString().trim());
      }catch (NumberFormatException e) {
        System.out.println("Introduce un número entero correctamente");
      }
    }while(true);
  }
  
  /**
   * Recibe una cadena que muestra por pantalla y captura la entrada de teclado de
   * un tipo int
   * 
   * @param pregunta
   * @return
   * @throws TypeException
   */
  static public int leerInt(String pregunta){
    System.out.println(pregunta);
    return leerInt();
  }
  
  /**
   * Captura la entrada de teclado de un tipo double
   * 
   * @return
   * @throws TypeException
   */
  static public double leerDouble(){
    do {
      try {
        return Double.parseDouble(leerString().trim());
      }catch (NumberFormatException e) {
        System.out.println("Introduce un número decimal correctamente");
      }
    }while(true);
  }
  
  /**
   * Recibe una cadena que muestra por pantalla y captura la entrada de teclado de 
   * un tipo double.
   * 
   * @param pregunta
   * @return
   * @throws TypeException
   */
  static public double leerDouble(String pregunta){
    System.out.println(pregunta);
    return leerDouble();
  }
}