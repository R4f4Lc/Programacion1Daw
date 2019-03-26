import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import Carta.Carta;
import Carta.Figura;
import Carta.Palo;

/**
 * Ejercicio 12
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una estructura de la clase ArrayList que contiene objetos de la clase Carta.
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
 * → 3, rey → 4; el resto de cartas no vale nada.
 * 
 * @author RafaLpeC
 * 
 */
public class Ejercicio12 {

  public static void main(String[] args) {

    ArrayList<Carta> Baraja = new ArrayList<Carta>();
    ArrayList<Carta> Descartes = new ArrayList<Carta>();
    
    HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
    hashmap.put("AS", 11);
    hashmap.put("DOS", 0);
    hashmap.put("TRES", 10);
    hashmap.put("CUATRO", 0);
    hashmap.put("CINCO", 0);
    hashmap.put("SEIS", 0);
    hashmap.put("SIETE", 0);
    hashmap.put("SOTA", 2);
    hashmap.put("CABALLO", 3);
    hashmap.put("REY", 4);
    
    int puntos = 0;
    
    for (Figura figura : Figura.values()) {
      for (Palo palo : Palo.values()) {
        Baraja.add(new Carta(figura, palo));
      }
    }

    Collections.shuffle(Baraja);

    for (int i = 0; i < 5; i++) {
      Descartes.add(Baraja.remove(0));
    }

    for (Carta miCarta : Descartes) {
      System.out.println(miCarta);
      puntos += hashmap.get(miCarta.getFigura().toString());
    }
    System.out.println("Tienes " + puntos + " puntos");
  }

}
