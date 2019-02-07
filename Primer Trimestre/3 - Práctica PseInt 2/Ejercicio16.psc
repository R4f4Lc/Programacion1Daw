//La política de cobro de una compañía telefónica es: cuando se realiza una llamada, 
//el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, 
//los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos. 
//Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y en turno de tarde, 
//10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
Proceso Ejercicio16
	//Definimos variables
	Definir tiempo,coste Como Entero;
	Definir es_domingo Como Caracter;
	Definir turno Como Caracter;
	//Preguntamos tiempo de llamada, si es domingo y turno
	Escribir "Tiempo de la llamada:";
	Leer tiempo;
	Escribir "¿Es Domingo? (S o N):";
	Leer es_domingo;
	Si Mayusculas(es_domingo)="N" Entonces
		Escribir "Indica el turno si es de Mañana o Tarde(M o T):";
		Leer turno;
	FinSi
	//Calculamos el coste
	Si tiempo<5 Entonces
		coste<-tiempo*100;
	SiNo
		Si tiempo<8 Entonces
			coste<-(tiempo-5)*80+500;
		SiNo
			Si tiempo<10 Entonces
				coste<-(tiempo-8)*70+240+500;
			SiNo
				coste<-(tiempo-10)*50+140+240+500;
			FinSi
		FinSi
	FinSi
	Si Mayusculas(es_domingo)="S" Entonces
		coste<-coste+coste*0.03;
	SiNo
		Si Mayusculas(turno)="M" Entonces
			coste<-coste+coste*0.15;
		SiNo
			coste<-coste+coste*0.10;
		FinSi
	FinSi
	//Mostramos por pantalla
	Escribir "El coste de la llamada es ", coste/100," euros.";
FinProceso
