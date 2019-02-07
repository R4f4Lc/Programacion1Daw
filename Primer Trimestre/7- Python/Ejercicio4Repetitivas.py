"""
Escribir un programa que imprima todos los números pares 
entre dos números que se le pidan al usuario.

__author__ = "Rafael López Cruz"
"""

#Pedimos los numeros
num1 = int(input("Introduce el primer número: "));
num2 = int(input("Introduce el segundo número: "));

#Comprobamos si num1 es mayor que num2 y si no cambiamos valores
if (num1 > num2):
  medio = num1;
  num2 = medio;

#Comprobamos si es par o impar y si es impar le sumamos 1
if (num1 % 2 != 0):
  num1 = num1+1;
  print(num1);

while True: #Esto seria el do en java
  if (num1 < num2 and num1 % 2 == 0):
    num1 = num1+2;
    if (num1 < num2):
      print(num1);
      
  if (num1 > num2): #Condición while en java para romper
    break; #El break rompe el bucle
