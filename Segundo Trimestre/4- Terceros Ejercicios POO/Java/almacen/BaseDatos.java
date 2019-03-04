package almacen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 * Fichero que realiza la comunicación con la base de datos y nos permite:
 * Insertar
 * Eliminar
 * 
 * @author RafaLpeC
 */
public class BaseDatos {
  /**
   * Se conecta a la Base de Datos y devuelve la conexión.
   * 
   * @return
   */
  private static Connection connect(){
    Connection conn = null;
    String url = "jdbc:sqlite:data\\almacen.db";
    try {
      conn = DriverManager.getConnection(url);
    }
    catch(SQLException e) {
     System.out.println("Error. No se ha podido conectar con la base de datos.");
     //Descomentar la siguiente linea para mostrar el mensaje de error.
     //System.out.println(e.getMessage());
   }
    return conn;
  }
  /**
   * Selecciona todos los articulos de la base de datos y los devuelve.
   * 
   * @return rs
   */
  public static ResultSet selectAll(){
    String sql = "SELECT Codigo, Nombre, PrecioC, PrecioV, Stock FROM articulo";
    ResultSet rs = null;
    try{
      Connection conn = connect();
      Statement stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);
    }
    catch(SQLException e) {
      System.out.println("Error. No se han podido sacar los productos de la base de datos.");
      //Descomentar la siguiente linea para mostrar el mensaje de error.
      //System.out.println(e.getMessage());
    }
    return rs;
  }

  /**
   * Inserta los valores en la base de datos.
   * 
   * @param codigo
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   */
  public static void insert(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
    String sql = "INSERT INTO articulo(Codigo, Nombre, PrecioC, PrecioV, Stock) "
        + "VALUES("
        +codigo
        +",'"+descripcion+
        "',"+precioCompra+
        ","+precioVenta+
        ","+stock+")";
    try(Connection conn = connect();
        PreparedStatement pstmt = conn.prepareStatement(sql)){
      pstmt.executeUpdate();
    }
    catch(SQLException e) {
      System.out.println("Error. No se ha podido insertar el articulo "+codigo + " en la base de datos.");
      //Descomentar la siguiente linea para mostrar el mensaje de error.
      //System.out.println(e.getMessage());
    }
  }
  
  /**
   * Elimina todo lo que hay en la base de datos.
   * 
   */
  public static void deleteAll() {
    String sql = "DELETE FROM articulo";
    try(Connection conn = connect();
        PreparedStatement pstmt = conn.prepareStatement(sql)){
      pstmt.executeUpdate();
    }
    catch(SQLException e) {
      System.out.println("Error al eliminar en la base de datos.");
      //Descomentar la siguiente linea para mostrar el mensaje de error.
      //System.out.println(e.getMessage());
    }
  }
  
  public static void main(String[] args) {
  System.out.println("Este fichero contiene la configuración de la base de Datos.");
  }
}