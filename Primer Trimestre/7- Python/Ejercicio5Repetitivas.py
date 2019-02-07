"""
Escribe un programa que pida el limite inferior y superior de un intervalo. 
Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 

A continuación se van introduciendo números hasta que introduzcamos el 0. 
Cuando termine el programa dará las siguientes informaciones:

La suma de los números que están dentro del intervalo (intervalo abierto).
Cuantos números están fuera del intervalo.
Informa si hemos introducido algún número igual a los límites del intervalo.

__author__ = "Rafael López Cruz"
"""

suma = 0;
igual = 0;
fuera = 0;

#Pedimos los limites
lim1 = int(input("Introduce el limite inferior:"));
lim2 = int(input("Introduce el limite superior:"));

#Si limite 1 es mayor que limite 2 se pide hasta introducir uno menor
while lim1 > lim2:
  lim1 = int(input("Introduce el limite inferior:"));
  lim2 = int(input("Introduce el limite superior:"));

#Pedimos numeros y ordenamos si van fuera, son iguales o suma los del intervalo
while True:
  num1 = int(input("Introduce un numero: "));
  if num1<lim2 and num1>lim1:
    suma+=num1;
  
  if num1 == lim1 or num1==lim2:
    igual = igual + 1;
  
  if num1>lim2 or num1<lim1:
    fuera = fuera + 1;
    
  if num1 == 0:
    break;

#Muestra por pantalla
print("La suma de los numeros del intervalo es", suma);
print("Se han quedado fuera del rango un total de", fuera);
print("Y han sido iguales al limite inferior y superior",igual);    
