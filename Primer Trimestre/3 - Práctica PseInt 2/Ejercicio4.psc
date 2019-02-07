//Crea un programa que pida al usuario dos números y muestre su división 
//si el segundo no es cero, o un mensaje de aviso en caso contrario.

Proceso Ejercicio4
	//Definimos variables y pedimos valores
	Definir num1, num2 como Real;
	
	Escribir "Dime el primer numero:";
	Leer num1;
	
	Escribir "Dime el segundo numero:";
	Leer num2;
	
	//Comprabamos si num2 es menor o igual a 0
	//y si es menor o igual a 0 que salga el mensaje
	//y si es mayor que muestre la division.
	Si num2 <= 0 Entonces
		Escribir "El segundo numero es menor o igual a 0";
	Sino
		Escribir "La division de los dos numeros es igual a ", num1/num2;
	FinSi
FinProceso
