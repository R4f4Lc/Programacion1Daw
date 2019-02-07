"""
Mostrar en pantalla los N primero número primos. 
Se pide por teclado la cantidad de números primos que queremos mostrar.

__author__ = "Rafael López Cruz"
"""
import math
while True:
  mostrar = int(input("Ingrese la cantidad de números primos a mostrar: "));
  if mostrar > 0:
    break;
  
print("1: 2");
mostrados = 1;
num = 3;

while mostrados < mostrar:
  primo = "true";
  for divisor in range(3,int(math.sqrt(num)),2):
    if (num%divisor == 0):
      primo = "false";
    
  if primo == "true":
    mostrados = mostrados+1;
    print(mostrados,":",num);
  num += 2
    
    
