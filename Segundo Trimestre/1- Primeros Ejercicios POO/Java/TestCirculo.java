/**
 * Crea una clase TestCirculo que cree una instancia de “Circulo”, muestre su
 * estado, lo haga crecer 27 veces, averigüe su área, lo haga decrecer 10 veces
 * y muestre su estado final.
 * 
 * @author Rafael López | RafaLpeC
 *
 */

public class TestCirculo {
	public static void main(String[] args) {
		Circulo circulito = new Circulo(12.5);
		// System.out.println(circulito.toString());
		System.out.println(circulito);

		System.out.println("Voy a incrementar 27 veces: ");
		for (int i = 0; i < 27; i++) {
			circulito.crecer(1);
			System.out.println(circulito);
		}

		System.out.println("Voy a descrecer 10 veces: ");
		for (int i = 0; i < 10; i++) {
			circulito.menguar(1);
		}
		System.out.println(circulito);
		
		System.out.println("Ponemos el valor del radio a 0: ");
		do{
			circulito.menguar(1);
		}while(circulito.getRadio() !=0);
		//circulito.setRadio(0);
		

//	circulito.crecer("n");
//	System.out.println(circulito.toString(0.00));
//	
//	System.out.println("Aumentamos el circulo 27 veces: ");
//	circulito.crecer("a");
//	System.out.println(circulito.toString(27.00));
//	
//	System.out.println("Disminuimos 10 veces el área del circulo: ");
//	circulito.crecer("d");
//	System.out.println(circulito.toString(10.00));
	}
}