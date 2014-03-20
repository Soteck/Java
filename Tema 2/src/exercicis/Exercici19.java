package exercicis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercici19 {

	    /**
	     * Llegeix un sencer del teclat i el torna com a resultat. Aquest resultat
	     * s'ha d'assignar a qualque variable o s'ha d'utilitzar en qualque
	     * expressió Exemple d'utilització: int maxim;
	     * maxim=Teclat.llegirSencer("Introdueixi el màxim: ");
	     *
	     * @param prompt El missatge que volem mostrar a l'usuari per que sàpiga què
	     * li estam demanant.
	     * @return El sencer que ha teclejat l'usuari.
	     */
	    public static int llegirSencer(String prompt) {
	        boolean correcte = false;

	        int sencer = 0;

	        //L'objecte teclat representa l'entrada de dades.
	        Scanner teclat = new Scanner(System.in);

	        //Llegeix un sencer del teclat. Si el que introdueix l'usuari no es pot 
	        //convertir a sencer l'avisa de l'errada i torna a demanar el sencer.
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
		int sencer=llegirSencer("Introdueix un nombre");
        System.out.println("La taula de multiplicar del: " + sencer);
       int contador=0;
        for (;contador<=10;contador++){
        	int resultat=sencer*contador;
            System.out.println(resultat);
        }
	}

}

