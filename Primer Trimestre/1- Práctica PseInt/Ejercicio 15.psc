//Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
Proceso Calcular
	Definir a,b, a2, b2 como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dame el valor a";
	Leer a;
	Escribir "Dame el valor b";
	Leer b;
	//Calculos
	
	a2 <- b;
	b2 <- a;
	//Mostrar los resultados
	Escribir "El valor nuevo de a es ", a2;
	Escribir "El valor nuevo de b es ", b2;
FinProceso