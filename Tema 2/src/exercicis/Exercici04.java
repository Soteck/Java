/** Exercici 4

* Intercanvia els valors de dues variables del mateix tipus. Mostra-les per pantalla abans i després de fer el canvi. Per exemple si a=2 i b=3, al final a=3 i b=2.

* @author Cristian

*/

package exercicis;

public class Exercici04 {

	public static void main(String[] args) {


		int a=2;
		int b=5;
		System.out.println("A:" + a + " B:" + b);
		//mostra les dues variables per pantalla
		int c=a;
		a=b;
		b=c;
		//intercanvia el valor de les dues variables
		System.out.println("A:" + a + " B:" + b);
		//mostra el resultat per pantalla


	}

}
