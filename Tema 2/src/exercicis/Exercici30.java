/** Exercici 30

*Utilitzant els m�todes de la classe String, per la cadena Aix� era i no era, fes un programa que

Mostri la longitud de la cadena.

Els dos primers car�cters.

La compari amb una altre sense tenir en compte les difer�ncies maj�scules / min�scules.

Trobi la posici� de la primera lletra e.

Escrigui la lletra que ocupa la posici� 6.

 * @author Cristian

 */

package exercicis;

public class Exercici30 {

	public static void main(String[] args) {
		String frase = "Aix� era i no era";
		String oracio = "Hola";
		System.out.println("La longitud �s: " + frase.length());
		System.out.println("Primer caracter: " + frase.charAt(0) + " i segon caracter: " + frase.charAt(1));
		int comparacio=frase.compareToIgnoreCase(oracio);
		if (comparacio<0){
			System.out.println("No es pareixen");
		}
		else if (comparacio==0) {
			System.out.println("S�n iguals");
		} else {
			System.out.println("S�n parescudes");
		}

		System.out.println("La primera e est� a la posicio: " + frase.indexOf("e"));
		System.out.println("Posici� 6: " + frase.charAt(6));
	}


	

		
	}


