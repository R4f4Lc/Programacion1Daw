"""
Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.

__author__ = "Rafael López Cruz"
"""

mes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]

temperatura = []

for x in range(0,12):
  temperatura.append(input("Introduce la temperatura de "+ mes[x] +  ":"))

print("_________________________________________")
for x in range(0,12):
  print(mes[x] + "=" + temperatura[x] + "Cº");
  print("_________________________________________")
