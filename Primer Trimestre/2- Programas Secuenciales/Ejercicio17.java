//Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. 
//El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
//Escribir un algoritmo que determine la hora de llegada a la ciudad B.

class Ejercicio17{
	public static void main(String[] args){
    int h;
    int min;
    int seg;
    int seg2;
    int horallegada;
    int minllegada;
    int segllegada;
    int segfinal;
    
    //Preguntamos por pantalla
    System.out.print("Dime la hora de salida: ");
    h = Integer.parseInt(System.console().readLine());
    
    System.out.print("Dime los minutos de salida: ");
    min = Integer.parseInt(System.console().readLine());
    
    System.out.print("Dime los segundos de salida ");
    seg = Integer.parseInt(System.console().readLine());

    System.out.print("Dime los segundos de llegada ");
    seg2 = Integer.parseInt(System.console().readLine());
    
    //Calculamos la hora
    h = h*3600;
    min = min*60;
    segfinal = (h+min+seg) + seg2;
    horallegada = segfinal/3600;
    minllegada = (((h+min+seg)+ seg2)%3600)/60;
    segllegada = (((h+min+seg) + seg2)%3600)%60;
    
    //Mostramos por pantalla
    System.out.print("El coche llegara a la ciudad 2 en " +  horallegada + ":" + minllegada +":" + segllegada);

	}
}
