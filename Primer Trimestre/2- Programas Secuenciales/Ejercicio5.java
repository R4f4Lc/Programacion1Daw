//Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
class Ejercicio5{
	public static void main(String[] args){
    double a;
    double b;
    
    //Preguntamos el valor de fahrenheit
    System.out.print("Dime el valor en fahrenheit: ");
    a = Double.parseDouble(System.console().readLine());
    
    //Calculamos
    b = (a-32)/1.8;
    
    //Mostramos por pantalla
		System.out.print("El valor proporcionado en grados centigrados es " + b);
	}
}
