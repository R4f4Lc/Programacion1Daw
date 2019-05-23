package ejercicio2;

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
public class Rectangulo {
  
  protected int ancho;
  protected int alto;
  
  /**
   * Constructor del rectángulo
   * @param ancho
   * @param alto
   */
  public Rectangulo(int ancho, int alto) {
    setAncho(ancho);
    setAlto(alto);
  }
  
  /**
   * Devuelve el Ancho
   * @return ancho
   */
  public int getAncho() {
    return ancho;
  }
  
  /**
   * Devuelve el Alto
   * @return alto
   */
  public int getAlto() {
    return alto;
  }
  
  /**
   * Asigna un valor al ancho
   * @param ancho
   */
  public void setAncho(int ancho) {
    if (ancho <= 0 || ancho > 10) {
      throw new ArithmeticException("El ancho indicado es inválido.");
    }
    this.ancho = ancho;
  }
  
  /**
   * Asigna un valor al alto
   * @param alto
   */
  public void setAlto(int alto) {
    if (alto <= 0 || alto > 10) {
      throw new ArithmeticException("El alto indicado es inválido.");
    }
    this.alto = alto;
  }
  
  /**
   * toString de la clase rectangulo que devuelve
   * su información.
   */
  public String toString() {
    int i;
    int espacios;
    String resultado = "";
    
    for (i=0; i < this.ancho; i++) {
      resultado += "[]";
    }
    
    resultado += "\n";
    
    for (i = 1; i < this.alto - 1; i++) {
      resultado += "[]";
      for (espacios = 1; espacios < this.ancho -1; espacios++) {
        resultado += "  ";
      }
      resultado += "[]\n";
    }
    
    for (i=0; i < this.ancho; i++) {
      resultado += "[]";
    }
    
    resultado += "\n";
    
    return resultado;
  }
}