package evaluacion1;

import java.util.Scanner;

public class Leernum1 {

	public static void main(String[] args) {
		/*
		 * lee un número entero por teclado, le suma 1, y lo muestra por pantalla.
		 */
		
		int n;
		
		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado
										
		
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor
		// muestro un mensaje informativo
		
		System.out.println("Introduce un valor entero: ");
		n = teclado.nextInt(); //asigno el valor leido por teclado a la variable n
	//le suma 1
			n = n + 1;
		System.out.println("El valor de la variable es " + n );
		
		teclado.close(); //libero la memoria asignada al objeto llamado teclado
	}

}
