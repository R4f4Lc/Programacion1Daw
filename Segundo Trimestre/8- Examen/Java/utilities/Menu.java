package utilities;

/**
 * Clase menu usada para generar un menú.
 * 
 * @author R4f4Lc
 */

public class Menu {
  private String nombre;
  private String opciones[];

  public Menu(String nombre, String[] opciones) {
    this.nombre = nombre;
    this.opciones = opciones;
  } 
  
  public int funciones(){
    mostrar();
    return recogerOpciones();
  }

  private int recogerOpciones() {
    int opcion = -1;
    do {
      opcion = Teclado.leerInt("Elige una opción: ");
    }while (opcion < 1 || opcion > opciones.length);
    
    return opcion;
  }

  private void mostrar() {
    int i = 1;
    System.out.println(nombre);
    for (String elemento : opciones) {
      System.out.println( (i++) + ". " + elemento);
    }
  }
}