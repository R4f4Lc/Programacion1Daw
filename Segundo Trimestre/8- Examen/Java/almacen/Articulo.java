package almacen;

/**
 * 
 * Clase artículo encargada de llevar un control sobre los artículos que están
 * almacenados en un almacén. Se almacenan de cada uno de los artículos:
 * 
 * <ul>
 * <li>Código de referencia (único)</li>
 * <li>Descripción</li>
 * <li>Precio con el que fue comprado</li>
 * <li>Precio al que debe ser vendido</li>
 * <li>Cantidad de unidades almacenadas (stock)</li>
 * </ul>
 * 
 * 
 * @author R4f4Lc
 *
 */
public class Articulo {
  // Atributos:
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock = 0;
  private Iva tipoIva;
  private static int numArticulo = 0;

  /**
   * Constructor
   */
  public Articulo(String descripcion, double precioCompra, double precioVenta, Iva tipoIva, int stock)
      throws IvaInvalidoException, ErrorStockException {
    setDescripcion(descripcion);
    setPrecioCompra(precioCompra);
    setPrecioVenta(precioVenta);
    setStock(stock);
    setTipoIva(tipoIva);
    setCodigo();
  }

  // ################# STOCK #################\\

  Articulo(int codigo) {
    setCodigo(codigo);
  }

  private void setCodigo(int codigo) {
    this.codigo = codigo;

  }

  /**
   * Incrementa el stock del artículo
   * 
   * @param cantidad Número de artículos a incrementar
   * @throws ErrorStockException Cuando la cantidad es negativa
   */
  void incrementaStock(int cantidad) throws ErrorStockException {
    if (cantidad < 0)
      throw new ErrorStockException("Incrementa stock: La cantidad no puede ser negativa.");
    setStock(getStock() + cantidad);
  }

  /**
   * Decrementa el stock del artículo
   * 
   * @param cantidad Número de artículos a decrementar
   * @throws ErrorStockException Cuando la cantidad es negativa o se intenta
   *                             asignar un stock negativo
   */
  void decrementaStock(int cantidad) throws ErrorStockException {
    if (cantidad < 0)
      throw new ErrorStockException("Decrementa stock: La cantidad no puede ser negativa.");
    setStock(getStock() - cantidad);
  }

  // ################# SETTERS #################\\

  /**
   * Asigna una cantidad determinada de stock en un artículo.
   * 
   * @param numArticulos La cantidad a insertar en el stock
   * @throws ErrorStockException Cuando el stock es negativo
   */
  private void setStock(int numArticulos) throws ErrorStockException {
    if (numArticulos < 0)
      throw new ErrorStockException("El stock no puede ser negativo.");
    stock = numArticulos;
  }

  /**
   * Inserta un código de artículo.
   * 
   * @param numeroCodigo Código (int) de artículo.
   */
  private void setCodigo() {
    codigo = numArticulo;
    numArticulo++;
  }

  /**
   * Inserta la descripción del artículo.
   * 
   * @param desc Descripción (String) del artículo.
   */
  void setDescripcion(String desc) {
    descripcion = desc;
  }

  /**
   * Inserta el precio de compra del artículo.
   * 
   * @param precioCompra Precio (double) con el que fue comprado el artículo.
   */
  void setPrecioCompra(double precioComp) {
    precioCompra = precioComp;
  }

  /**
   * Inserta el precio de venta del artículo.
   * 
   * @param precioVen Precio (double) de venta del artículo.
   */
  void setPrecioVenta(double precioVen) {
    precioVenta = precioVen;
  }

  /**
   * Inserta el tipo de iva del artículo.
   * 
   * @param tipoIv
   */
  void setTipoIva(Iva tipoIva) throws IvaInvalidoException {
    if (tipoIva == null)
      throw new IvaInvalidoException("El iva tiene que ser válido en este caso");

    this.tipoIva = tipoIva;
  }

  // ################# GETTERS #################\\

  /**
   * Devuelve la cantidad de unidades almacenadas.
   * 
   * @return Unidades almacenadas (int)
   */
  int getStock() {
    return this.stock;
  }

  /**
   * Devuelve el precio por el que fue comprado el artículo.
   * 
   * @return Precio de compra (double)
   */
  double getPrecioCompra() {
    return this.precioCompra;
  }

  /**
   * Devuelve el precio por el que debe ser vendido el artículo.
   * 
   * @return Precio de venta (double)
   */
  double getPrecioVenta() {
    return this.precioVenta;
  }

  /**
   * Devuelve el código del artículo.
   * 
   * @return Descripcion del artículo (String)
   */
  String getDescripcion() {
    return this.descripcion;
  }

  /**
   * Devuelve la descripcion del artículo.
   * 
   * @return Código del artículo (int)
   */
  int getCodigo() {
    return codigo;
  }

  /**
   * Devuelve el tipo de iva del artículo.
   * 
   * @return
   * @throws IvaInvalidoException
   */
  Iva getTipoIva() {
    return this.tipoIva;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
    return result;
  }

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
   * Imprime el estado de cada artículo:
   */
  public String toString() {
    return "Código de art: " + this.codigo + "\nDescripción: " + this.descripcion + "\nPrecio de compra: "
        + this.precioCompra + "\nPrecio de venta: " + this.precioVenta + "\nArtículos en almacén: " + this.stock
        + "\nTipo de IVA: " + this.tipoIva;
  }
}
