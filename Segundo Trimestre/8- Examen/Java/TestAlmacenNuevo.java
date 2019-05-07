import almacen.Almacen;
import almacen.ErrorStockException;
import almacen.IvaInvalidoException;
import almacen.Iva;
import utilities.Menu;
import utilities.Teclado;

/**
 * Clase TestAlmacen que hace la función de menú para que el usuario interactúe con el programa
 * @author R4f4Lc
 *
 */

public class TestAlmacenNuevo {
  private static Menu menuGeneral = new Menu("\nG E S T I S I M A L\n" + "===================", new String[] {"Listado", "Alta", "Baja" , "Modificación" , "Entrada de mercancía" , "Salida de mercancía" , "Salir"});
  private static Menu menuIva = new Menu("\nSeleccione un tipo de IVA", new String[] { "General", "Reducido", "Super Reducido" });
  
  public static void main(String[] args) throws IvaInvalidoException, ErrorStockException {
    
    /**
     * Menú
     */
    do {
      /**
       * Se llama al método menú, y se introducirá la opción que se quiera realizar
       */
      switch ((menuGeneral.funciones())) {
      
      /**
       * En el caso 1 se muestra una lista del almacén
       */
      case 1:
        System.out.println(Almacen.mostrarLista());
        break;
        
        /**
         * En el caso 2 se da de alta un nuevo artículo
         */
      case 2:
        alta();
        break;
        
        /**
         * En el caso 3 se da de baja un artículo
         */
      case 3:
        baja();
        break;
        
        /**
         * En el caso 4 se modificarán los datos que sean neesarios
         */
      case 4:
        modificar();
        break;
        
        /**
         * En el caso 5 se incrementa la mercancía
         */
      case 5:
        entradaMercancia();
        break;
        
        /**
         * En el caso 6 se da salida a la mercancía
         */
      case 6:
        salidaMercancia();
        break;
        
        /**
         * En el caso 7 se cierra el programa
         */
      
      case 7:
        return;
      }  
    }while(true);
  }

/**
 * Método menuModificarArticulo que muestra el menú para modificar un artículo
 */
  private static void menuModificarArticulo() {
    System.out.println("1. Modificar Descripción ");
    System.out.println("2. Modificar Precio de Compra ");
    System.out.println("3. Modificar Precio de Venta");
    System.out.println("4. Modificar Tipo de Iva");
    System.out.println("5. Salir");
  }
  
  private static Iva datoIva() throws IvaInvalidoException {
    do {
      switch (menuIva.funciones()) {
      case 1:
        return Iva.GENERAL;
      case 2:
        return Iva.REDUCIDO;
      case 3:
        return Iva.SUPER_REDUCIDO;  
      }
    }while(true);
  }
  
  private static void alta() throws IvaInvalidoException, ErrorStockException {
    String descripcion;
    double precioCompra;
    double precioVenta;
    Iva tipoIva = null;
    int stock;
    try {
      descripcion = Teclado.leerString("Introduzca descripcion del nuevo articulo: ");
      precioCompra = Teclado.leerDouble("Precio compra: ");
      precioVenta= Teclado.leerDouble("Precio Venta: ");
      tipoIva = datoIva();
      stock = Teclado.leerInt("Stock: ");
      if (Almacen.alta(descripcion,precioCompra,precioVenta,tipoIva,stock)) {
        System.out.println("El artículo se ha añadido correctamente");
      }else {
        System.out.println("Error. El artículo no se ha podido añadir correctamente");
      }
    }catch (IvaInvalidoException iie) {
      System.out.println("Error. El iva debe ser válido en este caso ");
    }
  }
  
  private static void baja() {
    int codigo;
    Almacen.mostrarLista();
    codigo = Teclado.leerInt("Introduzca el código del artículo que desea borrar: ");
    if (Almacen.baja(codigo)) {
      System.out.println("El artículo se ha borrado correctamente");
    }else {
      System.out.println("El artículo no ha podido ser borrado");
    }
  }
  
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
      do {
        /**
         * Se llama al método menuModificarArticulo para eligir la modificación a efectuar
         */
        menuModificarArticulo();
        opcionM = Teclado.leerInt("Elige una opción: ");
      
        switch (opcionM) {
        case 1:
          descripcion = Teclado.leerString("Introduzca la nueva descripción del artículo: ");
          if (Almacen.modificarDescripcion(codigo, descripcion)) {
            System.out.println("La descripción ha sido modificada correctamente");
          }else {
            System.out.println("La descripción no ha podido ser modificada");
          }
          break;
        case 2:
          precioCompra = Teclado.leerDouble("Introduzca el nuevo precio de compra del artículo: ");
          if (Almacen.modificarPrecioCompra(codigo, precioCompra)) {
            System.out.println("El precio de compra ha sido modificado correctamente");
          }else {
            System.out.println("El precio de compra no ha podido ser modificado");
          }
          break;
        case 3:
          precioVenta = Teclado.leerDouble("Introduzca el nuevo precio de venta del artículo: ");
          if (Almacen.modificarPrecioVenta(codigo, precioVenta)) {
            System.out.println("El precio de venta ha sido modificado correctamente");
          }else {
            System.out.println("El precio de venta no ha podido ser modificado");
          }
          break;
        case 4:
          menuIva.funciones();
          int opcion = Teclado.leerInt("Introduzca el nuevo valor del IVA (general, reducido, super reducido)");
          if (opcion == 1) {
            tipoIva = Iva.GENERAL;
          }else {
            if (opcion == 2) {
              tipoIva = Iva.REDUCIDO;
            }else {
              if (opcion == 3) {
                tipoIva = Iva.SUPER_REDUCIDO;
              }
            }
          }
          if (Almacen.modificarTipoIva(codigo, tipoIva)) {
            System.out.println("El tipo de iva ha sido modificado correctamente");
          }else {
            System.out.println("El tipo de iva no ha podido ser modificado");
          }
        }
      }while(opcionM != 5);
    }catch (IvaInvalidoException iie) {
      System.out.println("Error. El iva debe ser válido en este caso ");
    }
  }
  
  private static void entradaMercancia() {
    int codigo;
    int cantidadArticulos;
    Almacen.mostrarLista();
    codigo = Teclado.leerInt("Introduce código: ");
    cantidadArticulos = Teclado.leerInt("Introduce la cantidad de artículos a incrementar");
    if (Almacen.entradaMercancia(codigo, cantidadArticulos)) {
      System.out.println("La entrada de mercancía se ha realizado con éxito");
    }else {
      System.out.println("La entrada de artículos no se ha podido producir");
    }
  }
  
  private static void salidaMercancia() {
    int codigo;
    int cantidadArticulos;
    Almacen.mostrarLista();
    codigo = Teclado.leerInt("Introduce código: ");
    cantidadArticulos = Teclado.leerInt("Introduce la cantidad de artículos a quitar");
    if (Almacen.salidaMercancia(codigo, cantidadArticulos)) {
      System.out.println("La salida de mercancía se ha realizado con éxito");
    }else {
      System.out.println("La salida de artículos no se ha podido producir");
    }
  }
}
