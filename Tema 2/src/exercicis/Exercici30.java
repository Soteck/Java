/** Exercici 30

*Utilitzant els mètodes de la classe String, per la cadena Això era i no era, fes un programa que

Mostri la longitud de la cadena.

Els dos primers caràcters.

La compari amb una altre sense tenir en compte les diferències majúscules / minúscules.

Trobi la posició de la primera lletra e.

Escrigui la lletra que ocupa la posició 6.

 * @author Cristian

 */

package exercicis;

public class Exercici30 {

	public static void main(String[] args) {
		String frase = "Això era i no era";
		String oracio = "Hola";
		System.out.println("La longitud és: " + frase.length());
		System.out.println("Primer caracter: " + frase.charAt(0) + " i segon caracter: " + frase.charAt(1));
		int comparacio=frase.compareToIgnoreCase(oracio);
		if (comparacio<0){
			System.out.println("No es pareixen");
		}
		else if (comparacio==0) {
			System.out.println("Són iguals");
		} else {
			System.out.println("Són parescudes");
		}

		System.out.println("La primera e está a la posicio: " + frase.indexOf("e"));
		System.out.println("Posició 6: " + frase.charAt(6));
	}


	

		
	}


