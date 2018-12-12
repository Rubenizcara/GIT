package evaluacion2;

import java.util.Scanner;

public class MEDIANUM {

	public static void main(String[] args) {
		//Pide números por pantalla y los almacena 
		//en un array hasta que se introduzca un número
		//negativo que no será tenido en cuenta o hasta
		//que esté lleno el array. Después calcula la 
		//Media y la muestra.
		
		int n, posicion, elementos;
		int [] arrayenteros = new int [5];
		double media;

		Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado								
		teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado
	
		// leer valor
		
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt(); 
		
		elementos =0;
		
		while (elementos < 5 && n >= 0){
			arrayenteros[elementos] = n;
			elementos = elementos +1;
			if (elementos < 5) {
				//leo otro valor
				System.out.println("Introduce un valor: ");
				n = teclado.nextInt();
			}
		
		}
		teclado.close(); //libero la memoria asignada al objeto llamado teclado
		
		posicion = 0;
		media = 0.0;
		
		while (posicion < elementos){
			media = media + arrayenteros[posicion];
			posicion = posicion + 1;
		}
		
		media = media /elementos;
		System.out.println("La media es " + media);
		
	}
	}


