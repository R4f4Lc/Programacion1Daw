# -*- coding: utf-8 -*-
"""
Crea una clase Fraccion (en Java yPython) de forma que podamos hacer las siguientes operaciones:

Contruir un objeto Fraccion pasándole al constructor el numerador y el denominador.
Obtener la fracción.
Obtener y modificar numerador y denominador. No se puede dividir por cero.
Obtener resultado de la fracción (número real).
Multiplicar la fracción por un número.
Multiplicar, sumar y restar fracciones.
Simplificar la fracción.

__author__ = Rafael López | RafaLpeC
"""

from Fraccion import *
salir = True
nu1 = float(input("Introduce el numerador de la primera fracción: "))
de1 = float(input("Introduce el denominador de la primera fracción: "))

frac1 = Fraccion(nu1, de1)
while salir:
    print("1. Obtener la fracción.")
    print("2. Modificar numerador y denominador.")
    print("3. Resultado de la fracción. ")
    print("4. Multiplicar un número a la fracción. ")
    print("5. Multiplicar, sumar y restar dos fracciones.")
    print("6. Salir.")
    opcion = float(input("Elige una opción: (1-6)"))
    if opcion == 1:
        print("La fracción es " + str(frac1.getNum()) + "/" + str(frac1.getDen()))
    if (opcion == 2):
        nu1 = float(input("Introduce el numerador de la primera fracción: "))
        de1 = float(input("Introduce el denominador de la primera fracción: "))
        frac1.numerador = nu1
        frac1.denominador = de1
    if (opcion == 3):
        if(frac1.getFraccion() == 0):
            print("La fracción tiene que tener un denominador mayor que 0")
        else:
            print("La fracción es " + str(frac1.getFraccion()))
    if (opcion == 4):
        num = float(input("Introduce el número a multiplicar: "))
        print("El resultado es " + str(frac1.MultiplicaNum(num)))
    if (opcion == 5):
        nu2 = float(input("Introduce el numerador de la segunda fracción: "))
        de2 = float(input("Introduce el denominador de la segunda fracción: "))
        frac2 = Fraccion(nu2, de2)
        print("La multiplicación de las dos fracciones es igual a " + str(frac1.MultiplicaFrac(frac2)))
        print("La suma de las dos fracciones es igual a " + str(frac1.SumaFrac(frac2)))
        print("La resta de las dos fracciones es igual a " + str(frac1.RestarFrac(frac2)))
    if (opcion == 6):
        salir = False