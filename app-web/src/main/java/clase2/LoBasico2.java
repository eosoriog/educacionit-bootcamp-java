package clase2;

public class LoBasico2 {

	public static void main(String[] args) {
		// operadores
		float a = 10;
		float b = 0;
		System.out.println(a/b);
		
		float sueldo = 100.5f;
		double sueldo2 = 100.5;
		double sumaDdecimales = sueldo + sueldo2;
		System.out.println(sumaDdecimales);
		
		//casteo
		float altura = 174.3f;
		int alturaInt = (int)altura;
		System.out.println(altura);
		System.out.println(alturaInt);
	}

}
