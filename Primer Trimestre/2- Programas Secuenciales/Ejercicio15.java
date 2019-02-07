//Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.

class Ejercicio15{
	public static void main(String[] args){
    double a;
    double b;
    double c;
    
    //Preguntamos el valor
    System.out.print("Dame el valor a: ");
    a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor b: ");
    b = Double.parseDouble(System.console().readLine());
    
    //Cambiamos los valores de las variables con una tercera
    c = a;
    a = b;
    b = c;
    
    //Mostramos por pantalla los numeros invertidos
    System.out.print("El nuevo valor de a es " + a);
    System.out.print("\nEl nuevo valor de b es " + b);
	}
}
