package clase5;

import java.util.Scanner;

public class PisosMain {

	public static void main(String[] args) {
		/**
		 * cosntruir un edificio de tamaño indicado por el usuario
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el tamaño:");
		int tamanio = teclado.nextInt();
		
		String[] edificio = new String[tamanio];
		
		System.out.println(edificio.length);
		
		// cargar los nombres de las personas que viven en el edificio
		for(int piso=0; piso<edificio.length; piso++) {
			edificio[piso] = "persona-"+piso;
		}
		
		// como recorrer un array
		for(int piso=0; piso<edificio.length; piso++) {
			String fulano = edificio[piso];
			
			// mostrar su nombre y piso
			System.out.println(fulano + " vive en el piso " + piso);
		}
		teclado.close();
	}

}
