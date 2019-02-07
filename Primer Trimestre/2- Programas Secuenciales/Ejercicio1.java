//Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
class Ejercicio1{
	public static void main(String[] args){
    String nombre;
    //preguntamos nombre
    System.out.print("Dime tu nombre: ");
    nombre = System.console().readLine();
    //imprimimos nombre
		System.out.print("Hola " + nombre);
	}
}
