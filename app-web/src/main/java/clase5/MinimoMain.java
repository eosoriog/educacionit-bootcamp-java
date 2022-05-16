package clase5;

public class MinimoMain {

	public static void main(String[] args) {
		/**
		 * buscar el numero minimo dentro del array
		 */
		int[] edades = {36,31,38,34,29,35,17};
				
		if(edades.length > 0) {
			int min = edades[0];
			int posMin = 0;
			//int cantMin = 0;
			
			int max = edades[0];
			int posMax = 0;
			//int cantMax = 0;
			
			for(int i=0; i<edades.length; i++) {
				
				// calculo del minimo
				if(edades[i] <= min) {
					min=edades[i];
					posMin = i;
					//cantMin++;
				}
				
				// calculo del maximo
				if(edades[i] >= max) {
					max=edades[i];
					posMax = i;
					//cantMax++;
				}
				
			}
			System.out.println("El minimo es: " + min + " y esta en la posición: " + posMin);
			
			System.out.println("El maximo es: " + max + " y esta en la posición: " + posMax);
			
		}else {
			System.out.println("no hay a quien preguntar la edad");
		}
		
	}

}
