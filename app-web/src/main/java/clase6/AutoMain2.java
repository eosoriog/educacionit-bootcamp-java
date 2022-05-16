package clase6;

public class AutoMain2 {

	public static void main(String[] args) {
		// instancio
		Auto miAuto = new Auto();
		
		// seteo valores
		miAuto.anio = 2022;
		miAuto.marca = "renault";
		miAuto.modelo = "clio";
		miAuto.velocidad = 0f;
		
		miAuto.encender();
		
		miAuto.acelerar();
		miAuto.acelerar();
		
		miAuto.apagar();
		
		System.out.println("fin del main");
		miAuto = null;
	}

}
