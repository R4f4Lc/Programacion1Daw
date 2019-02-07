//Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
//mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
//dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
//imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
Proceso Ejercicio8
	Definir nota,edad como Entero;
	Definir sexo Como Caracter;
	Escribir "Dime la nota";
	Leer nota;
	
	Escribir "Dime la edad";
	Leer edad;
	
	Escribir "Dime el sexo(F o M)";
	Leer sexo;
	Si sexo = 'F' o sexo = 'M' Entonces
	
		Si nota >= 5 y edad >= 18 y sexo = "F" Entonces  	
			Escribir "ACEPTADA";
		FinSi
		
		Si nota >= 5 y edad >= 18 y sexo = "M" Entonces  	
			Escribir "POSIBLE";
		FinSi
		
		Si nota <= 5 y edad <= 18 Entonces  	
			Escribir "NO ACEPTADA";
		FinSi
		
	Sino
		Escribir "No has escrito un genero correcto";
	FinSi	
FinProceso
