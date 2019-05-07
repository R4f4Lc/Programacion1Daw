package almacen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import almacen.Articulo.IvaInvalidoException;

/**
* Clase Almacen que se encarga de la gestión de todo el almacen y de la comunicación con la clase Articulo.
* @author R4f4Lc
*
*/
public class Almacen {
   private static ArrayList<Articulo> arrayList = new ArrayList<Articulo>();
  
  /**
   * Devuelve un articulo si existe
   * @param codigo
   * @return 
   */
  private static Articulo getArticulo(int codigo) {
    for(Articulo a : arrayList) {
      if(a.getCodigo() == codigo)
        return arrayList.get(codigo);
    }
    return null;
  }
  
  /**
   * Añade el artículo al almacén siempre y cuando no exista.
   * @param Descripcion
   * @param PrecioCompra
   * @param PrecioVenta
   * @return true de que ha insertado correctamente
   */
  public static boolean alta(String Descripcion, double PrecioCompra, double PrecioVenta, Iva TipoIva, int Stock) throws IvaInvalidoException, ErrorStockException {
    return arrayList.add(new Articulo(Descripcion, PrecioCompra, PrecioVenta, TipoIva, Stock));
    }
  
  /**
   * Elimina el artículo del almacén siempre y cuando exista.
   * @param codigo
   * @return true si se ha eliminado. false en otro caso
   */
  public static boolean baja(int codigo) {
    return arrayList.remove(getArticulo(codigo));
  }
   
  /**
   * Modifica la descripción del artículo del almacén siempre y cuando exista.
   * @param codigo código del articulo
   * @param descripcion descripción nueva del articulo
   * @return true si se ha modificado. false en otro caso
   */
  public static boolean modificarDescripcion(int codigo, String descripcion) {
    if(getArticulo(codigo) != null) {
      arrayList.get(codigo).setDescripcion(descripcion);
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
  public static boolean modificarPrecioCompra(int codigo, double PrecioCompra) {
    if(getArticulo(codigo) != null) {
      arrayList.get(codigo).setPrecioCompra(PrecioCompra);
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
  public static boolean modificarPrecioVenta(int codigo, double PrecioVenta) {
    if(getArticulo(codigo) != null) {
      arrayList.get(codigo).setPrecioVenta(PrecioVenta);
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
  public static boolean entradaMercancia(int codigo, int cantidadArticulos){
    if(getArticulo(codigo) != null) {
      try {
        arrayList.get(codigo).incrementaStock(cantidadArticulos);
        return true;
      } catch (ErrorStockException e) {
        System.out.println(e.getMessage());
        return false;
      }
  }
    return false;
  }
  
  /**
   * Elimina stock a cada articulo
   * @param codigo código del articulo
   * @param cantidadArticulos Cantidad de articulos a eliminar
   * @return true si se ha modificado. false en otro caso
   */
  public static boolean salidaMercancia(int codigo, int cantidadArticulos){
    if(getArticulo(codigo) != null) {
      try {
        arrayList.get(codigo).decrementaStock(cantidadArticulos);
        return true;
      } catch (ErrorStockException e) {
        System.out.println(e.getMessage());
        return false;
        }
      }
    return false;
  }
  
  /**
   * Muestra todos los articulos en el almacen
   * @return 
   */
  public static StringBuilder mostrarLista() {
    StringBuilder cadena = new StringBuilder();
    for (int i=0; i<arrayList.size(); i++) {
      cadena.append("\n\nArtículo nº (" + (i) + "): \n" + (arrayList.get(i)).toString());
    }
    return cadena;
  }
  
  /**
   * Modifica el tipo de iva del artículo del almacén siempre y cuando exista.
   * @param codigo código del articulo
   * @param TipoIva TipoIva nuevo del articulo
   * @return true si se ha modificado. false en otro caso
   * @throws IvaInvalidoException 
   */
  public static boolean modificarTipoIva(int codigo, Iva TipoIva) throws IvaInvalidoException {
    if(getArticulo(codigo) != null) {
      arrayList.get(codigo).setTipoIva(TipoIva);
      return true;
    }
    return false;
  }
}
