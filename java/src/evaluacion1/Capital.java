package evaluacion1;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		/*
		 *pide una cantidad en euros, un tipo de interés (ej: 5,5%), 
		 *y un período de tiempo expresado en días por pantalla y 
		 *calcula el interés producido en ese tiempo en base a la 
		 *fórmula Interes=(Cantidad*TipoInteres*Tiempo)/(360*100) 
		 *Nota: Para mostrar el carácter ‘%’ dentro de printf debemos
		 * escribir ‘%%’. Sino mostrará una excepción. 
		 */
		
		int tiempo;
		Double cantidad;
		Double tipointeres;
		Double interes;
		
		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado
										
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor
		// muestro un mensaje informativo
		//leer cantidad
		System.out.println("Cantidad: ");
		cantidad = teclado.nextDouble(); //asigno el valor leido por teclado a la variable n
		
		//leer tipointeres
			System.out.println("Tipo de interes: ");
			tipointeres = teclado.nextDouble();
		
		//leer tiempo
		System.out.println("Tiempo en dias: ");
		tiempo = teclado.nextInt();
		
		teclado.close(); //libero la memoria asignada 
		//al objeto llamado teclado
		
		// Calcula el interes
		interes = (cantidad * tipointeres * tiempo)/(360*100);
		
		System.out.println("El interes es " + interes );
		
		
	}

}
