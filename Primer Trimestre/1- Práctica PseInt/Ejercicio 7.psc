//Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde
Proceso Calcular
	Definir mins, hora Como Real;
	
	// Pedimos los minutos
	Escribir "Dime los minutos";
	Leer mins;
	
	//Calcular
	hora <- mins/60;
	
	//Mostramos por pantalla
	Escribir "Son un total de ",hora, " horas";
FinProceso
