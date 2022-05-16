package clase5;

import java.util.Arrays;

public class MinimoMainRefactor {

	public static void main(String[] args) {
		/**
		 * buscar el numero minimo dentro del array
		 */
		int[] edades = {36,16,31,38,34,16,29,35,17,17,16};
				
		if(edades.length > 0) {
			int minimo = calcularMinimo(edades);
			int cantidadMinimos = contarMinimos(minimo, edades);
			int[] posiciones = indicarPosiciones(cantidadMinimos, minimo, edades);
			
			System.out.println("El minimo es: " + minimo + " hay " + cantidadMinimos + " y esta en: " + Arrays.toString(posiciones));

		}else {
			System.out.println("no hay a quien preguntar la edad");
		}
		
	}
	
	static int[] indicarPosiciones(int cantidadMinimos, int minimo, int[] edades) {
		int[] posicionesMinimos = new int[cantidadMinimos];
		int j = 0;
		
		for(int i=0; i<edades.length; i++) {
			if(edades[i] == minimo) {
				posicionesMinimos[j] = i;
				j++;
			}
		}
		return posicionesMinimos;
	}

	static int contarMinimos(int minimo, int[] edades) {
		int cantidad = 0;
		for(int i=0; i<edades.length; i++) {
			if(edades[i] == minimo) {
				cantidad++;
			}
		}
		return cantidad;
	}

	static int calcularMinimo(int[] edades){
		int minimo = edades[0];
		for(int i=0; i<edades.length; i++) {
			if(edades[i] <= minimo) {
				minimo=edades[i];
			}
		}
		return minimo;
	}

}
