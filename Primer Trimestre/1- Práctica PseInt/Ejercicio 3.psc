//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa
Proceso Calcular
	Definir a, b, c como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dame el valor a del cateto";
	Leer a;
	Escribir "Dame el valor b del cateto";
	Leer b;
	
	//Calculos
	
	c <- rc(a^2+b^2);
	
	//Mostrar los resultados
	Escribir "La hipotenusa es ", c;

FinProceso
