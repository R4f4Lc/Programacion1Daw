//Diseñar un algoritmo que nos diga el dinero que tenemos 
//(en euros y céntimos) después de pedirnos cuantas monedas 
//tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).
Proceso Calcular
	Definir doseuro,uneuro, cincuentacts, veintects, diezcts, totaleur, totalcts, total como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dime cuantas monedas de 2 euros tienes";
	Leer doseuro;
	Escribir "Dime cuantas monedas de 1 euro tienes";
	Leer uneuro;
	Escribir "Dime cuantas monedas de 50 cts tienes";
	Leer cincuentacts;
	Escribir "Dime cuantas monedas de 20 cts tienes";
	Leer veintects;
	Escribir "Dime cuantas monedas de 10 cts tienes";
	Leer diezcts;
	//Calculos
	doseuro <- doseuro * 2;
	cincuentacts <- cincuentacts * 50;
	veintects <- veintects * 20;
	diezcts <- diezcts * 10;
	totaleur <- doseuro+uneuro;
	totalcts <- veintects + diezcts + cincuentacts;
	Si totalcts >= 100 Entonces
		Escribir totalcts;
		total <- totaleur + (totalcts/100);
	SiNo
		total <- totaleur + (totalcts/100);
		Escribir "hola";
	FinSi
	//Mostrar los resultados
	Escribir "Tiene un total de ", total, " euros";
FinProceso	
	
