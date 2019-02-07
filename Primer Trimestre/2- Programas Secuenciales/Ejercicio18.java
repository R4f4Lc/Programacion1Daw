//Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.

public class Ejercicio18 { 

public static void main(String[] args) {
  String nombre;
  String apellido1;
  String apellido2;
  String iniciales;

  //Preguntamos nombre, apellido1 y apellido2
  System.out.print("Dime el nombre: ");
  nombre = System.console().readLine();

  System.out.print("Dime el apellido 1: ");
  apellido1 = System.console().readLine();

  System.out.print("Dime el apellido 2: ");
  apellido2 = System.console().readLine(); 
  
  //Cogemos las iniciales con substring y lo ponemos en mayuscula
  iniciales = nombre.substring(0,1); 
  iniciales = iniciales + (apellido1.substring(0,1)); 
  iniciales = iniciales + (apellido2.substring(0,1));
  iniciales = iniciales.toUpperCase();
  
  //Mostramos por pantalla
  System.out.print("Las iniciales son " + iniciales);
  }
  
  
  
  
}
