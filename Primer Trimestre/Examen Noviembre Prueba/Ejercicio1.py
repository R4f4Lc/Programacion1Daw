"""
Haz un programa en Java y Python que calcule el combinatorio de dos numeros. 
Si hay un error en la introducción debe indicarlos.

__author__ = "Rafael Lopez Cruz"
"""
#Pedimos n y m
n = int(input("Introduce n:"))
m = int(input("Introduce m:"))

#Declaramos valores de factorial
factorial1 = n
factorial2 = m
factorial3 = factorial1 - factorial2

#Si es mayor n que m entra si no no
if (n>m):
    #Bucle for para calcular factorial de n
    for x in range(n-1, -1, -1):
        if x == 0:
            x = 0
        else:
            n = n * x
            #print("N:",n) 
    #Bucle for para calcular factorial2
    for x in range(m-1, -1, -1):
        if x == 0:
            x = 0
        else:
            factorial2 = m * x
            #print("Factorial2:",factorial2)
            
    #Bucle for para calcular factorial3
    for x in range(factorial3-1, -1, -1):
        if x == 0:
            x = 0
        else:
            factorial3 = factorial3 *  x
            #print("Factorial3:",factorial3)
            
    #Calcula el numero combinatorio
    calcula = n / (factorial3 * factorial2)

    print("El numero combinatorio es",calcula)

else:
    print("N tiene que ser mayor que M")