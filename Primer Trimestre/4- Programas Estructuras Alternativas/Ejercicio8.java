//Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
//mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
//dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
//imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’
//@author: Rafael López Cruz

public class Ejercicio8 {
	public static void main (String[] args) {
		String linea;
		
		//Se piden los valores 
		System.out.print("Indica la edad correspondiente ");
		int edad = Integer.parseInt(System.console().readLine());
		
		System.out.print("Indica la nota obtenida ");
		int nota = Integer.parseInt(System.console().readLine());
		
		System.out.print("Indica el sexo al que se pertenece con H o M en este caso ");
		String sexo = System.console().readLine();
		
		//Ahora se realizan los cálculos y se muestran los resultados
		if (nota>=5 && edad>=18) {
			if (sexo.toUpperCase().equals("H")) {
			System.out.println("ACEPTADA");
		} else {
			if (sexo.toUpperCase().equals("M")) {
			System.out.println("POSIBLE");
		} 
		} 
		} else { 
			System.out.println("NO ACEPTADA");
		}
	}
}

