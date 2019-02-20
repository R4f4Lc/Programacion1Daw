'''
Creación de ejemplo de control de JSON en Python.

@author: jsillero | R4f4Lc
'''
'''185.15.76.85 <-- ip ejemplo'''

print("Dime la IP a escanear:") 
ip=input()
'''Pedimos la IP que vamos a escanear y construimos la url a la que vamos a realizar la peticion'''
import json,urllib.request
'''Iniciamos conexion con shodan'''
data = urllib.request.urlopen("https://api.shodan.io/shodan/host/"+str(ip)+"?key=p2s927StbOzkhj8BI5FOEmYQi68gTzAB").read()
'''Obtenemos el json de la pagina y lo guardamos en una variable que llmamamos output'''
output = json.loads(data)

print("Información de", str(ip) )

salida = format(output.get('ip_str'))
print ('IP: ',salida)

salida = format(output.get('isp'))
print ('Proveedor de Servicios de Internet(ISP):',salida)

salida = format(output.get('org'))
print ('Organización:',salida)

salida = format(output.get('hostnames'))
print ('Hostnames: ',salida)

salida=format(output.get('ports'))
print ('Puertos: ',salida)

salida = format(output.get('country_name'))
print ('Pais: ',salida)

salida = format(output.get('longitude'))
longitud=salida
print ('Longitud',salida)

salida = format(output.get('latitude'))
latitud=salida
print ('Latitud',salida)

print("Geolocalización Google Maps: http://maps.google.com/maps?q=" +  str(latitud) + "," + str(longitud))
