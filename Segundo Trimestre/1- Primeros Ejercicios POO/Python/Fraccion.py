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
from math import fabs

class Fraccion():

    def __init__(self,numer, denomin):
        self.numerador = fabs(numer)
        self.denominador = fabs(denomin)
        self.fraccion = self.numerador/self.denominador
        
    
    def getFraccion(self):
        if self.denominador <= 0:
            return 0
        else:
            return self.fraccion
    
    def getNum(self):
        return self.numerador;
    
    def getDen(self):
        return self.denominador;
    
    def MultiplicaNum(self, num):
        return (abs(num)*self.numerador)/self.denominador;
    
    def MultiplicaFrac(self, frac2):
        return (self.numerador * frac2.numerador)/(self.denominador*frac2.denominador)
    
    def mcm(self, num1, num2):
        if (num1>num2):
            multiplo = num1;
        else:
            multiplo = num2;
        
        while(multiplo%num1!=0 or multiplo%num2!=0):
            multiplo+= 1
        
        return multiplo
    
    def SumaFrac(self, frac2):
        multiplo = self.mcm(self.denominador, frac2.denominador)
        return (((multiplo/self.denominador)*self.numerador) + ((multiplo/frac2.denominador)*frac2.numerador))/multiplo;
    
    def RestarFrac(self, frac2):
        multiplo = self.mcm(self.denominador, frac2.denominador)
        return (((multiplo/self.denominador)*self.numerador) - ((multiplo/frac2.denominador)*frac2.numerador))/multiplo;
    
    def simplificar(self):
        multiplo = self.mcm(self.numerador, self.denominador)
        return "La fracción simplificada es " + self.numerador/multiplo + "/" + self.denominador/multiplo;