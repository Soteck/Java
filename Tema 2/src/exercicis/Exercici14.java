/** Exercici 14

* Defineix dues variables de tipus sencer, anomenades inici i fi, i assigna-li valors.
*  Mostra per pantalla tots els sencers entre inici i fi (inclosos) utilitzant un while.

* @author Cristian

*/

package exercicis;

public class Exercici14 {

	public static void main(String[] args) {
		int inici=22;
		int fi=10;
		
		if (inici>fi){
			System.out.println("Ha introduit un valor erroni");
		}
		else{
		for (;inici<=fi;inici++){
			System.out.println(inici);
		}
		}
	}

}
