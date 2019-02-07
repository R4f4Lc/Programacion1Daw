//Escribir un algoritmo para calcular la nota final de un estudiante, 
//considerando que por cada respuesta correcta 5 puntos, por una incorrecta -1
//y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.

class Ejercicio19{
	public static void main(String[] args){
    double correcta;
    double incorrecta;
    double blanco;
    double resultado;
    //preguntamos el valor de las variables
    System.out.print("Cuantas preguntas tiene correctas: ");
    correcta = Double.parseDouble(System.console().readLine());
    
    System.out.print("Cuantas preguntas tiene incorrectas: ");
    incorrecta = Double.parseDouble(System.console().readLine());
    
    System.out.print("Cuantas preguntas tiene en blanco: ");
    blanco = Double.parseDouble(System.console().readLine());
    //calculamos
    correcta = correcta * 5;
    incorrecta  =  incorrecta * (-1);
    blanco  =  blanco * 0;
    resultado  =  correcta + incorrecta + blanco;
    //mostramos por pantalla
    System.out.print("El resultado del alumno es de un " + resultado);

	}
}
