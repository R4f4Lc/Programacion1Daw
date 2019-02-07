//Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras 
//y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
//Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto.”.

Proceso Ejercicio17
	//Definimos y preguntamos
	Definir cara Como Entero;
	Escribir "Introduce la cara:";
	Leer cara;
	//Como dice el enunciado si indica 1 que sea 6 y asi con el resto.
	Segun cara Hacer
		1:
			Escribir "6";
		2:
			Escribir "5";
		3:
			Escribir "4";
		4:
			Escribir "3";
		5:
			Escribir "2";
		6:
			Escribir "1";
		De Otro Modo:
			Escribir "No es un numero que esté en una cara del dado";
	FinSegun
FinProceso
