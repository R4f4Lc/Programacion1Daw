package ejercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Clase Fecha que crea una fecha y permite: -Sumar un dia -Restar un dia -Sacar
 * la diferencia entre el dia actual y el dia introducido por el usuario
 * 
 * @author Rafael López
 *
 */
public class Fecha {
  private static final int _86400000 = 86400000;
  private Date fecha;
  private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
  final static int[] DIAS_MES = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  /**
   * Constructor de fecha
   * 
   * @param fecha
   * @throws ParseException
   */
  public Fecha(String fecha) throws ParseException {
    if (!validaFecha(fecha))
      throw new ParseException(null, 0);
    setFecha(fecha);
//    else
  }

  /**
   * Asigna un valor a fecha
   * 
   * @param fecha
   * @throws ParseException
   */
  private void setFecha(String fecha) throws ParseException {
    this.fecha = formatter.parse(fecha);
  }

  /**
   * Devuelve la fecha
   * 
   * @return
   */
  private Date getFecha() {
    return fecha;
  }

  /**
   * Valida la fecha
   * 
   * @param fecha
   * @return
   * @throws ParseException
   */
  private boolean validaFecha(String fecha) throws ParseException, NullPointerException {
    if (fecha.length() <= 10) {
      int mes = Integer.parseInt(fecha.substring(3, 5));
      if (mes < 1 || mes > 12) {
        return false;
      }
      int dia = Integer.parseInt(fecha.substring(0, 2));
      int anyo = Integer.parseInt(fecha.substring(6));
      int diasmes = DIAS_MES[mes - 1];
      if (mes == 2 && anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0)) {
        diasmes++;
      }
      return (dia > 0 && dia <= diasmes);
    } else
      throw new ParseException(null, 0);
  }

  /**
   * Devuelve el dia Posterior
   * 
   * @return
   */
  String diaPosterior() {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(getFecha());
    calendar.add(Calendar.DAY_OF_YEAR, 1);
    return calendar.get(Calendar.DATE) + "/" + Integer.toString(Integer.valueOf(calendar.get(Calendar.MONTH)) + 1) + "/"
        + calendar.get(Calendar.YEAR);
  }

  /**
   * Devuelve el dia anterior.
   * 
   * @return
   */
  String diaAnterior() {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(getFecha());
    calendar.add(Calendar.DAY_OF_YEAR, -1);
    return calendar.get(Calendar.DATE) + "/" + Integer.toString(Integer.valueOf(calendar.get(Calendar.MONTH)) + 1) + "/"
        + calendar.get(Calendar.YEAR);
  }

  /**
   * Tenemos que calcular los dias. Entonces restamos los milisegundos de las
   * fechas y tendremos que multiplicar para convertirlo a dias desde
   * millisegundos que es a lo que convertimos la fecha: millisegundos x segundos
   * x minutos x horas -> 1000 x 60 x 60 x 24 = 86400000
   * 
   * Una vez obtenidos los dias totales de cada fecha se restan y se obtiene la
   * diferencia.
   * 
   * @return Diferencia de dias
   */
  int diasHastaHoy() {
    Date hoy = new Date();
    long hoyMs = hoy.getTime();
    long fechaMs = getFecha().getTime();
    if (getFecha().before(hoy))
      return (int) (((hoyMs - fechaMs) / _86400000));
    // else
    return (int) (((fechaMs - hoyMs) / _86400000));
  }
}