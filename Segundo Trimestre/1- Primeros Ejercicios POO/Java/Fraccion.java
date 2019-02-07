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


import java.lang.Math;
public class Fraccion {
	public double numerador, denominador, fraccion;

	/**
	 * @param numerador
	 * @param denominador
	 */
	public Fraccion(double num, double den) {
		this.numerador = Math.abs(num);
		this.denominador = Math.abs(den);
		this.fraccion = this.numerador/this.denominador;
	}
	
	public Double getFraccion(){
		if (this.denominador == 0.0) {
			return null;
		}
		else {
			return this.fraccion;
		}
	}
	
	public double getNum() {
		return this.numerador;
	}
	
	public double getDen() {
		return this.denominador;
	}
	
	public double MultiplicaNum(double num) {
		return (Math.abs(num)*this.numerador)/this.denominador;
	}
	
	public double MultiplicaFrac(Fraccion frac2) {
		return (this.numerador * frac2.numerador)/(this.denominador*frac2.denominador);
	}
	
	private Double mcm(Double num1, Double num2) {
		double multiplo;
		if (num1>num2)
            multiplo=num1;
        else
            multiplo=num2;
        
        while (multiplo%num1!=0 || multiplo%num2!=0)
            multiplo++;
		return multiplo;
	}
	
	public double SumaFrac(Fraccion frac2) {
		double multiplo = mcm(this.denominador, frac2.denominador);
		return (((multiplo/this.denominador)*this.numerador)+((multiplo/frac2.denominador)*frac2.numerador))/multiplo;
	}
	
	public double RestarFrac(Fraccion frac2) {
		double multiplo = mcm(this.denominador, frac2.denominador);
		return (((multiplo/this.denominador)*this.numerador)-((multiplo/frac2.denominador)*frac2.numerador))/multiplo;
	}
	
	public String simplificar() {
		double multiplo = mcm(this.numerador, this.denominador);
		return "La fracción simplicada es " + this.numerador/multiplo +  "/" +  this.denominador/multiplo;
	}
	
}