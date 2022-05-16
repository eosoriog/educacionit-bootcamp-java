package clase6;

public class AutoMain {

	public static void main(String[] args) {
		// crear nuestro primer objeto de la clase auto
		Auto miAuto = new Auto("renault", "clio", 2022, 200f);
		
		/*
		miAuto.anio = 2022;
		miAuto.marca = "renault";
		miAuto.modelo = "clio";
		miAuto.velocidad = 0f;
		*/
		
		miAuto.encender();
		miAuto.encender();
		
		miAuto = null;
	}

}
