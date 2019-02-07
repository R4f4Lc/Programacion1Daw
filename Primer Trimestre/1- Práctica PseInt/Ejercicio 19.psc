//Escribir un algoritmo para calcular la nota final de un estudiante, 
//considerando que por cada respuesta correcta 5 puntos, por una incorrecta -1
//y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
Proceso Calcular
	Definir correcta, incorrecta, blanco, resultado como Real;
	
	// Pedimos los datos al usuario
	Escribir "Cuantas preguntas tiene correctas";
	Leer correcta;	
	Escribir "Cuantas preguntas tiene incorrectas";
	Leer incorrecta;	
	Escribir "Cuantas preguntas tiene en blanco";
	Leer blanco;	
	//Calculos
	correcta <- correcta * 5;
	incorrecta <- incorrecta * (-1);
	blanco <- blanco * 0;
	resultado <- correcta + incorrecta + blanco;
	//Mostrar los resultados
	Escribir "El resultado del alumno es de un ", resultado;
FinProceso