/** Exercici 18

* Crea un programa que recorri els 10 primers sencers.
*  Si el nombre �s 5 ha d'executar una instrucci� continue, si no l'ha de mostrar per pantalla.
*  Repeteix-lo amb un break. Quina �s la difer�ncia? Mostra explicaci� per pantalla.

* @author Cristian

*/

package exercicis;

public class Exercici18 {

	public static void main(String[] args) {
		int inici;
		for (inici=0;inici<10;inici++){
			if(inici==5){
				continue;
			}
			System.out.println(inici);
		}


		for (inici=0;inici<10;inici++){
			if(inici==5){
				break;
			}
			System.out.println(inici);
		}
	}

}
