package Carta;

public class Carta implements Comparable<Carta> {

  private Figura figura;
  private Palo palo;

  /**
   * Constructor
   * 
   * @param figura
   * @param palo
   */
  public Carta(Figura figura, Palo palo) {
    this.figura = figura;
    this.palo = palo;
  }

  /**
   * @return the figura
   */
  public Figura getFigura() {
    return figura;
  }

  /**
   * @param figura the figura to set
   */
  public void setFigura(Figura figura) {
    this.figura = figura;
  }

  /**
   * @return the palo
   */
  public Palo getPalo() {
    return palo;
  }

  /**
   * @param palo the palo to set
   */
  public void setPalo(Palo palo) {
    this.palo = palo;
  }

  @Override
  public String toString() {
    return getFigura() + " de " + getPalo();
  }

  @Override
  public int compareTo(Carta carta) {
    if (this.palo.equals(carta.getPalo())) {
      return figura.compareTo(carta.getFigura());
    } else {
      return this.palo.compareTo(carta.getPalo());
    }

  }

}
