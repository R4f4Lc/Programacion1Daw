//Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde

class Ejercicio7{
	public static void main(String[] args){
    double mins;
    double hora;
    
    //Preguntamos minutos
    System.out.print("Dime los minutos: ");
    mins = Double.parseDouble(System.console().readLine());
		
    //Calculamos horas
    hora = mins/60;
    
    //Mostramos por pantalla
    System.out.print("Son un total de " + hora + " horas");
	}
}
