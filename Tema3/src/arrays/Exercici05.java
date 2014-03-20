/** Exercici 5

 * Creau el paquet utilitats. Dins el paquet creau la classe UtilitatsConsola amb les seg�ents caracter�stiques:
No tendr� main.
Tendra un m�tode llegirCadena que tornar� un String. Tendr� un p�r�metre tamb� de tipus String que ser� el text que es mostrar� a l'usuari per que s�piga quina dada es demana.
Tendra un m�tode llegirSencer que tornar� un int. Tendr� un p�r�metre de tipus String que ser� el text que es mostrar� a l'usuari per que s�piga quina dada es demana.
Tendra un m�tode llegirDouble que tornar� un double. Basau-vos en el m�tode anterior.

A partir d'ara utilitzau aquesta classe quan necessiteu llegir dades de teclat. La manera de fer-ho ser� creant un objecte d'aquesta classe:
UtilitatsConsola utilitats=new UtilitatsConsola();
En haver d'utilitzar un dels seus m�todes cridau-lo, per exemple
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
