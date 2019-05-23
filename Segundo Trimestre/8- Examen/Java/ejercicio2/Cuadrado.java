package ejercicio2;

/**
 * Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
 * la posibilidad de comparar objetos cuadrados entre sí.
 * 
 * @author Rafael López
 *
 */
public class Cuadrado extends Rectangulo implements Comparable<Cuadrado>{

  /**
   * Constructor de la clase cuadrado que se extiende de 
   * la clase rectangulo
   * @param lado
   */
  public Cuadrado(int lado) {
    super(lado, lado);
  }
  
  /**
   * Devuelve el valor del lado que forma al cuadrado.
   * 
   * @return lado del cuadrado
   */
  public int getLado() {
    return this.getAncho();
  }

  @Override
  public int compareTo(Cuadrado o) {
    if (this.getLado() < o.getLado()) {
      return -1;
    } else if (this.getLado() > o.getLado()) {
      return 1;
    } else {
      return 0;
    }
  }
}
