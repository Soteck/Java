/** Exercici 23

 *Comprova si un nombre recuperat de la l�nia de comandes �s primer o no utilitzant un for i un break.

 * @author Cristian

 */

package exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici23 {

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
		int numero = llegirSencer("Introdueix un n�mero natural major a 0: ");
		int contador;
		boolean primer=true;
		for (contador=(numero-1);contador>1;contador--){
			if ((numero%contador) == 0){
				System.out.println("El nombre no �s primer.");
				primer=false;
				break;
			}
		}
			if (primer=true){
				System.out.println("El nombre introdu�t �s primer.");
			}
		

	}

}
