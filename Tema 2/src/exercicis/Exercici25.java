/** Exercici 25

 *Comprova si un nombre recuperat de la línia de comandes és primer o no utilitzant un for i un break.

 * @author Cristian

 */

package exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici25 {

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
		int resultat=0;
		do {
			numero = llegirSencer("Introdueix un número sencer distint de 0: ");
			resultat=resultat+numero;
		} while (numero != 0);

		double mitjana=resultat/2.0;
		System.out.println("La mitjana dels nombres introduits és: " + mitjana);
	}

}
