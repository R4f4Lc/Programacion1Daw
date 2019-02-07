// Calcular la media de tres números pedidos por teclado

class Ejercicio6{
	public static void main(String[] args){
    double a;
    double b;
    double c;
    double media;
    
    //Preguntamos valor
    System.out.print("Dame el valor a: ");
    a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor b: ");
    b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor c: ");
    c = Double.parseDouble(System.console().readLine());
    
    //Calculamos media
    media = (a+b+c)/3;
    
    //Mostramos por pantalla
    System.out.print("La media es igual a " + media);

	}
}
