"""
Ejercicio 2
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
esos números. El tamaño de la lista también será aleatorio y podrá oscilar
entre 10 y 20 elementos ambos inclusive.

@author: RafaLpeC
"""

from random import randint

suma = 0
minimo = 100
maximo = 0
tamano = randint(10, 20) 

numeros = [randint(0, 100) for _ in range(tamano)]

print("Lista generada:" , numeros)

for i in numeros:
    suma += i

    if (i < minimo):
        minimo = i

    if (i > maximo):
        maximo = i

print("La suma es igual a" , suma);
print("La media es igual a" , suma / tamano);
print("El número más grande es" , maximo,"y el más pequeño es",maximo);