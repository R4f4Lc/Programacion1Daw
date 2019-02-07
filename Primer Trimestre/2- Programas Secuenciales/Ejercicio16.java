//Dos vehículos viajan a diferentes velocidades (v1 y v2) 
//y están distanciados por una distancia d. El que está 
//detrás viaja a una velocidad mayor. Se pide hacer un 
//algoritmo para ingresar la distancia entre los dos vehículos (km) 
//y sus respectivas velocidades (km/h) y con esto determinar y mostrar
//en que tiempo (minutos) alcanzará el vehículo más rápido al otro.

class Ejercicio16{
	public static void main(String[] args){
    double v1;
    double v2;
    double d;
    double minuto;
    
    //Preguntamos los valores
    System.out.print("Dime la velocidad del vehiculo 1: ");
    v1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dime la velocidad del vehiculo 2: ");
    v2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dime el valor de la distancia entre el v1 y v2: ");
    d = Double.parseDouble(System.console().readLine());
    
    //Calculamos la distancia y en cuantos minutos lo alcanzara
    d = Math.abs(d/(v1-v2));
    minuto = d * 60;
    
    //Mostramos por pantalla
    System.out.print("El coche v1 alcanzara al v2 en  " + minuto + " minutos");

	}
}
