//Un alumno desea saber cual ser� su calificaci�n final en la materia de Algoritmos. Dicha calificaci�n se compone de los siguientes porcentajes:
//* 55% del promedio de sus tres calificaciones parciales.
//* 30% de la calificaci�n del examen final.
//* 15% de la calificaci�n de un trabajo final.
Proceso Calcular
	Definir cali1, cali2, cali3, exam, trabajo, media como Real;
	
	// Pedimos los datos al usuario
	Escribir "Dame el valor de la primera calificaci�n";
	Leer cali1;
	Escribir "Dame el valor de la segunda calificicaci�n";
	Leer cali2;
	Escribir "Dame el valor de la tercera calificaci�n";
	Leer cali3;
	Escribir "Dame el valor del examen";
	Leer exam;
	Escribir "Dame el valor del trabajo final";
	Leer trabajo;
	//Calculos
	
	media<-((cali1+cali2+cali3)/3)*0.55+(exam*0.30)+(trabajo*0.15);
	//Mostrar los resultados
	Escribir "La media es un ", media; 
FinProceso

