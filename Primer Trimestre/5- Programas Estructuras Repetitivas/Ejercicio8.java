/**Hacer un programa que muestre un cronometro,
indicando las horas, minutos y segundos.

@author: Rafael López Cruz
*/
import java.io.*;
public class Ejercicio8 { 
	public static void main (String[] args )throws InterruptedException {
  int horas;
  int minutos;
  int segundo;
  String borrar = "\b\b\b\b\b\b\b\b";
  for (horas = 0; horas <=59; horas++){
    for(minutos = 0; minutos <=59; minutos++){
  for (segundo=0;segundo<=59;segundo++){
      System.out.print(borrar + horas + ":"+minutos +":" +segundo);
      Thread.sleep(1*1000);
  }
    }}}
      }
