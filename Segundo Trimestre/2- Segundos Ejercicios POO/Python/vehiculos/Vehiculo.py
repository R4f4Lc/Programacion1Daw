'''
Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
de la primera. Para la clase Vehiculo, crea los atributos de clase
vehiculosCreadosy kilometrosTotales, así como el atributo de instancia
kilometrosRecorridos. Crea también algún método específico para cada una de
las subclases. Prueba las clases creadas mediante un programa con un menú
como el que se muestra a continuación:

@author: Rafael López | RafaLpeC
'''

class Vehiculo():
    global kilometrosTotales
    kilometrosTotales = 0
    __contadorVehiculos = 0
    
    def __init__(self):
        self.__kilometrosRecorridos = 0
        self.__contadorVehiculos+=1
    
    def getVehiculosCreados(self):
        return self.__contadorVehiculos

    def setKilometrosTotales(self, km):
        global kilometrosTotales
        kilometrosTotales += km
        
    def getKilometrosTotales(self):
        return kilometrosTotales
    
    def getKilometrosRecorridos(self):
        return self.__kilometrosRecorridos
    
    def setKilometrosRecorridos(self, km):
        self.__kilometrosRecorridos += km
        self.setKilometrosTotales(km)
    
    def andar(self, km):
        self.setKilometrosRecorridos(km)
    
    def __str__(self):
        return "Vehiculo [getVehiculosCreados()=" + str(self.getVehiculosCreados()) + ", getKilometrosTotales()=" + str(self.getKilometrosTotales()) + ", getKilometrosRecorridos()=" + str(self.getKilometrosRecorridos()) + "]"
