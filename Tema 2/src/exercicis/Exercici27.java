/** Exercici 27

 * Al programa anterior elimina els break del switch.
 *  Que passa? Torna'l a escriure de forma que amb el mínim de codi obtinguem el resultat correcte.

 * @author Cristian

 */

package exercicis;

public class Exercici27 {

	public static void main(String[] args) {
		System.out.println("Les mostra totes consonants");
		
		String resultat="hola";
		for (char lletra='a'; lletra<='z';lletra++){
			switch (lletra) {
			case 'a':
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': {
				resultat="vocal";
				break;
			}
			
			default: {
				resultat="consonant";
				break;
			}
			}
			System.out.println(lletra + " és una " + resultat);
		}

	}

}
