import almacen.Almacen;
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

  public static void main(String[] args) throws IvaInvalidoException, ErrorStockException {

    /**
     * Menú
     */
    do {
      /**
       * Se llama al método menú, y se introducirá la opción que se quiera realizar
       */
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

  private static Iva datoIva() throws IvaInvalidoException {
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
    String descripcion;
    double precioCompra;
    double precioVenta;
    Iva tipoIva = null;
    int stock;
    try {
      descripcion = Teclado.leerString("Introduzca descripcion del nuevo articulo: ");
      precioCompra = Teclado.leerDouble("Precio compra: ");
      precioVenta = Teclado.leerDouble("Precio Venta: ");
      tipoIva = datoIva();
      stock = Teclado.leerInt("Stock: ");
      Almacen.alta(descripcion, precioCompra, precioVenta, tipoIva, stock);
      System.out.println("El artículo se ha añadido correctamente");
    } catch (IvaInvalidoException iie) {
      System.out.println("Error. El iva debe ser válido en este caso ");
    }
  }

  /**
   * Da de baja un articulo
   */
  private static void baja() {
    int codigo;
    Almacen.mostrarLista();
    codigo = Teclado.leerInt("Introduzca el código del artículo que desea borrar: ");
    if (Almacen.baja(codigo)) {
      System.out.println("El artículo se ha borrado correctamente");
    } else {
      System.out.println("El artículo no ha podido ser borrado");
    }
  }

  /**
   * Modifica un articulo
   * 
   * @throws IvaInvalidoException
   */
  private static void modificar() throws IvaInvalidoException {
    String[] opcionesIva = new String[] { "General", "Reducido", "Super Reducido" };
    Menu menuIva = new Menu("\nSeleccione un tipo de IVA", opcionesIva);
    int opcionM;
    String descripcion;
    double precioCompra;
    double precioVenta;
    Iva tipoIva = null;
    int codigo;
    try {
      Almacen.mostrarLista();
      codigo = Teclado.leerInt("Introduzca el código del artículo a modificar: ");
      if(Almacen.getArticulo(codigo) == null)
        return;
      
      do {
        /**
         * Se llama al objeto menuModificarArticulo para eligir la modificación a
         * efectuar
         */
        Menu menuModificarArticulo = new Menu("\nSeleccione que desea modificar:",
            new String[] { "Modificar Descripción", "Modificar Precio de Compra", "Modificar Precio de Venta","Modificar IVA","Salir" });
        opcionM = menuModificarArticulo.funciones();
        switch (opcionM) {
        case 1:
          descripcion = Teclado.leerString("Introduzca la nueva descripción del artículo: ");
          if (Almacen.modificarDescripcion(codigo, descripcion)) {
            System.out.println("La descripción ha sido modificada correctamente");
          } else {
            System.out.println("La descripción no ha podido ser modificada");
          }
          break;
        case 2:
          precioCompra = Teclado.leerDouble("Introduzca el nuevo precio de compra del artículo: ");
          if (Almacen.modificarPrecioCompra(codigo, precioCompra)) {
            System.out.println("El precio de compra ha sido modificado correctamente");
          } else {
            System.out.println("El precio de compra no ha podido ser modificado");
          }
          break;
        case 3:
          precioVenta = Teclado.leerDouble("Introduzca el nuevo precio de venta del artículo: ");
          if (Almacen.modificarPrecioVenta(codigo, precioVenta)) {
            System.out.println("El precio de venta ha sido modificado correctamente");
          } else {
            System.out.println("El precio de venta no ha podido ser modificado");
          }
          break;
        case 4:
          menuIva.funciones();
          int opcion = Teclado.leerInt("Introduzca el nuevo valor del IVA (general, reducido, super reducido)");
          if (opcion == 1) {
            tipoIva = Iva.GENERAL;
          } else {
            if (opcion == 2) {
              tipoIva = Iva.REDUCIDO;
            } else {
              if (opcion == 3) {
                tipoIva = Iva.SUPER_REDUCIDO;
              }
            }
          }
          if (Almacen.modificarTipoIva(codigo, tipoIva)) {
            System.out.println("El tipo de iva ha sido modificado correctamente");
          } else {
            System.out.println("El tipo de iva no ha podido ser modificado");
          }
        }
      } while (opcionM != 5);
    } catch (IvaInvalidoException iie) {
      System.out.println("Error. El iva debe ser válido en este caso ");
    }
  }

  /**
   * Entrada de stock
   */
  private static void entradaMercancia() {
    int codigo;
    int cantidadArticulos;
    Almacen.mostrarLista();
    codigo = Teclado.leerInt("Introduce código: ");
    cantidadArticulos = Teclado.leerInt("Introduce la cantidad de artículos a incrementar");
    if (Almacen.entradaMercancia(codigo, cantidadArticulos)) {
      System.out.println("La entrada de mercancía se ha realizado con éxito");
    } else {
      System.out.println("La entrada de artículos no se ha podido producir");
    }
  }

  /**
   * Salida de stock
   */
  private static void salidaMercancia() {
    int codigo;
    int cantidadArticulos;
    Almacen.mostrarLista();
    codigo = Teclado.leerInt("Introduce código: ");
    cantidadArticulos = Teclado.leerInt("Introduce la cantidad de artículos a quitar");
    if (Almacen.salidaMercancia(codigo, cantidadArticulos)) {
      System.out.println("La salida de mercancía se ha realizado con éxito");
    } else {
      System.out.println("La salida de artículos no se ha podido producir");
    }
  }
}
