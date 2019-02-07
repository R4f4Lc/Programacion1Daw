"""
//Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. 
//El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
//Escribir un algoritmo que determine la hora de llegada a la ciudad B.

__author__ = "Rafael López Cruz"
"""
import math
#Preguntamos por pantalla
h = int(input("Dime la hora de salida: "));
mins = int(input("Dime los minutos de salida: "));
seg = int(input("Dime los segundos de salida: "));
seg2 = int(input("Dime los segundos de llegada: "));

#Calculamos la hora
h = h*3600;
mins = mins*60;
segfinal = (h+mins+seg) + seg2;
horallegada = round(segfinal/3600);
minllegada = round((((h+mins+seg)+ seg2)%3600)/60);
segllegada = round((((h+mins+seg) + seg2)%3600)%60);

#Mostramos por pantalla
print("El coche llegara a la ciudad 2 en",horallegada,"horas", minllegada, "minutos y",segllegada,"segundos");
