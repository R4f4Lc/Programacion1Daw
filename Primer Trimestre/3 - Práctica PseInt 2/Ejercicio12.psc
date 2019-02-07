//Escribir un programa que lea un a�o indicar si es bisiesto. 
//Nota: un a�o es bisiesto si es un n�mero divisible por 4, 
//pero no si es divisible por 100, excepto que tambi�n sea divisible por 400.

Proceso Ejercicio12
	//Definimos variable
	Definir anio Como Entero;
	Escribir "Introduce el a�o:";
	Leer anio;
	//Si a�o es divisible entre 4 pero no es divisible entre 100 excepto
	//que sea divisible por 400 muestra por pantalla A�o bisiesto 
	//y si no muestra A�o no bisiesto
	Si (anio % 4 = 0 Y NO (anio % 100 = 0)) O anio % 400 = 0 Entonces
		Escribir "A�o bisiesto.";
	SiNo
		Escribir "A�o no bisiesto.";
	FinSi
FinProceso
