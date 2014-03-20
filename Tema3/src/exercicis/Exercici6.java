/** Exercici 6

 * Crea una classe amb un mètode que ordeni tres variables de tipus sencer (anomenades a, b i c), 
 * de manera que al final el valor més petit estigui dins la a i el major dins la c. 
 * Mostra amb un println els problemes amb els que t'hagis pogut trobar i com els has solucionat.


 * @author Guillem Arrom

 */

package exercicis;

public class Exercici6 {

	public void ordenar(int a, int b, int c) {
		int temporal;

		if (a > b) {
			temporal = a;
			a = b;
			b = temporal;
		}
		if (a > c) {
			temporal = a;
			a = c;
			c = temporal;
		}
		if (b > c) {
			temporal = b;
			b = c;
			c = temporal;
		}
		System.out.println("Ara (a) es " + a + ", (b) es ara " + b + ", i (c) es ara " + c);

	}

	public static void main(String[] args) {
		Exercici6 exercici = new Exercici6();
		System.out.println("Ordenarem els nombres de major a menor ");
		int a,b,c;
		a = LlegirSencer.llegirSencer("Tecletja el valor 'a'");
		b = LlegirSencer.llegirSencer("Tecletja el valor 'b'");
		c = LlegirSencer.llegirSencer("Tecletja el valor 'c'");
		exercici.ordenar(a,b,c);
		System.out.println("Cap problema");
		

	}

}
