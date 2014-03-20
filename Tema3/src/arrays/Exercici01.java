/** Exercici 1

 * Escriviu una classe que crei un vector de 10 sencers, 
 * els inicialitzi de 1 a 10 i els mostri per pantalla.

 * @author Guillem Arrom

 */

package arrays;

public class Exercici01 {

	public void vector() {
		int rang[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int index;
		for (index = 0; index < (rang.length); index++) {
			System.out.println(rang[index]);
		}

	}

	public static void main(String[] args) {
		Exercici01 exercici = new Exercici01();
		exercici.vector();
	}

}
