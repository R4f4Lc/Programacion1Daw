from ejercicio2.Rectangulo import Rectangulo

"""
Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
la posibilidad de comparar objetos cuadrados entre sí.

@author: Rafael López
"""

class Cuadrado(Rectangulo):
    
    def __init__(self, lado):
        super().__init__(lado, lado)
        
    @property
    def lado(self):
        return self.ancho
    
    @lado.setter
    def lado(self, lado):
        self.ancho = lado
        self.alto = lado

    """Sobrecarga del operador >"""
    def __gt__(self, other):
        if not isinstance(other, Cuadrado):
            raise Exception
        else:
            return (self.lado) > (other.lado)
        
    """Sobrecarga del operador >="""
    def __ge__(self, other):
        if not isinstance(other, Cuadrado):
            raise Exception
        else:
            return (self.lado) >= (other.lado)
        
    """Sobrecarga del operador =="""
    def __eq__(self, other):
        if not isinstance(other, Cuadrado):
            raise Exception
        else:
            return (self.lado) == (other.lado)
    
if __name__ == "__main__":
    try:
        cuadrado1 = Cuadrado(5)
        cuadrado2 = Cuadrado(5)
        print("Cuadrado 1:\n" + str(cuadrado1) + "Cuadrado 2:\n" + str(cuadrado2))
        print("Cuadrado 1 y Cuadrado 2:" , cuadrado1 == cuadrado2)
        cuadrado3 = Cuadrado(7)
        cuadrado4 = Cuadrado(6)
        print("Cuadrado 3:\n" + str(cuadrado3) + "Cuadrado 4:\n" + str(cuadrado4))
        print("Cuadrado 3 y Cuadrado 4:" , cuadrado3 == cuadrado4)
        cuadrado6 = Cuadrado(12)
    except ArithmeticError as e:
        print(e)