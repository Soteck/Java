/** Exercici 4

 *Crea un m�tode que calculi el producte de a *b utilitzant sumes. Fes-ho amb una iteraci�.

 * @author Guillem Arrom

 */

package recursivitat;

public class Exercici04 {

	public int producte(int a, int b) {
		int resultat = a;
		for (int contador = b; contador > 1; contador--) {
			resultat = resultat + a;
		}

		return resultat;

	}

	public static void main(String[] args) {

		Exercici04 exercici = new Exercici04();
		System.out.println(exercici.producte(2, 20));

	}

}
