//Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.
Proceso Calcular
	Definir x1,x2,y1,y2, media como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dame el valor x1";
	Leer x1;
	Escribir "Dame el valor y1";
	Leer y1;
	Escribir "Dame el valor x2";
	Leer x2;
	Escribir "Dame el valor y2";
	Leer y2;
	//Calculos
	
	media <- abs(rc((x1-x2)^2 + (y1-y2)^2));
	//Mostrar los resultados
	Escribir "La distancia es de ", media; 
FinProceso
