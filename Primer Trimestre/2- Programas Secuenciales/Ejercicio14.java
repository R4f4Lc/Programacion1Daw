//Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido.
class Ejercicio14{
	public static void main(String[] args){
    int a;
    int decenas;
    int unidades;
    int invertido;
    
    //Preguntamos el valor
    System.out.print("Dime el número ");
    a = Integer.parseInt(System.console().readLine());
    
    //Calculamos el numero invertido
		decenas = (a/10);
    
    unidades = a % 10;
    
    invertido = (10*unidades) + decenas;
    
    //Mostramos por pantalla el numero invertido
    System.out.print("El número invertido es " + invertido);
	}
}
