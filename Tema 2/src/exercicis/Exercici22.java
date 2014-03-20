/** Exercici 22

 *Donat un nombre natural n, mostrar els n primers nombres de la sèrie de Fibonnacci: 0, 1, 1, 2, 3, 5, 8, ...

 * @author Cristian

 */

package exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici22 {

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
			numero = llegirSencer("Introdueix un número natural major a 0: ");
			if (numero < 0) {
				System.out.println("El nombre introduit no és un natural.");
			}
		} while (numero <= 0);
		int num1=0;
		int num2=1;
		int num3;

		if (numero==1){
				System.out.println(num1);	
			}
			else {
			
				System.out.println(num1);
				System.out.println(num2);
		for (;numero>2;numero--){

			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;

		}

	}

}
}
