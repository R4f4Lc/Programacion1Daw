"""
2. Validador de DNIs.
Pide un DNI y comprueba que es correcto, sera correcto si tiene 9 caracteres y la letra es correcta.
Para calcular la letra se divide el numero entre 23 y el resto indica la posicion de la cadena de letras:
"TRWAGMYFPDXBNJZSQVHLCKE"
Usar una funcion para validar el DNI y otra que te devuelva la letra del mismo.

__author__ = Rafael Lopez Cruz
"""

"""
Importamos el paquete math
"""
import math

"""
Definimos la funcion Validardni que es la que va
a comprobar que nuestro DNI sea valido.
"""
def Validardni(dni):
    """
    Definimos la variable letras con todo el rango
    de letras posibles en el DNI
    """
    letras = "TRWAGMYFPDXBNJZSQVHLCKE"
    
    """
    Cogemos el numero del DNI con la variable num
    """
    num = dni[0] + dni[1] + dni[2] + dni[3]+ dni[4]+ dni[5]+ dni[6]+ dni[7]
    
    """
    Si la longitud del DNI es 9 entra dentro si no devuelve
    un FALSE.
    """
    if (len(dni) == 9):
        """
        Calculamos el resto con la funcion math.fmod
        """
        division = int(math.fmod(int(num),23))
        
        """
        Guardamos en una variable la letra del DNI introducido
        """
        letradivision = letras[division]
        
        """
        Si la letra que hemos introducido es igual a la letra que
        se ha calculado con la division es correcto el DNI y
        devuelve un TRUE
        """
        if (letradivision == dni[8]):
            return True

"""
Creamos la variable "dni" donde almacenaremos
el dni que introduzca el usuario.
"""

dni = input("Introduce un DNI: ");

"""
Llamamos a la funcion "Validardni()" pasandole como parametro
la variable dni y si devuelve un True el DNI es correcto si no,
no es correcto el DNI.
"""
if (Validardni(dni)):
    print("El DNI",dni,"es valido.");

else:
    print("El DNI",dni,"no es valido.");