/**
La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos. 
Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.

author: Rafael López Cruz
*/ 

public class Ejercicio16 { 
	public static void main (String[] args) {
		String linea;
	
		//Se pide la cantidad de alumnos correspondiente 
		System.out.print("Minutos hablados: ");
		int minutos = Integer.parseInt(System.console().readLine()); 
		
		System.out.print("Dia de la llamada(lunes a domingo): ");
		String dia = System.console().readLine(); 
		
		System.out.print("Llamada de temprano o tarde: ");
		String turno = System.console().readLine(); 
		
		//Comprobamos la duracion de llamada y si es domingo
		//En caso de que sea domingo calculará su precio si es de temprano
		//o tarde. Si es diferente de domingo calculará el precio normal.
		if (minutos>=5 && minutos<8 && dia.equals("domingo")) {
			System.out.println("Se debera pagar " + (1+0.03) + " euros");
		} else {
			if (minutos>=5 && minutos<8 && dia!="domingo" && turno.equals("temprano")) { 
				System.out.println("Se debera pagar " + (1+0.15) + " euros");
			} else {
				if (minutos>=5 && minutos<8 && dia!="domingo" && turno.equals("tarde")) {
			System.out.println("Se debera pagar " + (1+0.10) + " euros");
		}	
		}
		}
		if (minutos>=8 && minutos<10 && dia.equals("domingo")) {
			System.out.println("Se debera pagar " + (1+0.03+0.80) + " euros");
		} else {
			if (minutos>=8 && minutos<10 && dia!="domingo" && turno.equals("temprano")) {
			System.out.println("Se debera pagar " + (1+0.15+0.80) + " euros");
			} else {
				if (minutos>=8 && minutos<10 && dia!="domingo" && turno.equals("tarde")) {
			System.out.println("Se debera pagar " + (1+0.10+0.80) + " euros");
		}	
		}
		}
		if (minutos>=10 && minutos<11 && dia.equals("domingo")) {
			System.out.println("Se debera pagar " + (1+0.03+0.80+0.70) + " euros");
		} else {
			if (minutos>=10 && minutos<11 && dia!="domingo" && turno.equals("temprano")) {
			System.out.println("Se debera pagar " + (1+0.15+0.80+0.70) + " euros");
			} else {
				if (minutos>=10 && minutos<11 && dia!="domingo" && turno.equals("tarde")) {
			System.out.println("Se debera pagar " + (1+0.10+0.80+0.70) + " euros");
		}	
		}
		}
		if (minutos>11 && dia.equals("domingo")) {
			System.out.println("Se debera pagar " + (1+0.03+0.80+0.70+0.50) + " euros");
		} else {
			if (minutos>11 && dia!="domingo" && turno.equals("temprano")) {
			System.out.println("Se debera pagar " + (1+0.15+0.80+0.70+0.50) + " euros");
			} else {
				if (minutos>11 && dia!="domingo" && turno.equals("tarde")) {
			System.out.println("Se debera pagar " + (1+0.10+0.80+0.70+0.50) + " euros");
		}	
		}
		}
	}	
}
