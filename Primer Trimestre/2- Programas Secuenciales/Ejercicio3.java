//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa
class Ejercicio3{
	public static void main(String[] args){
    double a;
    double b;
    double c;
    
    //Preguntamos el valor de los catetos
    System.out.print("Dame el valor a del cateto ");
    a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor b del cateto ");
    b = Double.parseDouble(System.console().readLine());
		
    
    //Calculamos el valor del cateto
    c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    
    //Mostramos por pantalla
    System.out.print("La hipotenusa es igual a " + c);
	}
}
