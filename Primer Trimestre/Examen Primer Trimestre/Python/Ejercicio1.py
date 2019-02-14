"""
1. Cajero de cambio: devuelve y desglosa el cambio en billetes y monedas de forma "ideal"; es decir,
con el menor numero de billetes y monedas posibles.
Pide un valor en euros y devuelve los billetes de 500, 200, 100, 50, 20, 10 y 5 euros, y las monedas de
2e, 1e, 50c, 20c, 10c, 5c, 2c y 1c. Ejemplo:
Valor en euros: 175,50
Cambio: 1 billete de 100 euros
1 billete de 50 euros
2 billetes de 20 euros
1 billete de 5 euros
1 moneda de 50c

__author__ = Rafael Lopez Cruz
"""
"""
Importamos el paquete decimal la funcion Decimal ya que
con float nos da problemas y aun asi nos da problemas
al restar 0.05, 0.02 y 0.01
"""
from decimal import Decimal
"""
Pedimos los euros y cts y lo almacenamos en la variable euros.
La variable eurostotal es para almacenar los euros que ha introducido
para llamarla mas tarde al final para indicar la cantidad que introdujo
el usuario
"""
euros = Decimal(input("Introduce la cantidad de dinero(Ej 5.54): "))
eurostotal = euros
"""
Declaramos las variables donde vamos a almacenar la cantidad
de monedas y billetes
"""
billete500 = 0
billete200 = 0
billete100 = 0
billete50 = 0
billete20 = 0
billete10 = 0
billete5 = 0
moneda2eur = 0
moneda1eur = 0
moneda50ct = 0
moneda20ct = 0
moneda10ct = 0
moneda5ct = 0
moneda2ct = 0
moneda1ct = 0
"""
Creamos bucles while que se repitan hasta que los euros sean
menor o igual que la cantidad que compara. Por ejemplo si metemos 500 euros
el primer bucle sumara +1 la cantidad de billetes de 500 euros y le resta a
euros los 500 euros quedando en total 0 euros y no entrando en los demas
bucles.
"""
while(euros >= 500):
    billete500 += 1
    euros -= Decimal("500.00")
print(euros)
while(euros >=  200):
    billete200+= 1
    euros-= Decimal("200.00")
while(euros >=  100):
    billete100+=1
    euros -= Decimal("100.00")
while (euros >=  50):
    billete50+=1
    euros -= Decimal("50.00")
while(euros >=  20):
    billete20+=1
    euros-=  Decimal("20.00")
while(euros>= 10):
    billete10+=1
    euros-= Decimal("10.00")
while(euros>= 5):
    billete5+=1
    euros-= Decimal("5.00")
while(euros>= 2):
    moneda2eur+=1
    euros-= Decimal("2.00")
while(euros>= 1):
    moneda1eur+=1
    euros-= Decimal("1.00")
while(euros>0.50):
    moneda50ct+=1
    euros-= Decimal("0.50")
while(euros>0.20):
    moneda20ct+=1
    euros-= Decimal("0.20")
print(euros)
while(euros>0.10):
    moneda10ct+=1
    euros-= Decimal("0.10")
while(euros>0.05):
    moneda5ct+=1
    euros-= Decimal("0.05")
while(euros>0.02):
    moneda2ct+=1
    euros-= Decimal("0.02")
print(euros)
if(euros==Decimal("0.01")):
    moneda1ct+=1
    euros-= Decimal("0.01")

"""
Vamos mostrando por pantalla la cantidad de billetes o monedas de euro.
Para ello compara con todos que tiene que haber como minimo un billete o una moneda
y entonces lo muestra por pantalla.
"""
print("Valor de",eurostotal,":")
if(billete500 >= 1):
    print(billete500,"billetes de 500 euros")

if(billete200 >= 1):
    print(billete200,"billetes de 200 euros")
    
if(billete100 >= 1):
    print(billete100,"billetes de 100 euros")
    
if(billete50 >= 1):
    print(billete50,"billetes de 50 euros")
    
if(billete20 >= 1):
    print(billete20,"billetes de 20 euros")
    
if(billete10 >= 1):
    print(billete10,"billetes de 10 euros")
    
if(billete5 >= 1):
    print(billete5,"billetes de 5 euros")
    
if(moneda2eur >= 1):
    print(moneda2eur,"monedas de 2 euros")
    
if(moneda1eur >= 1):
    print(moneda1eur,"monedas de 1 euros")
    
if(moneda50ct >= 1):
    print(moneda50ct,"monedas de 50cts")
    
if(moneda20ct >= 1):
    print(moneda20ct,"monedas de 20cts")

if(moneda10ct >= 1):
    print(moneda10ct,"monedas de 10cts")
    
if(moneda5ct >= 1):
    print(moneda5ct,"monedas de 5cts")
    
if(moneda2ct >= 1):
    print(moneda2ct,"monedas de 2cts")
    
if(moneda1ct >= 1):
    print(moneda1ct,"moneda de 1cts")