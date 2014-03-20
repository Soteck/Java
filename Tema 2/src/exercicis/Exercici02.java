/** Exercici 2

* Donada una velocitat v expressada en km/h passar-la a m/s (v*1000/3600). Fes el càlcul amb decimals.

* @author Cristian

*/

package exercicis;

public class Exercici02 {

	public static void main(String[] args) {

		double conversor=1000.0/3600;
		double velocitat=200;
		double resultat=velocitat*conversor;
		System.out.println("La velocitat en m/s és:  " + resultat);

	}

}
