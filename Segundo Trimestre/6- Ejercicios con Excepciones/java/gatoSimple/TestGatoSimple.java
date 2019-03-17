package gatoSimple;

public class TestGatoSimple {
  public static void main(String[] args) {
    GatoSimple garfield = new GatoSimple("macho");
    GatoSimple tom = new GatoSimple("macho");
    GatoSimple lisa = new GatoSimple("hembra");
    GatoSimple luisa = new GatoSimple("hembra");
    System.out.println("Prueba de Apareamiento: ");
    System.out.println("Macho con Macho: ");
    try {
      GatoSimple cria1 = new GatoSimple(garfield.apareaCon(tom));
      cria1.maulla();
    } catch (ExcepcionApareamientoImposible e) {
      System.out.println(e.getMessage());
    }
    
    System.out.println("Hembra con Hembra: ");
    try {
      GatoSimple cria2 = new GatoSimple(lisa.apareaCon(luisa));
      cria2.maulla();
    } catch (ExcepcionApareamientoImposible e) {
      System.out.println(e.getMessage());
    }
    
    System.out.println("Macho con Hembra: ");
    try {
      GatoSimple cria3 = new GatoSimple(garfield.apareaCon(lisa));
      cria3.maulla();
    } catch (ExcepcionApareamientoImposible e) {
      System.out.println(e.getMessage());
    }
  }
}
