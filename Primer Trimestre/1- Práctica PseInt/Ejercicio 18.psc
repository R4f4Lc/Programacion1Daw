//Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
Proceso Calcular
	Definir nombre, apellido1, apellido2, iniciales como Caracter;
	
	// Pedimos los datos al usuario
	Escribir "Dime el nombre";
	Leer nombre;
	Escribir "Dime el primer apellido";
	Leer apellido1;
	Escribir "Dime el segundo apellido";
	Leer apellido2;
	//Calculos
	iniciales <- subcadena(nombre,0,0);
	iniciales <- concatenar(inicial,subcadena(apellido1,0,0));
	iniciales <- concatenar(inicial,subcadena(apellido2,0,0));
	iniciales <- Mayusculas(iniciales);
	//Mostrar los resultados
	Escribir "Las iniciales son: ", iniciales;
FinProceso

