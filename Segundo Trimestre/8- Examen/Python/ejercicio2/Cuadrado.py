from ejercicio2.Rectangulo import Rectangulo

"""
Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
la posibilidad de comparar objetos cuadrados entre sí.

@author: Rafael López
"""

class Cuadrado(Rectangulo):
    
    def __init__(self, lado):
        super().__init__(lado, lado)
        self.lado = lado
        
    @property
    def lado(self):
        return self.__lado
    
    @lado.setter
    def lado(self, lado):
        self.__lado = lado

    """
    Método equals que compara los lados del cuadrado.
    """
    
    def __eq__(self, comparacion):
        if self.__lado == comparacion.__lado:
            return "Los cuadrados son iguales."
        else:
            return "Los cuadrados son distintos."
    
if __name__ == "__main__":
    
    cuadrado1 = Cuadrado(5)
    cuadrado2 = Cuadrado(5)
    print("Cuadrado 1:\n" + cuadrado1.pintarRectangulo() + "Cuadrado 2:\n" + cuadrado2.pintarRectangulo())
    print("Cuadrado 1 y Cuadrado 2:" , cuadrado1 == cuadrado2)
    cuadrado3 = Cuadrado(7)
    cuadrado4 = Cuadrado(6)
    print("Cuadrado 3:\n" + cuadrado3.pintarRectangulo() + "Cuadrado 4:\n" + cuadrado4.pintarRectangulo())
    print("Cuadrado 3 y Cuadrado 4:" , cuadrado3 == cuadrado4)
    