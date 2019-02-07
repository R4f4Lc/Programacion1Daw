//Dados los catetos de un triángulo rectángulo, calcular su hipotenusa
Proceso Calcular
	Definir perimetro, area, base, altura como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dame la base del rectángulo";
	Leer base;
	Escribir "Dame la altura del rectángulo";
	Leer altura;
	
	//Calculos
	
	perimetro <- 2 * (base+altura);
	area <- altura * base;
	
	//Mostrar los resultados
	Escribir "El perimetro es ", perimetro;
	Escribir "El area es ", area;
FinProceso