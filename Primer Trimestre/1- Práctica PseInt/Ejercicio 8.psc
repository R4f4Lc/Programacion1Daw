//Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
//el vendedor desea saber cuanto dinero obtendrá por concepto 
//de comisiones por las tres ventas que realiza en el mes y el 
//total que recibirá en el mes tomando en cuenta su sueldo base 
//y comisiones.
Proceso Calcular
	Definir a,b,c,media como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dame el valor a";
	Leer a;
	Escribir "Dame el valor b";
	Leer b;
	Escribir "Dame el valor c";
	Leer c;
	//Calculos
	
	media<-(a*0.10)+(b*0.10)+(c*0.10);
	//Mostrar los resultados
	Escribir "La comisión de la primera venta es ", a*0.10;
	Escribir "La comisión de la segunda venta es " , b*0.10;
	Escribir "La comisión de la tercera venta es ", c*0.10;
	Escribir "La media es ", media; 
FinProceso

