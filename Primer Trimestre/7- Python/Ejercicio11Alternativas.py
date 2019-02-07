"""
Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:

Si se cumple Pitágoras entonces es triángulo rectángulo
Si sólo dos lados del triángulo son iguales entonces es isósceles.
Si los 3 lados son iguales entonces es equilátero.
Si no se cumple ninguna de las condiciones anteriores, es escaleno.

__author__ = "Rafael López Cruz"
"""

import math
#Pedimos los valores
a = int(input("Indica el primer valor: "));
b = int(input("Indica el segundo valor: "));
c = int(input("Indica el tercer valor: "));

#Calculamos y mostramos que tiene de triangulo es
if (math.pow(a,2) + math.pow(b,2) == math.pow(c,2)):
  print("Es un triangulo rectangulo");

else:
  print("Es un triangulo isosceles");
  if (a==b and a!=c or c==b and c!=a):
    print("Es un triangulo equilatero");
  else:
    print("Es un triangulo escaleno");
