package vehiculos;

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
public class Bicicleta extends Vehiculo {
	private String caballito;
	private String tipo;

	/**
	 * @param vehiculosCreados
	 * @param kilometrosTotales
	 * @param kilometrosRecorridos
	 * @param caballito
	 */
	public Bicicleta(String tipo) {
		this.tipo = tipo;
		caballito = "no";
	}

	public String arre(String valor) {
		this.caballito = valor;
		
		if (caballito == "si")
			return "La bicicleta está haciendo el caballito";

		return "La bicicleta no está haciendo el caballito";

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bicicleta [caballito=" + caballito + ", tipo=" + tipo + "]"+super.toString();
	}
	
}
