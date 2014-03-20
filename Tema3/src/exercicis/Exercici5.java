/** Exercici 5

 * Copia la classe de l'exercici anterior i modifica-la de la seg�ent forma:
Crea un m�tode nou anomenat principal. Aquest m�tode far� tot el que abans es feia al main: mostrar les opcions, llegir la que ha pitjat l'usuari i per a cada una llegir les dades necess�ries i passar-les al m�tode adequat.
Des del main l'�nic que heu de fer �s cridar al m�tode principal.

 */
package exercicis;

public class Exercici5 {

	public void taula(int sencer) {
		System.out.println("La taula de multiplicar del: " + sencer);
		int contador = 0;
		for (; contador <= 10; contador++) {
			int resultat = sencer * contador;
			System.out.println(resultat);
		}

	}

	public void divisor(int sencer) {

		int contador;
		for (contador = sencer; contador > 0; contador--) {
			if ((sencer % contador) == 0) {
				System.out.println(contador);
			}
		}

	}

	public void fractorial(int numero) {
		do {
			if (numero < 0) {
				System.out.println("El nombre introduit no �s un natural.");
			}
		} while (numero < 0);

		int contador = numero - 1;
		int resultat = numero;
		System.out.println("El factorial de " + numero + " �s: ");
		for (; contador > 1; contador--) {
			resultat = resultat * contador;

		}
		System.out.println(resultat);

	}

	public void primer(int numero) {
		int contador;
		boolean primer = true;
		for (contador = (numero - 1); contador > 1; contador--) {
			if ((numero % contador) == 0) {
				System.out.println("El nombre no �s primer.");
				primer = false;
				break;
			}
		}
		if (primer == true) {
			System.out.println("El nombre introdu�t �s primer.");
		}

	}

	public void principal() {
		boolean flag;
		do {
			flag = true;
			switch (LlegirSencer.llegirSencer("\n| 1 -> multiplicar \n| 2 -> dividir \n| 3 -> fractorial \n| 4 -> num primer \n| 5 -> Sortir \n| : ")) {
			case 1:
				taula(LlegirSencer.llegirSencer("Escriu un numero per veure la seva taula: "));
				break;
			case 2:
				divisor(LlegirSencer.llegirSencer("Escriu un numero per treure els seus divisors: "));
				break;
			case 3:
				fractorial(LlegirSencer.llegirSencer("Escriu un numero per treure el seu fractorial: "));
				break;
			case 4:
				primer(LlegirSencer.llegirSencer("Escriu un numero per veure si es primer: "));
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Introdueix un nombre valid");
				break;
			}
		} while (flag == true);

	}

	public static void main(String[] args) {
		Exercici5 exercici = new Exercici5();
		exercici.principal();
	}

}
