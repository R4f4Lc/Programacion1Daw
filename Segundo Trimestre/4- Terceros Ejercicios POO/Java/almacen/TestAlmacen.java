package almacen;
import almacen.Almacen;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Clase TestAlmacen que hace la función de menú para que el usuario interactúe con el programa
 * @author JavierGF00 R4f4Lc FcoJavierGlez
 *
 */

public class TestAlmacen {
  
  /**
   * Saca todos los articulos de la base de datos y los añade al arrayList de Almacen.
   * 
   */
  private static void insertarBaseDatos() {
    ResultSet rs = BaseDatos.selectAll();
    if(rs != null) {
      try{
        while (rs.next()) {
          Almacen.alta(new Articulo(rs.getString("Nombre"), rs.getDouble("PrecioC"), rs.getDouble("PrecioV"), rs.getInt("Stock")));
        }
      }catch(SQLException e) {
        System.out.println("Error con la base de datos.");
        System.exit(1);
      }
    }
    else {
      System.out.println("No hay articulos en la base de datos.");
    }
  }
  
  
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int opcion;
    int opcionM;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;
    int codigo;
    int cantidadArticulos;
    insertarBaseDatos();
	  
	  /**
	   * Menú
	   */
	  do {
	  	/**
	  	 * Se llama al método menú, y se introducirá la opción que se quiera realizar
	  	 */
	    menu();
	    opcion = qint(s,"Introduzca una opción: ");
	    
	    switch (opcion) {
	    /**
	     * En el caso 1 se muestra una lista del almacén
	     */
	    case 1:
	    	Almacen.mostrarLista();
	    	break;
	    	
	    	/**
	    	 * En el caso 2 se da de alta un nuevo artículo
	    	 */
	    case 2:
	    	descripcion = qstring(s,"Introduzca descripcion del nuevo articulo: ");
	    	precioCompra = qdouble(s, "Precio compra: ");
	    	precioVenta=qdouble(s,"Precio Venta: ");
	    	stock = qint(s,"Stock: ");
	    	if (Almacen.alta(new Articulo(descripcion,precioCompra,precioVenta,stock))) {
	    		System.out.println("El artículo se ha añadido correctamente");
	    	}else {
	    		System.out.println("Error. El artículo no se ha podido añadir correctamente");
	    	}
	    	break;
	    	
	    	/**
	    	 * En el caso 3 se da de baja un artículo
	    	 */
	    case 3:
	    	Almacen.mostrarLista();
	    	codigo = qint(s,"Introduzca el código del artículo que desea borrar: ");
				if (Almacen.baja(codigo)) {
					System.out.println("El artículo se ha borrado correctamente");
				}else {
					System.out.println("El artículo no ha podido ser borrado");
				}
				break;
				
				/**
				 * En el caso 4 se modificarán los datos que sean neesarios
				 */
	    case 4:
	    	Almacen.mostrarLista();
  			codigo = qint(s,"Introduzca el código del artículo a modificar: ");
	    	do {
	    		/**
	    		 * Se llama al método menuModificarArticulo para eligir la modificación a efectuar
	    		 */
	    		menuModificarArticulo();
	    		opcionM = qint(s,"Elige una opción: ");
		    
	    		switch (opcionM) {
	    		case 1:
	    			descripcion = qstring(s,"Introduzca la nueva descripción del artículo: ");
	    			if (Almacen.modificarDescripcion(codigo, descripcion)) {
	    				System.out.println("La descripción ha sido modificada correctamente");
	    			}else {
	    				System.out.println("La descripción no ha podido ser modificada");
	    			}
	    			break;
	    		case 2:
	    			precioCompra = qdouble(s,"Introduzca el nuevo precio de compra del artículo: ");
	    			if (Almacen.modificarPrecioCompra(codigo, precioCompra)) {
	    				System.out.println("El precio de compra ha sido modificado correctamente");
	    			}else {
	    				System.out.println("El precio de compra no ha podido ser modificado");
	    			}
	    			break;
	    		case 3:
	    			precioVenta = qdouble(s,"Introduzca el nuevo precio de venta del artículo: ");
	    			if (Almacen.modificarPrecioVenta(codigo, precioVenta)) {
	    				System.out.println("El precio de venta ha sido modificado correctamente");
	    			}else {
	    				System.out.println("El precio de venta no ha podido ser modificado");
	    			}
	    			break;
	    		}
	    	}while(opcionM != 4);
	    	break;
	    	
	    	/**
	    	 * En el caso 5 se incrementa la mercancía
	    	 */
	    case 5:
	    	Almacen.mostrarLista();
	    	codigo = qint(s,"Introduce código: ");
	    	cantidadArticulos = qint(s,"Introduce la cantidad de artículos a incrementar");
	    	if (Almacen.entradaMercancia(codigo, cantidadArticulos)) {
	    		System.out.println("La entrada de mercancía se ha realizado con éxito");
	    	}else {
	    		System.out.println("La entrada de artículos no se ha podido producir");
	    	}
	    	break;
	    	
	    	/**
	    	 * En el caso 6 se da salida a la mercancía
	    	 */
	    case 6:
	    	Almacen.mostrarLista();
	    	codigo = qint(s,"Introduce código: ");
	    	cantidadArticulos = qint(s,"Introduce la cantidad de artículos a quitar");
	    	if (Almacen.salidaMercancia(codigo, cantidadArticulos)) {
	    		System.out.println("La salida de mercancía se ha realizado con éxito");
	    	}else {
	    		System.out.println("La salida de artículos no se ha podido producir");
	    	}
	    	break;
	    	
	    	/**
	    	 * En el caso 7 se guardan los cambios efectuados y se cierra el programa
	    	 */
	    case 7:
        Almacen.guardar();
	    }
	    
	  }while(opcion!=7);
  }

