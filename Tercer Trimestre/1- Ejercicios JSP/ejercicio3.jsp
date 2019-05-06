<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejercicio 3</title>
</head>
<body>
<% 
if(request.getParameter("nombre")!= null)
  out.println("Hola " + request.getParameter("nombre"));
%>
<form method="post" action="ejercicio3.jsp">
<b>Nombre: </b><input type="text" name="nombre">
<br><input type="submit" value="Enviar">
</form>
</body>
</html>