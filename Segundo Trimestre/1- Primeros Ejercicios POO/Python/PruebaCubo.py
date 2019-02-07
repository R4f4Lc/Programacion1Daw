# -*- coding: utf-8 -*-
"""
PruebaCubo.py
Programa que prueba la clase Cubo
__author__ = Rafael López | RafaLpeC
"""

from Cubo import *

cubito = Cubo(2)
cubote = Cubo(7)

print("Cubito: \n")
cubito.pinta()

print("\nCubote: \n")
cubote.pinta()

print("\nLleno el cubito: \n")
cubito.llena()
cubito.pinta()

print("\nEl cubote sigue vacío: \n")
cubote.pinta()

print("\nAhora vuelco lo que tiene el cubito en el cubote \n")
cubito.vuelcaEn(cubote)

print("Cubito: \n")
cubito.pinta()

print("\nCubote: \n")
cubote.pinta()

print("\nAhora vuelco lo que tiene el cubote en el cubito \n")
cubote.vuelcaEn(cubito)
cubote.pinta()
print("\n")
cubito.pinta()
