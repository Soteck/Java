/** Exercici 6

 * Creau una classe que defineixi una matriu quadrada, pe 4x4, i un mètode per a cada una d'aquestes opcions. Cridau-los tots des del main, no cal programa r cap menú.
Inicialitzau-la de forma que cada casella tengui la suma de les seves coordenades.
Mostrau la matriu, si potser de forma ordenada.
Mostrau la diagonal principal, [1,1], [2,2]...
Mostrau la diagonal secundària [4,1][3,2]...

 * @author Guillem Arrom

 */

package arrays;

public class Exercici06 {

	public void diagonalPrincipal(int[][] matriu) {
		System.out.println("La matriu principal es: ");
		for (int index = 0; index < matriu.length; index++) {
			System.out.println(matriu[index][index]);
		}
	}

	public void diagonalSecundaria(int[][] matriu) {

		System.out.println("La matriu secundaria es: ");
		for (int index = (matriu.length) - 1, index2 = 0; index >= 0; index--, index2++) {

			System.out.println(matriu[index][index2]);

		}

	}

	public void mostrarMatriu(int[][] array) {
		System.out.print("L'array es: ");
		for (int contador = 0; contador < array.length; contador++) {
			System.out.println("");
			for (int contador2 = 0; contador2 < array[contador].length; contador2++) {
				System.out.print(array[contador2][contador] + " ");
			}
		}
		System.out.println("");

	}

	public static void main(String[] args) {
		Exercici06 exercici = new Exercici06();
		int[][] array = new int[4][4];
		for (int contador = 0; contador < array.length; contador++) {
			for (int contador2 = 0; contador2 < array[contador].length; contador2++)
				array[contador][contador2] = contador + contador2;
		}
		exercici.mostrarMatriu(array);
		exercici.diagonalPrincipal(array);
		exercici.diagonalSecundaria(array);

	}

}
