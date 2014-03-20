/** Exercici 29

*Modifica l'exercici anterior per a tenir en compte els anys de trasp�s. S�n de trasp�s els anys m�ltiples de 4. Es m�ltiples de 100 no ho s�n excepte que siguin m�ltiples de 400.
*
 * @author Cristian

 */

package exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici29 {

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
		numero = llegirSencer("Introdueix un n�mero entre 1 i 12: ");
		
	} while ((numero < 1) || (numero > 12));
		
	int any;
	do {
		any = llegirSencer("Introdueix un any ");
		
	} while (any<0);
		
	switch (numero){
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: {
		System.out.println("T� 31 d�es");
		break;}
	case 2:{
		if ((any%4)==0 && ((any%100)!=0) || ((any%100)==0) && (any%400)==0){
			System.out.println("T� 29 d�es");}
			else{
				System.out.println("T� 28 d�es");
		}
		
		break;}
	case 4:
	case 6:
	case 9:
	case 11:{
		System.out.println("T� 30 d�es");
		break;}
	}

	}
		
	
}
