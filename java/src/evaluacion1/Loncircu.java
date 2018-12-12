package evaluacion1;

import java.util.Scanner;

public class Loncircu {

	public static void main(String[] args) {
		/*
		 *  lee el valor del radio por teclado y muestra 
		 *  el valor de la circunferencia de ese
		 *  radio por pantalla con dos decimales. 
		 *  Para el cálculo podemos usar la constante Java Math.PI.
		 */
		
		Double n;
		Double Resultado;
		
		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado
										
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor
		// muestro un mensaje informativo
		
		System.out.println("Introduce un valor entero: ");
		n = teclado.nextDouble(); //asigno el valor leido por teclado a la variable n
		
		// Calcular la circunferencia de ese radio
		Resultado = Math.PI * n;
		
		// Muestra el resultado por pantalla
		System.out.printf("El valor de la variable es %.2f ", Resultado );
		
		teclado.close(); //libero la memoria asignada al objeto llamado teclado
	}

}
