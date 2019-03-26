import almacen.Almacen;
import java.util.Scanner;

/**
 * Clase TestAlmacen que hace la función de menú para que el usuario interactúe con el programa
 * @author JavierGF00 R4f4Lc FcoJavierGlez
 *
 */

//
public class TestAlmacen {
  
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
    Almacen.insertarBaseDatos();
	  
	  /**
	   * Menú
	   */
	  do {
	  	/**
	  	 * Se llama al método menú, y se introducirá la opción que se quiera realizar
	  	 */
	    menu();
	    opcion = preguntaInt(s,"Introduzca una opción: ");
	    
	    switch (opcion) {
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
	    	opcion2(s);
	    	break;
	    	
	    	/**
	    	 * En el caso 3 se da de baja un artículo
	    	 */
	    case 3:
	    	opcion3(s);
				break;
				
				/**
				 * En el caso 4 se modificarán los datos que sean neesarios
				 */
	    case 4:
	    	opcion4(s);
	    	break;
	    	
	    	/**
	    	 * En el caso 5 se incrementa la mercancía
	    	 */
	    case 5:
	    	opcion5(s);
	    	break;
	    	
	    	/**
	    	 * En el caso 6 se da salida a la mercancía
	    	 */
	    case 6:
	    	opcion6(s);
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
	
	private static void opcion2(Scanner s) {
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		descripcion = preguntaString(s,"Introduzca descripcion del nuevo articulo: ");
		precioCompra = preguntaDouble(s, "Precio compra: ");
		precioVenta=preguntaDouble(s,"Precio Venta: ");
		stock = preguntaInt(s,"Stock: ");
		if (Almacen.alta(descripcion,precioCompra,precioVenta)) {
			System.out.println("El artículo se ha añadido correctamente");
		}else {
			System.out.println("Error. El artículo no se ha podido añadir correctamente");
		}
	}
	
	/**
	 * Método opcion3 que es llamdo en el case 3 correspondiente
	 * @param s
	 */
	private static void opcion3(Scanner s) {
		int codigo;
		Almacen.mostrarLista();
		codigo = preguntaInt(s,"Introduzca el código del artículo que desea borrar: ");
		if (Almacen.baja(codigo)) {
			System.out.println("El artículo se ha borrado correctamente");
		}else {
			System.out.println("El artículo no ha podido ser borrado");
		}
	}
	
	/**
	 * Método opcion4 que es llamado en el case 4 correspondiente
	 * @param s
	 */
	private static void opcion4(Scanner s) {
		int opcionM;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int codigo;
		Almacen.mostrarLista();
		codigo = preguntaInt(s,"Introduzca el código del artículo a modificar: ");
		do {
			/**
			 * Se llama al método menuModificarArticulo para eligir la modificación a efectuar
			 */
			menuModificarArticulo();
			opcionM = preguntaInt(s,"Elige una opción: ");
		
			switch (opcionM) {
			case 1:
				descripcion = preguntaString(s,"Introduzca la nueva descripción del artículo: ");
				if (Almacen.modificarDescripcion(codigo, descripcion)) {
					System.out.println("La descripción ha sido modificada correctamente");
				}else {
					System.out.println("La descripción no ha podido ser modificada");
				}
				break;
			case 2:
				precioCompra = preguntaDouble(s,"Introduzca el nuevo precio de compra del artículo: ");
				if (Almacen.modificarPrecioCompra(codigo, precioCompra)) {
					System.out.println("El precio de compra ha sido modificado correctamente");
				}else {
					System.out.println("El precio de compra no ha podido ser modificado");
				}
				break;
			case 3:
				precioVenta = preguntaDouble(s,"Introduzca el nuevo precio de venta del artículo: ");
				if (Almacen.modificarPrecioVenta(codigo, precioVenta)) {
					System.out.println("El precio de venta ha sido modificado correctamente");
				}else {
					System.out.println("El precio de venta no ha podido ser modificado");
				}
				break;
			}
		}while(opcionM != 4);
	}
	
	/**
	 * Método opcion 5 que es llamdo en el case 5 correspondiente
	 * @param s
	 */
	private static void opcion5(Scanner s) {
		int codigo;
		int cantidadArticulos;
		Almacen.mostrarLista();
		codigo = preguntaInt(s,"Introduce código: ");
		cantidadArticulos = preguntaInt(s,"Introduce la cantidad de artículos a incrementar");
		if (Almacen.entradaMercancia(codigo, cantidadArticulos)) {
			System.out.println("La entrada de mercancía se ha realizado con éxito");
		}else {
			System.out.println("La entrada de artículos no se ha podido producir");
		}
	}
	
	/**
	 * Método opcion6 que es llamdo en el case 6 correspondiente
	 * @param s
	 */
	private static void opcion6(Scanner s) {
		int codigo;
		int cantidadArticulos;
		Almacen.mostrarLista();
		codigo = preguntaInt(s,"Introduce código: ");
		cantidadArticulos = preguntaInt(s,"Introduce la cantidad de artículos a quitar");
		if (Almacen.salidaMercancia(codigo, cantidadArticulos)) {
			System.out.println("La salida de mercancía se ha realizado con éxito");
		}else {
			System.out.println("La salida de artículos no se ha podido producir");
		}
	}

/**
 * Método preguntaDouble que pregunta al usuario un número con decimales y comprueba que es válido
 * @param s
 * @param q
 * @return
 */
	private static double preguntaDouble(Scanner s, String q) {
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
 * Método preguntaInt que pregunta al usuario un número entero y comprueba que es válido
 * @param s
 * @param q
 * @return
 */
	private static int preguntaInt(Scanner s, String q) {
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
 * Método preguntaString que pregunta al usuario una cadena de texto y comprueba que es válida
 * @param s
 * @param q
 * @return
 */
	private static String preguntaString(Scanner s, String q) {
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
    
 