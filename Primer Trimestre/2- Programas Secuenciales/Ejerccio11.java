//Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

class Ejercicio11{
	public static void main(String[] args){
    double a;
    double b;
    double distancia;
    //Preguntamos el valor
    System.out.print("Dame el valor a: ");
    a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor b: ");
    b = Double.parseDouble(System.console().readLine());
    
    //calculamos la distancia
    distancia =  Math.abs(a-b);
    
    //mostramos por pantalla la distancia
    System.out.print("La distancia es de " + distancia);

	}
}
