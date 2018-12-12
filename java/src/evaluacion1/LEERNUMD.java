package evaluacion1;
import java.util.Scanner;
public class LEERNUMD {
	public static void main(String[] args) {
		/*
		 *  pide un número entero por teclado, 
		 *  si el número entero que se pide por
		 *  teclado es negativo sigue pidiendo 
		 *  números hasta que se introduzca un número
		 *  positivo que muestra por pantalla (con HACER MIENTRAS). 
		 */
	
		
		int numero;
		
		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor muestro un mensaje informativo
		
		//leer numero
		do {
		System.out.println("Numero: ");
		numero = teclado.nextInt(); //asigno el valor leido por teclado a la variable n
		}while(numero <0 );
		//cierro el teclado
		teclado.close(); //libero la memoria asignada 
		//al objeto llamado teclado
		 {
		
			//muestro el numero
		System.out.println(" El numero introducido es el " +numero);
		 }
	}
}

