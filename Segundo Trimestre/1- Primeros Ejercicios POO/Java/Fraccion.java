/**
* Fraccion.java 
* Crea una clase Fraccion (en Java yPython) de forma que podamos hacer las siguientes operaciones:
* Contruir un objeto Fraccion pasándole al constructor el numerador y el denominador.
* Obtener la fracción.
* Obtener y modificar numerador y denominador. No se puede dividir por cero.
* Obtener resultado de la fracción (número real).
* Multiplicar la fracción por un número.
* Multiplicar, sumar y restar fracciones.
* Simplificar la fracción.
* 
* @author Rafael López | RafaLpeC
*/

public class Fraccion {
	private double numerador, denominador;

	/**
	 * @param numerador
	 * @param denominador
	 * Definición del constructor que llama al setNumerador y setDenominador
	 */
	public Fraccion(double num, double den) {
		setNumerador(num);
		setDenominador(den);
	}
	
	/**
	 * @param num
	 * Asignamos un valor a numerador
	 */
	public void setNumerador(double num) {
		numerador = num;
	}

	/**
	 * @return
	 * Devolvemos el valor del numerador
	 */
	public double getNumerador() {
		return numerador;
	}

	/**
	 * @param den
	 * @return
	 * Checkea que el denominador no sea 0 en tal caso devuelve true si es 0 y si no devuelve false
	 */
	public static boolean checkDenominador(double den) {
		if(den==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @param den
	 * Asignamos el valor a denominador
	 */
	public void setDenominador(double den) {
		denominador = den;
	}
	

	/**
	 * @return
	 * Devolvemos el valor de denominador
	 */
	public double getDenominador() {
		return denominador;
	}	
	
	/**
	 * @return
	 * Devolvemos el resultado de la fracción
	 */
	public double getResultado(){
		return numerador/denominador;
		}
	
	/**
	 * @param num
	 * @return
	 * Devolvemos la múltiplicación del número
	 */
	public double MultiplicaNum(double num) {
		return (num*numerador)/denominador;
	}
	
	/**
	 * @param num1
	 * @param num2
	 * @return
	 * Calcula el mínimo común múltiplo
	 */
	private double mcm(double num1, double num2) {
		double multiplo;
		if (num1>num2)
            multiplo=num1;
        else
            multiplo=num2;
        
        while (multiplo%num1!=0 || multiplo%num2!=0)
            multiplo++;
		return multiplo;
	}
	
	/**
	 * @param frac2
	 * @return
	 * Sumamos dos fracciones
	 */
	public double SumaFrac(Fraccion frac2) {
		double multiplo = mcm(this.denominador, frac2.denominador);
		return (((multiplo/this.denominador)*this.numerador)+((multiplo/frac2.denominador)*frac2.numerador))/multiplo;
	}
	
	/**
	 * @param frac2
	 * @return
	 * Restamos dos fracciones
	 */
	public double RestarFrac(Fraccion frac2) {
		double multiplo = mcm(this.denominador, frac2.denominador);
		return (((multiplo/this.denominador)*this.numerador)-((multiplo/frac2.denominador)*frac2.numerador))/multiplo;
	}
	
	/**
	 * @param frac2
	 * @return
	 * Multiplicamos dos fracciones
	 */
	public double MultiplicaFrac(Fraccion frac2) {
		return (this.numerador * frac2.numerador)/(this.denominador*frac2.denominador);
	}
	
	/**
	 * @return
	 * Simplificamos las fracciones
	 */
	public String simplificar() {
		double multiplo = mcm(numerador, denominador);
		return numerador/multiplo +  "/" +  denominador/multiplo;
	}
}