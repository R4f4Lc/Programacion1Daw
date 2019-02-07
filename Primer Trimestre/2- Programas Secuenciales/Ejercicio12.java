//Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.

class Ejercicio12{
	public static void main(String[] args){
    double x1;
    double x2;
    double y1;
    double y2;
    double media;    
    
    //Preguntamos los valores
    System.out.print("Dame el valor x1: ");
    x1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor x2: ");
    x2 = Double.parseDouble(System.console().readLine());
		
    System.out.print("Dame el valor y1: ");
    y1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor y2: ");
    y2 = Double.parseDouble(System.console().readLine());
    
    //Calculamos la raiz
    media = Math.abs(Math.sqrt((Math.pow((x1-x2),2) + Math.pow((y1-y2),2))));
    
    //Mostramos por pantalla
    System.out.print("La distancia es de " + media);
	}
}
