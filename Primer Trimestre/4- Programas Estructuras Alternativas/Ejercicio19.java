/**
Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.

author: Rafael López Cruz
*/ 

public class Ejercicio19 { 
	public static void main (String[] args) {
		String linea;
	
		//Pedimos el numero  
		System.out.print("Introduce un numero ");
		int num = Integer.parseInt(System.console().readLine()); 
		
		//Comprobamos los diferentes case 
		switch (num) { 
			case 1:
				System.out.print("Este mes tiene 31 dias");
				break;
			case 3:
				System.out.print("Este mes tiene 31 dias");
				break;			
			case 5:
				System.out.print("Este mes tiene 31 dias");
				break;			
			case 7:
				System.out.print("Este mes tiene 31 dias");
				break;			
			case 8:
				System.out.print("Este mes tiene 31 dias");
				break;			
			case 10:
				System.out.print("Este mes tiene 31 dias");
				break;			
			case 12:
				System.out.print("Este mes tiene 31 dias");
				break;			
			case 4:
				System.out.print("Este mes tiene 30 dias");
				break;				
			case 6:
				System.out.print("Este mes tiene 30 dias");
				break;	
			case 9:
				System.out.print("Este mes tiene 30 dias");
				break;	
			case 11:
				System.out.print("Este mes tiene 30 dias");
				break;
			case 2:
				System.out.print("Este mes 28 dias y cuando es bisiesto tiene 29 dias");
				break;
			default:
				System.out.print("Introduce un mes que sea correcto!");
		}
	}
}
