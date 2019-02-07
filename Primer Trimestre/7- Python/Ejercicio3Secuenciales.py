"""
Dados los catetos de un triángulo rectángulo, 
calcular su hipotenusa

__author__ = "Rafael López Cruz"
"""
import math

#Preguntamos el valor de los catetos
a = int(input("Dame el valor a del cateto: "));
b = int(input("Dame el valor b del cateto: "));

#Calculamos el valor del catero
c = math.sqrt(math.pow(a,2) + math.pow(b,2));

print ("La hipotenusa es igual a", c);

