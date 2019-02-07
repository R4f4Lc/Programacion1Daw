//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.

class Ejercicio9{
	public static void main(String[] args){
    double compra;
    double media;
    
    //Preguntamos valor
    System.out.print("Dame el valor de la compra: ");
    compra = Double.parseDouble(System.console().readLine());
    
    //Calculamos media
    media = compra * 0.85;
    
    //Mostramos por pantalla
    System.out.print("El cliente debera pagar un total de " + media + " euros");
  
	}
}
