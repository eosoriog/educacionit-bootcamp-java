package clase7;

public class Buscador {
	// atributos
	String claveBusqueda;
	Articulo[] articulos;
	Integer cantidad;
	
	// constructor
	public Buscador() {
		this.claveBusqueda = "";
		this.articulos = new Articulo[0];
		cantidad = 0;
	}
	
	public Buscador(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
	
	// metodos
	public void buscar(){
		Articulo[] resultados = new Articulo[3];
		resultados[0] = new Articulo(1l, "BATMAN (1970) UN CABALLERO MAS OSCURO", "DC COMICS", 1540.90d, "https://www.tematika.com/media/catalog/Ilhsa/Imagenes/689620.jpg");
		resultados[1] = new Articulo(2l, "BATMAN (2010) UNA NUEVA LEYENDA", "DC COMICS", 1540.90d, "https://www.tematika.com/media/catalog/Ilhsa/Imagenes/689625.jpg");
		resultados[2] = new Articulo(3l, "BATMAN (2000) BATMAN Y ROBIN RENACIDOS", "DC COMICS", 1540.90d, "https://www.tematika.com/media/catalog/Ilhsa/Imagenes/689623.jpg");
		
		this.articulos = resultados;
		this.cantidad = resultados.length;
	}

	public void mostrarCantidadResultados() {
		System.out.println("Hemos Encontrado " + this.cantidad + " Resultados Para '" + this.claveBusqueda + "'");
	}
	
	
	public void MostrarDetalleResultados() {
		if(this.cantidad > 0) {
			System.out.println("\n");
			for(int i=0; i < this.cantidad; i++) {
				
				Articulo unArticulo = this.articulos[i];
				System.out.println(unArticulo.nombre);
				System.out.println(unArticulo.autor);
				System.out.println(unArticulo.precio);
				if(unArticulo.tieneImagen()) {
					System.out.println(unArticulo.urlImage);					
				}
				System.out.println("================================================================");
			}
		}
	}
}
