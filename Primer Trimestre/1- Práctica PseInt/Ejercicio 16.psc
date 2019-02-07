//Dos vehículos viajan a diferentes velocidades (v1 y v2) 
//y están distanciados por una distancia d. El que está 
//detrás viaja a una velocidad mayor. Se pide hacer un 
//algoritmo para ingresar la distancia entre los dos vehículos (km) 
//y sus respectivas velocidades (km/h) y con esto determinar y mostrar
//en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
Proceso Calcular
	Definir v1,v2,d, hora como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dime la velocidad del vehiculo 1";
	Leer v2;
	Escribir "Dime la velocidad del vehiculo 2";
	Leer v1;
	Escribir "Dime el valor de la distancia entre v1 y v2";
	Leer d;
	//Calculos
	d <- abs(d/(v1-v2));
	hora <- d * 60;
	//Mostrar los resultados
	Escribir "El coche v1 alcanzará al v2 en ", hora , " minutos";
FinProceso