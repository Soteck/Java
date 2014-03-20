/** Exercici 3

 *Calcula el factorial de n de forma recursiva. 5!=5*4!

 * @author Guillem Arrom

 */

package recursivitat;

public class Exercici03 {
	public int factorial(int numero) {
		if (numero == 1) {
			return numero;
		} else {
			numero = numero * factorial(numero - 1);
		}
		return numero;

	}

	public static void main(String[] args) {
		Exercici03 exercici = new Exercici03();
		System.out.println(exercici.factorial(4));

	}

}
