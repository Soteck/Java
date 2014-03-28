/** proves


 * @author Guillem Arrom

 */

package proves;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

import contenidors.ElementParametritzat;
import contenidors.ElementSencer;
import contenidors.PilaParametritzat;
import contenidors.PilaSencers;
import utilitats.Algorismes;
import utilitats.Cronometre;
import utilitats.OrdenacioCerca;
import utilitats.UtilitatsConsola;

public class Proves {

	public void mostraArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("Posició: " + i + " valor: " + a[i]);

		}

	}

	private void provaOrdenacio(Algorismes condicio) {
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
		if (condicio == Algorismes.QUICK_SORT) {
			crono.start();
			OrdenacioCerca.quickSort(array, 0, array.length - 1);
			crono.stop();
			System.out.println("Mostram array ordenat -quick - : ");
			mostraArray(array);
			System.out.println("Ha tardat: " + crono.temps() + "ms");
		} else if (condicio == Algorismes.BIMBOLLA) {

			crono.start();
			System.out.println("Mostram array ordenat - bimbolla - : ");
			OrdenacioCerca.bimbolla(array2);
			mostraArray(array2);
			crono.stop();
			System.out.println("Ha tardat: " + crono.temps() + "ms");

		} else {
			System.out.println("Error desconegut");
		}

		System.out.println("Error");

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
		System.out.println("La pila esta buida? " + pila.empty());
		for (int contador = 0; contador < 10; contador++) {
			pila.push(contador);
			// System.out.println(element.getInfo());
		}
		System.out.println("La pila esta buida? " + pila.empty());
		System.out.println("Quin ha estat el darrer en entrar? " + pila.peek());
		pila.pop();
		System.out.println("Quin ha estat el darrer en entrar? " + pila.peek());
		System.out.println("Provam un poll... " + pila.poll());
		System.out.println("Quin ha estat el darrer en entrar? " + pila.peek());

	}

	private void provaHashSet() {
		HashSet<Preferencia2> hash = new HashSet<>();
		Preferencia2 paella = new Preferencia2(0, "paella");
		System.out.println(hash.add(paella));
		Preferencia2 paella2 = new Preferencia2(0, "paellaaaa");
		System.out.println(hash.add(paella2));
		System.out
				.println("No s'hauria de tornar a inserir pero se ha inserit ja que lo que comprova es la posicio de memoria, que relment si es diferent");
		Preferencia2 pepino = new Preferencia2(1, "pepinos");
		System.out.println(hash.add(pepino));
		System.out.println("Hi ha la -paella2- al mapa? "
				+ hash.contains(paella2));
		for (Preferencia2 a : hash) {
			System.out.println(a.getPlato());
		}
		System.out.println("El tamañ del hash es: " + hash.size());
		System.out.println(hash.remove(paella));
		for (Preferencia2 a : hash) {
			System.out.println(a.getPlato());
		}
		System.out.println("esta buid? " + hash.isEmpty());

	}

	private void provaHashSet2() {
		HashSet<Preferencia2> hash = new HashSet<>();
		Preferencia2 paella = new Preferencia2(0, "paella");
		System.out.println(hash.add(paella));
		Preferencia2 paella2 = new Preferencia2(0, "paella");
		System.out.println(hash.add(paella2));
		System.out
				.println("No s'ha inserit perque gracies al hascode, comprova els valors per dedins i troba que no son iguals");
		Preferencia2 pepino = new Preferencia2(1, "pepinos");
		System.out.println(hash.add(pepino));
		System.out.println("Hi ha la -paella2- al mapa? "
				+ hash.contains(paella2));
		for (Preferencia2 a : hash) {
			System.out.println(a.getPlato());
		}
		System.out.println("El tamañ del hash es: " + hash.size());
		System.out.println(hash.remove(paella));
		for (Preferencia2 a : hash) {
			System.out.println(a.getPlato());
		}
		System.out.println("esta buid? " + hash.isEmpty());

	}

	private void provesHashMap() {
		HashMap<String, Preferencia> mapa = new HashMap<>();
		for (int index = 0; index < 3; index++) {
			Preferencia a = new Preferencia(index, index + " paella");
			mapa.put(a.getPlato(), a);
		}
		Preferencia prova = new Preferencia(10, "1 paella");
		System.out.println(mapa.put(prova.getPlato(), prova));
		System.out.println("hi ha la clau -1 paella- ? "
				+ mapa.containsKey("1 paella"));
		System.out.println("Aquest valor es al mapa? "
				+ mapa.containsValue(prova));
		System.out.println(mapa.get(prova.getPlato()).toString());
		System.out.println("Nem a mostrar tot el mapa");
		for (Preferencia d : mapa.values()) {
			System.out.println(d.toString());
		}
		System.out.println(mapa.size());
		System.out.println(mapa.remove(prova.getPlato()));
		System.out.println("El mapa es buid?" + mapa.isEmpty());

	}

	private void provaCoaArrayDeque() {
		ArrayDeque<String> array = new ArrayDeque<>();
		System.out.println("Esta buid? " + array.isEmpty());
		for (int contador = 0; contador < 10; contador++) {
			array.add(contador + "");
		}

		System.out.println("Esta buid? " + array.isEmpty());
		System.out.println("Quants nhi ha? " + array.size());
		System.out.println(array.remove());
		System.out.println("Quants nhi ha? " + array.size());
		System.out.println(array.element());
		array.clear();
		System.out.println("Quants nhi ha? " + array.size());

	}

	private void provaPila() {

		PilaParametritzat<String> pila = new PilaParametritzat<>();
		System.out.println("La pila esta buida? " + pila.empty());
		for (int contador = 0; contador < 10; contador++) {
			pila.push(contador + "");
			// System.out.println(element.getInfo());
		}
		System.out.println("La pila esta buida? " + pila.empty());
		System.out.println("Quin ha estat el darrer en entrar? " + pila.peek());
		pila.pop();
		System.out.println("Quin ha estat el darrer en entrar? " + pila.peek());
		System.out.println("Provam un poll... " + pila.poll());
		System.out.println("Quin ha estat el darrer en entrar? " + pila.peek());

	}

	public static void main(String[] args) {
		Cronometre crono = new Cronometre();
		Proves proves = new Proves();
		// proves.provaOrdenacio();
		// proves.provaCercaBinaria();
		// proves.provaCercaBinaria(1000);
		// proves.provaPila();
		// proves.provaCoaArrayDeque();
		// proves.provaHashSet2();
		proves.provesHashMap();

	}

}
