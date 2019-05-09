package almacen;

import java.util.ArrayList;

import almacen.IvaInvalidoException;

/**
* Clase Almacen que se encarga de la gestión de todo el almacen y de la comunicación con la clase Articulo.
* @author R4f4Lc
*
*/
public class Almacen {
   private ArrayList<Articulo> arrayList = new ArrayList<Articulo>();
  
  /**
   * Devuelve un articulo si existe
   * @param codigo
   * @return 
   * @throws ErrorCodigoException 
   */
  public Articulo getArticulo(int codigo) throws ErrorCodigoException {
    try {
      return arrayList.get(codigo);
    }catch(IndexOutOfBoundsException ioobe) {
      throw new ErrorCodigoException("ID Articulo inválido.");
    }
    
  }
  
  /**
   * Añade el artículo al almacén siempre y cuando no exista.
   * @param Descripcion
   * @param PrecioCompra
   * @param PrecioVenta
   * @param TipoIva
   * @param Stock
   * @return true de que ha insertado correctamente
   */
  public void alta(String Descripcion, double PrecioCompra, double PrecioVenta, Iva TipoIva, int Stock) throws IvaInvalidoException, ErrorStockException {
    arrayList.add(new Articulo(Descripcion, PrecioCompra, PrecioVenta, TipoIva, Stock));
    }
  
  /**
   * Elimina el artículo del almacén siempre y cuando exista.
   * @param codigo
   * @return true si se ha eliminado. false en otro caso
   * @throws ErrorCodigoException 
   */
  public boolean baja(int codigo) throws ErrorCodigoException {
    return arrayList.remove(getArticulo(codigo));
  }
   
  /**
   * Modifica la descripción del artículo del almacén siempre y cuando exista.
   * @param codigo código del articulo
   * @param descripcion descripción nueva del articulo
   * @throws ErrorCodigoException 
   */
  public void modificarDescripcion(int codigo, String descripcion) throws ErrorCodigoException {
      getArticulo(codigo).setDescripcion(descripcion);
  }
  
  /**
   * Modifica el precio de compra del artículo del almacén siempre y cuando exista.
   * @param codigo código del articulo
   * @param PrecioCompra Precio de compra nuevo del articulo
   * @throws ErrorCodigoException 
   */
  public void modificarPrecioCompra(int codigo, double PrecioCompra) throws ErrorCodigoException {
      getArticulo(codigo).setPrecioCompra(PrecioCompra);
  }
  
  /**
   * Modifica el precio de venta del artículo del almacén siempre y cuando exista.
   * @param codigo código del articulo
   * @param PrecioVenta Precio de venta nuevo del articulo
   * @throws ErrorCodigoException 
   */
  public void modificarPrecioVenta(int codigo, double PrecioVenta) throws ErrorCodigoException {
      getArticulo(codigo).setPrecioVenta(PrecioVenta);
  }
  
  /**
   * Añade a cada articulo más stock
   * @param codigo código del articulo
   * @param cantidadArticulos Cantidad de articulos a añadir
   * @return true si se ha modificado. false en otro caso
   * @throws ErrorStockException 
   * @throws ErrorCodigoException 
   */
  public void entradaMercancia(int codigo, int cantidadArticulos) throws ErrorStockException, ErrorCodigoException{
        try {
          arrayList.get(arrayList.indexOf(new Articulo(codigo))).incrementaStock(cantidadArticulos);
        } catch (IndexOutOfBoundsException e) {
         throw new ErrorCodigoException("El código no existe.");
        }
  }
  
  /**
   * Elimina stock a cada articulo
   * @param codigo código del articulo
   * @param cantidadArticulos Cantidad de articulos a eliminar
   * @return true si se ha modificado. false en otro caso
   */
  public boolean salidaMercancia(int codigo, int cantidadArticulos)  throws ErrorStockException, ErrorCodigoException{
      try {
        arrayList.get(arrayList.indexOf(new Articulo(codigo))).decrementaStock(cantidadArticulos);
        return true;
      } catch (IndexOutOfBoundsException e) {
        throw new ErrorCodigoException("El código no existe.");
       }
      }
  
  /**
   * Muestra todos los articulos en el almacen
   * @return 
   */
  public StringBuilder mostrarLista() {
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
   * @throws IvaInvalidoException 
   * @throws ErrorCodigoException 
   */
  public void modificarTipoIva(int codigo, Iva TipoIva) throws IvaInvalidoException, ErrorCodigoException {
      getArticulo(codigo).setTipoIva(TipoIva);
  }
}
