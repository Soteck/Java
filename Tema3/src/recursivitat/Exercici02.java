/** Exercici 2

 *A una classe nova, escriu un m�tode que calculi de forma recursiva la suma dels n primers enters,
 * �s a dir, la suma dels 5 primers enters �s 5+4+3+2+1, la de 4 �s 4+3+2+1.

 * @author Guillem Arrom

 */

package recursivitat;

public class Exercici02 {
	public int sumar(int numero) {
		if (numero == 1) {
			return numero;
		} else {
			numero = numero + sumar(numero - 1);
		}
		return numero;

	}

	public static void main(String[] args) {
		Exercici02 exercici = new Exercici02();
		System.out.println(exercici.sumar(3));

	}

}
