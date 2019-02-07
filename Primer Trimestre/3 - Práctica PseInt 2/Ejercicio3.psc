//Escribe un programa que lea un número e indique si es par o impar.
Proceso Ejercicio3
//definimos variables y preguntamos
Definir num1 como Real;
Escribir "Dime el numero";
Leer num1;

//Dividimos entre 2 y si el resultado es 0 es par y si no es impar
//y mostramos por pantalla
Si num1 mod 2 = 0 Entonces
	Escribir "El numero ", num1, " es par";		
SiNo
	Escribir "El numero ", num1, " es impar";
FinSi
FinProceso