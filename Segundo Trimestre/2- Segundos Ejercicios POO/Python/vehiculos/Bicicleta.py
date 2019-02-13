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

class Bicicleta(Vehiculo):
    
    def __init__(self, tipo):
        Vehiculo.__init__(self)
        self.__tipo = tipo
        self.__caballito = "no"
    
    def arre(self, valor):
        self.__caballito= valor
        
        if(self.__caballito == "si"):
            return "La bicicleta está haciendo el caballito"
        
        return "La bicicleta no está haciendo el caballito"
    
    def __str__(self):
        return "Bicicleta [caballito=" + self.__caballito + ", tipo=" + self.__tipo + "]" +  Vehiculo.__str__(self)
    