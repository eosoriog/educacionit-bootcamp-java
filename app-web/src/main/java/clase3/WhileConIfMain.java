package clase3;

import java.util.Scanner;

public class WhileConIfMain {

	public static void main(String[] args) {
		int cont = 0;
		int numero;
		
		// leer desde teclado
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese dato: ");
		numero = teclado.nextInt();
		
		while(numero != 0 && cont < 6) {
			cont++;
			System.out.println("Ingrese dato: ");
			numero = teclado.nextInt();
		}
		teclado.close();
		System.out.println("fin");
	}

}
