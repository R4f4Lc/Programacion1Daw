//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá pagar finalmente por su compra.
Proceso Calcular
	Definir compra,media como Real;
		
	// Pedimos los datos al usuario
	Escribir "Dame el valor de la compra";
	Leer compra;	
	//Calculos
	media<-compra*0.85;
	//Mostrar los resultados
	Escribir "El cliente deberá pagar un total de ", media, " euros";
FinProceso

