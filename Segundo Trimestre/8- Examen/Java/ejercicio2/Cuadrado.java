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

  /**
   * Setter del lado del rectangulo
   * @param lado
   */
  public void setLado(int lado) {
    this.setAlto(lado);
    this.setAncho(lado);
  }
  

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + alto;
    result = prime * result + ancho;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Rectangulo other = (Rectangulo) obj;
    if (alto != other.alto)
      return false;
    if (ancho != other.ancho)
      return false;
    return true;
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
