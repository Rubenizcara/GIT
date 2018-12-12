package evaluacion1;
import java.util.Scanner;
public class VALORABS {
	public static void main(String[] args) {
		/*
		 *  lee una cantidad en euros por teclado y 
		 *  muestra por separado el número de euros y 
		 *  el número de céntimos de euro.
		 */
	
		double cantidad;
		int euros;
		int centimos;
		
		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado
										
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor muestro un mensaje informativo
		
		//leer cantidad
		System.out.println("Cantidad: ");
		cantidad = teclado.nextDouble(); //asigno el valor leido por teclado a la variable n
		
		//calcular euros
		euros = (int) cantidad;
		
		//calcular centimos
		centimos = (int)((cantidad - euros) *100) ;
		
		teclado.close(); //libero la memoria asignada 
		//al objeto llamado teclado
		
		
		System.out.println(" Euros " +euros + " centimos " + centimos );
		
		
	}

}
