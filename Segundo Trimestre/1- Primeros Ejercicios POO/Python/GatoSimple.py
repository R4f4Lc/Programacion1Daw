"""
GatoSimple.py
Definición de la clase GatoSimple
__author__ : Rafael López | RafaLpeC
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
    
    
    def peleaCon(self,contrincante):
        if self.sexo == "hembra":
            print("No me gusta pelear.")
        else:
            if contrincante.sexo == "hembra":
                print("No peleo contra gatitas.")
            else:
                print("Ven aquí que te vas a enterar.")
