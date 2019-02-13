'''
Implementa la clase Terminal. Un terminal tiene asociado un número. Los 
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla.

@author: Rafael López | RafaLpeC
'''

class Terminal():
    
    def __init__(self,numero):
        self.__numero = numero;
        self.__segundos=0;
    
    def getNumero(self):
        return self.__numero;
    
    def __setNumero(self,numero):
        self.__numero= numero;
    
    def getSegundos(self):
        return self.__segundos;
    
    def setSegundos(self,segundos):
        self.__segundos+=segundos;
    
    def llama(self, t2, segundos):
        self.setSegundos(segundos);
        t2.setSegundos(segundos);
        
    def __str__(self):
        return "Nº " + str(self.getNumero()) + " - " + str(self.getSegundos()) + "s de conversación"
    