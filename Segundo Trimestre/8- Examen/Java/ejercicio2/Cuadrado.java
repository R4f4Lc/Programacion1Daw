package ejercicio2;

/**
 * Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
 * la posibilidad de comparar objetos cuadrados entre sí.
 * 
 * @author Rafael López
 *
 */
public class Cuadrado extends Rectangulo {

  /**
   * Constructor de la clase cuadrado que se extiende de 
   * la clase rectangulo
   * @param lado
   */
  public Cuadrado(int lado) {
    super(lado, lado);
  }
}
