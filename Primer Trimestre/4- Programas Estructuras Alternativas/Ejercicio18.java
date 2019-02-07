/**
Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.

author: Rafael López Cruz
*/ 

public class Ejercicio18 { 
	public static void main (String[] args) {
		String linea;
	
		//Pedimos el numero  
		System.out.print("Introduce un numero ");
		int num = Integer.parseInt(System.console().readLine()); 
		
		//Ahora se realizan los cálculos y se muestran los resultados 
		
		switch (num) { 
			case 1:
			System.out.print("Es lunes");
			break;
			
			case 2:
			System.out.print("Es martes");
			break;
			
			case 3:
			System.out.print("Es miercoles");
			break;
			
			case 4:
			System.out.print("Es jueves");
			break;
			
			case 5:
			System.out.print("Es viernes");
			break;
			
			case 6:
			System.out.print("Es sabado");
			break;
			
			case 7:
			System.out.print("Es domingo");
			break;
			
			default:
				System.out.print("Introduce un dia entre lunes a domingo");
		}
	}
}
