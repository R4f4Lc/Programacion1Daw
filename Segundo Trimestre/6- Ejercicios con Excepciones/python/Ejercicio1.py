"""
Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.

__author__ = 'R4f4Lc'

"""

i=0
n = 0
numero = []
while(i!=6):
    try:
        n = int(input("Introduce un número: "))
        numero.append(n)
        i = i+1

    except ValueError:
        print("¡Introduce un número correcto!")

numero.sort()
print("El número introducido más pequeño es " + str(numero[0]))
print("El número introducido más grande es " + str(numero[len(numero)-1]))