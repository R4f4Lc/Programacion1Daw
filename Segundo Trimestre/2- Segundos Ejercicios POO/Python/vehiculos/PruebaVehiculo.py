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
from vehiculos.Bicicleta import *
from vehiculos.Coche import *

biciRoja = Bicicleta("ciudad")
cocheMini = Coche("seat")

def mostrarMenu():
        print("VEHICULOS:")
        print("1. Anda con la bicicleta.")
        print("2. Haz el caballito con la bicicleta. ")
        print("3. Anda con el coche.")
        print("4. Quema rueda con el coche.")
        print("5. Ver kilometraje de la bicicleta. ")
        print("6. Ver kilometraje del coche.")
        print("7. Ver kilometraje total.")
        print("8. Salir")

def Andar(vehiculo):
    km = float(input("¿Cuántos kilometros quieres andar con el vehiculo?"))
    vehiculo.andar(km)
    print("El vehiculo ha andando " + str(km) + " kilometros")
    print(vehiculo)

def CaballitoBici(bici):
    print(bici.arre("si"))

def QuemaRueda(vehiculo):
    print(vehiculo.quemaRueda())

def Kilometraje(vehiculo):
    print("El vehiculo tiene un total de " + str(vehiculo.getKilometrosRecorridos()) + " kilometros.")
    
def KilometrajeTotal():
    print("Los dos vehiculos han recorrido un total de " + str(biciRoja.getKilometrosTotales()))

salir = 0

print(biciRoja)
print(cocheMini)

while True:
    mostrarMenu()
    opcion = int(input("Elije una opción(1-8):"))
    print(opcion)
    if opcion == 1:
        Andar(biciRoja)
    elif (opcion == 2):
        CaballitoBici(biciRoja)
    elif opcion == 3:
        Andar(cocheMini)
    elif opcion == 4:
        QuemaRueda(cocheMini)
    elif opcion == 5:
        Kilometraje(biciRoja)
    elif opcion == 6:
        Kilometraje(cocheMini)
    elif opcion == 7:
        KilometrajeTotal()
    elif opcion == 8:
        salir = 1

    if (salir == 1):
        break
    else: 
        print("Introduce una opción correcta.")

