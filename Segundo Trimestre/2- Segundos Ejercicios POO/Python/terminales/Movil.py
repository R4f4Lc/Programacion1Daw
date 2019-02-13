'''
Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
llamada. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
decimales, puedes utilizar DecimalFormat.
 
@author: Rafael López | RafaLpeC
'''
from terminales.Terminal import *

class Movil(Terminal):# -*
    
    def __init__(self, numero, tarifa):
        Terminal.__init__(self, numero)
        self.__setTarifa(tarifa)
    
    def __setTarifa(self, tarifa):
        self.__tarifa = tarifa;
    
    def __getTarifa(self):
        return self.__tarifa;
    
    def __calculaTarifa(self):
        mins = self.getSegundos()/60
        
        if (mins == 0):
            return 0
        
        if (self.__getTarifa() == "rata"):
            return mins * 0.06;
        
        if (self.__getTarifa() == "mono"):
            return mins * 0.12;
        
        if (self.__getTarifa() == "bisonte"):
            return mins * 0.30;
        
        return 0;
    
    def llama(self, t2, segundos):
        self.setSegundos(segundos)
    
    def __str__(self):
        return Terminal.__str__(self) + " - tarificados " + '{0:.2f}'.format(self.__calculaTarifa()) + " euros"
