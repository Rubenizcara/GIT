package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEnterosMenuOrdenado {

	public static void main(String[] args) {

		String palabra;
		int posicion, opcion;
		ArrayList<String> diccionario = new ArrayList<String>();

		Scanner teclado;// informo de que necesito un objeto de la clase Scanner llamado teclado
		teclado = new Scanner(System.in); // creo el objeto de la clase Scanner llamado teclado

		//escribo el menu
		System.out.println("1.Añadir palabra");
		System.out.println("2.Buscar palabra");
		System.out.println("3.Borrar palabra");
		System.out.println("4.Listar Diccionario");
		System.out.println("0.Salir");
		
		//pido la opcion
		System.out.println(" Opcion: ");
		opcion = teclado.nextInt();
		
		while(opcion !=0) {
			//con cada opcion
			switch(opcion) {
			case 1:
				//pido una palabra
				//limpio el buffer
				teclado.nextLine();
				System.out.println("Introduce una palabra ");
				palabra = teclado.nextLine();
				//si todavia no existe
				if(!diccionario.contains(palabra)) {
					//añado la palabra
					diccionario.add(palabra);
				}
				break;
				
			case 2:
				teclado.nextLine();
				//Pido una palabra
				System.out.println("Introduce una palabra ");
				palabra = teclado.nextLine();
				// la busca en el diccionario
				if(diccionario.contains(palabra)) {
					// si la encuentra la muestra
					System.out.println("La palabra " +palabra+ " está en el diccionario");
				}
				else {
					//si NO la encuentra muestra un mensaje de error
					System.out.println("Error. La palabra " +palabra+ " NO está en el diccionario");
				}
				break;
				
			case 3:
				//Pido una palabra
				//limpio el buffer
				teclado.nextLine();
				System.out.println("Introduce una palabra ");
				palabra = teclado.nextLine();
				// la busca en el diccionario
				if(diccionario.contains(palabra)) {
					// si la encuentra la borra
					diccionario.remove(palabra);
					System.out.println("La palabra " +palabra+ " ha sido borrada en el diccionario");
				}
				else {
					//si NO la encuentra muestra un mensaje de error
					System.out.println("Error. La palabra " +palabra+ " NO está en el diccionario");
				}
				break;
			case 4:
				//Muestra todos los elementos del diccionario por pantalla
				//si es que tiene elementos,
				//ordenados alfabeticamente
				Collections.sort(diccionario);
				for(posicion = 0; posicion < diccionario.size(); posicion++) {
					System.out.println(diccionario.get(posicion));
			}
				break;
				
			case 0:
				//Fin
				System.out.println("Fin del programa");	
				break;
			}
			
			// pido otra opcion
			System.out.println("Opcion: ");
			opcion = teclado.nextInt();
		}
		teclado.close();
	}
}
