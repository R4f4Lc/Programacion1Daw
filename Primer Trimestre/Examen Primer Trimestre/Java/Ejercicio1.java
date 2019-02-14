/**
 * - Introducir (por teclado) una fecha en formato dd/mm/aaaa.
 * Pide una fecha al usuario, si no se introduce correctamente se devuelve un mensaje de error.
 * Usa una función booleana para validar la fecha.
 * - Sumar días a la fecha.
 * Pide un número de días (positivo) para sumar a la fecha introducida previamente y actualiza
 * su valor. Esta opción sólo podrá realizarse si hay una fecha introducida, si no la hay mostrará
 * un mensaje de error, si el número de días introducido no es positivo también. Usa una función
 * que recibirá la fecha, el número de días a sumarle y devolverá la nueva fecha.
 * - Restar días a la fecha.
 * Pide un número de días (negativo) para sumar a la fecha introducida previamente y actualiza
 * su valor. Esta opción sólo podrá realizarse si hay una fecha introducida, si no la hay mostrará
 * un mensaje de error, si el número de días introducido no es negativo también. Usa la función
 * del apartado anterior.
 * - Comparar la fecha introducida con otra.
 * Pide una fecha al usuario (válida, si no lo es da error) y la comparará con la que tenemos
 * almacenada, posteriormente mostrará si esta fecha es anterior, igual o posterior a la que
 * tenemos almacenada, usará una función para ello a la que le pasaremos las dos fechas y
 * devolverá un valor negativo si la 1ª es ANTERIOR a la 2ª, 0 si son IGUALES y un valor
 * positivo si es POSTERIOR.
 * - Mostrar fecha.
 * - Terminar.
 * 
 * @author Rafael Lopez Cruz
 */

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ejercicio1 {
	/**
	 * Funcion para validar la fecha que introduce el usuario.
	 * @param fecha
	 * @return
	 */
	public static boolean validaFecha(String fecha) {
		/**
		 * Convertirmos a un array la fecha que introduce el usuario
		 */
		char[] arrayfecha = fecha.toCharArray();
		/**
		 * Fecha de ejemplo para mas tarde hacer una comparacion
		 */
		String fechaejemplo = "12/12/2014";
		/**
		 * Convertirmos la fecha de ejemplo a un array
		 */
		char[] arrayfechaejem = fechaejemplo.toCharArray();
		/**
		 * Separamos los dias, meses y anios con split indicando el separador que es /
		 */
		String[] partfecha = fecha.split("/");
		int dia = Integer.parseInt(partfecha[0]);
		int mes =Integer.parseInt(partfecha[1]);
		int anio = Integer.parseInt(partfecha[2]);
		/**
		 * Comparamos que las barras esten en las posiciones correctas y que no tenga la cadena una longitud superior a 10
		 */
		if(arrayfecha[2]==arrayfechaejem[2] && arrayfecha[5]==arrayfechaejem[5] && arrayfecha.length == 10) {
			/**
			 * Si los meses son 4, 6, 9 y 11 entra y si el dia se encuentra entre 1 y 30 incluido devuelve un true. 
			 */
			if(mes == 4  || mes == 6 || mes == 9 || mes == 11) {
				if(dia > 0 && dia <= 30) {
					return true;
				}
				else {
					return false;
				}
			}
			/**
			 * Si el mes es 1,3,5,7,8,10 o 12 entra y si los dias se encuentra 0 y 31 incluido devuelve true.
			 */
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if(dia > 0 && dia <= 31) {
					return true;
				}
				else {
					return false;
				}
			}
			/**
			 * Si el mes es 2 entra y si es bisiesto y los dias se encuentra entre 0 y 29 incluido devuelve true y si no false.
			 * Si el mes no es bisiesto y los dias se encuentran entre 0 y 18 incluido devuelve true.
			 */
			if (mes == 2) {
				if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
					if (dia > 0 && dia <= 29) {
						return true;
					}
					else {
						return false;
					}
				}
				else if (dia > 0 && dia <= 28) {
					return true;
				}
				else {
					return false;
				}
			}
			/**
			 * Si no cumple ninguna de las caracteristicas anteriores devuelve un false
			 */
			else {
				return false;
			}
		}
		else {
		return false;
		}
	}
	
	/**
	 * Funcion SumarDia()
	 * @param fecha
	 * @param incremento
	 * @return
	 */
	public static String SumarDia(Date fecha, int incremento) {
		/**
		 * Creamos la variable calendar e indicamos que la fecha  es la variable fecha.
		 */
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		/**
		 * Con la funcion add indicamos el incremento para ello usamos la variable incremento y montamos la fecha y la devolvemos
		 */
		calendar.add(Calendar.DAY_OF_YEAR, incremento);
		String fechasumada = calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
		return fechasumada;
	}
	
	/**
	 * Funcion RestarDia()
	 * @param fecha
	 * @param menosdias
	 * @return
	 */
	public static String RestarDia(Date fecha, int menosdias) {
		/**
		 * Creamos la variable calendar e indicamos que la fecha  es la variable fecha.
		 */
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		/**
		 * Con la funcion add indicamos cuantos dias restamos para ello usamos la variable menosdias y montamos la fecha y la devolvemos
		 */
		calendar.add(Calendar.DAY_OF_YEAR, (menosdias));
		String fechasumada = calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
		return fechasumada;
	}
	
	/**
	 * comparaFecha()
	 * @param fecha
	 * @param fechanueva
	 * @return
	 * @throws ParseException
	 */
	public static int comparaFecha(String fecha, String fechanueva) throws ParseException {
		/**
		 * Indicamos el formato de la fecha y convertirmos los String a tipo Date.
		 */
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha1 = formatter.parse(fecha);
		Date fecha2 = formatter.parse(fechanueva);
		/**
		 * Si la fecha1 es mas antigua que fecha2 devuelve -1 
		 */
		if (fecha1.before(fecha2)){
			return -1;
		}
		/**
		 * Si la fecha2 es mas antigua que fecha1 devuelve 1
		 */
		if (fecha2.before(fecha1)){
			return 1;
		}
		/**
		 * Si no las fechas son iguales y devuelve 0
		 */
		else {
			return 0;
		}
	}
	
	/**
	 * Main
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		/**
		 * Invocamos a scanner y creamos la variable salir con valor 0 y fecha con null
		 */
		Scanner s = new Scanner(System.in);
		int salir = 0;
		String fecha = null;
		/**
		 * Creamos un bucle do while que nos va a ir mostrando el menu todo el rato cada vez que terminemos
		 * con una opcion.
		 */
		do {
			/**
			 * Opciones del menu
			 */
			System.out.println("Introduce una fecha(1)");
			System.out.println("Sumar dias a la fecha(2)");
			System.out.println("Restar dias a la fecha(3)");
			System.out.println("Comparar la fecha introducida con otra(4)");
			System.out.println("Salir(5)");
			System.out.print("Introduce el numero de la opcion a elegir:");
			int opcion = s.nextInt();
			
			/**
			 * Switch con las diferentes opciones que elija el usuario.
			 */
			switch(opcion) {
				/**
				 * Nos pide introducir una fecha y nos la valida si es correcta o no llamando
				 * a la funcion validaFecha()
				 */
				case 1:
					System.out.print("Introduce una fecha(dd/mm/aaaa): ");
					fecha = s.next();
					if(validaFecha(fecha)) {
						System.out.println("Se ha introducido la fecha correctamente.");
					}
					else {
						System.out.print("La fecha introducida no es correcta.");
					}
					break;
				
				/**
				 * Nos pide que indiquemos el numero de dias que vamos a sumar y convierte la fecha original a tipo Date
				 * e invoca a la funcion SumarDia() que devuelve la nueva fecha.
				 */
				case 2:
					if (fecha != null && validaFecha(fecha)) {
						System.out.print("Introduce la cantidad de dias a sumar: ");
						int incremento = s.nextInt();
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						Date fecha2 = formatter.parse(fecha);
						System.out.println("La nueva fecha es " + SumarDia(fecha2, incremento));
					}
					else {
						System.out.println("Introduce una fecha correcta en la opcion 1");
					}
					break;
				
				/**
				 * Nos pide que indiquemos el numero de dias que vamos a restar y convierte la fecha original a tipo Date
				 * e invoca a la funcion RestarDia() que devuelve la nueva fecha. El numero de dia que introduce el usuario
				 * lo convertimos a negativo para despues enviarlo para que lo reste.
				 */
				case 3:
					if (fecha != null && validaFecha(fecha)) {
						System.out.print("Introduce la cantidad de dias a restar: ");
						int menosdias = s.nextInt();
						menosdias = menosdias * (-1);
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						Date fecha2 = formatter.parse(fecha);
						System.out.println("La nueva fecha es " + RestarDia(fecha2, menosdias));
					}
					else {
						System.out.println("Introduce una fecha correcta en la opcion 1");
					}
					break;
					
				/**
				 * Comparamos que la fecha sea valida y pedimos una nueva fecha y comparamos que la nueva fecha sea valida.
				 * Ahora invocamos a la funcion comparaFecha con diferentes if para ver que resultado devuelven.
				 * Si devuelven -1 la fecha1 es anterior a la fecha2, si devuelve 0 las fechas son iguales y si devuelve
				 * 1 la fecha1 es superior a la fecha2
				 */
				case 4:
					if (fecha != null && validaFecha(fecha)) {
						System.out.print("Introduce la fecha a comparar (dd/mm/aaaa): ");
						String fechacompara = s.next();
						if (fechacompara != null && validaFecha(fechacompara)) {
							if (comparaFecha(fecha, fechacompara) == -1) {
								System.out.println("La fecha " + fecha + " es anterior a la fecha " + fechacompara);
							}
							else if (comparaFecha(fecha, fechacompara) == 0) {
								System.out.println("Las fechas son inguales.");
							}
							else if (comparaFecha(fecha,fechacompara) == 1) {
								System.out.println("La fecha " + fecha + " es superior a la fecha " + fechacompara);
		
							}
						}
						else {
							System.out.println("Introduce una fecha correcta a comparar.");
						}
					}
					else {
						System.out.println("Introduce una fecha correcta en la opcion 1");
					}
					break;
				
				/**
				 * Salir del programa. Para ello indicamos que la variable salir es 1 y entonces el bucle do while acabara.
				 */
				case 5:
					salir = 1;
			}
		/**
		 * Bucle do while que se repetirá mientras salir sea igual a 0
		 */
		} while (salir == 0);
	}	
}
