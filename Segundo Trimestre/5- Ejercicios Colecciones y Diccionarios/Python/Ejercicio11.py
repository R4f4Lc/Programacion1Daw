"""
Ejercicio 11
Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap
para almacenar las parejas de palabras. El programa pedirá una palabra en
español y dará la correspondiente traducción en inglés.

Realiza un programa que escoja al azar 5 palabras en español del
minidiccionario del ejercicio anterior. El programa irá pidiendo que el
usuario teclee la traducción al inglés de cada una de las palabras y
comprobará si son correctas. Al final, el programa deberá mostrar cuántas
respuestas son válidas y cuántas erróneas.

@author: RafaLpeC
"""

import random

diccionario={'Edad':'Age', 'Aire':'Air', 'Respuesta':'Answer','Arte':'Art','Bebé':'Baby',
             'Pelota':'Ball','Cuerpo':'Body','Caja':'Box','Circulo':'Circle','Gato':'Cat',
             'Perro':'Dog','Huevo':'Egg','Escritorio':'Desk','Pais':'Country','Nube':'Cloud',
             'Vaca':'Cow','Maiz':'Corn','Vestido':'Dress','Bicicleta':'Bicycle','Ropa':'Clothes'}

listaDiccionario = []
palabrasAleatorias = []

contadorFallos = 0
contadorAciertos = 0
indice = 0

for i in diccionario:
    listaDiccionario.append(i)

random.shuffle(listaDiccionario)

for i in range(5):
    palabrasAleatorias.append(listaDiccionario.pop(0))

for i in palabrasAleatorias:
    respuesta = input("Introduca la traduccion de la palabra "+ i +"\n")

    if(respuesta == diccionario.get(i)):
        contadorAciertos = contadorAciertos+1
    else:
        contadorFallos = contadorFallos +1
    indice = indice +1

print("Has acertado " + str(contadorAciertos)+ " palabras.")
print("Has fallado "+str(contadorFallos)+" palabras.")