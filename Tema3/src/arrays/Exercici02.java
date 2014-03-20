/** Exercici 2

 * Escriviu una classe que crei un vector de 10 sencers, els inicialitzi de 1 a 10 aleatòriament i 
 * els mostri per pantalla.
Per a generar els números aleatòriament podeu utilitzar Math.random(). 
Torna un float entre 0 i 1 (no inclòs). Per obtenir un nombre dins el rang demanat [min, max] inclosos, 
haureu de fer 

Min+(int)(Math.random()*((Max-Min)+1))
en el noste cas per [1, 10]

1+(int)(Math.random()*((10- 1)+1))

 * @author Guillem Arrom

 */

package arrays;

public class Exercici02 {

	public void vector() {

		int[] rang = new int[10];
		int index;

		for (index = 0; index < 10; index++) {
			rang[index] = 1 + (int) (Math.random() * ((10 - 1) + 1));
			System.out.println(rang[index]);
		}
	}

	public static void main(String[] args) {
		Exercici02 exercici = new Exercici02();
		exercici.vector();

	}

}
