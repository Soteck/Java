/** Exercici 1

 * Crea una classe amb un m�tode anomenat simpatic que rebi com a par�metre una cadena de car�cters 
 * amb un nom i saludi aquesta persona.

 * @author Guillem Arrom

 */

package exercicis;

public class Exercici1 {

	public void simpatic(String nom) {
		System.out.println("�Hola, " + nom + " !");

	}

	public static void main(String[] args) {
		Exercici1 exercici = new Exercici1();
		String nombre = "Manuel";
		exercici.simpatic(nombre);
	}

}
