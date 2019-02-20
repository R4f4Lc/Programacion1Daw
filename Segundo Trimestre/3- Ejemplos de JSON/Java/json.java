/**
 * 
 * Creación de ejemplo de control de JSON en Java.
 * 
 * @author R4f4Lc
 */

import java.net.URL;
import java.net.URLConnection;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

import java.util.Scanner;

public class json {

  public static void main(String[] args) throws IOException{
    Scanner s = new Scanner(System.in);
    
    /**
     * 
     * Pedimos la IP que vamos a escanear y construimos la url a la que vamos a realizar
     * la petición.
     */ 
    System.out.println("Dime la IP a escanear: ");
    String dominio = s.nextLine();
    String sURL = "https://api.shodan.io/shodan/host/"+ dominio + "?key=p2s927StbOzkhj8BI5FOEmYQi68gTzAB";
    
    /**
     * 
     * Abrimos la conexión con shodan
     */
    URL url = new URL(sURL);
    URLConnection request = url.openConnection();
    request.connect();
    
    /**
     * 
     * Obtenemos el json de la página a la que hemos hecho la conexión.
     */
    JsonParser jp = new JsonParser();
    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
    JsonObject rootobj = root.getAsJsonObject(); 
    
    /**
     * 
     * Mostramos por pantalla algunos de los valores del json.
     */
    System.out.println("Información de " + dominio);
    System.out.println("IP: " + rootobj.get("ip_str").getAsString());
    System.out.println("Proveedor de Servicios de Internet(ISP): " +  rootobj.get("isp").getAsString());
    System.out.println("Organización: " + rootobj.get("org").getAsString());
    System.out.println("Hostnames: " + rootobj.get("hostnames").getAsString());
    System.out.println("Puertos: " + rootobj.get("ports"));
    System.out.println("Pais: " + rootobj.get("country_name").getAsString());
    System.out.println(rootobj.get("longitude").getAsString());
    System.out.println("Longitud y Altitud: " +  rootobj.get("longitude").getAsString() + ", " + rootobj.get("latitude").getAsString());
    System.out.println("Geolocalización Google Maps: http://maps.google.com/maps?q=" + rootobj.get("latitude").getAsString() + "," + rootobj.get("longitude").getAsString());
  }
}