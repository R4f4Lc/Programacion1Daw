/**
Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
circunferencias y las clasifique en uno de estos estados:

exteriores
tangentes exteriores
secantes
tangentes interiores
interiores
concéntricas

author: Rafael López Cruz
*/ 

public class Ejercicio10 {
	public static void main (String[] args) {
		String linea;
		
		//Pedimos los valores
		System.out.print("Introduce la coordenada x de la primera circunfrencia ");
		int x1 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la coordenada y de la primera circunfrencia ");
		int y1 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la coordenada x de la segunda circunfrencia ");
		int x2 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la coordenada y de la segunda circunfrencia ");
		int y2 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce el radio de la primera circunfrencia ");
		int r1 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce el radio de la segunda circunfrencia ");
		int r2 = Integer.parseInt(System.console().readLine());
		
		//Calculamos la distancia y segun sea el resultado comparamos con las
		//diferentes comparaciones para averriguar si es exterior, etc...
		
		double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		
		if (distancia>r1+r2) {
			System.out.println("La circunferencia es exterior");
		}
		if (distancia==r1+r2) {
			System.out.println("La circunferencia es tangente exterior");
		} 
	 
		if (distancia<r1+r2 && distancia>Math.abs(r1 - r2)) {
			System.out.println("La circunferencia es secante");
		} 
		if (distancia==Math.abs(r1-r2)) {
			System.out.println("La circunferencia es tangente interior");
		} 
		if (distancia>0 && distancia<Math.abs(r1 - r2)) {
			System.out.println("La circunferencia es interior");
		} 
		if (distancia==0) {
			System.out.println("La circunferencia es concentrica");
		} 
	}
} 
