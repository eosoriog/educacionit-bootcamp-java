package clase4;

import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		/**
		 * realizar mini calculadora
		 */
		
		short opcion = 0;
		short continuar;
		double val1;
		double val2;
		double res;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			do {
				mostrarMenu();
				opcion = teclado.nextShort();
			}while(opcion < 0 || opcion > 4);
			
			if(opcion == 0) {
				System.out.println("Saliendo....");
				System.exit(0);
			}
			
			val1 = leerDato("Ingrese valor 1:", teclado);
			val2 = leerDato("Ingrese valor 2:", teclado);
	
			switch(opcion) {
			case 1:
				res = val1 + val2;
				mostrarResultado('+', res);
				break;
			case 2:
				res = val1 - val2;
				mostrarResultado('-', res);
				break;
			case 3:
				res = val1 * val2;
				mostrarResultado('*', res);
				break;
			case 4:
				if(val2 != 0) {
					res = val1 / val2;
					mostrarResultado('/', res);
					break;				
				}else {
					System.out.println("No se puede dividir por cero");
				}
			default:
				System.out.println("Opción invalida");
			}
			
			System.out.println("Desea continuar (1=si, 0=no)");
			continuar = teclado.nextShort();
		}while(continuar == 1);
		
		teclado.close();
		System.out.println("Salida exitosa");
	}

	private static void mostrarMenu() {
		System.out.println("Ingrese operación:");
		System.out.println("1 = suma");
		System.out.println("2 = resta");
		System.out.println("3 = multiplicación");
		System.out.println("4 = division");
		System.out.println("0 = salir");
	}
	
	private static void mostrarResultado(char operacion, double resultado) {
		System.out.println("La operacion " + operacion + " = " + resultado);
	}
	
	private static double leerDato(String msj, Scanner teclado) {
		System.out.println(msj);
		return teclado.nextDouble();
	}
}
