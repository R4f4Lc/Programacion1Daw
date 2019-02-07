/**
Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se basa en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la tabla:

ZONA	UBICACIÓN	COSTO/GRAMO
1	América del Norte	24.00 euros
2	América Central	20.00 euros
3	América del Sur	21.00 euros
4	Europa	10.00 euros
5	Asia	18.00 euros
Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones de logística y de seguridad. 
Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.

author: Rafael López Cruz
*/ 

public class Ejercicio20 { 
	public static void main (String[] args) {
		String linea;
		
		System.out.println("America del Norte: 1"); 
		System.out.println("America Central: 2"); 
		System.out.println("America del Sur: 3");
		System.out.println("Europa: 4");
		System.out.println("Asia: 5");
	
		//Pedimos la zona y peso del paquete
		System.out.print("Introduce a que zona va dirigido el paquete con el numero de zona correspondiente ");
		int zona = Integer.parseInt(System.console().readLine()); 
		
		System.out.print("Introduce el peso del paquete en gramos ");
		double peso = Double.parseDouble(System.console().readLine()); 
		
		//Comprobamos si la zona está en el rango y si no sale zona invalida
		
		if (zona>5 && zona<1) {
				System.out.print("Solo hay cinco zonas(1-5)");
			} else {
				if (peso>5000) {
				System.out.print("Los paquetes de mas de 5000 gramos o 5 kg no se pueden transportar");
			}
			}
		
		switch (zona) { 
			case 1:
			System.out.print("El cobro por el paquete es de " + (peso*24) + " euros");
			break; 
			
			case 2:
			System.out.print("El cobro por el paquete es de " + (peso*20) + " euros");
			break;
			
			case 3:
			System.out.print("El cobro por el paquete es de " + (peso*21) + " euros");
			break;
			
			case 4:
			System.out.print("El cobro por el paquete es de " + (peso*10) + " euros");
			break;
			
			case 5:
			System.out.print("El cobro por el paquete es de " + (peso*18) + " euros");
			break;
		}
	}
}
