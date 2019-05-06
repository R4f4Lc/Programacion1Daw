<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejercicio 8</title>
</head>
<body>
<h1>Generador de Tablas de Multiplicar</h1>
<form method="post" action="ejercicio8.jsp">
<b>N&uacute;mero: </b><input type="text" name="numero">
<br><input type="submit" value="Enviar">
</form>
<% 
if(request.getParameter("numero")!= null){
  out.println("<p><h2>Tabla de multiplicar del "+ request.getParameter("numero") + "</h2><table border='1'>");
  for(int i=1;i<10;i++)
  	out.println("<tr><td><b>"+i+"</b></td><td>"+Double.valueOf(request.getParameter("numero"))*i+"</td>");
  out.println("</table>");
}
%>
</body>
</html>