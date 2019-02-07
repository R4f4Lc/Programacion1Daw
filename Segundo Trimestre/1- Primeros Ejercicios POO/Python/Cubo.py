# -*- coding: utf-8 -*-
"""
Cubo.py
Definición de la clase Cubo
__author__ = Rafael López | RafaLpeC
"""

class Cubo():
    
    def __init__(self,capacidad):
        self.capacidad = capacidad
        self.contenido = 0
    
    def getCapacidad(self):
        return self.capacidad
    
    def setContenido(self, litros):
        self.contenido = litros
    
    def vacia(self):
        self.contenido = 0
    
    def llena(self):
        self.contenido = self.capacidad
    
    """
    Pinta el cubo en la pantalla.
    Se muestran los bordes del cubo con el caracter * y el
    agua que contiene con el car�cter.
    """
    
    def pinta(self):
        nivel = self.capacidad
        while nivel > 0:
            if self.contenido >= nivel: 
                print("#~~~~#")
            else:
                print("#    #")
            nivel-=1
        print("######")
    
    def vuelcaEn(self, destino):
        libres = destino.capacidad - destino.contenido
        
        if libres > 0:
            if self.contenido <= libres:
                destino.setContenido(destino.contenido+ self.contenido)
                self.vacia()
            
            else:
                self.contenido -= libres
                destino.llena()
                
                
            