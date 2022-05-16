package clase7;

public class Carrito {
	
	// atributos
	Item[] items;
	
	// constructor
	Carrito(){
		this.items = new Item[0];
	}
	
	void agregarAlCarrito(Articulo art) {
		
		// agregar el constructor a Item
		
		Item i = new Item(art,1);
		Item[] nuevos = new Item[this.items.length + 1];
		
		// copiar los actuales al nuevo ....
		
		items[items.length] = i; // ojo, se rompe
		this.items = nuevos;
	}
	
	void seguirComprando() {
		System.out.println("Seguir comprando...");
	}
	
	void limpiar() {
		this.items = new Item[0];
	}
	
	void actualizar(Item[] itemsActualizados) {
		this.items = itemsActualizados;
	}
	
	double obtenerPrecio() {
		double precioFinal = 0d;
		for(Item item : this.items) {
			precioFinal += item.articulo.precio;
		}
		return precioFinal;
	}
	
	void eliminar(Item itemAEliminar) {
		for(Item item : this.items) {
			if(existeItem(item.articulo.id)) {
				// crear un vector con un elemento menos de lo que tiene el original
				//copiarItems();
			}
		}
	}
	
	void copiarItems(Long idArticulo) {
		Item[] nuevos = new Item[this.items.length - 1];
		for(Item item : this.items) {
			if(item.articulo.id.equals(idArticulo)) {
				continue;
			}
		}
		this.items = nuevos;
	}

	boolean existeItem(Long idArticulo) {
		boolean existe = false;
		
		for(Item item : this.items) {
			if(item.articulo.id.equals(idArticulo)) {
				existe = true;
				break;
			}
		}
		return existe;
	}
	
	Integer obtenerCantidadItems() {
		return this.items.length;
	}
}
