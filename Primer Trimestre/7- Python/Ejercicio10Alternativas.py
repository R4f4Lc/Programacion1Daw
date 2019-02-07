"""
Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios 
r1,r2 de dos circunferencias y las clasifique en uno de estos estados:

exteriores
tangentes exteriores
secantes
tangentes interiores
interiores
concéntricas

__author__ = "Rafael López Cruz"
"""
import math
#Pedimos los valores
x1 = int(input("Introduce la coordenada x de la primera circunferencia: "));
y1 = int(input("Introduce la coordenada y de la primera circunferencia: "));
x2 = int(input("Introduce la coordenada x de la segunda circunferencia: "));
y2 = int(input("Introduce la coordenada x de la segunda circunferencia: "));
r1 = int(input("Introduce el radio de la primera circunferencia: "));
r2 = int(input("Introduce el radio de la segunda circunferencia: "));

#Calculamos la distancia y según sea el resultado comparamos con las
#diferentes comparaciones para averriguar si es exterior, etc...

distancia = math.sqrt(math.pow((x1 - x2), 2) + math.pow((y1 - y2), 2));
if (distancia > r1+r2):
  print("La circunferencia es exterior");
if (distancia == r1+r2):
  print("La circunferencia es tangente exterior");
if distancia < r1+r2 and distancia > math.fabs(r1-r2):
  print("La circuferencia es secante");
if distancia == math.fabs(math.fabs(r1-r2)):
  print("La circuferencia es interior");
if(distancia == 0):
  print("La circunferencia es concentrica");
