//Escribir un programa que lea un año indicar si es bisiesto. 
//Nota: un año es bisiesto si es un número divisible por 4, 
//pero no si es divisible por 100, excepto que también sea divisible por 400.

Proceso Ejercicio12
	//Definimos variable
	Definir anio Como Entero;
	Escribir "Introduce el año:";
	Leer anio;
	//Si año es divisible entre 4 pero no es divisible entre 100 excepto
	//que sea divisible por 400 muestra por pantalla Año bisiesto 
	//y si no muestra Año no bisiesto
	Si (anio % 4 = 0 Y NO (anio % 100 = 0)) O anio % 400 = 0 Entonces
		Escribir "Año bisiesto.";
	SiNo
		Escribir "Año no bisiesto.";
	FinSi
FinProceso
