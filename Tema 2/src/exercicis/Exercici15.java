/** Exercici 15

* Defineix dues variables de tipus sencer, anomenades inici i fi, i assigna-li valors.
*  Mostra per pantalla tots els sencers entre inici i fi (inclosos) utilitzant un while.
*Repeteix l'exercici amb un do{}while().
* @author Cristian

*/

package exercicis;

public class Exercici15 {

	public static void main(String[] args) {
		int inici=1;
		int fi=10;
		
		if (inici>fi){
			System.out.println("Ha introduit un valor erroni");
		}
		else{
		do {
			System.out.println(inici);
			inici++;
		} while (inici<=fi);
		}
	}

}
