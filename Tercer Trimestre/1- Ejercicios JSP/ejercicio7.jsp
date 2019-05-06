<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejercicio 7</title>
</head>
<body>
<h1>Conversor de Pesetas</h1>
<form method="post" action="ejercicio7.jsp">
<b>Cantidad: </b><input type="text" name="valor">
<br>
<b>Convertir a:</b>
<select name="convertir">
<option value="euro">Euro</option>
<option value="peseta">Peseta</option>
</select>
<br><input type="submit" value="Enviar">
</form>

<% 
String convertir = request.getParameter("convertir");
if(convertir!= null){
  Double valor = Double.valueOf(request.getParameter("valor"));
  if(convertir.equals("euro"))
    out.println(valor + " pesetas son un total de " + valor/166.386 + " euros.");
  else if(convertir.equals("peseta"))
    out.println(valor + " euros son un total de " + valor * 166.386 + " pesetas.");
  else
    out.println("Elige una opción valida");
}
%>

</body>
</html>