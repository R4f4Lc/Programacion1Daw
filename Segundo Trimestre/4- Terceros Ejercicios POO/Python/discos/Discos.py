class Discos():
   
    def __init__(self,codigo):
        self.__codigo=codigo
        self.__autor=""
        self.__titulo=""
        self.__genero=""
        self.__duracion=0
        
    def getCodigo(self):
        return self.__codigo
    
    def setCodigo(self,codigo):
        self.__codigo=codigo
    
    def getAutor(self):
        return self.__autor
    
    def setAutor(self,autor):
        self.__autor=autor
    
    def getGenero(self):
        return self.__genero
    
    def setGenero(self,genero):
        self.__genero=genero
    
    def getTitulo(self):
        return self.__titulo
    
    def setTitulo(self,titulo):
        self.__titulo=titulo
    
    def getDuracion(self):
        return self.__duracion
    
    def setDuracion(self,duracion):
        self.duracion=duracion
    
    def __str__(self):
        cadena="\n---------------------------------------------------"
        cadena+="\nCódigo: " + self.__codigo
        cadena+="\nAutor: " + self.__autor
        cadena+="\nTítulo: " + self.__titulo
        cadena+="\nGénero: " + self.__genero
        cadena+="\nDuración: " + self.__duracion
        cadena+="\n---------------------------------------------------"
        
        return cadena
        