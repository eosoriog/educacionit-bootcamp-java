package clase3;

import java.util.Scanner;

public class ForMain {

	public static void main(String[] args) {
		int sumPares = 0;
		int sumImpares = 0;
		int cantLecturas = 4;
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<cantLecturas; i++) {
			System.out.println("Ingrese valor:");
			numero = teclado.nextInt();
			
			if(numero%2 == 0) {
				sumPares += numero;
			}else {
				sumImpares += numero;
			}
		}
		teclado.close();
		
		if(sumPares < sumImpares) {
			System.out.println("hay más impares...");
		}
		if(sumPares > sumImpares) {
			System.out.println("hay más pares...");
		}
		if(sumPares == sumImpares) {
			System.out.println("hay igual cantidad de pares que impares...");
		}
		
		System.out.println("Suma Pares: " + sumPares);
		System.out.println("Suma Impares: " + sumImpares);
	}

}
