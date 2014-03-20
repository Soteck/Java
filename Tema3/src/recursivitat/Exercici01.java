/** Exercici 1

 *Crea una classe i comprova que l'exemple de sobrecàrrega dels apunts, 
 *el que té unes quantes versions de saluda, funciona.

 * @author Guillem Arrom

 */

package recursivitat;

public class Exercici01 {
	
	public void saluda() {
		System.out.println("Hola!");
		}
		public void saluda(String nom) {
		System.out.println("Hola " + nom + " !");
		}
		public void saluda(String nom1, String nom2) {
		System.out.println("Hola " + nom1 + " i " + nom2 + " !");
		}
		public void saluda(String nom, int dies) {
		System.out.println("Hola " + nom + " ! Feia " + dies + " que no et veia!");
		}

	public static void main(String[] args) {
		Exercici01 exercici = new Exercici01();
		exercici.saluda();
		exercici.saluda("pepe");
		exercici.saluda("pepe", "cebolla");
		exercici.saluda("pepe", 9);
		
	}

}
