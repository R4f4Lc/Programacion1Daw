"""
Programa que lea una cadena por teclado 
y compruebe si es una letra mayúscula.

__author__ = "Rafael López Cruz"
"""

#Se pide la letra
letra = str(input("Introduce la letra: "));

#Comparamos si la letra es igual a la misma letra en minúscula
#entonces es mayúscula en caso contrario en minúscula
if (letra==letra.upper()):
  print("Es una letra mayúscula");
else:
  print("Es una letra minúscula");
