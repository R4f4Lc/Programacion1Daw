"""
Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la línea de comandos.

@author: RafaLpeC
"""

import sys

repetida = 0
try:
    f = open(sys.argv[1],'r')
    lines = f.readlines()
    for x in lines:
        palabras = x.split("\n")
        for i in palabras:
            if i==sys.argv[2]:
                repetida +=1
    f.close()
    
    print("La palabra",sys.argv[2],"se repite",repetida,"veces.")
    
except Exception:
    print("¡Pasa por parametro un fichero correcto!")