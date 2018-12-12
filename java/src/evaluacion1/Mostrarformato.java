package evaluacion1;

public class Mostrarformato {

	public static void main(String[] args) {
		/*
		 *  coge el valor de una variable de tipo String y 
		 *  el valor de una variable de tipo real y 
		 *  muestra por pantalla la cadena y 
		 *  la variable real con 2 decimales. 
		 */
		
		String cadena = "Hola Mundo";
		double n;
		n = Math.PI;
		System.out.println(" El valor de n es " + n + "y el valor de s es " + cadena); 
		System.out.printf(" El valor de n %.2f es y el valor de cadena es %s", n,cadena);

	}

}
