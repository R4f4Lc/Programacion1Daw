"""
Ejercicio 3
Escribe un programa que ordene 10 números enteros introducidos por teclado y
 almacenados en un objeto de la clase ArrayList.
 
@author: RafaLpeC
"""

lista = []
i = 0
while(i!=6):
    try:
        lista.append(int(input("Introduzca un número a la lista: ")))
        i = i+1
    except Exception:
        print("¡Introduce un número correcto!")

lista.sort()
print("El número introducido más pequeño es "+str(lista[0]))
print("El número introducido más grande es "+str(lista[5]))