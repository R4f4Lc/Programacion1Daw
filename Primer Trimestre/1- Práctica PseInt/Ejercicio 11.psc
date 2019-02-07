//Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

Proceso Calcular
	Definir a,b, distancia como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dame el valor a";
	Leer a;
	Escribir "Dame el valor b";
	Leer b;
	
	//Calculos
	
	distancia<-abs(a-b);
	//Mostrar los resultados
	Escribir "La distancia es de ", distancia; 
FinProceso
