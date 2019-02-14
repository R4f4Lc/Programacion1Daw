'''
Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
30) donde los parámetros que se le pasan al constructor son las horas, los
minutos y los segundos respectivamente. Crea el método toString para ver los
intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
comprobar que la clase funciona bien.

El ejercicio 6 anterior te pide que crees una clase "Tiempo" y un programa de prueba. 
Investiga si ya existe en Java y Python una clase similar y adapta tus programas de prueba 
para trabajar con esas clases.

@author: Rafael López | RafaLpeC
'''

from datetime import timedelta

hora = timedelta(hours=0,minutes= 30, seconds = 40)
print("Hora 1: " + str(hora))

hora2 = timedelta(hours=0,minutes= 35,seconds = 20)
print("Hora 2: " + str(hora2))

hora3 = timedelta(hours=1,minutes= 35,seconds = 20)
print("Hora 3: " + str(hora3))

print("Suma de Hora 1 y Hora 2 = " + str(hora + hora2))

print("Resta de Hora 3 y Hora 1 = " + str(hora3 - hora))