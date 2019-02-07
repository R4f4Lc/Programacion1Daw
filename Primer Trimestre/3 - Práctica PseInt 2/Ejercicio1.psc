//Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
Proceso Ejercicio1
	//definimos variables y preguntamos
	Definir num1, num2 como Real;
	Escribir "Dime el primer numero";
	Leer num1;
	Escribir "Dime el segundo numero";
	Leer num2;
	//compara numeros y muestra por pantalla
	Si num1 = num2 Entonces
		Escribir "El numero ", num1, " es igual que ", num2;		
	SiNo
		Si num1 > num2 Entonces
			Escribir "El numero ", num1, " es mayor que ", num2;
		SiNo
			Escribir "El numero ", num2, " es mayor que ", num1;
		FinSi
	FinSi

	
FinProceso
