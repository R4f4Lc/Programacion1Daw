package almacen;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar
 * el control de los artículos de un almacén. De cada artículo se debe saber
 * el código, la descripción, el precio de compra, el precio de venta y el stock
 * (número de unidades). El menú del programa debe tener, al menos, las
 * siguientes opciones:
 * 
 * 1. Listado
 * 2. Alta
 * 3. Baja
 * 4. Modificación
 * 5. Entrada de mercancía
 * 6. Salida de mercancía
 * 7. Salir
 * 
 * La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo. Hay que controlar que no se
 * pueda sacar más mercancía de la que hay en el almacén.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Gestisimal {
  public static void main(String[] args) {
    //Scanner:
    Scanner s = new Scanner (System.in);
    
    //Variables:
    int numeroMenu = 0;
    
    /**
     * Hacemos una consulta a la base de datos para sacar todos los productos 
     * y definimos un ArrayList del objeto Articulo donde vamos añadiendo los articulos de la
     * base de datos.
     */
    ArrayList<Articulo> art = new ArrayList<Articulo>();
    ResultSet rs = BaseDatos.selectAll();
    if(rs != null) {
    try{
      while (rs.next()) {
        art.add(new Articulo(rs.getInt("Codigo"), rs.getString("Nombre"), rs.getDouble("PrecioC"), rs.getDouble("PrecioV"), rs.getInt("Stock")));
      }
    }
    catch(SQLException e) {
      System.out.println("Error con la base de datos.");
      System.exit(1);
      //System.err.println(e.getMessage());
    }
    }
    else {
      System.out.println("No hay articulos en la base de datos.");
    }
        
    //Borra la pantalla de la consola de inicio, antes de ejecutar el programa:
    borraPantalla();
    
    //Inicio de programa:
    while(numeroMenu!=7) {
      
      numeroMenu = menuPrincipal(s);
      
      switch(numeroMenu) {
        
        case 1:
          imprimeLista(art);  //Imprimimos la lista          
          esperaSegundos(3);  //Esperamos 3 segundos antes de volver a mostrar el menú
          break;
          
        case 2:
          darDeAlta(art, s);
          esperaSegundos(1);  //Esperamos 1 segundo antes de volver a mostrar el menú
          borraPantalla();    //Borra la pantalla de la consola
          break;
          
        case 3:
          darDeBaja(art, s);
          esperaSegundos(1);  //Esperamos 1 segundo antes de volver a mostrar el menú
          borraPantalla();    //Borra la pantalla de la consola
          break;
          
        case 4:
          modificaArticulo(art, s);
          esperaSegundos(1);  //Esperamos 1 segundo antes de volver a mostrar el menú
          borraPantalla();    //Borra la pantalla de la consola
          break;
          
        case 5:
          entradaMercancia(art, s);
          esperaSegundos(1);  //Esperamos 1 segundo antes de volver a mostrar el menú
          borraPantalla();    //Borra la pantalla de la consola
          break;
          
        case 6:
          salidaMercancia(art, s);
          esperaSegundos(1);  //Esperamos 1 segundo antes de volver a mostrar el menú
          borraPantalla();    //Borra la pantalla de la consola
          break;
          
        default:
          System.out.println("GUARDANDO CAMBIOS...");
          BaseDatos.deleteAll();
          for (int i = 0; i < art.size(); i++) {
            BaseDatos.insert((art.get(i)).getCodigo(),(art.get(i)).getDescripcion(),(art.get(i)).getPrecioComp(),(art.get(i)).getPrecioVen(),(art.get(i)).getStock());
            System.out.println("Insertado articulo " + (art.get(i)).getCodigo() + " en la DB");
          }
          System.out.println("\n\nFIN DE PROGRAMA.");   //Mensaje de fin de programa
          esperaSegundos(2);                            //Esperamos 2 segundos
          System.exit(0);                               //Cerramos el programa con valor 0
      }      
    }
    
  }
  
  
  //#####################################     MÉTODOS     #####################################\\
  
  
  /**
   * Éste método imprime por pantalla el menú del programa y lo repite mientras
   * la entrada del número no se corresponda con ninguna de las opciones.
   * 
   * @param s Objeto clase Scanner.
   * @return  Devuelve (int) número menú.
   */
  private static int menuPrincipal(Scanner s) {
    
    int numeroMenu;
    
    do {      
      System.out.print("\n\nMenú:");
      System.out.print("\n-----");
      System.out.print("\n\n(1) Listado");
      System.out.print("\n(2) Alta");
      System.out.print("\n(3) Baja");
      System.out.print("\n(4) Modificación");
      System.out.print("\n(5) Entrada de mercancia");
      System.out.print("\n(6) Salida de mercancia");
      System.out.println("\n(7) Salir");
      numeroMenu=s.nextInt();
      s.nextLine();
    } while (numeroMenu<1 || numeroMenu>7);
    
    return numeroMenu;    
  }
  
  
  /**
   * Imprime el listado completo de artículos almacenados.
   * 
   * @param art   Lista de artículos.
   */
  private static void imprimeLista(ArrayList<Articulo> art) {
    
    System.out.println("\n\nHa elegido la opción de mostrar listado de artículos:");
    
    for (int i=0; i<art.size(); i++) {
      System.out.print("\n\nArtículo nº (" + (i+1) + "): \n" + (art.get(i)).toString());      
    }    
  }
  
  
  /**
   * Permite ingresar un nuevo artículo a la lista. Se requiere almacenar:
   * 
   * <ul>
   * <li>La descripción del artículo</li>
   * <li>El precio de compra</li>
   * <li>El precio de venta</li>
   * <li>Stock</li>
   * <li>Código (único)</li>
   * </ul>
   * 
   * @param art
   * @param s
   */
  private static void darDeAlta(ArrayList<Articulo> art, Scanner s) {
    String respuesta = "";
    int codigo;
    String descripcion = "";
    double precioCompra;
    double precioVenta;
    int stock = 0;
    
    //Borra la pantalla de la consola
    borraPantalla();
    
    //Informamos que va a introducir un nuevo artículo:
    System.out.print("\nHa seleccionado dar de alta un artículo:");
    
    //Pedimos la descripción del artículo:
    System.out.println("\n\nInserte la descripción del artículo:");
    descripcion = s.nextLine();
    
    //Pedimos el precio de compra:
    System.out.println("\n\nInserte el precio de compra del artículo:");
    precioCompra = s.nextDouble();
    s.nextLine();
    
    //Pedimos el precio de venta:
    System.out.println("\n\nInserte el precio de venta del artículo:");
    precioVenta = s.nextDouble();
    s.nextLine();
    
    //Preguntamos si han entrado unidades en stock para añadir cantidad:
    do {
      System.out.println("\n\n¿Han entrado unidades en stock? (S/N)");
      respuesta = s.nextLine().toUpperCase();
    } while(!(respuesta.equals("S") || respuesta.equals("SI") || respuesta.equals("N") || respuesta.equals("NO")));
    
    /*
     * Si la respuesta es sí añadimos una cantidad:
     */
    if (respuesta.equals("S") || respuesta.equals("SI")) {
      respuesta = "";      
      do {  //Evitamos números negativos:
        System.out.println("\n\n¿Cuántas unidades han entrado en stock?");
        stock = s.nextInt();
        s.nextLine();
      } while (stock<0);      
    } else {    //Si la respuesta es no, por defecto el valor es 0:
      respuesta = "";
    }
    
    //Pedimos el código de artículo (NO SE PUEDE REPETIR!!):
    System.out.println("\n\nInserte el código del artículo:");
    codigo = s.nextInt();
    s.nextLine();
    
    //Creamos el objeto:
    art.add(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
    
    //Y comprobamos que no se haya repetido el código con ningún otro artículo de la lista:
    while((art.get(art.size()-1)).repiteCodigo(art, codigo)) {    //Comprobamos que en la última posición no se haya repetido código           
      //Si se ha repetido lo tenemos que cambiar a la fuerza:
      System.out.print("\n\nEl código del artículo está repetido, no puede repetir el código.");
      System.out.println("\n\nPor favor, inserte un código de artículo válido:");
      codigo = s.nextInt();
      s.nextLine();
      (art.get(art.size()-1)).setCodigo(codigo);   //Reasignamos el código
    }
    
    //Mostramos el resultado del artículo a agregar:
    System.out.println("\n\nUsted desea agregar el siguiente artículo:");
    (art.get(art.size()-1)).toString();    
    
    //Preguntamos si acepta los cambios (el objeto está creado por defecto):
    do {
      System.out.println("\n\n¿Desea guardar los cambios? (S/N)");
      respuesta = s.nextLine().toUpperCase();
    } while(!(respuesta.equals("S") || respuesta.equals("SI") || respuesta.equals("N") || respuesta.equals("NO")));
    
    //Y si no acepta entonces borramos el objeto:
    if (respuesta.equals("N") || respuesta.equals("NO")) {
      art.remove(art.size()-1);
    }
  }
  
  /**
   * Elimina un artículo de la lista de artículos. Para ello comprueba:
   * <ul>
   * <li>Que el número de existencias de ese artículo no sea superior a 0.</li>
   * </ul>
   * 
   * @param art   Lista de artículos
   * @param s     Scanner
   */
  private static void darDeBaja(ArrayList<Articulo> art, Scanner s) {    
    String respuesta = "";
    int numero;
    
    //Borra la pantalla de la consola
    borraPantalla();
    
    //Preguntamos si quiere ver la lista de artículos:
    do {
      System.out.println("\n\n¿Desea ver la lista de artículos? (S/N)");
      respuesta = s.nextLine().toUpperCase();
    } while(!(respuesta.equals("S") || respuesta.equals("SI") || respuesta.equals("N") || respuesta.equals("NO")));
           
    //Si la respuesta es afirmativa imprimimos la lista:
    if (respuesta.equals("S")) {
      imprimeLista(art);
    }
    
    //Comprobamos que el artículo selecciondo sea corecto:
    numero = seleccionArticulo(art, s);
    
    /*
     * -Si quedan existencias del artículo no puede ser borrado.
     * -Si no quedan existencias se borra sin más.
     */
    if ((art.get(numero-1)).getStock()!=0) {
      System.out.println("\n\nUsted no puede dar de baja un artículo cuyas existencias sigan almacenadas.");
    }
    
    else {
      System.out.println("\n\nEl artículo ha sido borrado con éxito.");
      art.remove(numero-1);
    }
    
    //Esperamos 2 segundos:
    esperaSegundos(2);
  }
  
  
  /**
   * Modifica los atributos de un artículo seleccionado, los atributos modificables son:
   * <ul>
   * <li>Código</li>
   * <li>Descripción</li>
   * <li>Precio de compra</li>
   * <li>Precio de venta</li>
   * <li>Disponibilidad según catálogo</li>
   * </ul>
   * 
   * @param art Lista de artículos
   * @param s   Scanner
   */
  private static void modificaArticulo(ArrayList<Articulo> art, Scanner s) {
    //Variables de selección:
    int numeroArticulo;       //Número del artículo a modificar
    int opcionMenu = 0;       //Opción de menú que elija el usuario
    String respuesta = "";    //Respuesta para confirmar cambios
    
    //Variables para el artículo a modificar:
    int codigo;               //Código del artículo
    String descripcion = "";  //Descricipción
    double precioCompra;      //Precio de compra
    double precioVenta;       //Precio de venta
    
    //Borra la pantalla de la consola
    borraPantalla();
    
    //Preguntamos si quiere ver la lista de artículos:
    do {
      System.out.println("\n\n¿Desea ver la lista de artículos? (S/N)");
      respuesta = s.nextLine().toUpperCase();
    } while(!(respuesta.equals("S") || respuesta.equals("SI") || respuesta.equals("N") || respuesta.equals("NO")));
           
    //Si la respuesta es afirmativa imprimimos la lista:
    if (respuesta.equals("S")) {
      imprimeLista(art);
    }
    
    //Reseteamos el valor de la variable respuesta:
    respuesta = "";
    
    //Comprobamos que el artículo selecciondo sea corecto:
    numeroArticulo = seleccionArticulo(art, s);
    
    /*
     * Entramos en un doble bucle do-while:
     * 
     *  -El primero imprime un menú con las opciones a modificar, y lo imprimirá mientras 
     *  la opción sea inválida o se quiera seguir modificando atributos.
     *  -El segundo pregunta al usuario si desea modificar otro atributo del artículo seleccionado 
     *  si la repsuesta es sí volveremos al bucle del menú, si la respuesta es no terminamos.
     */
    do {  
      borraPantalla();    //Borramos para que no se acumule texto en consola: 
      do {        
        System.out.print("\n\n¿Qué atributo desea modificar?");
        System.out.print("\n(1) Modificar código.");
        System.out.print("\n(2) Modificar descripción.");
        System.out.print("\n(3) Modificar precio de compra.");
        System.out.print("\n(4) Modificar precio de venta.");
        System.out.print("\n(6) Salir.");
        opcionMenu=s.nextInt();
        s.nextLine();
      } while (opcionMenu<1 || opcionMenu>6);      
      
      //Aquí modificamos el artículo según la opción elegida:
      switch (opcionMenu) {
        case 1:
          //Pedimos el código de artículo (NO SE PUEDE REPETIR!!):
          System.out.println("\n\nInserte el código del artículo:");
          codigo = s.nextInt();
          s.nextLine();
          
          //Y comprobamos que no se haya repetido el código con ningún otro artículo de la lista:
          while((art.get(numeroArticulo-1)).repiteCodigo(art, codigo)) {    //Comprobamos que en la última posición no se haya repetido código           
            //Si se ha repetido lo tenemos que cambiar a la fuerza:
            System.out.print("\n\nEl código del artículo está repetido, no puede repetir el código.");
            System.out.println("\n\nPor favor, inserte un código de artículo válido:");
            codigo = s.nextInt(); 
            s.nextLine();
            (art.get(numeroArticulo-1)).setCodigo(codigo);   //Reasignamos el código
          }
          
          //Si no se repite lo cambiamos:
          (art.get(numeroArticulo-1)).setCodigo(codigo);
          break;
        
        case 2: //Nueva descripción:
          System.out.println("\n\nInserte la nueva descripción:");
          descripcion = s.nextLine();
          (art.get(numeroArticulo-1)).setDescripcion(descripcion);
          break;
          
        case 3: //Nuevo precio de compra:
          System.out.println("\n\nInserte el nuevo precio de compra:");
          precioCompra = s.nextDouble();
          s.nextLine();
          (art.get(numeroArticulo-1)).setPrecioCompra(precioCompra);
          break;
          
        case 4: //Nuevo precio de venta:
          System.out.println("\n\nInserte el nuevo precio de venta:");
          precioVenta = s.nextDouble();
          s.nextLine();
          (art.get(numeroArticulo-1)).setPrecioCompra(precioVenta);
          break;
          
        default:
          respuesta = "N";
      }
      
      //Borramos pantalla:
      borraPantalla();
      
      //Si la opción del menú no es 6 (Salir) preguntamos al usuario si quiere modificar otro atributo:
      if (opcionMenu!=6) {
        System.out.println("\n\n¿Desea modificar otro atributo del artículo? (S/N)");
        respuesta = s.nextLine().toUpperCase();
      }
      
    } while (respuesta.equals("S") || respuesta.equals("SI"));
    
    
  }
  
  
  /**
   * Método que se encarga de gestionar la entrada de artículos del almacén, 
   * certifando que no puedan ingresar un número negativo de artículos.
   * 
   * @param art   Lista de artículos
   * @param s     Scanner
   */
  private static void entradaMercancia(ArrayList<Articulo> art, Scanner s) {
    String respuesta = "";
    int numero;
    int cantidadArticulos;
    
    //Borra la pantalla de la consola
    borraPantalla();
    
    //Preguntamos si quiere ver la lista de artículos:
    do {
      System.out.println("\n\n¿Desea ver la lista de artículos? (S/N)");
      respuesta = s.nextLine().toUpperCase();
    } while(!(respuesta.equals("S") || respuesta.equals("SI") || respuesta.equals("N") || respuesta.equals("NO")));
           
    //Si la respuesta es afirmativa imprimimos la lista:
    if (respuesta.equals("S")) {
      imprimeLista(art);
    }
    
    //Comprobamos que el artículo selecciondo sea corecto:
    numero=seleccionArticulo(art, s);
    
    //Pedimos el número de artículos a ingresar:
    System.out.println("\n\n¿Cuántos artículos desea ingresar?");
    cantidadArticulos = s.nextInt();
    s.nextLine();
    
    //Mientras el número sea negativo le negamos la entrada al usuario y solicitamos un nuevo valor:
    while(cantidadArticulos<0) {
      System.out.print("\n\nNo puede introducir una cantidad negativa de artículos, introduzca un valor positivo.");
      System.out.println("\n\n¿Cuántos artículos desea registrar?");
      cantidadArticulos = s.nextInt();
      s.nextLine();
    }
    
    (art.get(numero-1)).cambiaStock(cantidadArticulos);
  }
  
  
  /**
   * Método que se encarga de gestionar la salida de artículos del almacén, 
   * certifando que no puede extraerse un número positivo de artículos.
   * 
   * @param art   Lista de artículos
   * @param s     Scanner
   */
  private static void salidaMercancia(ArrayList<Articulo> art, Scanner s) {
    String respuesta = "";
    int numero;
    int cantidadArticulos;
    
    //Borra la pantalla de la consola
    borraPantalla();
    
    //Preguntamos si quiere ver la lista de artículos:
    do {
      System.out.println("\n\n¿Desea ver la lista de artículos? (S/N)");
      respuesta = s.nextLine().toUpperCase();
    } while(!(respuesta.equals("S") || respuesta.equals("SI") || respuesta.equals("N") || respuesta.equals("NO")));
           
    //Si la respuesta es afirmativa imprimimos la lista:
    if (respuesta.equals("S")) {
      imprimeLista(art);
    }
    
    //Comprobamos que el artículo selecciondo sea corecto:
    numero=seleccionArticulo(art, s);
    
    System.out.println("\n\n¿Cuántos artículos desea retirar?");
    cantidadArticulos = s.nextInt();
    s.nextLine();
    
    //Si el número ingresado es positivo lo pasamos a negativo:
    if (cantidadArticulos>0) {
      cantidadArticulos *= -1;
    }
    (art.get(numero-1)).cambiaStock(cantidadArticulos);
    
    //Esperamos 3 segundos:
    esperaSegundos(3);
  }
  
  
  /**
   * Método que selecciona el artículo elegido por el usuario tras 
   * preguntar al usuario si es el articulo correcto o si desea 
   * seleccionar otro.
   * 
   * @param art   Lista de artículos
   * @param s     Scanner
   * @return      El número de índice (int) del artículo seleccionado
   */
  private static int seleccionArticulo(ArrayList<Articulo> art, Scanner s) {
    int numero;
    String respuesta = "";
    
    do {
      //Pedimos el número del artículo a sacar:
      System.out.println("\n\nIndique el número de artículo según la lista.");
      numero = s.nextInt();
      s.nextLine();
      
      //Limpiamos la consola:
      borraPantalla();
      
      //Comprobamos que el número introducido sea correcto:
      if (numero<1 || numero>art.size()) {
        System.out.println("\n\n¡¡Número de artículo incorrecto!!");
      } else {
        System.out.print("\n\nHa seleccionado el artículo nº" + numero + ": \n" + (art.get(numero-1).toString()));
        System.out.println("\n\n¿Es correcto el artículo seleccionado? (S/N)");
        respuesta = s.nextLine().toUpperCase();
      }
    } while (!(respuesta.equals("S") || respuesta.equals("SI")));
    
    //Borramos pantalla:
    borraPantalla();
    
    return numero;    
  }
  
  /**
   * Espera una cantidad n de segundos para que le de tiempo a leer al usuario.
   */
  private static void esperaSegundos(int n) {
    try {
      Thread.sleep(n*1000);
    } catch(Exception e) {}
  }
  
  /**
   * Borra todo lo que haya en consola.
   */
  private static void borraPantalla() {    
    try {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception e) {}  
  }
  
  
}
