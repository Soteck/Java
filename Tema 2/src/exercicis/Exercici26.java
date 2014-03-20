/** Exercici 26

 **Crea una classe que mostri les lletres de l'alfabet i al costat indiqui si es tracta d'una vocal o d'una consonant.
 * En farem tres versions:

Amb un if per a cada vocal if() else if....

Amb un sol if() else

Amb un switch. Recorda posar break a cada case

 * @author Cristian

 */

package exercicis;

public class Exercici26 {

	public static void main(String[] args) {
		String resultat="hola";
		for (char lletra='a'; lletra<='z';lletra++){
			switch (lletra) {
			case 'a': {
				resultat="vocal";
				break;
			}
			case 'e': {
				resultat="vocal";
				break;
			}
			case 'i': {
				resultat="vocal";
				break;
			}
			case 'o': {
				resultat="vocal";
				break;
			}
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
		
		
		System.out.println(" ");
		
		
		for (char lletra='a'; lletra<='z';lletra++){
			if ((lletra=='a') || (lletra=='e') || (lletra=='i') || (lletra=='o') || (lletra=='u'))
				resultat="vocal";
			else {
				resultat="consonant";
			}
			System.out.println(lletra + " és una " + resultat);
		}
		
		
		System.out.println(" ");
		
		
		for (char lletra='a'; lletra<='z';lletra++){
			if (lletra=='a')
				resultat="vocal";
			else if (lletra=='e'){
				resultat="vocal";}
			else if (lletra=='i'){
				resultat="vocal";}
			else if (lletra=='o'){
				resultat="vocal";}
			else if (lletra=='u'){
				resultat="vocal";}
			else {
				resultat="consonant";
			}
			System.out.println(lletra + " és una " + resultat);
		}

	}

}
