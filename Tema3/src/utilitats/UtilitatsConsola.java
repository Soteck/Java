package utilitats;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilitatsConsola {
	public String llegirCadena(String prompt) {
		boolean correcte = false;

		String cadena = "";

		Scanner teclat = new Scanner(System.in);

		do {
			System.out.print(prompt);
			try {
				cadena = teclat.next();
				correcte = true;

			} catch (InputMismatchException e) {
				System.err.println("Cadena incorrecte.");
				teclat.next();
			}
		} while (correcte == false);
		return cadena;
	}

	public int llegirSencer(String prompt) {
		boolean correcte = false;

		int sencer = 0;

		Scanner teclat = new Scanner(System.in);

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

	public double llegirDouble(String prompt) {
		boolean correcte = false;

		Double sencer = 0.0;

		Scanner teclat = new Scanner(System.in);

		// Llegeix un sencer del teclat. Si el que introdueix l'usuari no es pot
		// convertir a sencer l'avisa de l'errada i torna a demanar el sencer.
		do {
			System.out.print(prompt);
			try {
				sencer = teclat.nextDouble();
				correcte = true;

			} catch (InputMismatchException e) {
				System.err.println("Double erroni.");
				teclat.next();
			}
		} while (correcte == false);
		return sencer;
	}

	public int gestionarMenu(String titol, String[] opcions, String pregunta) {
		UtilitatsConsola utilitats = new UtilitatsConsola();
		System.out.println(titol);
		int resultat = 0;
		for (int index = 0; index < opcions.length; index++) {
			System.out.println("[" + (index + 1) + "]--> " + opcions[index]);
		}
		resultat = utilitats.llegirSencer("tria la opció: ");

		return resultat;
	}
}
