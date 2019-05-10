import almacen.Almacen;
import almacen.ErrorCodigoException;
import almacen.ErrorStockException;
import almacen.IvaInvalidoException;
import almacen.Iva;
import utilities.Menu;
import utilities.Teclado;

/**
 * Clase TestAlmacen que hace la función de menú para que el usuario interactúe
 * con el programa
 * 
 * @author R4f4Lc
 *
 */

public class TestAlmacenNuevo {
  
  private static Menu menuGeneral = new Menu("\nG E S T I S I M A L\n" + "===================", new String[] {
      "Listado", "Alta", "Baja", "Modificación", "Entrada de mercancía", "Salida de mercancía", "Salir" });
  private static Menu menuIva = new Menu("\nSeleccione un tipo de IVA",
      new String[] { "General", "Reducido", "Super Reducido" });
  private static Menu menuModificarArticulo = new Menu("\nSeleccione que desea modificar:",
      new String[] { "Modificar Descripción", "Modificar Precio de Compra", "Modificar Precio de Venta",
          "Modificar IVA", "Salir" });
  private static Almacen Almacen = new Almacen();

  public static void main(String[] args) throws IvaInvalidoException, ErrorStockException {
    do {
      switch ((menuGeneral.funciones())) {
      case 1:
        System.out.println(Almacen.mostrarLista());
        break;

      case 2:
        alta();
        break;

      case 3:
        baja();
        break;

      case 4:
        modificar();
        break;

      case 5:
        entradaMercancia();
        break;

      case 6:
        salidaMercancia();
        break;

      case 7:
        return;
      }
    } while (true);
  }

  /**
   * Pide un tipo de IVA válido
   * @return
   * @throws IvaInvalidoException
   */
  private static Iva pedirIva() throws IvaInvalidoException {
    switch (menuIva.funciones()) {
    case 1:
      return Iva.GENERAL;
    case 2:
      return Iva.REDUCIDO;
    default:// case 3:
      return Iva.SUPER_REDUCIDO;
    }
  }

  /**
   * Da de alta un articulo
   */
  private static void alta() throws IvaInvalidoException, ErrorStockException {
    try {
      Almacen.alta(Teclado.leerString("Introduzca descripcion del nuevo articulo: "), Teclado.leerDouble("Precio compra: "), Teclado.leerDouble("Precio Venta: "), pedirIva(), Teclado.leerInt("Stock: "));
      System.out.println("El artículo se ha añadido correctamente");
    } catch (IvaInvalidoException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Da de baja un articulo
   */
  private static void baja() {
    try {
      Almacen.mostrarLista();
      Almacen.baja(Teclado.leerInt("Introduzca el código del artículo que desea borrar: "));
      System.out.println("El artículo se ha borrado correctamente");
    } catch (ErrorCodigoException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Modifica un articulo
   * @throws IvaInvalidoException
   */
  private static void modificar() throws IvaInvalidoException {
    int opcionM;
      Almacen.mostrarLista();
      int codigo = Teclado.leerInt("Introduzca el código del artículo a modificar: ");
      try {
        Almacen.getArticulo(codigo);

      do {
        opcionM = menuModificarArticulo.funciones();
        switch (opcionM) {
        case 1:
          modificarDescripcion(codigo);
          break;
        case 2:
          modificarPrecioCompra(codigo);
          break;
        case 3:
          modificarPrecioVenta(codigo);
          break;
        case 4:
          modificarTipoIva(codigo);
          break;
        }
      } while(opcionM != 5);
    }
    catch (ErrorCodigoException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Modificar el tipo de IVA
   * @param codigo
   * @throws ErrorCodigoException
   */
  private static void modificarTipoIva(int codigo) throws ErrorCodigoException {
    Iva tipoIva;
    try {
      tipoIva=pedirIva();
      Almacen.modificarTipoIva(codigo, tipoIva);
    } catch (IvaInvalidoException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Modificar el precio de venta
   * @param codigo
   * @throws ErrorCodigoException
   */
  private static void modificarPrecioVenta(int codigo) throws ErrorCodigoException {
    double precioVenta;
    precioVenta = Teclado.leerDouble("Introduzca el nuevo precio de venta del artículo: ");
    Almacen.modificarPrecioVenta(codigo, precioVenta);
      System.out.println("El precio de venta ha sido modificado correctamente");
  }

  /**
   * Modificar el precio de compra
   * @param codigo
   * @throws ErrorCodigoException 
   */
  private static void modificarPrecioCompra(int codigo) throws ErrorCodigoException {
    double precioCompra;
    precioCompra = Teclado.leerDouble("Introduzca el nuevo precio de compra del artículo: ");
    Almacen.modificarPrecioCompra(codigo, precioCompra);
  }

  /**
   * Modifica la descripción
   * @param codigo
   * @throws ErrorCodigoException 
   */
  private static void modificarDescripcion(int codigo) throws ErrorCodigoException {
    String descripcion;
    descripcion = Teclado.leerString("Introduzca la nueva descripción del artículo: ");
    Almacen.modificarDescripcion(codigo, descripcion);
  }

  /**
   * Entrada de stock
   */
  private static void entradaMercancia() {
    Almacen.mostrarLista();
    try {
      Almacen.salidaMercancia(Teclado.leerInt("Introduce código: "),
          Teclado.leerInt("Introduce la cantidad de artículos a quitar"));
    } catch (ErrorStockException | ErrorCodigoException e) {
      System.out.println(e.getMessage());
      return;
    }
  }

  /**
   * Salida de stock
   */
  private static void salidaMercancia() {
    try {
      Almacen.mostrarLista();
      Almacen.salidaMercancia(Teclado.leerInt("Introduce código: "),
          Teclado.leerInt("Introduce la cantidad de artículos a quitar"));
    } catch (ErrorStockException | ErrorCodigoException e) {
      System.out.println(e.getMessage());
    }
  }
}
