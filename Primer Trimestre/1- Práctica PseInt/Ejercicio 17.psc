//Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. 
//El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
//Escribir un algoritmo que determine la hora de llegada a la ciudad B.
Proceso Calcular
	Definir h,min,seg,seg2, horallegada, minllegada, segllegada, segfinal como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dime la hora de salida";
	Leer h;
	Escribir "Dime los minutos de salida";
	Leer min;
	Escribir "Dime los segundos de salida";
	Leer seg;
	Escribir "Dime los segundos de llegada";
	Leer seg2;
	//Calculos
	h <- h*3600;
	min <- min*60;
	segfinal <- (h+min+seg) + seg2;
	horallegada <- trunc(segfinal/3600);
	minllegada <-  trunc(((((h+min+seg) + seg2))%3600)/60);
	segllegada <- (((h+min+seg) + seg2) %3600) %60;
	//Mostrar los resultados
	Escribir "El coche llegará a la ciudad 2 en ", horallegada,":",minllegada,":",segllegada;

FinProceso
