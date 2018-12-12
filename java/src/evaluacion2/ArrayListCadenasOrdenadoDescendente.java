package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListCadenasOrdenadoDescendente {

	public static void main(String[] args) {
		// modifica la clase ArrayListCadenasOrdenado para 
		// que las cadenas aparezcan por pantalla en orden 
		// descendente (de mayor a menor). 
		
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

		// ordeno el arrayList 
		// en orden descendente
		Comparator<String> comparador = Collections.reverseOrder(); 
		Collections.sort(arrayListString, comparador); 
		
		// muestro el contenido del arrayList
		for  (posicion = 0; posicion < arrayListString.size(); posicion++) {
			System.out.println(arrayListString.get(posicion));
		}
	}
}
