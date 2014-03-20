/** Exercici 6

 *Escriu un m�tode que calculi el terme n-essim de la s�rie de Fibonacci de forma recursiva. 
 *Des del main crida aquest m�tode per a mostrar els 10 primers termes de la successi�.

 * @author Guillem Arrom

 */

package recursivitat;

public class Exercici06 {

	public int fibon(int numero) {
		if (numero == 1) {
			return 1;

		} else if (numero == 0) {
			return 0;
		} else {

			numero = (fibon(numero - 1) + fibon(numero - 2));
			return numero;
		}

	}

	public static void main(String[] args) {
		Exercici06 exercici = new Exercici06();
		for (int contador = 0; contador < 10; contador++) {
			System.out.print(exercici.fibon(contador)+" ");
		}

	}
}
