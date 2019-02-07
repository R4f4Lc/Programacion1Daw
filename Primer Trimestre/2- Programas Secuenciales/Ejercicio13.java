//Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica. PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿cómo se puede calcular?

class Ejercicio13{
	public static void main(String[] args){
    double a;
    double raiz2;
    double raiz3;   
    
    //Preguntamos valor
    System.out.print("Dame el valor a: ");
    a = Double.parseDouble(System.console().readLine());
    
    //Calculamos la raiz cuadrada y cubica
    raiz2 = Math.sqrt(a);
    raiz3 = Math.pow(a,(1))/3;
    
    //Mostramos por pantalla
    System.out.print("La raiz cuadrada positiva es " + raiz2);
    System.out.print("\nLa raiz cubica es " + raiz3);  
	}
}
