/**
 * Circulo.java
 * 
 * Crea la clase círculo en Java que responda al siguiente comportamiento:
 * Un círculo puede crecer. Aumenta su radio.
 * Un círculo puede menguar. Decrementa su radio.
 * Un círculo me devuelve su area si se la pido.
 * Un círculo me dice su estado, por ejemplo Soy un circulo de radio 0.5 metros. Ocupo un area de 0.7853981633974483 metros cuadrados (metodo toString())
 * 
 * @author Rafael López | RafaLpeC
 *
 */
import java.lang.Math;
import javax.swing.*;

public class Circulo {
	/**
	 * Radio del círculo
	 */
	public double radio;

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		// super();
		this.radio = Math.abs(radio);
	}

//	/**
//	 * Checkea el radio si es igual o menor a 0 y en tal caso muestra un mensaje por
//	 * pantalla gráfico.
//	 */
//	private void checkradio() {
//		if (radio == 0 || radio < 0) {
//			JOptionPane.showMessageDialog(null, "Soy un mísero punto sin área");
//		}
//	}

	/**
	 * Incrementa el radio del Círculo
	 * 
	 * @param inc Valor a incrementar
	 */
	public void crecer(double inc) {
		// this.radio = this.radio + Math.abs(inc);
		setRadio(radio+Math.abs(inc));
		//radio += Math.abs(inc);
		//this.checkradio();
	}

	/**
	 * Decrementa el radio del Círculo
	 * 
	 * @param inc Valor a decrementar
	 */

	public void menguar(double dec) {
		// this.radio = this.radio - Math.abs(dec);
		setRadio(radio-Math.abs(dec));
		//radio -= Math.abs(dec);
		//this.checkradio();
	}

	private void setRadio(double i) {
		if (i < 0)
			i = 0;

		radio = i;
		checkPunto();
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void checkPunto() {
		if (radio == 0)
			JOptionPane.showMessageDialog(null, "Soy un mísero punto sin área");

	}

	public double getArea() {

		return Math.PI * Math.pow(this.radio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getArea()=" + getArea() + "]";
	}

//	 
//	 String crece;
//	 
//	 Circulo (double c){
//		 this.radio = Math.abs(c);
//	 }
//	 
//	 void crecer (String e){
//		 this.crece = e;
//	 }
//	 
//	 
//	 public String toString(double cr) {
//		if (this.radio == 0) {
//			return null;
//		}
//		else {
//		if(this.crece == "a") {
//			Double a = Math.PI*Math.pow((this.radio*cr),2);
//			return "Soy un circulo de radio "+ this.radio*cr +" metros. " + "Ocupo un área de " + a + " metros cuadrados";
//		}
//		
//		else if (this.crece == "d"){
//			Double a = Math.PI*Math.pow((this.radio/cr),2);
//			return "Soy un circulo de radio "+ cr/this.radio +" metros. " + "Ocupo un área de " + a + " metros cuadrados";
//		}
//		
//		else {
//			Double a = Math.PI*Math.pow((this.radio),2);
//			return "Soy un circulo de radio "+ this.radio +" metros. " + "Ocupo un área de " + a + " metros cuadrados";		
//		}
//		
//		}
//	}
}
