package clase4;

public class Repaso {

	public static void main(String[] args) {
		float resultado = funcionXmas2(2);
		System.out.println(resultado);
	}

	static float funcionXmas2(float x) {
		float y = x + 2;
		return y;
	}
	
	static float dividir(float a, float b) {
		float res;
		if(b != 0) {
			res = a/b;
		}else {
			System.out.println("no se puede dividor por 0");
			res = -1;
		}
		return res;
	}
	
	static void mostrarParidad(float numero) {
		boolean esPar = (numero%2 ==0) ? true : false;
		System.out.println(esPar ? "es par" : "es impar");
	}
	
}
