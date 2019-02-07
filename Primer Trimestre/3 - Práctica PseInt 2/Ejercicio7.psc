//Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base 
//y el exponente. Pueden ocurrir tres cosas:
//El exponente sea positivo, sólo tienes que imprimir la potencia.
//El exponente sea 0, el resultado es 1.
//El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
Proceso Ejercicio7
	//Definimos y pedimos base y exponente y calculamos
	Definir a, b, resultado como Real;
	
	Escribir "Dime la base:";
	Leer a;
	
	Escribir "Dime el exponente:";
	Leer b;
	resultado <- a^b;
	//El exponente sea positivo, sólo tienes que imprimir la potencia.
	Si resultado > 0 Entonces
		Escribir "La potencia es igual a ",resultado;
	FinSi
	//El exponente sea 0, el resultado es 1.
	Si resultado = 0 Entonces
		resultado <- 1;
		Escribir "La potencia es igual a ",resultado;
	FinSi
	//El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
	Si resultado < 0 Entonces
		resultado <- abs(1/resultado);
		Escribir "La potencia es igual a ",resultado;
	FinSi	
FinProceso
