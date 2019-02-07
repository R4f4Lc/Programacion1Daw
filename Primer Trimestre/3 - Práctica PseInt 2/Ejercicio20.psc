//Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, 
//América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se basa en 
//el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la tabla:
	
//	ZONA	UBICACIÓN	COSTO/GRAMO
//	1	América del Norte	24.00 euros
//	2	América Central	20.00 euros
//	3	América del Sur	21.00 euros
//	4	Europa	10.00 euros
//	5	Asia	18.00 euros
//	Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones de logística y de seguridad. 
//	Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.

Proceso Ejercicio20
	//Definimos variables
	Definir peso,zona Como Entero;
	Escribir "¿Qué peso tiene el paquete?:";
	Leer peso;
	//Si Peso es mayor que 0 y menor que 5000 gramos indicamos la zona
	Si peso>0 Y peso<=5000 Entonces
		Escribir "1 - América del Norte";
		Escribir "2 - América Central";
		Escribir "3 - América del Sur";
		Escribir "4 - Europa";
		Escribir "5 - Asia";
		//Preguntamos al usuario que zona elige
		Escribir "A que zona se reparte (1-5):";
		Leer zona;
		//Calculamos el precio por zona
		Segun zona Hacer
			1:
				Escribir "Coste: ",peso*24, " euros.";
			2:
				Escribir "Coste: ",peso*20, " euros.";
			3:
				Escribir "Coste: ",peso*21, " euros.";
			4:
				Escribir "Coste: ",peso*10, " euros.";
			5:
				Escribir "Coste: ",peso*18, " euros.";
			De Otro Modo:
				Escribir "Zona incorrecta.";
				
		FinSegun
	SiNo
		Escribir "No se permite paquetes de peso superior a 5kg.";
	FinSi
FinProceso
