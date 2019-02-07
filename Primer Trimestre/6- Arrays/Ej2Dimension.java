/**Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?
@author: Rafael López Cruz
*/

public class Ej2Dimension { 
	public static void main (String[] args) {

    String[] num = new String[10];
    num[0] = "'a'";
    num[1] = "'x'";
    num[4] = "'@'";
    num[6] = "''";
    num[7] = "'+'";
    num[8] = "'Q'";
    
    for (int i = 0; i<10; i++){
      System.out.println("Número " + i + ": " + num[i]);
    }
  }      
}
