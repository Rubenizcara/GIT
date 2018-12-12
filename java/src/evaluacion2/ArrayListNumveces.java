package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumveces {

	public static void main(String[] args) {
		// Pide números del 1 al 5 por pantalla y calcula el número de veces que han sido
		// introducidos utilizando un ArrayList. Finaliza la introducción de datos cuando se 
		// introduzca un número incorrecto. Al finalizar muestra por pantalla el número de 
		// veces que se ha introducido cada número.  
		
		int n,valor, posicion;
		
		//creo el arrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); 		
		
		//lo inicializo con 10 elementos
		for  (posicion = 0; posicion < 10; posicion++) {
			arrayList.add(0);
		}
		Scanner teclado;// informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado

		// leer el valor
		System.out.println("Introduce un valor: ");
		n = teclado.nextInt();

		while (n >=0 && n <=9){
			//cogo el valor que hay en esa posicion en arrayList 
			valor = arrayList.get(n);
			//le sumo 1
			valor = valor + 1;
			//actualizo el valor que hay en esa posicion en arraylist
			arrayList.set(n, valor);
			
			System.out.println("Introduce un valor: ");
			n = teclado.nextInt(); 
			}
		
		teclado.close(); //libero la memoria asignada al objeto llamado teclado
		
		// muestro el contenido del arrayList
		for  (posicion = 0; posicion < arrayList.size(); posicion++) {
			valor = arrayList.get(posicion);
			System.out.println(posicion + " : " +valor + " veces");
		}

			
			}
		}