//Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
//circunferencias y las clasifique en uno de estos estados:
//	exteriores
//	tangentes exteriores
//	secantes
//	tangentes interiores
//	interiores
//	concéntricas
Proceso Ejercicio10
	//Definimos y preguntamos valores
	Definir x1,x2,y1,y2,r1,r2, distancia como Real;
	Escribir "Dime x1";
	Leer x1;
	
	Escribir "Dime x2";
	Leer x2;
	
	Escribir "Dime y1";
	Leer y1;
	
	Escribir "Dime y2";
	Leer y2;
	
	Escribir "Dime r1";
	Leer r1;
	
	Escribir "Dime r2";
	Leer r2;
	
	//usamos la formula de distancia y aplicamos las diferentes reglas
	//de matematicas
	distancia <- raiz((x2-x1)^2 + (y2-y1)^2);
	
	Si distancia> (r1 + r2) Entonces
		Escribir "Exteriores";
	FinSi
	
	Si distancia = (r1 + r2) Entonces
		Escribir "Tangentes Exteriores";
	FinSi
	
	Si distancia < (r1 + r2) Y distancia > abs(r1-r2) Entonces
		Escribir "Secantes";
	FinSi
	
	Si distancia = abs(r1-r2) Entonces
		Escribir "Tangentes Interiores";
	FinSi

	Si distancia>0 Y distancia<abs(r1-r2) Entonces
		Escribir "Interiores";
	FinSi
	
	Si distancia=0 Entonces
		Escribir "Concétricas";
	FinSi
	
FinProceso
