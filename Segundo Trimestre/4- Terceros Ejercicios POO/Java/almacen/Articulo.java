package almacen;

import java.util.ArrayList;

/**
 * 
 * Clase artículo encargada de llevar un control sobre los artículos que están almacenados en un almacén. 
 * Se almacenan de cada uno de los artículos:
 * <ul>
 * <li>Código de referencia (único)</li>
 * <li>Descripción</li>
 * <li>Precio con el que fue comprado</li>
 * <li>Precio al que debe ser vendido</li>
 * <li>Cantidad de unidades almacenadas (stock)</li>
 * <li>Si está o no descatalogado</li>
 * </ul>
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Articulo {
  
  private int codigo;
  
  private String descripcion;
  
  private double precioCompra;
  
  private double precioVenta;
  
  private int stock;
  
  //private boolean descatalogado;
  
  /**
   * Constructor
   */
  public Articulo(int cod, String desc, double precComp, double precVen, int stock) {
    
    this.codigo = cod;
    
    this.descripcion = desc;
    
    this.precioCompra = precComp;
    
    this.precioVenta = precVen;
    
    this.stock = stock;
    
    //this.descatalogado = false;
    
    
  }
  
  
  /**
   * Asigna una cantidad determinada de stock en un artículo.
   * 
   * @param numArticulos  La cantidad a insertar en el stock
   * @throws ErrorStockException  Cuando el stock es negativo
   */
  private void setStock(int numArticulos) throws ErrorStockException {    
    if(numArticulos<0)
      throw new ErrorStockException("El stock no puede ser negativo.");
    this.stock = numArticulos;    
  }
  
  /**
   * Incrementa el stock del artículo 
   * @param cantidad Número de artículos a incrementar
   * @throws ErrorStockException Cuando la cantidad es negativa 
   */
  void incrementaStock(int cantidad) throws ErrorStockException{
      if(cantidad<0)
        throw new ErrorStockException("Incrementa stock: La cantidad no puede ser negativa.");
      setStock(getStock()+cantidad);
  }
  
  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
    return result;
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Articulo other = (Articulo) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }


  /**
   * Decrementa el stock del artículo
   * @param cantidad Número de artículos a decrementar
   * @throws ErrorStockException Cuando la cantidad es negativa o se intenta asignar un stock negativo
   */
  void decrementaStock(int cantidad) throws ErrorStockException {
    if(cantidad<0)
      throw new ErrorStockException("Decrementa stock: La cantidad no puede ser negativa.");
    setStock(getStock()-cantidad);
  }
  
  
  /**
   * Este método modifica el stock de un artículo determinado.
   * <ul>
   * <li>Añade artículos si el valor de entrada es positivo.</li>
   * <li>Reduce el stock almacenado si el valor de entrada es negativo y si el total a restar 
   * no supera al total almacenado.</li>
   * </ul>
   * 
   * En caso de querer reducir un total de artículos superior al almacenado muestra un mensaje 
   * de información al usuario y no hace ningún cambio.
   * 
   * @param cantidad  Unidades a modificar en el stock (int)
   */
  protected void cambiaStock(int cantidad) {    
    if (cantidad<0) {      
      if (Math.abs(cantidad)>this.stock) {
        System.out.print("\n\nNo puede retirar más artículos de los que hay disponibles en stock.");
        System.out.print("\n\nUsted desea retirar " + Math.abs(cantidad) + " artículos y hay en stock " + this.stock + ".");
      } else {
        this.stock += cantidad;
      }      
    } else {      
      this.stock += cantidad;      
    }    
  }
  
  
  /**
   * Devuelve la cantidad de unidades almacenadas.
   * 
   * @return  Unidades almacenadas (int)
   */
  public int getStock() {
    return this.stock;
  }
  
  
  /**
   * Devuelve el precio por el que fue comprado el artículo.
   * 
   * @return  Precio de compra (double)
   */
  public double getPrecioComp() {
    return this.precioCompra;
  }
  
  
  /**
   * Devuelve el precio por el que debe ser vendido el artículo.
   * 
   * @return  Precio de venta (double)
   */
  public double getPrecioVen() {
    return this.precioVenta;
  }
  
  
  /**
   * Devuelve el código del artículo.
   * 
   * @return  Descripcion del artículo (String)
   */
  public String getDescripcion() {
    return this.descripcion;
  }
  
  /**
   * Devuelve la descripcion del artículo.
   * 
   * @return Código del artículo (int)
   */
  public int getCodigo() {
    return this.codigo;
  }
  
  
  /**
   * Devuelve un booleano con la información de si el artículo está o no descatalogado.
   * 
   * @return  Verdadero o falso.
   */
  /**
  public boolean getDescatalogado() {
    return this.descatalogado;
  }
  
  */
  
  /**
   * Comprueba que el código de artículo insertado no se repite en el resto de artículos.
   * 
   * @param art             Lista de artículos.
   * @param numeroCodigo    Código insertado por el usuario
   * @return                Verdadero o falso
   */
  public boolean repiteCodigo(ArrayList<Articulo> art, int numeroCodigo) {
    
    for (int i=0; i<art.size()-1;i++) {
      if ((art.get(i)).codigo == numeroCodigo) {
        return true;
      }
    }    
    return false;
  }
  
  /**
   * Inserta un código de artículo.
   * 
   * @param numeroCodigo  Código (int) de artículo.
   */
  protected void setCodigo(int numeroCodigo) {
    this.codigo = numeroCodigo;
  }
  
  
  /**
   * Inserta la descripción del artículo.
   * 
   * @param descripcion  Descripción (String) del artículo.
   */
  protected void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  
  /**
   * Inserta el precio de compra del artículo.
   * 
   * @param precioCompra  Precio (double) con el que fue comprado el artículo.
   */
  protected void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }
  
  
  /**
   * Inserta el precio de venta del artículo.
   * 
   * @param precioVenta  Precio (double) de venta del artículo.
   */
  protected void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }
  
  
  /**
   * Inserta la disponibilidad del artículo.
   * 
   * @param descatalogado  Disponibilidad o no (boolean) del artículo.
   */
  /**
  protected void setDescatalogado(boolean descatalogado) {
    this.descatalogado = descatalogado;
  }
  */
  
  /**
   * Imprime el estado de cada artículo:
   */
  public String toString() {    
    /**if (!this.descatalogado) {*/
      return "Código de art: " + this.codigo + "\nDescripción: " +
          this.descripcion + "\nPrecio de compra: " + this.precioCompra + 
          "\nPrecio de venta: " + this.precioVenta + "\nArtículos en almacén: " + this.stock;
    /**} else {
      return "Código de art: " + this.codigo + "\nDescripción: " +
          this.descripcion + "\nPrecio de compra: " + this.precioCompra + 
          "\nPrecio de venta: " + this.precioVenta + "\nArtículos en almacén: " + this.stock + "\nDESCATALOGADO";
    }  */  
  }
}
