/** Exercici 3

 * Escriviu una classe que al main tengui dos arrays de sencers.
Escriviu un mètode que generi un array de sencers. Té com a paràmetre la longitud de l'array. 
Utilitzau-lo al main per crear els dos arrays.

Escriviu un mètode que compari correctament els dos arrays definits al main i torni un booleà 
amb el resultat.

Escriviu un altre mètode que pugui rebre dos vectors de diferent longitud i els compari. 
Si no tenen la mateixa longitud evidentment no són iguals.

 * @author Guillem Arrom

 */

package arrays;

public class Exercici03 {
	public int[] array(int a) {
		int[] array = new int[a];
		return array;
	}

	public boolean comparador(int[] a, int[] b) {
		int index;
		boolean comparacio = true;
		if ((a.length) != (b.length)) {
			comparacio = false;
		} else
			for (index = 0; index < (a.length); index++) {
				if (a[index] != b[index]) {
					comparacio = false;
					break;
				}
			}
		return comparacio;
	}

	public static void main(String[] args) {
		Exercici03 exercici = new Exercici03();
		// Treim 2 numeros al atzar del 1 al 3
		int numero = 1 + (int) (Math.random() * ((3 - 1) + 1));
		int numero2 = 1 + (int) (Math.random() * ((3 - 1) + 1));
		// cridam al metode array donantli els numeros al atzar. Aquest retorna
		// un array de ints amb
		// la longitud que li hem indicat
		int[] array1 = exercici.array(numero);
		int[] array2 = exercici.array(numero2);
		// cridam el metode que compara i mos torna un boolea
		boolean iguals = exercici.comparador(array1, array2);
		// segons el boolea ens dira una cosa o un altre
		if (iguals) {
			System.out.println("Els arrays son iguals");
		} else {
			System.out.println("Els arrays no son iguals");
		}

	}

}
