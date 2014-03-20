/** Exercici 21

 * Demana a l'usuari un nombre natural i calcula el seu factorial. El factorial d'un nombre n és n*(n-1)*(n-2)* ... 3*2*1.

 * @author Cristian

 */

package exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici21 {
	public static int llegirSencer(String prompt) {
		boolean correcte = false;

		int sencer = 0;

		// L'objecte teclat representa l'entrada de dades.
		Scanner teclat = new Scanner(System.in);

		// Llegeix un sencer del teclat. Si el que introdueix l'usuari no es pot
		// convertir a sencer l'avisa de l'errada i torna a demanar el sencer.
		do {
			System.out.print(prompt);
			try {
				sencer = teclat.nextInt();
				correcte = true;

			} catch (InputMismatchException e) {
				System.err.println("Sencer incorrecte.");
				teclat.next();
			}
		} while (correcte == false);
		return sencer;
	}

	public static void main(String[] args) {

		int numero;
		do {
			numero = llegirSencer("Introdueix un número natural: ");
			if (numero < 0) {
				System.out.println("El nombre introduit no és un natural.");
			}
		} while (numero < 0);

		int contador = numero - 1;
		int resultat = numero;
		System.out.println("El factorial de " + numero + " és: ");
		for (; contador > 1; contador--) {
			resultat = resultat * contador;

		}
		System.out.println(resultat);
	}

}
