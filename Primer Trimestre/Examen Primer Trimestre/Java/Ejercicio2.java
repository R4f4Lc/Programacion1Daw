/**
* 2. Impresión de la quiniela de la jornada de fútbol (15 partidos) después de conocer los resultados.
*Para ello vamos a utilizar dos matrices:
*• Equipos: matriz de cadenas de caracteres donde guardamos en cada columna el nombre de los
*equipos de cada partido. En la quiniela se indican 15 partidos.
*• Resultados: matriz de enteros donde se indica el resultado. También tiene dos columnas, en la
*primera se guarda el número de goles del equipo que está guardado en la primera columna de
*la tabla anterior, y en la segunda los goles del otro equipo.
*El programa ira pidiendo los nombres de los equipos de cada partido y el resultado del partido,
*guardará los datos donde corresponda y a continuación imprimirá la quiniela de esa jornada llamando
*a una función que recibirá ambas matrices.
*(Recomendación: meter 15 en una constante para hacer las pruebas con menos equipos)
*
*
*@author Rafael Lopez Cruz
 */

import java.util.Scanner;
public class Ejercicio2 {
	
	/**
	 * Definimos la función
	 * @param r1
	 * @param r2
	 * @return
	 */
	public static String Quiniela(int r1, int r2) {
		/**
		 * Definimos la variable resultado que será
		 * la que devolverá.
		 */
		String resultado = "";
		/**
		 * Sentencia if que comprobará si r1 es mayor,
		 * menor o igual a r2 y definirá la variable resultado
		 * con 1, 2 o x
		 */
		if (r1 > r2) {
			resultado = "1";
		}
		
		if(r1<r2) {
			resultado = "2";
		}
		
		if (r1==r2) {
			resultado = "x";
		}
		/**
		 * Devolvemos la variable resultado
		 */
		return resultado;
	}
	
	public static void main(String[] args){
		/**
		 * Definimos Scanner
		 */
		Scanner s = new Scanner(System.in);
		
		/**
		 * Definimos los arrays bidimensionales de Equipos
		 * y Resultados formados por 15 filas y 2 columnas.
		 */
		String[][] Equipos = new String[15][2];
		
		int[][] Resultados = new int[15][2];
		
		/**
		 * Pedimos por pantalla el nombre de los equipos 
		 * y sus goles con un bucle for de 15 repeticiones
		 * y vamos almacenando los valores en los arrays
		 * Equipos y Resultados.
		 */
		
		for (int i=0;i<15;i++) {
			int numpart = i+1;
			System.out.println("Partido " + numpart + ":");
			System.out.print("Introduce el nombre del primer equipo: ");
			Equipos[i][0] = s.next();
			
			System.out.print("Introduce los goles de " + Equipos[i][0] + ": ");
			Resultados[i][0] = s.nextInt();
			
			System.out.print("Introduce el nombre del segundo equipo: ");
			Equipos[i][1] = s.next();
			
			System.out.print("Introduce los goles de " + Equipos[i][1] + ": ");
			Resultados[i][1] = s.nextInt();
			
		}
		
		/**
		 * Bucle for que se repitira 15 veces
		 */
		System.out.println("El Resultado de la Quiniela es:");
		for(int i=0; i<15;i++) {
			/**
			 * Guardamos en variables los valores de los goles
			 * de los equipos
			 */
			int r1 = Resultados[i][0];
			int r2 = Resultados[i][1];
			/**
			 * Vamos imprimiendo por pantalla los nombres de los
			 * equipos y ejecutamos la función pasando como parametros
			 * las variables r1 y r2
			 */
			System.out.println(Equipos[i][0] + "-" + Equipos[i][1] + " = " + Quiniela(r1,r2));
		}
	}
}