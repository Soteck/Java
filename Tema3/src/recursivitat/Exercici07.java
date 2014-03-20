/** Exercici 7

 *Copia l'exercici anterior i modifica'l de forma que el mètode que calcula el 
 *terme n-èssim mostri per pantalla el terme que està calculant, n. 
 *Executa el programa. Creus que és eficient?

 * @author Guillem Arrom

 */

package recursivitat;

public class Exercici07 {

	public int fibon(int numero) {
		System.out.print(numero+ " ");
		if (numero == 1) {
			//System.out.print(1 + " ");
			return 1;

		} else if (numero == 0) {
			//System.out.print(0 + " ");
			return 0;
		} else {
			numero = (fibon(numero - 1) + fibon(numero - 2));
			//System.out.print(numero + " ");
			return numero;
		}

	}

	public static void main(String[] args) {
		Exercici07 exercici = new Exercici07();
		for (int contador = 0; contador < 10; contador++) {
			exercici.fibon(contador);
			
		}
		System.out.println("");
		System.out.println("no");
	}
}
