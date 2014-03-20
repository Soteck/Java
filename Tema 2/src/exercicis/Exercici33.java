/**

Exercici 33

* Mostra un numero aleatori entre 10 i 20. Per a generar els números aleatòriament pots utilitzar Math.random(). Torna un float entre 0 i 1 (no inclòs). Per obtenir un nombre dins el rang demanat [min, max] inclosos, hauràs de fer

Min + (int)(Math.random() * ((Max - Min) + 1))
en el noste cas per [10, 20]

10 + (int)(Math.random() * ((20 - 10) + 1)) 
o sigui 10 + (int)(Math.random() * 11
		*/

package exercicis;

public class Exercici33 {

	public static void main(String[] args) {
		int numero=10 + (int)(Math.random() * ((20 - 10) + 1));
		System.out.println(numero);

	}

}
