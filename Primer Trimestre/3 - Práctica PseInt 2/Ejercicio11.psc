//Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un tri�ngulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:	
//	Si se cumple Pit�goras entonces es tri�ngulo rect�ngulo
//		Si s�lo dos lados del tri�ngulo son iguales entonces es is�sceles.
//			Si los 3 lados son iguales entonces es equil�tero.
//				Si no se cumple ninguna de las condiciones anteriores, es escaleno.
Proceso Ejercicio11
	Definir A,B,C Como Real;
	Escribir "Longitud lado A:";
	Leer A;
	Escribir "Longitud lado B:";
	Leer B;
	Escribir "Longitud lado C:";
	Leer C;
	
	//Aplicamos el teorema de pitagoras
	Si A^2+B^2 = C^2 O B^2+C^2 = A^2 O C^2+A^2 = B^2 Entonces
		Escribir "Tri�ngulo Rect�ngulo";
	FinSi
	//Si tiene dos lados iguales decimos que es is�sceles
	Si (A=B y A<>C) O (B=C y B<>A) O (C=A y C<>B) Entonces
		Escribir "Tri�ngulo Is�sceles";
	SiNo
		//Si tiene tres iguales es equilatero y si no es escaleno
		Si A=B Y A=C Entonces
			Escribir "Tri�ngulo Equil�tero";
		SiNo
			Escribir "Tri�ngulo Escaleno";
		FinSi
	FinSi
FinProceso
