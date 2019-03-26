import java.util.ArrayList;

public class Ejercicio2 {
  
  public static int suma(ArrayList<Integer>numeros) {
    int sum = 0;
    for(int i = 0; i < numeros.size();i++) {
      sum += numeros.get(i);
    }
    return sum;
  }
  
  public static int media(ArrayList<Integer>numeros) {
    return suma(numeros)/numeros.size();
  }
  
  public static int grande(ArrayList<Integer>numeros) {
    int mayor = numeros.get(0);
    for(int i = 1; i < numeros.size();i++) {
      if(numeros.get(i)>mayor) {
        mayor = numeros.get(i);
      }
    }
    return mayor;
  }
  
  public static int pequenio(ArrayList<Integer>numeros) {
    int menor = numeros.get(0);
    for(int i = 1; i < numeros.size();i++) {
      if(numeros.get(i)<menor) {
        menor = numeros.get(i);
      }
    }
    return menor;
  }
  
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    int tamaniolista = 10 + (int)(Math.random() * ((20 - 10) + 1));
    
    for(int i = 0; i<tamaniolista;i++) {
      numeros.add((int)(Math.random() * 100 + 1));
      System.out.println(numeros.get(i));
    }
    
    System.out.println("La suma es igual a " + suma(numeros));
    System.out.println("La media es igual a " + media(numeros));
    System.out.println("El número más grande es " + grande(numeros) + " y el más pequeño es " + pequenio(numeros));
  }
}
