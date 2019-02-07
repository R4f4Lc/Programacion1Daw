//El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a 
//cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: 
//si son 100 alumnos o más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, 
//de 30 a 49, de 95 euros, y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
//Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
Proceso Ejercicio15
	//Definimos variables
	Definir num_alumnos, coste_autobus Como Entero;
	Definir coste como Real;
	//Preguntamos el numero de alumnos
	Escribir "Numero de alumnos que van al viaje:";
	Leer num_alumnos;
	//Si es mayor o igual a 100
	Si num_alumnos>=100 Entonces
		coste<-65;
	FinSi
	//Si es mayor o igual a 50 pero igual o menor a 99
	Si num_alumnos>=50 Y num_alumnos<=99 Entonces
		coste<-70;
	FinSi
	//Si es mayor o igual a 30 pero igual o menor a 49
	Si num_alumnos>=30 Y num_alumnos<=49 Entonces
		coste<-95;
	FinSi
	//Si es menos que 30 y mayor que 0
	Si num_alumnos<30 Y num_alumnos>0 Entonces
		coste<-4000/num_alumnos;
	FinSi
	Si num_alumnos>0 Entonces
		//Calculamos y mostramos por pantalla
		coste_autobus<-num_alumnos*coste;
		Escribir "El coste por alumno es ",coste," euros.";
		Escribir "El coste del autobús es ",coste_autobus," euros.";
	SiNo
		Escribir "Numero invalido. Introduce un numero positivo";
	FinSi
FinProceso
