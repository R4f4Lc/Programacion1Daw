/**Una persona adquirió un producto para pagar en 20 meses. 
El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente. 
Realizar un programa para determinar cuánto debe pagar mensualmente y el total 
de lo que pagará después de los 20 meses.

@author: Rafael López Cruz
*/
import java.io.*;
public class Ejercicio7 { 
	public static void main (String[] args) {
		int pagofinal = 0;
		int pago = 10;
    System.out.println("Pago mes 1: "+ pago + " euros");
		for (int i=2;i<21;i++) {
			pagofinal = pagofinal + pago;
			pago = pago*2;
      System.out.println("Pago mes "+ i +": "+ pago + " euros");
		}
		System.out.println("Tuvo que pagar un total de: " + pagofinal + " euros");
    }
      }
