//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa
public class Ejercicio2 { 

public static void main(String[] args) {
  int basetri;
  int alturatri;
  int perimetro;
  int area;

  //Preguntamos el valor de base y altura
  System.out.print("Dame la base del rectangulo: ");
  basetri = Integer.parseInt(System.console().readLine());

  System.out.print("Dame la altura del rectangulo: ");
  alturatri = Integer.parseInt(System.console().readLine());


  //Calculamos perimetro y area
  perimetro = 2 * (basetri+alturatri);
  area = alturatri * basetri;

  //Imprimimos el perimetro y area
  System.out.print("El perimetro es " + perimetro);
  System.out.print("\nEl area es " + area);
  }
  
  
  
  
}
