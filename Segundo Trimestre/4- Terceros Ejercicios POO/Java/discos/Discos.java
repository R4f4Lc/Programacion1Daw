
public class Discos {
  String codigo = "LIBRE";
	private String autor;
	private String titulo;
	private String genero;
	private int duracion; // duración total en minutos

	String getCodigo() {
		return codigo;
	}
	
	void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	  
	String getAutor() {
		return autor;
	}
	  
	void setAutor(String autor) {
		this.autor = autor;
	}
	  
	String getGenero() {
		return genero;
	}
	  
	void setGenero(String genero) {
		this.genero = genero;
	}
	  
	String getTitulo() {
		return titulo;
	}
	  
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	  
	int getDuracion() {
		return duracion;
	}
	  
	void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	  
	public String toString() {
		String cadena = "\n------------------------------------------";
	  cadena += "\nCódigo: " + this.codigo;  
	  cadena += "\nAutor: " + this.autor;    
	  cadena += "\nTítulo: " + this.titulo;
	  cadena += "\nGénero: " + this.genero;
	  cadena += "\nDuración: " + this.duracion;
	  cadena += "\n------------------------------------------";
	  
	  return cadena;
	}
}
