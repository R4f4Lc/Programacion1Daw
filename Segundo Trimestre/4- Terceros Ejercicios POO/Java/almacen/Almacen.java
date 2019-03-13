package almacen;

import java.util.ArrayList;

public class Almacen {
  private ArrayList<Articulo> arrayList;

  /**
   * Añade el artículo al almacén siempre y cuando no exista.
   * @param articulo
   * @return true si se ha añadido. false en otro caso
   */
  boolean add(Articulo articulo) {
    if (arrayList.contains(articulo))
      return false;
    return arrayList.add(articulo);
  }
}
