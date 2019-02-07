"""
//Pide al usuario dos pares de números x1,y2 y x2,y2, que 
representen dos puntos en el plano. Calcula y muestra la 
distancia entre ellos.

__author__ = "Rafael López Cruz"
"""
import math

#Preguntamos los valores
x1 = int(input("Dame el valor x1: "));
x2 = int(input("Dame el valor x2: "));
y1 = int(input("Dame el valor y1: "));
y2 = int(input("Dame el valor y2: "));

#Calculamos la raiz
raiz = math.fabs(math.sqrt((math.pow((x1-x2),2) + math.pow((y1-y2),2))))

#Mostramos por pantalla
print("La distancia es de",raiz);
