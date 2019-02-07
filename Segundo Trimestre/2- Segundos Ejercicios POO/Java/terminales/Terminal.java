/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los 
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla.
 * 
 * @author Rafael López | RafaLpeC
 */

package terminales;

public class Terminal {
	private String numero;
	/**
	 * Número de segundos acumulados de cada una de las llamadas entre terminales
	 */
	private double segundos;
	/**
	 * @param numero
	 */
	public Terminal(String numero) {
		setNumero(numero);
		setSegundos(0);
	}
	
	/**
	 * @return the numero
	 */
	String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	private void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the segundos
	 */
	double getSegundos() {
		return segundos;
	}
	/**
	 * Incrementa los segundos de cada terminal
	 * @param segundos the segundos to set
	 */
	private void setSegundos(double segundos) {
		this.segundos += segundos;
	}
	
	public void llama(Terminal t2, double segundos) {
		this.setSegundos(segundos);

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nº " + getNumero() + " - " + getSegundos() + "s de conversación";
	}
}
