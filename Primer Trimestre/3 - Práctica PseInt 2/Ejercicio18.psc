//Realiza un programa que pida el d�a de la semana (del 1 al 7) y 
//escriba el d�a correspondiente. Si introducimos otro n�mero nos da un error.
Proceso Ejercicio18
	Definir dia Como Entero;
	Escribir Sin Saltar "Dime un d�a de la semana (1-7):";
	Leer dia;
	//Indicamos el dia segun el numero si no da el mensaje de que escribamos un numero del 1 al 7
	Segun dia Hacer
		1:
			Escribir "Lunes";
		2:
			Escribir "Martes";
		3:
			Escribir "Mi�rcoles";
		4:
			Escribir "Jueves";
		5:
			Escribir "Viernes";
		6:
			Escribir "S�bado";
		7:
			Escribir "Domingo";
		De Otro Modo:
			Escribir "Has introducido un dia incorrecto escribe un numero del 1 al 7";
	FinSegun
FinProceso
