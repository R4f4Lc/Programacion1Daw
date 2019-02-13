'''
Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
de la primera. Para la clase Vehiculo, crea los atributos de clase
vehiculosCreadosy kilometrosTotales, así como el atributo de instancia
kilometrosRecorridos. Crea también algún método específico para cada una de
las subclases. Prueba las clases creadas mediante un programa con un menú
como el que se muestra a continuación:

@author: Rafael López | RafaLpeC
'''
from vehiculos.Vehiculo import *

class Coche(Vehiculo):
    
    def __init__(self, marca):
        Vehiculo.__init__(self)
        self.__marca = marca
    
    def getMarca(self):
        return self.__marca
    
    def quemaRueda(self):
        return "Rumruuuummrurururuurummmm"
    
    def __str__(self):
        return "Coche [Marca=" + self.getMarca() + "]" +  Vehiculo.__str__(self)