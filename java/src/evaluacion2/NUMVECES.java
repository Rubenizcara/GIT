package evaluacion2;

import java.util.Scanner;

public class NUMVECES {

	public static void main(String[] args) {
		/*Pide números de 0 a 9 por pantalla y calcula
		 *el número de veces que han sido introducidos 
		 *utilizando un array. Finaliza la introducción 
		 *de datos cuando se introduce un valor negativo o 
		 *mayor que 9. Al finalizar la introducción de datos 
		 *muestra por pantalla el número de veces que se ha 
		 *introducido cada número.
		 */
		
	int n, posicion;
	int [] arrayenteros = new int[10];
	
	Scanner teclado;//informo de que necesito un objeto de la clase Scanner llamado teclado								
	teclado = new Scanner(System.in); //creo el objeto de la clase Scanner llamado teclado

	// leer valor
	
	System.out.println("Introduce un valor: ");
	n = teclado.nextInt(); 
	
	while (n >=0 && n <=9){
		arrayenteros[n] = arrayenteros[n] +1;
		
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt(); 
		}
	
	teclado.close(); //libero la memoria asignada al objeto llamado teclado
	
	posicion = 0;
	
	while (posicion <10) {
		System.out.println(posicion + " : " + arrayenteros[posicion] + " Veces ");
		posicion = posicion + 1;
	}

		
		}
	}
