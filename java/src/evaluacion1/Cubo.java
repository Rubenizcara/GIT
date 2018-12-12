package evaluacion1;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		/*
		 *lee un número por teclado y calcula el cubo de ese número.
		 */
		
	
		Double n;
		Double Resultado;
		
		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado
										
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor
		// muestro un mensaje informativo
		
		System.out.println("Introduce un valor entero: ");
		n = teclado.nextDouble(); //asigno el valor leido por teclado a la variable n
		
		// Calcular el valor del cubo
		Resultado = n * n * n;
		
		System.out.println("El valor de la variable es " + Resultado );
		
		teclado.close(); //libero la memoria asignada al objeto llamado teclado
	}

}
