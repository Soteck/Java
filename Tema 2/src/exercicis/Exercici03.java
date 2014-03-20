/** Exercici 3

* Donat un temps expressat en segons, descomposa'l en hores, minuts i segons. 1 Hora = 3600 segons i 1 minut= 60 segons. Per exemple 3662 ens ha de donar 1 hora, 1 minut i 2 segons.

* @author Cristian

*/

package exercicis;

public class Exercici03 {

	public static void main(String[] args) {
	
		int temps=3662;
		int minuts=temps/60;
		int segons=temps%60;
		int hores=minuts/60;
		minuts=minuts%60;
		
		System.out.println("Hi ha " + hores + " hores, " + minuts + " minuts i " + segons + " segons.");

	}

}
