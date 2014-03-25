/** proves


 * @author Guillem Arrom

 */

package proves;

import contenidors.ElementSencer;
import contenidors.PilaParametritzat;
import contenidors.PilaSencers;
import utilitats.Cronometre;
import utilitats.OrdenacioCerca;
import utilitats.UtilitatsConsola;

public class Proves {

	public void mostraArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("Posició: " + i + " valor: " + a[i]);

		}

	}

	private void provaOrdenacio() {
		Cronometre crono = new Cronometre();
		UtilitatsConsola utilitats = new UtilitatsConsola();

		int tamany = 99;
		int[] array = new int[tamany];
		for (int i = 0; i < array.length; i++) {
			array[i] = (1 + (int) (Math.random() * (100 - 1 + 1)));
		}
		int[] array2 = new int[tamany];
		array2 = array.clone();
		System.out.println("Mostram array desordenat: ");
		// mostraArray(array);

		System.out.println();
		System.out.println();
		switch (utilitats
				.llegirSencer("Quin metode voleu? 1 quickSort 2 bimbolla")) {
		case 1:
			crono.start();
			OrdenacioCerca.quickSort(array, 0, array.length - 1);
			crono.stop();
			System.out.println("Mostram array ordenat -quick - : ");
			mostraArray(array);
			System.out.println("Ha tardat: " + crono.temps() + "ms");
			break;
		case 2:
			crono.start();
			System.out.println("Mostram array ordenat - bimbolla - : ");
			OrdenacioCerca.bimbolla(array2);
			mostraArray(array2);
			crono.stop();
			System.out.println("Ha tardat: " + crono.temps() + "ms");

			break;

		default:

			System.out.println("Error");

		}

	}

	private void provaCercaBinaria() {
		Cronometre crono = new Cronometre();
		int tamany = 20;
		int[] a = new int[tamany];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		mostraArray(a);
		int valor = OrdenacioCerca.cercaBinaria2(a, 7);
		System.out.println("El valor que cercam es: " + a[7]);
		System.out.println("I esta en la posicio " + valor);

	}

	private void provaCercaBinaria(int tamany) {
		Cronometre crono = new Cronometre();
		int[] a = new int[tamany];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		mostraArray(a);
		int valor = OrdenacioCerca.cercaBinaria2(a, 7);
		System.out.println("El valor que cercam es: " + a[7]);
		System.out.println("I esta en la posicio " + valor);

	}

	private void provaPilaSencers() {

		PilaSencers pila = new PilaSencers();
		System.out.println("La pila esta buida? "+pila.empty());
		for (int contador = 0; contador < 10; contador++) {
			pila.push(contador);
			//System.out.println(element.getInfo());
		}
		System.out.println("La pila esta buida? " + pila.empty());
		System.out.println("Quin ha estat el darrer en entrar? "+pila.peek());
		pila.pop();
		System.out.println("Quin ha estat el darrer en entrar? "+pila.peek());
		System.out.println("Provam un poll... " + pila.poll());
		System.out.println("Quin ha estat el darrer en entrar? "+pila.peek());
		
	}
	private void provaPila() {

		PilaParametritzat<String> pila = new PilaParametritzat<>();
		System.out.println("La pila esta buida? "+pila.empty());
		for (int contador = 0; contador < 10; contador++) {
			pila.push(contador+"");
			//System.out.println(element.getInfo());
		}
		System.out.println("La pila esta buida? " + pila.empty());
		System.out.println("Quin ha estat el darrer en entrar? "+pila.peek());
		pila.pop();
		System.out.println("Quin ha estat el darrer en entrar? "+pila.peek());
		System.out.println("Provam un poll... " + pila.poll());
		System.out.println("Quin ha estat el darrer en entrar? "+pila.peek());
		
	}

	public static void main(String[] args) {
		Cronometre crono = new Cronometre();
		Proves proves = new Proves();
		// proves.provaOrdenacio();
		// proves.provaCercaBinaria();
		// proves.provaCercaBinaria(1000);
		proves.provaPila();

	}

}
