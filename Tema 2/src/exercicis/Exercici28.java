/** Exercici 28

*Escriu un programa que llegeixi un sencer de l'1 al 12 del teclat i ens digui el nombre de dies que té el mes corresponent. Suposarem que febrer sempre té 28 dies.

 * @author Cristian

 */

package exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici28 {

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
		numero = llegirSencer("Introdueix un número entre 1 i 12: ");
		
	} while ((numero < 1) || (numero > 12));
		
	switch (numero){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: {
		System.out.println("Té 31 díes");
		break;}
	case 2:{
		System.out.println("Té 28 díes");
		break;}
	case 4:
	case 6:
	case 9:
	case 11:{
		System.out.println("Té 30 díes");
		break;}
	}

	}
		
	
}
