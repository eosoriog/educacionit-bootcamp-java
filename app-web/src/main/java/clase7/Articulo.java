package clase7;

public class Articulo {
	Long id;
	String nombre;
	String autor;
	Double precio;
	String urlImage;
	
	public Articulo(Long id, String nombre, String autor, Double precio, String urlImage) {
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.urlImage = urlImage;
	}
	
	boolean tieneImagen() {
		return this.urlImage != null && this.urlImage != "";
	}
	
	/*
	void agregarAlCarrito() {
		
	}
	*/
}