/**
 * Método menuModificarArticulo que muestra el menú para modificar un artículo
 */
	private static void menuModificarArticulo() {
		System.out.println("1. Modificar Descripción ");
		System.out.println("2. Modificar Precio de Compra ");
		System.out.println("3. Modificar Precio de Venta");
		System.out.println("4. Salir");
	}

/**
 * Método menu que muestra el menú principal
 */
	private static void menu() {
		System.out.println("\n\nG E S T I S I M A L");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir");
	}

/**
 * Método qdouble que pregunta al usuario un número con decimales y comprueba que es válido
 * @param s
 * @param q
 * @return
 */
	private static double qdouble(Scanner s, String q) {
		boolean comprobacion=false;
		double n=0;
		do {
			try {
				System.out.println(q);
				n = s.nextDouble();
				comprobacion = true;
			}catch (Exception e){
				comprobacion = false;
				s.nextLine();
				System.out.println("Introduzca un número correctamente.");
				System.out.println();
			}
		}while (!comprobacion);
		return n;
	}

/**
 * Método qint que pregunta al usuario un número entero y comprueba que es válido
 * @param s
 * @param q
 * @return
 */
	private static int qint(Scanner s, String q) {
		boolean comprobacion=false;
		int n=0;
		do {
			try {
				System.out.println(q);
				n = s.nextInt();
				comprobacion = true;
			}catch (Exception e){
				comprobacion = false;
				s.nextLine();
				System.out.println("Introduzca un número entero correctamente.");
			}
		}while (!comprobacion);
		return n;
	}
	
/**
 * Método qstring que pregunta al usuario una cadena de texto y comprueba que es válida
 * @param s
 * @param q
 * @return
 */
	private static String qstring(Scanner s, String q) {
		boolean comprobacion=false;
		String texto="";
		do {
			try {
				System.out.println(q);
				s.nextLine();
				texto = s.nextLine();
				comprobacion = true;
			}catch (Exception e){
				comprobacion = false;
				s.nextLine();
				System.out.println("Introduzca una cadena de texto.");
			}
		}while (!comprobacion);
		return texto;
	}
}
    
 