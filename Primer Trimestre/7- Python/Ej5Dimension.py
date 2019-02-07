"""
Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras máximo y mínimo al lado
del máximo y del mínimo respectivamente.

__author__ = "Rafael López Cruz"
"""

n = []
maxs = 0;
mins = 0;

for x in range(10):
  print (x);
  n.append(int(input("Introduce un número: ")));
  if(n[x]>maxs):
    maxs=n[x];
  if(n[x]<mins):
    mins=n[x];
print ("El número máximo es", maxs , "y el número mínimo es", mins);
