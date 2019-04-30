"""
Crea la clase Rectángulo de forma que:
Un objeto de esta clase se construye pasándole el ancho y el alto. Ninguno de los dos atributos
puede ser menor o igual a cero ni mayor que diez, en esos casos se debe lanzar la excepción
ArithmeticException.
Mediante getters y setters permite que se acceda y se modifique el ancho y el alto del
rectángulo teniendo en cuenta las restricciones en cuanto a las dimensiones del apartado
anterior. 
Al imprimir en pantalla un objeto de la clase usando print se debe dibujar el
rectángulo por la pantalla.

@author: Rafael López
"""

class Rectangulo():
    
    def __init__(self, ancho, alto):
        Rectangulo.__comprobarAncho(ancho)
        Rectangulo.__comprobarAlto(alto)
        self.__ancho = ancho
        self.__alto = alto
    
    @property
    def ancho(self):
        return self.__ancho
    @property
    def alto(self):
        return self.__alto
    
    @ancho.setter
    def ancho(self, ancho):
        Rectangulo.__comprobarAncho(ancho)
        self.__ancho = ancho
        
    @alto.setter
    def alto(self, alto):
        Rectangulo.__comprobarAlto(alto)
        self.__alto = alto
    
    @staticmethod
    def __comprobarAncho(ancho):
        if ancho <= 0 or ancho > 10:
            raise TypeError("El ancho indicado es inválido.")
    
    @staticmethod
    def __comprobarAlto(alto):
        if alto <= 0 or alto > 10:
            raise TypeError("El alto indicado es inválido.")
    
    def pintarRectangulo(self):
        resultado=""
        for x in range(0,self.ancho):
            resultado += str("[]")
        resultado += "\n"
        
        for x in range(1,self.alto -1):
            resultado += str("[]")
            
            for x in range(1,self.ancho -1):
                resultado += "  "
            resultado += str("[]\n")
            
        for x in range(0,self.ancho):
            resultado += str("[]")
        resultado += "\n"
        
        return resultado

    
if __name__ == "__main__":
    rectangulo = Rectangulo(int(input("Introduce el ancho:")),int(input("Introduce el alto:")))
    print(rectangulo.pintarRectangulo())