//Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
//el vendedor desea saber cuanto dinero obtendrá por concepto 
//de comisiones por las tres ventas que realiza en el mes y el 
//total que recibirá en el mes tomando en cuenta su sueldo base 
//y comisiones.

class Ejercicio8{
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
    media = (a*0.10)+(b*0.10)+(c*0.10);
    
    
    //Calculamos los valores de las ventas y mostramos por pantalla
    System.out.print("La comision de la primera venta es " + (a*0.10));
    System.out.print("\nLa comision de la segunda venta es " + (b*0.10));
    System.out.print("\nLa comision de la tercera venta es " + (c*0.10));
    System.out.print("\nLa media es igual a " + media);
	}
}
