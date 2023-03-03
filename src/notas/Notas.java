package notas;

import java.util.Scanner;

public class Notas {
	
	/*@author David Benitez Matias
	 * @version 1.0
	 * @since 03/03/2023
	 * */
	/**

	Método main principal que pide al usuario que ingrese una nota y muestra la calificación correspondiente.
	@param args 
	*/
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota = 0;
		System.out.print("Introduzca el valor de una calificación: ");
		nota = reader.nextInt();
		String calificacion = Califica.califica(nota);
		System.out.println(calificacion);
		reader.close();
	}
}


/**

La clase Califica proporciona un método para evaluar una nota numérica y devolver su calificación correspondiente en letra.
*/
 class Califica {

/**

Evalúa una nota numérica y devuelve su calificación correspondiente en letra.
@param num_nota la nota numérica que se va a evaluar.
@return un String que representa la calificación en letra correspondiente a la nota numérica proporcionada.
*/
public static String califica(int num_nota) {
String calificacion = "";
if (num_nota >= 0 && num_nota < 5)
calificacion = "Suspenso";
else if (num_nota >= 5 && num_nota < 7)
calificacion = "Aprobado";
else if (num_nota >= 7 && num_nota < 9)
calificacion = "Notable";
else if (num_nota >= 9 && num_nota <= 10)
calificacion = "Sobresaliente";
else
calificacion = "El valor de la calificación introducida no es correcta";
return calificacion;
}
}

