//Diseñar un algoritmo que nos diga el dinero que tenemos 
//(en euros y céntimos) después de pedirnos cuantas monedas 
//tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).

class Ejercicio20{
	public static void main(String[] args){
    double doseuro;
    double uneuro;
    double cincuentacts;
    double veintects;
    double diezcts;
    double totaleur;
    double totalcts;
    double total;
    
    //preguntamos las monedas
    System.out.print("Dime cuantas monedas de 2 euros tienes: ");
    doseuro = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dime cuantas monedas de 1 euro tienes: ");
    uneuro = Double.parseDouble(System.console().readLine());
		
    System.out.print("Dime cuantas monedas de 50 centimos tienes: ");
    cincuentacts = Double.parseDouble(System.console().readLine());

    System.out.print("Dime cuantas monedas de 20 centimos tienes: ");
    veintects = Double.parseDouble(System.console().readLine());
    
    System.out.print("Dime cuantas monedas de 10 centimos tienes: ");
    diezcts = Double.parseDouble(System.console().readLine());
    
    //calculamos el valor
    doseuro = doseuro * 2;
    cincuentacts = cincuentacts * 50;
    veintects = veintects * 20;
    diezcts = diezcts * 10;
    totaleur = doseuro+uneuro;
    totalcts = veintects + diezcts + cincuentacts;
    
    if (totalcts >= 100){
      total = totaleur + (totalcts/100);
    }
    else {
      total = totaleur + (totalcts/100);
    }
    
    //imprimimos por pantalla el total
    System.out.print("Tienes un total de " + total + " euros");
	}
}
