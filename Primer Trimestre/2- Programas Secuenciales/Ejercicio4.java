//Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
class Ejercicio4{
	public static void main(String[] args){
    double a;
    double b;
    
    //Preguntamos el valor de los numeros
    System.out.print("Dame el valor a: ");
    a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor b: ");
    b = Double.parseDouble(System.console().readLine());
    
    //Calculamos y mostramos por pantalla
		System.out.print("La suma es igual a " + (a+b));
    System.out.print("\nLa resta es igual a " + (a-b));
    System.out.print("\nLa división es igual a " + (a/b));
    System.out.print("\nLa multiplicación es igual a " + (a*b));
	}
}
