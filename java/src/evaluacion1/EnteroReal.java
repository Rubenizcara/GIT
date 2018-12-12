package evaluacion1;
import java.util.Scanner;
public class EnteroReal {
	public static void main(String[] args) {
		/*
		 * lee un número real por teclado y 
		 * muestra por separado su parte entera y su parte real. 
		 */
	
		double n;
		int parteentera;
		double partereal;
		
		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado
										
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor muestro un mensaje informativo
		
		//leer 
		System.out.println("Introduce un valor real: ");
		n = teclado.nextDouble(); //asigno el valor leido por teclado a la variable n
		
		//calcular la parte entera
		parteentera = (int) n;
		
		//calcular la parte real
		partereal = n - parteentera;
		
		teclado.close(); //libero la memoria asignada 
		//al objeto llamado teclado
		
		
		System.out.println(" Parte entera " + parteentera + " parte real " + partereal );
		
		
	}

}
