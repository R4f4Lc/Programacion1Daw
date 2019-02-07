package time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
 * son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
 * 30) donde los parámetros que se le pasan al constructor son las horas, los
 * minutos y los segundos respectivamente. Crea el método toString para ver los
 * intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
 * comprobar que la clase funciona bien.
 * 
 * @author Rafael López | RafaLpeC
 */
public class PruebaTime {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH'h 'mm'm 'ss's'");
		
		LocalTime hora = LocalTime.of(0, 30, 40);
		System.out.println("Hora 1: " + hora.toString());
		
		LocalTime hora2 = LocalTime.of(0, 35, 20);
		System.out.println("Hora 2: " + hora2.toString());
		
		LocalTime hora3 = LocalTime.of(1, 35, 20);
		System.out.println("Hora 3: " + hora3.toString());
		
		LocalTime total = hora;
		total = total.plusHours(hora2.getHour());
		total = total.plusMinutes(hora2.getMinute());
		total = total.plusSeconds(hora2.getSecond());
		System.out.println("Suma de Hora 1 y Hora 2 = " + total.format(dtf));
		
		
		total = hora3;
		total = total.minusHours(hora.getHour());
		total = total.minusMinutes(hora.getMinute());
		total = total.minusSeconds(hora.getSecond());
		System.out.println("Resta de Hora 3 y Hora 1= " +  total.format(dtf));
		
	}

}
