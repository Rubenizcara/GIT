package evaluacion1;
import java.util.Scanner;
public class SUMANUMF {
	public static void main(String[] args) {
		/*
		 *  pide un numero entero por teclado y 
		 *  muestra la suma de todos los números 
		 *  desde 1 hasta el inclusive. Con PARA. 
		 */
	
		
		int numero, posicion, suma;
		
		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado		
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
		
		// antes de leer el valor muestro un mensaje informativo
		
		//leer numero
		System.out.println("Numero: ");
		numero = teclado.nextInt(); //asigno el valor leido por teclado a la variable n
	
		//cierro el teclado
		teclado.close(); //libero la memoria asignada 
		//al objeto llamado teclado
		
		//muestra todos los numeros DESDE 1 HASTA EL INCLUSIVE
		suma = 0;
		
		for(posicion = 1; posicion <= numero; posicion = posicion + 1) {
			//calculo suma
			suma = suma + posicion;
		
		}
			//muestro la suma
		System.out.println(" La suma de los "+numero+ " primeros números es " +suma);
	}

}
