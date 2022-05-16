package clase3;

import java.util.Scanner;

public class PromedioNotas {

	public static void main(String[] args) {
		/**
		 *  Calcular el promedio de notas de un alumno.
		 *  Se debe ingresar las tres notas del año
		 *  si el promedio supera 7, entonces está aprobado
		 *  si el promedio es menor a 7 debemos informar que debe recuperar
		 */
		
		float nota1;
		float nota2;
		float nota3;
		
		// leer notas del teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese Nota 1:");
		nota1 = teclado.nextFloat();
		
		System.out.println("Ingrese Nota 2:");
		nota2 = teclado.nextFloat();
		
		System.out.println("Ingrese Nota 3:");
		nota3 = teclado.nextFloat();
		
		// calculo el promedio de las notas
		float promedio = (nota1+nota2+nota3)/3;
		System.out.println("Tu promedio fue de: " + promedio);
		
		if(promedio > 7) {
			System.out.println("usted está aprobado");
		}else {
			System.out.println("usted ha reprobado");
		}
		
		teclado.close();
	}

}
