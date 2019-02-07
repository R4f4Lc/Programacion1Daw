//Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:	
//	Si se cumple Pitágoras entonces es triángulo rectángulo
//		Si sólo dos lados del triángulo son iguales entonces es isósceles.
//			Si los 3 lados son iguales entonces es equilátero.
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
		Escribir "Triángulo Rectángulo";
	FinSi
	//Si tiene dos lados iguales decimos que es isósceles
	Si (A=B y A<>C) O (B=C y B<>A) O (C=A y C<>B) Entonces
		Escribir "Triángulo Isósceles";
	SiNo
		//Si tiene tres iguales es equilatero y si no es escaleno
		Si A=B Y A=C Entonces
			Escribir "Triángulo Equilátero";
		SiNo
			Escribir "Triángulo Escaleno";
		FinSi
	FinSi
FinProceso
