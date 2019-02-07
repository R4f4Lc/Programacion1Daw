"""
Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
el vendedor desea saber cuanto dinero obtendrá por concepto 
de comisiones por las tres ventas que realiza en el mes y el 
total que recibirá en el mes tomando en cuenta su sueldo base 
y comisiones.

__author__ = "Rafael López Cruz"
"""

#Preguntamos valores
a = int(input("Dame el valor a: "));
b = int(input("Dame el valor b: "));
c = int(input("Dame el valor c: "));

#Calculamos media
media = (a*0.10) + (b*0.10) + (c*0.10);

#Calculamos los valores de las ventas y mostramos por pantalla
print("La comision de la primera venta es", (a*0.10));
print("La comision de la segunda venta es", (b*0.10));
print("La comision de la tercera venta es",(c*0.10));
print("La media es igual a", media);
