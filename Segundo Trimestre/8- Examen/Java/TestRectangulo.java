/**
 * Crea la clase Rectángulo de forma que:
 * Un objeto de esta clase se construye pasándole el ancho y el alto. Ninguno de los dos atributos
 * puede ser menor o igual a cero ni mayor que diez, en esos casos se debe lanzar la excepción
 * ArithmeticException.
 * Mediante getters y setters permite que se acceda y se modifique el ancho y el alto del
 * rectángulo teniendo en cuenta las restricciones en cuanto a las dimensiones del apartado
 * anterior. 
 * Al imprimir en pantalla un objeto de la clase usando System.out.print se debe dibujar el
 * rectángulo por la pantalla (de manera similar a como se imprime un cuadrado en la página 130
 * del libro Aprende Java con Ejercicios).
 * 
 * @author Rafael López
 *
 */
import java.util.Scanner;

import ejercicio2.Rectangulo;
public class TestRectangulo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int ancho, alto;
    try {
      System.out.println("Introduce el ancho:");
      ancho = s.nextInt();
      System.out.println("Introduce el alto:");
      alto = s.nextInt();
      Rectangulo rectangulo = new Rectangulo(ancho,alto);
      System.out.println(rectangulo);
    }catch (ArithmeticException e){
      System.out.println(e.getMessage());
    }
    s.close();
  }
}
