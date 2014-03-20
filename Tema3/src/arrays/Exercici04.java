/** Exercici 4

 * Escriviu una classe amb un mètode que rebi un array de tres sencers i l'ordeni 
 * (com a l'exercici 12 del tema anterior). Heu de comprovar que l'array tengui tres posicions. 
 * Tornau un booleà, true si el podeu ordenar i false en cas contrari.

 * @author Guillem Arrom

 */

package arrays;

public class Exercici04 {

	public boolean Ordenar(int[] array) {
		int temporal;
		boolean flag = false;
		if (array.length == 3) {
			flag = true;
		}

		if (array[0] > array[1]) {
			temporal = array[0];
			array[0] = array[1];
			array[1] = temporal;

		}
		if (array[0] > array[2]) {
			temporal = array[0];
			array[0] = array[2];
			array[2] = temporal;

		}
		if (array[1] > array[2]) {
			temporal = array[1];
			array[1] = array[2];
			array[2] = temporal;

		}

		return flag;

	}

	public void Mostrar(int[] array) {
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print(array[contador] + " ");
		}
		System.out.println("");

	}

	public static void main(String[] args) {

		Exercici04 exercici = new Exercici04();
		int[] array = new int[3];
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = 1 + (int) (Math.random() * ((10 - 1) + 1));
		}
		System.out.print("En principi, l'array es ");

		exercici.Mostrar(array);
		if (exercici.Ordenar(array)) {
			System.out.println("Ordenat queda: " + array[0] + " " + array[1]
					+ " " + array[2]);
		} else {
			System.out.println("no se ha pogut ordenar");
		}

	}

}
