package evaluacion2;

import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		// Recibe palabras por teclado y las almacena
		// en un array de Strings en orden alfabético
		// ascendente hasta que llega una cadena vacía
		// que no será tenida en cuenta (isEmpty())
		// o el array esté lleno. Una vez finalizado el
		// proceso muestra el contenido del array por
		// pantalla.

		String cadena;
		int elementos, posicion;
		String diccionario[] = new String[10];

		Scanner teclado;// informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado

		// leer una cadena
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();

		elementos = 0;
		while (!cadena.isEmpty() && elementos < 10) {
			// añado la cadena al diccionario de manera
			// ordenada

			// buscar la posicion
			posicion = 0;
			while (posicion < elementos) {
				// compruebo si es la posicion
				if (cadena.compareTo(diccionario[posicion]) < 0) {
					// si es la posicion
					break;
				}
				// voy a la siguiente posicion
				posicion = posicion + 1;
			}

			// desplazo los elementos desde la posicion, una posicion a la derecha
			for (int posmov = elementos; posmov > posicion; posmov--) {
				diccionario[posmov] = diccionario[posmov - 1];
			}
			// inserto la cadena en la posicion
			diccionario[posicion] = cadena;

			// incremento el numero de elementos
			elementos = elementos + 1;

			// leer otra cadena
			System.out.println("Introduce una cadena: ");
			cadena = teclado.nextLine();
		}
		teclado.close(); // libero la memoria asignada al objeto llamado teclado

		// muestro el contenido del diccionario
		for (posicion = 0; posicion < elementos; posicion++) {
			System.out.println(diccionario[posicion]);
		}
	}
}
