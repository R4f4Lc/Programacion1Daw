"""
Escribe un programa que pida un número entero entre uno y doce 
e imprima el número de días que tiene el mes correspondiente.

__author__ = "Rafael López Cruz"
"""

#Pedimos el numero
num = int(input("Introduce el número de un mes(1-12):"));

#Indicamos numero
if (num == 1):
  print("Este mes tiene 31 dias");

elif (num == 2):
  print("Este mes 28 dias y cuando es bisiesto tiene 29 dias");

elif (num == 3):
  print("Este mes tiene 31 dias");
  
elif (num == 4):
  print("Este mes tiene 30 dias");

elif (num == 5):
  print("Este mes tiene 31 dias");

elif (num == 6):
  print("Este mes tiene 30 dias");

elif (num == 7):
  print("Este mes tiene 31 dias");

elif (num == 8):
  print("Este mes tiene 31 dias");

elif (num == 9):
  print("Este mes tiene 30 dias");

elif (num == 10):
  print("Este mes tiene 31 dias");

elif (num == 11):  
  print("Este mes tiene 30 dias");

elif (num == 12):
  print("Este mes tiene 31 dias");

else:
  print("Introduce un mes que sea correcto!");
