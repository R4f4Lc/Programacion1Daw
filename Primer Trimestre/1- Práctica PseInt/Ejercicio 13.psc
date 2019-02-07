//Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica. PSeInt no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿cómo se puede calcular?
Proceso Calcular
	Definir a, raiz2,raiz2ne, raiz3  como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dame el valor a";
	Leer a;
	//Calculos
	raiz2 <- rc(a);
	raiz3 <- a^(1/3);
	//Mostrar los resultados
	Escribir "La raiz cuadrada positiva es ", raiz2; 
	Escribir "La raiz cubica es : ", raiz3;
FinProceso