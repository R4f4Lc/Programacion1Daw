/**Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.

@author: Rafael López Cruz
*/

import java.util.Scanner;

public class Ej8Dimension { 
	public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    int[] temperatura = new int[12];
    
    for (int i = 0; i<12; i++){
      System.out.print("Introduce la temperatura de " + mes[i] + ": ");
      temperatura[i] = s.nextInt();
    }
    System.out.println("______________________"); 
    for (int i = 0; i<12; i++){
      System.out.println(mes[i] + "= " + temperatura[i] + "Cº");
      System.out.println("______________________"); 
    }
    
}
}
