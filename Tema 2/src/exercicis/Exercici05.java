/** Exercici 5
 * 
*A partir d'un sencer que representa les hores treballades per un/a treballador/a i un real que representa el preu en € de cada hora, calcula que ha de cobrar aquesta persona en acabar la setmana. Suposa que totes les hores extra, les que passen de 40, doblen el preu.

* @author Cristian

*/

package exercicis;

public class Exercici05 {

	public static void main(String[] args) {
		int hores=33;
		double preu=15;
		double preuextra=preu*2;
		double sou;
		
		if (hores>40) {
			int extra=hores-40;
			double souextra=extra*preuextra;
			sou=(40*preu)+souextra;
			System.out.println("Cobrará " + sou + " euros.");}
			else {
				sou=preu*hores;
				System.out.println("No ha fet hores extra, però cobrará " + sou + " euros per les hores fetes.");}

		
		}
		

	}


