//Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
//* 55% del promedio de sus tres calificaciones parciales.
//* 30% de la calificación del examen final.
//* 15% de la calificación de un trabajo final.
class Ejercicio10{
	public static void main(String[] args){
    double cali1;
    double cali2;
    double cali3;
    double exam;
    double trabajo;
    double media;    
    
    //Preguntamos valor de las calificaciones    
    System.out.print("Dame el valor de la primera calificacion: ");
    cali1 = Double.parseDouble(System.console().readLine());

    System.out.print("Dame el valor de la segunda calificacion: ");
    cali2 = Double.parseDouble(System.console().readLine());

    System.out.print("Dame el valor de la tercera calificacion: ");
    cali3 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor del examen: ");
    exam = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dame el valor del trabajo final: ");
    trabajo = Double.parseDouble(System.console().readLine());
    
    
    //Calculamos media    
    media = ((cali1+cali2+cali3)/3)*0.55+(exam*0.30)+(trabajo*0.15);
    
    //Mostramos por pantalla la media
    System.out.print("La media es un " + media);
  
	}
}
