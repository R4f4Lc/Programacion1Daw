<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Calendar"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejercicio 12</title>
</head>
<body>
    <%
      int mes = Integer.parseInt(request.getParameter("mes"));
      int anio = Integer.parseInt(request.getParameter("anio"));
      String[] nombreMes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
      Calendar miCalendario = Calendar.getInstance();
      miCalendario.set(anio, mes - 1, 1); // los meses van de 0 a 11
      int diasTotales = miCalendario.getActualMaximum(Calendar.DAY_OF_MONTH);
      int dia1 = miCalendario.get(Calendar.DAY_OF_WEEK);
      if (dia1 == 1) {
        dia1 = 7; // el domingo es día 1
      } else {
        dia1--;
      }
      int columna = 1;
    %>

    <h1><% out.print(request.getParameter("titulo"));%></h1>

    <table>
      <tr><th>lunes</th><th>martes</th><th>miércoles</th><th>jueves</th><th>viernes</th><th>sábado</th><th>domingo</th></tr>
      <tr>
      <%
      for (int i = 1; i < diasTotales + dia1; i++) {
        if (i >= dia1) {
          out.print("<td>" + (i - dia1 + 1) + "</td>");
        } else {
          out.print("<td> </td>"); // pinta los huecos que corresponden a los días del mes pasado
        }
        columna++;
        if (columna == 8) { // termina la fila actual
          out.println("</tr><tr>");
          columna = 1;
        }
      }
      %>
      </td></tr>
    </table>
    </form>
</body>
</html>