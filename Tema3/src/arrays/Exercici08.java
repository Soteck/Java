/** Exercici 8

 * Simulau el sorteig de la primitiva. Heu de tenir
un m�tode que generi un "boleto", �s a dir que guardi dins un array 6 n�meros diferents de l'1 al 49
alguna forma de generar la combinaci� guanyadora, aleat�riament.
un m�tode que comprovi un "boleto", �s a dir si t� 6 encerts, 5, 4, o 3, i torni quin premi t�.

 * @author Guillem Arrom

 */

package arrays;

import utilitats.UtilitatsConsola;

public class Exercici08 {
	public int[] generarBoleto(int longitud) {
		int[] boleto = new int[longitud];
		boolean flag = false;
		for (int contador = 0; contador < boleto.length; contador++) {
			do {
				flag = false;
				boleto[contador] = 1 + (int) (Math.random() * ((49 - 1) + 1));
				for (int contador2 = 0; contador2 < contador; contador2++) {
					if (boleto[contador2] == boleto[contador]) {
						flag = true;

					}

				}
			} while (flag == true);
		}
		return boleto;
	}

	public void mostrar(int[] boleto) {
		for (int contador = 0; contador < boleto.length; contador++) {
			System.out.print(boleto[contador] + " ");
		}

	}

	public int comprovarPremi(int[] boleto, int[] premi) {
		int numeroAcerts = 0;
		for (int contador = 0; contador < boleto.length; contador++) {
			if (boleto[contador] == premi[contador]) {
				numeroAcerts++;
			}
		}

		return numeroAcerts;
	}

	public static void main(String[] args) {
		Exercici08 exercici = new Exercici08();
		System.out.println("Benvingut");
		int[] boleto = exercici.generarBoleto(6);
		int[] guanador = exercici.generarBoleto(6);
		int acerts = exercici.comprovarPremi(boleto, guanador);
		System.out.println("El usuari te el boleto amb els numeros: ");
		exercici.mostrar(boleto);
		System.out.println("");
		System.out.println("El boleto gua�ador te els numeros: ");
		exercici.mostrar(guanador);
		System.out.println("");

		switch (acerts) {
		case 1:
			System.out.println("Ha acertat 1, premi de 10�");
			break;
		case 2:
			System.out.println("Ha acertat 2, premi de 100�");
			break;
		case 3:
			System.out.println("Ha acertat 3, premi de 1000�");
			break;
		case 4:
			System.out.println("Ha acertat 4, premi de 10000�");
			break;
		case 5:
			System.out.println("Ha acertat 5, premi de 100000�");
			break;
		case 6:
			System.out.println("Ha acertat 6, premi de 1000000�");
			break;
		case 0:
			System.out.println("No n'ha encertat cap, premi de 0�");

		}

	}

}
