package vehiculos;

/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra
 * a continuación:
 * 
 * @author Rafael López | RafaLpeC
 *
 */
public class Coche extends Vehiculo{
	private String marca;

	/**
	 * @param vehiculosCreados
	 * @param kilometrosTotales
	 * @param kilometrosRecorridos
	 * @param marca
	 */
	public Coche(String marca) {
		super();//
		setMarca(marca);
	}

	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public String quemaRueda() {
		return "Rumruuuummrurururuurummmm";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coche [getMarca()=" + getMarca() + "]" + super.toString();
	}
}
