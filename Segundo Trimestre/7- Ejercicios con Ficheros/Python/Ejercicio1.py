"""
Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.

@author: RafaLpeC
"""

def esPrimo(num):
    if num<2:
        return False
    for x in range(2,num):
        if num % x == 0:
            return False
        return True

primos = []

for x in range(1,500):
    if esPrimo(x) == True:
        primos.append(x);

f = open('primos.dat','w')

for x in primos:
    f.write(str(x)+"\n")

f.close()