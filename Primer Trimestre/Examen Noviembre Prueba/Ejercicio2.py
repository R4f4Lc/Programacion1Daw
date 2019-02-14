"""
Haz un programa en Java y Python que calcule el elemento N 
(se pide al usuario) de la serie de Fibonacci.

__author__ = "Rafael López Cruz"
"""
import array
import numpy

#Pedimos numero de la serie de Fibonacci
n = (int(input("Introduce la serie de Fibonacci: ")))

#Declaro array
num = numpy.empty(n+1, dtype=object)
num[0] = 0
num[1] = 1

#Ejecutamos bucle for que va a calcular el numero
for x in range(0, n-2):
    num[x+2] = num[x]+num[x+1]

#Imprimimos
print("El numero de Fibonacci es",num[n-1])
    