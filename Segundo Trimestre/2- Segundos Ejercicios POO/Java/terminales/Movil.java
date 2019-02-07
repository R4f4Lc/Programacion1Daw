/**
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
 * que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
 * 30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
 * cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
 * llamada. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
 * decimales, puedes utilizar DecimalFormat.
 * 
 * @author Rafael López | RafaLpeC
 */
package terminales;
import java.text.DecimalFormat;
public class Movil extends Terminal{
	/**
	 * Definición de formato del DecimalFormat para todos los moviles
	 */
	private static String pattern = "###.##";
	/**
	 * Definición de DecimalFormat para todos los moviles
	 */
	private static DecimalFormat decimalFormat = new DecimalFormat(pattern);

	
	/**
	 * Definición del atributo tarifa
	 */
	private String tarifa;
	
	/**
	 * @param tarifa
	 */
	public Movil(String numero, String tarifa) {
		super(numero);
		setTarifa(tarifa);
	}

//	/**
//	 * @return the tarifa
//	 */
//	private String getTarifa() {
//		return tarifa;
//	}

	/**
	 * @param tarifa the tarifa to set
	 */
	private void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
	
//	private double calculaTarifa1() {
//		double mins = this.getSegundos()/60;
//		double total = 0.00;
//		if (mins == 0) 
//			return total;
//		
//		if(tarifa == "rata")
//			total += mins * 0.06;
//			
//		else if(tarifa == "mono")
//			total += mins * 0.12;
//		
//		else if(tarifa == "bisonte")
//			total += mins * 0.30;
//
//		return total;
//	}
	
	/**
	 * Calcula el precio según la tarifa y lo devuelve
	 * @return total;
	 */
	private double calculaTarifa() {
		double mins = this.getSegundos()/60;
		
		if (mins == 0)
			return 0;
		
		if(tarifa.equalsIgnoreCase("rata"))
			return mins * 0.06;
			
		if(tarifa.equalsIgnoreCase("mono"))
			return mins * 0.12;
		
		if(tarifa.equalsIgnoreCase("bisonte"))
			return mins * 0.30;
		return 0;

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " - tarificados " + decimalFormat.format(calculaTarifa()) + " euros";
	}
}