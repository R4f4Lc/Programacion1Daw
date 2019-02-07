"""
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.

__author__ = "Rafael López Cruz"
"""

num = [];
for x in range(15):
  num.append(int(input("Introduce un número: ")))

num.reverse()

for x in range(15):
  print("Número",x,":",num[x])