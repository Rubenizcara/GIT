package evaluacion1;
import java.util.Scanner;
public class SACAPARW {
	public static void main(String[] args) {
		/*
		 * Pide un número entero por teclado y 
		 * muestra los números pares desde 0 
		 * hasta él inclusive. Con MIENTRAS. 
		 */
	
		
		int numero, posicion;
		
		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor muestro un mensaje informativo
		
		//leer numero
		System.out.println("Numero: ");
		numero = teclado.nextInt(); //asigno el valor leido por teclado a la variable n
	
		//cierro el teclado
		teclado.close(); //libero la memoria asignada 
		//al objeto llamado teclado
		
		//muestra todos los numeros PARES desde 0 hasta el inclusive
		// inicializo posicion
		posicion=0;
		while(posicion <= numero) {
			//escribir posicion
			System.out.println(posicion);
			//actualizo posicion
			posicion = posicion + 2;
		}
				
	}

}
