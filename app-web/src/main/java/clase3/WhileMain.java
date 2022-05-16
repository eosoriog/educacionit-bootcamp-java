package clase3;

import java.util.Scanner;

public class WhileMain {

	public static void main(String[] args) {
		int cont = 0;
		int numero;
		
		// leer desde teclado
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese dato: ");
		numero = teclado.nextInt();
		
		while(numero != 0) {
			if(cont < 6) {
				// verdadero
				cont++;
				System.out.println("Ingrese dato: ");
				numero = teclado.nextInt();
			}else {
				// falso
				break; // permite salir de un ciclo
			}

		}
		teclado.close();
		System.out.println("fin");
	}

}
