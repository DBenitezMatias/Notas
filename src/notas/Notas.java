package notas;

import java.util.Scanner;

public class Notas {
	/*@author David Benitez Matias
	 * @version 1.0
	 * @since 03/03/2023
	 * /
	
	/**
	 * Este método devuelve la calificación correspondiente a una nota numérica.
	 * @param nota La nota numérica.
	 * @return La calificación correspondiente a la nota.
	 */
	public static String cali(int nota) {
		String calificacion = "";
		if (nota >= 0 && nota < 5)
			calificacion = "Suspenso";
		else if (nota >= 5 && nota < 7)
			calificacion = "Aprobado";
		else if (nota >= 7 && nota <9)
			calificacion = "Notable";
		else if (nota >= 9 && nota <= 10)
			calificacion = "Sobresaliente";
		else
			calificacion = "El valor de la calificación introducida no es correcta";
		return calificacion;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota = 0;
		System.out.print("Introduzca el valor de una calificación: ");
		nota = reader.nextInt();
		String calificacion = cali(nota);
		System.out.println(calificacion);
		reader.close();
	}
}
