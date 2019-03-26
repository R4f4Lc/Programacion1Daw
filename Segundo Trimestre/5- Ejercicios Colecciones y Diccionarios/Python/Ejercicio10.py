"""
Ejercicio 10
Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap
para almacenar las parejas de palabras. El programa pedirá una palabra en
español y dará la correspondiente traducción en inglés.

@author: RafaLpeC
"""

diccionario={'Edad':'Age', 'Aire':'Air', 'Respuesta':'Answer','Arte':'Art','Bebé':'Baby',
             'Pelota':'Ball','Cuerpo':'Body','Caja':'Box','Circulo':'Circle','Gato':'Cat',
             'Perro':'Dog','Huevo':'Egg','Escritorio':'Desk','Pais':'Country','Nube':'Cloud',
             'Vaca':'Cow','Maiz':'Corn','Vestido':'Dress','Bicicleta':'Bicycle','Ropa':'Clothes'}

respuesta = (input("Introduzca una palabra en español: "))

if(respuesta in diccionario):
    print(respuesta,'en inglés es',diccionario.get(respuesta)+".")
else:
    print("No existe la palabra introducida.")
