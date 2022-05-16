package clase7;

public class TematikaMain {

	public static void main(String[] args) {

		String claveBuscadaPorElUsuario = "batman";
		
		Buscador miBuscador = new Buscador();
		miBuscador.claveBusqueda = claveBuscadaPorElUsuario;
		
		miBuscador.buscar();
		
		miBuscador.mostrarCantidadResultados();
		
		miBuscador.MostrarDetalleResultados();
		
		// ahora agrego los articulos (impares) al carrito
		Carrito carrito = new Carrito();
		for(int i=0; i < miBuscador.articulos.length; i++) {
			
		}
		
	}

}
