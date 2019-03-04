from Discos import Discos
from sys import exit

codigoIntroducido=""
primeraLibre=-1
existeCodigo=True

# Se crea el array de discos, determinando su tamaño y creando todos los discos que van en cada una de las celdas del array correspondiente
album=[]
for x in range(100):
    album.append(Discos(x))

# Menú 
while True:
    print("\n\nCOLECCIÓN DE DISCOS")
    print("===================")
    print("1. Listado")
    print("2. Nuevo disco")
    print("3. Modificar")
    print("4. Borrar")
    print("5. Salir")
    opcion=int(input("Introduzca una opción: "))

    ##############################################################################
    ### LISTADO ##################################################################
    ##############################################################################
    
    if opcion==1:
        while True:
            print("\nLISTADO")
            print("=======")
            print("1. Completo")
            print("2. Por autor")
            print("3. Por género")
            print("4. En un rango de duración")
            print("5. Menú principal")
            opcionListado=int(input("Introduzca una opción: "))
            
            if opcionListado==1: ## Listado completo ################
                for N in range(100):
                    if (album[N].getCodigo()!="LIBRE"):
                        print("------------------------------------------")
                        print("Código: " + str(album[N].getCodigo()))
                        print("Autor: " + str(album[N].getAutor()))    
                        print("Título: " + str(album[N].getTitulo()))
                        print("Género: " + str(album[N].getGenero()))
                        print("Duración: " + str(album[N].getDuracion()))
                        print("------------------------------------------")
                    
            if opcionListado==2: ## Listado por autor ################
                autorIntroducido=input("Introduzca el autor: ")
                
                for N in range(100):
                    if (album[N].getCodigo()!="LIBRE" and album[N].getAutor()==autorIntroducido):
                        print("------------------------------------------")
                        print("Código: " + str(album[N].getCodigo()))
                        print("Autor: " + str(album[N].getAutor()))
                        print("Título: " + str(album[N].getTitulo()))
                        print("Género: " + str(album[N].getGenero()))
                        print("Duración: " + str(album[N].getDuracion()))
                        print("------------------------------------------")
                
            if opcionListado==3: ## Listado por género ################
                generoIntroducido=input("Introduce el género: ")
                
                for N in range(100):
                    if (album[N].getCodigo!="LIBRE" and album[N].getGenero()==generoIntroducido):
                        print("------------------------------------------")
                        print("Código: " + str(album[N].getCodigo()))
                        print("Autor: " + str(album[N].getAutor()))  
                        print("Título: " + str(album[N].getTitulo()))
                        print("Género: " + str(album[N].getGenero()))
                        print("Duración: " + str(album[N].getDuracion()))
                        print("------------------------------------------")
                        
            if opcionListado==4: ## Listado en un rango de duración ################
                print("Establezca el intervalo para la duración")
                limiteInferior=int(input("Introduzca el límite inferior de duración en minutos: "))
                limiteSuperior=int(input("Introduzca el límite superior de duración en minutos: "))
                
                for N in range(100):
                    if (album[N].getCodigo()!="LIBRE" and album[N].getDuracion() <= limiteSuperior and album[N].getDuracion() >= limiteInferior):
                        print("------------------------------------------")
                        print("Código: " + str(album[N].getCodigo())) 
                        print("Autor: " + str(album[N].getAutor()))    
                        print("Título: " + str(album[N].getTitulo()))
                        print("Género: " + str(album[N].getGenero()))
                        print("Duración: " + str(album[N].getDuracion()))
                        print("------------------------------------------")
        
    
            if opcionListado == 5:
                break
    
    ##############################################################################
    ### NUEVO DISCO ##############################################################
    ##############################################################################  
    elif opcion==2:
        print("\nNUEVO DISCO")
        print("===========")
        print("Introduzca un código: ")
        existeCodigo = True    
        while existeCodigo:
            existeCodigo = False
            codigoIntroducido = int(input())
                        
            for N in range(len(album)):
                if(codigoIntroducido==int(album[N].getCodigo())):
                    existeCodigo = True
                                
            if existeCodigo:
                print("Ese código ya existe en la base de datos.")
                print("Introduzca otro código: ")
                            
        album[primeraLibre].setCodigo(codigoIntroducido)
                    
        autorIntroducido=input("Autor: ")
        album[primeraLibre].setAutor(autorIntroducido)
                    
        tituloIntroducido=input("Título: ")
        album[primeraLibre].setTitulo(tituloIntroducido)
                    
        generoIntroducido=input("Género: ")
        album[primeraLibre].setGenero(generoIntroducido)
                    
        duracionIntroducida=input("Duración: ")
        album[primeraLibre].setDuracion(duracionIntroducida)
    
    ##############################################################################
    ### MODIFICAR ################################################################
    ##############################################################################               
    elif opcion==3:
        print("\nMODIFICAR")
        print("===========")
            
        codigoIntroducido=int(input("Por favor, introduzca el código del disco cuyos datos desea cambiar: "))
            
        i = -1
            
        while(album[i].getCodigo()==codigoIntroducido):
            ++i
            
        print("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.")
            
        print("Código: " + str(album[i].getCodigo()))
        codigoIntroducido=int(input("Nuevo código: "))
            
        if (codigoIntroducido!=""):
            album[i].setCodigo(codigoIntroducido)
            
        print("Autor: " + album[i].getAutor())
        autorIntroducido=input("Nuevo autor: ")
            
        if (autorIntroducido!=""):
            album[i].setAutor(autorIntroducido)
                
        print("Título: " + album[i].getTitulo())
        tituloIntroducido=input("Nuevo título: ")
            
        if (tituloIntroducido!=""):
            album[i].setTitulo(tituloIntroducido)
                
        print("Género: " + album[i].getGenero())
        generoIntroducido=input("Nuevo género: ")
            
        if (generoIntroducido!=""):
            album[i].setGenero(generoIntroducido)
                
        print("Duración: " + str(album[i].getDuracion()))
        duracionIntroducida=int(input("Nuevo duración: "))
            
        if (duracionIntroducida!=0):
            album[i].setDuracion(duracionIntroducida)
    
    ##############################################################################
    ### BORRAR ###################################################################
    ##############################################################################           
    elif opcion==4:
        print("\nBORRAR")
        print("======")
            
        print("Por favor, introduzca el código del disco que desea borrar: ")
        existeCodigo = True
        while existeCodigo:
            codigoIntroducido=int(input())
            for N in range(len(album)):
                if(codigoIntroducido==int(album[N].getCodigo())):
                    existeCodigo = False
                                    
            if existeCodigo:
                print("Ese código no existe en la base de datos.")
                print("Introduzca otro código: ")
                
                
        album[codigoIntroducido].setCodigo("LIBRE")
        print("Album borrado")
                
    # Salir del programa en cuestión   
    elif opcion==5:
        exit(0)
                    
                    
                                
                                
                    