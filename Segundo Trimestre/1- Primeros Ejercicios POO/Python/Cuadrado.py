# -*- coding: utf-8 -*-
"""
Cuadrado.py
Definición de la clase Cuadrado
__author__ = Rafael López | RafaLpeC
"""

class Cuadrado():

    def __init__(self,lado):
        self.lado = lado

    def toString(self):
        resultado = "";
        for x in range(0, self.lado):
            resultado += str("￿￿￿￿￿￿￿￿￿￿[]")
            
        resultado+="\n"
        

        for x in range(1, self.lado-1):
            resultado += str("￿￿￿￿￿￿￿￿￿￿[]")
            
            for x in range(1, self.lado-1):
                resultado += "  "
                
            resultado += str("￿￿￿￿￿￿￿￿￿￿[]\n")

            
        for x in range(0, self.lado):
            resultado += str("￿￿￿￿￿￿￿￿￿￿[]")
        
        resultado += "\n"
        
        return resultado
            