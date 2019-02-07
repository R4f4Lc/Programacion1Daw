/**Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario.

@author: Rafael López Cruz
*/


public class Ej10Dimension { 
	public static void main (String[] args) {
    int[] random = new int[20];
    int[] par = new int[20];
    int pares = 0;
    int[] impar = new int[20];
    int impares = 0;
    int i;
    //Calculamos numero random y comprobamos si es par o impar.
    for (i = 0; i < 20; i++) {
      random[i] = (int)(Math.random() * 101);
      if (random[i] % 2 == 0) {
        par[pares++] = random[i];
      } else {
        impar[impares++] = random[i];
      }
    }
    
    // Mete los pares en las primeras posiciones del array.
    for (i = 0; i < pares; i++) {
      random[i] = par[i];
    }
    
    // Mete los impares después de los pares.
    for (i = pares; i < 20; i++) {
      random[i] = impar[i - pares];
    }

    //Imprimimos por pantalla.
    for (i = 0; i < 20; i++) {
      System.out.println("El número " + i + ":" + random[i]);
    }
  }
}
