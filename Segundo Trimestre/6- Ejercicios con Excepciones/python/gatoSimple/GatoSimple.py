"""
GatoSimple.py
Definición de la clase GatoSimple
__author__ : Rafael López | RafaLpeC

"""

from random import randint

"""
Clases del Error de apareamiento

"""
class Error(Exception):
    pass

class ExcepcionApareamientoImposible(Error):
    pass

"""
Clase GatoSimple.
    -Obtener sexo
    -Maullar
    -Ronronear
    -Comer
    -Aparearse con otro gato de su mismo sexo
    -Pelearse con otro gato

"""
class GatoSimple():
    def __init__(self,sexo):
        self.sexo = sexo
    
    def getSexo(self):
        return self.sexo;
    
    def maulla(self):
        print("Miauuuu");
    
    def ronronea(self):
        print("mrrrrrr");
    
    """
    Hacer que el gato coma.
    A los gatos les gusta el pescado, si le damos otra comida
    la rechazará
    """
    def come(self):
        if self.comida == "pescado":
            print("Hmmm, gracias")
        
        else:
            print("Lo siento, yo solo como pescado")
    
    """
    
    
    """
    def apareaCon(self, pareja):
        try:
            if self.sexo == pareja.sexo:
                raise ExcepcionApareamientoImposible

            else:
                if(randint(1,2) == 1):
                    return GatoSimple("hembra")
                else:
                    return GatoSimple("macho")
                
        except ExcepcionApareamientoImposible:
            print("Dos gatos del mismo sexo no pueden criar.")

    def peleaCon(self,contrincante):
        if self.sexo == "hembra":
            print("No me gusta pelear.")
        else:
            if contrincante.sexo == "hembra":
                print("No peleo contra gatitas.")
            else:
                print("Ven aquí que te vas a enterar.")

