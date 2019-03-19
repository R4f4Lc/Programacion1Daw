package almacen;

import java.util.ArrayList;

/**
* Clase Almacen que se encarga de la gestión de todo el almacen y de la comunicación con la clase Articulo.
* @author JavierGF00 R4f4Lc FcoJavierGlez
*
*/
public class Almacen {
  private static ArrayList<Articulo> arrayList = new ArrayList<Articulo>();

  /**
   * Añade el artículo al almacén siempre y cuando no exista.
   * @param articulo
   * @return true si se ha añadido. false en otro caso
   */
   static boolean alta(Articulo articulo) {
    if (arrayList.contains(articulo))
      return false;
    return arrayList.add(articulo);
  }
  
  /**
   * Elimina el artículo del almacén siempre y cuando exista.
   * @param codigo
   * @return true si se ha eliminado. false en otro caso
   */
  static boolean baja(int codigo) {
    if (arrayList.contains(arrayList.get(codigo-1)))
        return arrayList.remove(arrayList.get(codigo-1));
    return false;
  }
  
  /**
   * Modifica la descripción del artículo del almacén siempre y cuando exista.
   * @param codigo código del articulo
   * @param descripcion descripción nueva del articulo
   * @return true si se ha modificado. false en otro caso
   */
  static boolean modificarDescripcion(int codigo, String descripcion) {
    if(arrayList.contains(arrayList.get(codigo-1))) {
      (arrayList.get(codigo-1)).setDescripcion(descripcion);
      return true;
    }
    return false;
  }
  
  /**
   * Modifica el precio de compra del artículo del almacén siempre y cuando exista.
   * @param codigo código del articulo
   * @param PrecioCompra Precio de compra nuevo del articulo
   * @return true si se ha modificado. false en otro caso
   */
  static boolean modificarPrecioCompra(int codigo, double PrecioCompra) {
    if(arrayList.contains(arrayList.get(codigo-1))) {
      (arrayList.get(codigo-1)).setPrecioCompra(PrecioCompra);
      return true;
    }
    return false;
  }
  
  /**
   * Modifica el precio de venta del artículo del almacén siempre y cuando exista.
   * @param codigo código del articulo
   * @param PrecioVenta Precio de venta nuevo del articulo
   * @return true si se ha modificado. false en otro caso
   */
  static boolean modificarPrecioVenta(int codigo, double PrecioVenta) {
    if(arrayList.contains(arrayList.get(codigo-1))) {
      (arrayList.get(codigo-1)).setPrecioVenta(PrecioVenta);
      return true;
    }
    return false;
  }
  
  /**
   * Añade a cada articulo más stock
   * @param codigo código del articulo
   * @param cantidadArticulos Cantidad de articulos a añadir
   * @return true si se ha modificado. false en otro caso
   */
  static boolean entradaMercancia(int codigo, int cantidadArticulos){
    try {
      (arrayList.get(codigo-1)).incrementaStock(cantidadArticulos);
      return true;
    } catch (ErrorStockException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }
  
  /**
   * Elimina stock a cada articulo
   * @param codigo código del articulo
   * @param cantidadArticulos Cantidad de articulos a eliminar
   * @return true si se ha modificado. false en otro caso
   */
  static boolean salidaMercancia(int codigo, int cantidadArticulos){
  try {
    (arrayList.get(codigo-1)).decrementaStock(cantidadArticulos);
    return true;
  } catch (ErrorStockException e) {
    System.out.println(e.getMessage());
    return false;
    }
  }
  
  /**
   * Muestra todos los articulos en el almacen
   */
  static void mostrarLista() {
    for (int i=0; i<arrayList.size(); i++) {
      System.out.println("\n\nArtículo nº (" + (i+1) + "): \n" + (arrayList.get(i)).toString());      
    }
  }
  
  static void guardar() {
  	System.out.println("GUARDANDO CAMBIOS...");
    BaseDatos.deleteAll();
    for (int i = 0; i < arrayList.size(); i++) {
      BaseDatos.insert((arrayList.get(i)).getCodigo(),(arrayList.get(i)).getDescripcion(),(arrayList.get(i)).getPrecioComp(),(arrayList.get(i)).getPrecioVen(),(arrayList.get(i)).getStock());
      System.out.println("Insertado articulo " + (arrayList.get(i)).getCodigo() + " en la DB");
    }
    System.out.println("\n\nFIN DE PROGRAMA.");
    System.exit(0);
  }
}
