/** Exercici 10

* Donat un sencer que representa el valor numèric d'una nota, mostra la qualificació corresponent en paraules, per exemple Aprovat.

* @author Cristian

*/

package exercicis;

public class Exercici10 {

	public static void main(String[] args) {
		int nota = 8;
		if ((nota >= 0) && (nota < 5)) {
			System.out.println("Suspes");
		}
		else if ((nota > 4) && (nota < 11)) {
			System.out.println("Aprovat");
		}
		else {
			System.out.println("No ha introduit un valor vàlid");
		}
		}

}
