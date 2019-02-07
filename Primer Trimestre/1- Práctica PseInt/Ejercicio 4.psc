//Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
Proceso Calcular
	Definir a, b, suma, resta, multi, divi como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dame el valor a";
	Leer a;
	Escribir "Dame el valor b";
	Leer b;
	
	//Calculos
	
	suma <- a + b;
	resta <- a-b;
	multi <- a*b;
	divi <- a/b;
	//Mostrar los resultados
	Escribir "La suma es ", suma;
	Escribir "La resta es ", resta;
	Escribir "La multiplicación es ", multi;
	Escribir "La división es ", divi;
	
FinProceso
