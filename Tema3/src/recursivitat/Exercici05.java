/** Exercici 5

 *Repeteix el problema anterior de forma recursiva.

 * @author Guillem Arrom

 */

package recursivitat;

public class Exercici05 {

	public int producte(int a, int b) {
		int resultat = a;
		if (b == 1) {
			return resultat;
		} else {
			resultat = resultat + producte(a, b - 1);

		}

		return resultat;

	}

	public static void main(String[] args) {

		Exercici05 exercici = new Exercici05();
		System.out.println(exercici.producte(2, 20));

	}

}
