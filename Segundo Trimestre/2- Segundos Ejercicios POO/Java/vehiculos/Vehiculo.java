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
public class Vehiculo {
	private static int contadorVehiculos;
	private static double kilometrosTotales = 0;
	
	/**
	 * Total de kilómetros recorridos por cada uno de los vehículos creados
	 */
	private double kilometrosRecorridos;
	
	
	/**
	 * @param vehiculosCreados
	 * @param kilometrosTotales
	 * @param kilometrosRecorridos
	 */
	public Vehiculo() {
		kilometrosRecorridos = 0;
		Vehiculo.contadorVehiculos++;
	}

	/**
	 * @return the vehiculosCreados
	 */
	public double getVehiculosCreados() {
		return contadorVehiculos;
	}
	
	/**
	 * Incrementa los kilometros totales de todos los vehiculos.
	 * @param km
	 */
	private void setKilometrosTotales(double km) {
		Vehiculo.kilometrosTotales += km;
	}
	
	/**
	 * @return the kilometrosTotales
	 */
	public double getKilometrosTotales() {
		return kilometrosTotales;
	}

	/**
	 * @return the kilometrosRecorridos
	 */
	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	/**
	 * @param kilometrosRecorridos the kilometrosRecorridos to set
	 */
	 void setKilometrosRecorridos(double kilometros) {
		this.kilometrosRecorridos = this.getKilometrosRecorridos() + kilometros;
//		Vehiculo.kilometrosTotales += kilometros;
		setKilometrosTotales(kilometros);
	}
	
	public void andar(double km) {
		setKilometrosRecorridos(km);
		//setKilometrosTotales(km);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [getVehiculosCreados()=" + getVehiculosCreados() + ", getKilometrosTotales()="
				+ getKilometrosTotales() + ", getKilometrosRecorridos()=" + getKilometrosRecorridos() + "]";
	}
	
}
