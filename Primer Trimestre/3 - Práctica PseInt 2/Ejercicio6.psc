//Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
Proceso Ejercicio6
	//Definimos y pedimos la cadena
	Definir cadenita Como Caracter;
	Escribir "Dime la cadena:";
	Leer cadenita;
	
	//Comprobamos si la cadena tiene alguna mayuscula o minuscula
	
	Si cadenita >='A' y cadenita <='Z' entonces 
		Escribir "La cadena tiene mayuscula";
	SiNo
		Escribir "La cadena es minuscula";
	FinSi
	
FinProceso
