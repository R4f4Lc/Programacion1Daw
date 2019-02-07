/**
La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo A, 
se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.

author: Rafael López Cruz
*/ 

public class Ejercicio14 { 
	public static void main (String[] args) {
		String linea;
	
		//Pedimos el valor 
		System.out.print("Precio inicial de la uva: ");
		double precioinicial = Double.parseDouble(System.console().readLine()); 
		
		System.out.print("Tipo de uva(A/B): ");
		String tipo = System.console().readLine();
		
		System.out.print("Tamaño de la uva(1/2): ");
		String tamanio = System.console().readLine();
		
		//Ahora se realizan los cálculos y se muestran los resultados
		
		if (tipo.equals("A") && tamanio.equals("1")) {
			System.out.println("El precio total es de " + (precioinicial + 0.20) + " euros");
		} else {
			if (tipo.equals("A") && tamanio.equals("2")) {
			System.out.println("El precio total es de " + (precioinicial + 0.30) + " euros");
			} else {
				if (tipo.equals("B") && tamanio.equals("1")) {
			System.out.println("El precio total es de " + (precioinicial - 0.30) + " euros");
			} else {
				if (tipo.equals("B") && tamanio.equals("2")) {
			System.out.println("El precio total es de " + (precioinicial - 0.50) + " euros");
		}
		}
		}
		}
	}
}
