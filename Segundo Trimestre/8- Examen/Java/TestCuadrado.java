/**
 * Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
 * la posibilidad de comparar objetos cuadrados entre sí.
 * 
 * @author Rafael López
 *
 */

import ejercicio2.Cuadrado;
public class TestCuadrado {
  public static void main (String[] args) {
    Cuadrado cuadrado1 = new Cuadrado(6);
    Cuadrado cuadrado2= new Cuadrado(6);
    Cuadrado cuadrado3 = new Cuadrado(9);
    Cuadrado cuadrado4 = new Cuadrado(10);
    System.out.println("Cuadrado 1:\n" + cuadrado1.toString() + "Cuadrado 2:\n" + cuadrado2.toString());
    System.out.println("Cuadrado 1 y Cuadrado 2: " + cuadrado1.compareTo(cuadrado2));
    System.out.println("Cuadrado 3:\n" + cuadrado3.toString() + "Cuadrado 4:\n" + cuadrado4.toString());
    System.out.println("Cuadrado 3 y Cuadrado 4: " + cuadrado3.compareTo(cuadrado4));
  }
}
