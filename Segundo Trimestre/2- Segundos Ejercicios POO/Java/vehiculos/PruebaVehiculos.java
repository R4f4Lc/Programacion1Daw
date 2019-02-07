/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreadosy kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación:
 * 
 * @author Rafael López | RafaLpeC
 *
 */
package vehiculos;
import java.util.Scanner;
public class PruebaVehiculos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int salir = 0;
		double km;
		Bicicleta biciRoja= new Bicicleta("ciudad");
		Coche cocheMini = new Coche("seat");
		System.out.println(biciRoja.toString());
		System.out.println(cocheMini.toString());
		do {
			mostrarMenu();
			int opcion = s.nextInt();
			switch(opcion){				
			case 1:
				andar(s, biciRoja);
				break;
			case 2:
				System.out.println(biciRoja.arre("si"));
				break;
			case 3:
				andar(s, cocheMini);
				break;
			case 4:
				System.out.println(cocheMini.quemaRueda());
				break;
			case 5:
				System.out.println("La bicicleta tiene un total de " + biciRoja.getKilometrosRecorridos() + " kilometros.");
				break;
			case 6:
				System.out.println("El coche tiene un total de " + cocheMini.getKilometrosRecorridos() + " kilometros.");
				break;
			case 7:
				System.out.println("Los dos vehiculos han recorrido un total de " + (biciRoja.getKilometrosTotales()) + " kilometros.");
				break;
			case 8:
				salir = 1;
			}
		}while(salir == 0);
		
	}

	private static void andar(Scanner s, Vehiculo vehiculo) {
		double km;
		System.out.println("¿Cuántos kilometros quieres andar con el " + vehiculo.getClass().getSimpleName()+"?");
		km = s.nextDouble();
		vehiculo.andar(km);
		System.out.println("El vehiculo ha andando " + km + " kilometros");
		System.out.println(vehiculo);
	}
	

	private static void mostrarMenu() {
		System.out.println("VEHICULOS:");
		System.out.println("1. Anda con la bicicleta");
		System.out.println("2. Haz el caballito con la bicicleta. ");
		System.out.println("3. Anda con el coche.");
		System.out.println("4. Quema rueda con el coche.");
		System.out.println("5. Ver kilometraje de la bicicleta. ");
		System.out.println("6. Ver kilometraje del coche.");
		System.out.println("7. Ver kilometraje total.");
		System.out.println("8. Salir");
		System.out.println("Elige una opción: (1-8) ");
	}
}
