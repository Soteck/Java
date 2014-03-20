/** Exercici 2

 * Copiau l'exercici anterior i modificau-lo de la següent manera: 
 * afegiu un mètode que llegeixi el nom de la persona del teclat i 
 * passau aquest nom al mètode simpatic.

 * @author Guillem Arrom

 */


package exercicis;

public class Exercici2 {

	public static void simpatic(String nom) {
		System.out.println("¡Hola, " + nom + " !");

	}

	public static void main(String[] args) {
		LlegirCadena teclat = new LlegirCadena();
		String nombre = teclat.llegirCadena("Escriu el teu nom: ");
		simpatic(nombre);
	}

}
