//Realizar un algoritmos que lea un n�mero y que muestre su ra�z cuadrada y su ra�z c�bica. PSeInt no tiene ninguna funci�n predefinida que permita calcular la ra�z c�bica, �c�mo se puede calcular?
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