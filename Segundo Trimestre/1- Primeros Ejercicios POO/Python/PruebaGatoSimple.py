# -*- coding: utf-8 -*-

from GatoSimple import  *

garfield = GatoSimple("macho")
garfield.maulla()
print("Toma tarta.")
garfield.comida = "tarta selva negra"
garfield.come()

print("Toma pescado, a ver si esto te gusta.")
garfield.comida = "pescado"
garfield.come()

tom = GatoSimple("macho")
print("Tom, toma sopita de verduras.")
tom.comida = "sopa de verduras"
tom.come()

lisa = GatoSimple("hembra")

print("gatitos, a ver cómo maullais")
garfield.maulla()
tom.maulla()
lisa.maulla()

garfield.peleaCon(lisa)
lisa.peleaCon(tom)
tom.peleaCon(garfield)