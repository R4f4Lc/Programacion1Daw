"""
Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
contenidas en un fichero de texto. El nombre del fichero que contiene las
palabras se debe pasar como argumento en la línea de comandos. El nombre
del fichero resultado debe ser el mismo que el original añadiendo la coletilla
sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
línea.

@author: RafaLpeC
"""
import sys

lista = []
try:
    f = open(sys.argv[1],'r')
    lines = f.readlines()
    for x in lines:
        palabras = x.split("\n")
        for i in palabras:
            lista.append(i)
    f.close()
    
    print(lista)
    f2 = open(sys.argv[1]+"_sort.txt", 'w')
    for p in sorted(lista):
        f2.write(p+ "\n")
    f2.close()
    
except Exception:
    print("¡Pasa por parametro un fichero correcto!")