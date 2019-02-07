"""
Crea un programa que pida al usuario dos números 
y muestre su división si el segundo no es cero, 
o un mensaje de aviso en caso contrario.

__author__ = "Rafael López Cruz"
"""

#Se piden los numeros
num1 = int(input("Dime el primer número: "));
num2 = int(input("Dime el segundo número: "));

#Ahora comparamos si num2 es igual que 0 y realizamos la 
#division en caso que num2 no sea igual a 0

if (num2==0):
  print("El segundo número no puede ser 0");

else:
  print("La división es igual a",num1/num2);
