/** Exercici 20

* Crea un programa que donat un nombre sencer mostri per pantalla tots els seus divisors, per exemple, 
* per a 6 mostraria 1, 2, 3, 6.

* @author Cristian

*/

package exercicis;

public class Exercici20 {

	public static void main(String[] args) {
		int sencer=20;
		int contador;
		for (contador=sencer;contador>0;contador--){
			if((sencer%contador)==0){
				System.out.println(contador);
			}
		}

	}

}
