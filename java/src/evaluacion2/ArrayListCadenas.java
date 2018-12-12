package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenas {

	public static void main(String[] args) {
		// Recibe Strings por teclado hasta que se introduce un String en blanco y los va 
		// almacenando en un ArrayList. Cuando finaliza la introducción muestra el contenido 
		// del array por pantalla.  
		
		String cadena;
		int posicion;
		ArrayList<String> arrayListString = new ArrayList<String>(); 
		Scanner teclado;// informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado

		// leer una cadena
		System.out.println("Introduce una cadena: ");
		cadena = teclado.nextLine();

		while(!cadena.isEmpty()) {
			//añado la cadena al arraylist
			arrayListString.add(cadena);
			
			//leo otra cadena
			System.out.println("Introduce una cadena ");
			cadena=teclado.nextLine();
			}
		
		teclado.close(); // libero la memoria asignada al objeto llamado teclado

		// muestro el contenido del arrayList
		for  (posicion = 0; posicion < arrayListString.size(); posicion++) {
			System.out.println(arrayListString.get(posicion));
		}
	}
}
