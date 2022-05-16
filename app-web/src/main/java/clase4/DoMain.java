package clase4;

import java.util.Scanner;

public class DoMain {

	public static void main(String[] args) {
		/**
		 * leer un dato hasta que el usuario ingrese cero
		 */
		Scanner teclado = new Scanner(System.in);
		int opcion;
		int continuar;
		
		do {
			
			do {
				mostrarMenu();
				opcion = teclado.nextInt();
			}while(opcion < 0 || opcion > 4);
			
			System.out.println("Desea continuar (1=si, 0=no)");
			continuar = teclado.nextInt();
		}while(continuar == 1);
		
		teclado.close();
		System.out.println("Fin");
	}
	
	private static void mostrarMenu() {
		System.out.println("Ingrese operación:");
		System.out.println("1 = suma");
		System.out.println("2 = resta");
		System.out.println("3 = multiplicación");
		System.out.println("4 = division");
		System.out.println("0 = salir");
	}

}
