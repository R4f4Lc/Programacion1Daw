"""
Realizar un algoritmo que pida números (se pedirá por teclado 
la cantidad de números a introducir). 
El programa debe informar de cuantos números introducidos son 
mayores que 0, menores que 0 e iguales a 0.

__author__ = "Rafael López Cruz"
"""
#Introducimos las repeticiones
repetir = int(input("Introduce un número de repeticiones que vas a introducir: "));

#Bucle for con las repeticiones que ha indicado el usuario.
for x in range(0,repetir):
  numero = int(input("Introduce un número: "));
  #Comprobamos que sea mayor sea igual o menor y muestra el mensaje.
  if numero == 0:
    print("El número es igual a 0");
  elif numero > 0:
    print("El número",numero,"es mayor que 0");
  else:
    print("El número,",numero+"es menor que 0");
