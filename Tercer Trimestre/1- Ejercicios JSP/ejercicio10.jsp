<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejercicio 10</title>
</head>
<body>
<%
	double puntuacion = 0;
	if(request.getParameter("p1").equals("r1"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
	if(request.getParameter("p2").equals("r3"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
	if(request.getParameter("p3").equals("r1"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
	if(request.getParameter("p4").equals("r2"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
	if(request.getParameter("p5").equals("r2"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
	if(request.getParameter("p6").equals("r1"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
	if(request.getParameter("p7").equals("r2"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
	if(request.getParameter("p8").equals("r3"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
	if(request.getParameter("p9").equals("r1"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
	if(request.getParameter("p10").equals("r2"))
	  puntuacion++;
	else
	  puntuacion = puntuacion-0.2;
%>
<h1>Puntuación</h1>
<p>Has sacado un total de un <b><%out.print(puntuacion); %></b>.
</body>
</html>