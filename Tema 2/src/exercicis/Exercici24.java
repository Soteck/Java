/** Exercici 23

 *Comprova si un nombre recuperat de la línia de comandes és primer o no utilitzant un for i un break.

 * @author Cristian

 */

package exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici24 {

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
		int numero = llegirSencer("Introdueix un número natural major a 0: ");
		int contador=numero-1;
		boolean primer=true;
		
		while (contador>1){
			if ((numero%contador)==0){
				primer=false;
				System.out.println("El nombre no és primer.");
				contador=0;
			}
			contador--;
		}
		
		
			if (primer==true){
				System.out.println("El nombre introduït és primer.");
			}
		

	}

}
