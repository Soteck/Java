/** Exercici 5

 * Creau el paquet utilitats. Dins el paquet creau la classe UtilitatsConsola amb les següents característiques:
No tendrà main.
Tendra un mètode llegirCadena que tornarà un String. Tendrà un pàràmetre també de tipus String que serà el text que es mostrarà a l'usuari per que sàpiga quina dada es demana.
Tendra un mètode llegirSencer que tornarà un int. Tendrà un pàràmetre de tipus String que serà el text que es mostrarà a l'usuari per que sàpiga quina dada es demana.
Tendra un mètode llegirDouble que tornarà un double. Basau-vos en el mètode anterior.

A partir d'ara utilitzau aquesta classe quan necessiteu llegir dades de teclat. La manera de fer-ho serà creant un objecte d'aquesta classe:
UtilitatsConsola utilitats=new UtilitatsConsola();
En haver d'utilitzar un dels seus mètodes cridau-lo, per exemple
int quantitatNotes=utilitats.llegirSencer("Nombre de notes: ");

 * @author Guillem Arrom

 */

package arrays;

import utilitats.UtilitatsConsola;

public class Exercici05 {

	public static void main(String[] args) {
		UtilitatsConsola utilitats = new UtilitatsConsola();
		System.out.println(utilitats.llegirCadena("Escriu el teu nom (string) :"));
		System.out.println(utilitats.llegirSencer("Escriu la teva edad (int) :"));
		System.out.println(utilitats.llegirDouble("Escriu el teu pes (double) :"));
	}

}
