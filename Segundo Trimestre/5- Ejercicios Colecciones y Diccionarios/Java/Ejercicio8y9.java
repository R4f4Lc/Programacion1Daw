import java.util.ArrayList;
import java.util.Collections;
import Carta.Carta;
import Carta.Figura;
import Carta.Palo;
/**
 * Ejercicio 8 y 9
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author RafaLpeC
 * 
 */
public class Ejercicio8y9 {

  public static void main(String[] args) {

    ArrayList<Carta> Baraja = new ArrayList<Carta>();
    ArrayList<Carta> Descartes = new ArrayList<Carta>();

    crearBaraja(Baraja);

    barajar(Baraja); 

    sacarCartas(Baraja, Descartes);

    ordenarDescartes(Descartes);

    mostrarCartas(Descartes);

  }

  /**
   * Crea una baraja
   * 
   * @param Baraja
   */
  private static void crearBaraja(ArrayList<Carta> Baraja) {
    for (Figura figura : Figura.values()) {
      for (Palo palo : Palo.values()) {
        Baraja.add(new Carta(figura, palo));
      }
    }
  }

  /**
   * Baraja las cartas de la baraja
   * 
   * @param Baraja
   */
  private static void barajar(ArrayList<Carta> Baraja) {
    Collections.shuffle(Baraja);
  }

  /**
   * Saca 10 cartas de la Baraja
   * 
   * @param Baraja
   * @param Descartes
   */
  private static void sacarCartas(ArrayList<Carta> Baraja, ArrayList<Carta> Descartes) {
    for (int i = 0; i < 10; i++) {
      Descartes.add(Baraja.remove(0));
    }
  }

  /**
   * Muestra las cartas sacadas de la baraja
   * 
   * @param Descartes
   */
  private static void mostrarCartas(ArrayList<Carta> Descartes) {
    for (Carta carta : Descartes) {
      System.out.println(carta);
    }
  }
  
  /**
   * Ordena las cartas de la pila de Descartes
   * 
   * @param Descartes
   */
  private static void ordenarDescartes(ArrayList<Carta> Descartes) {
    Collections.sort(Descartes);
  }
}