package clase6;

public class Auto {
	// atributos
	String marca;
	String modelo;
	int anio;
	boolean encendido;
	float velocidad;
	float velocidadMaxima;
	
	void init() {
		this.encendido = false;
		this.velocidad = 0f;		
	}
	
	// constructor
	Auto(){
		init();
	}
	
	Auto(String marca, String modelo, int anio, float velocidadMaxima){
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.velocidadMaxima = velocidadMaxima;
		init();
	}
	
	// metodos
	void encender(){
		String msj = "encendido previamente";
		if(!this.encendido) {
			this.encendido = true;
			msj = "se ha encendido";
		}
		System.out.println(msj);
	}
	
	void apagar(){
		String msj = "no se puede apagar, ya estaba apagado";
		if (this.encendido) {
			while(this.velocidad > 0) {
				frenar();
			}
			this.encendido = false;
			msj = "se ha apagado";
		}
		System.out.println(msj);
	}

	void acelerar() {
		String msj = "debe encender el auto para acelerar";
		if(this.encendido) {
			this.velocidad++;
			msj = "acelerando, velocidad: " + this.velocidad;
		}
		System.out.println(msj);
	}
	
	void frenar() {
		if(this.encendido) {
			if(this.velocidad > 0) {
				this.velocidad--;
				System.out.println("frenando, velocidad: " + this.velocidad);
			}else {
				System.out.println("el auto está detenido");
			}
		}else {
			System.out.println("el auto está apagado");
		}
	}
	
}
