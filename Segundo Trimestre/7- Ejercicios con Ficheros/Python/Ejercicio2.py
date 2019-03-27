"""
Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.

@author: RafaLpeC
"""

f = open('primos.dat','r')
lines = f.readlines()
for x in lines:
    print(x)

f.close()