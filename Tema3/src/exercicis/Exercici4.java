/** Exercici 4
 * 
 * Realitzau un programa que mostri les següents opcions:
Mostrar la taula de multiplicar d'un nombre donat.
Mostrar els divisors d'un nombre.
Calcular el factorial d'un nombre.
Comprovar si un nombre és primer o no.
Acabar .
Per a cada una d'elles heu de crear un mètode que faci els càlculs necessaris.
El main s'encarregarà de mostrar les opcions, llegir la que ha pitjat l'usuari i per a 
cada una llegir les dades necessàries i passar-les al mètode adequat.
Per llegir sencers podeu utilitzar la plantilla PlantillaLlegirSencers.
Els mètodes que implementin les dues darreres opcions no han de mostrar res per pantalla, 
han de tornar el valor adequat i que sigui el main el que ho mostri.
 
 * @author Guillem Arrom

 */

package exercicis;

public class Exercici4 {

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
				System.out.println("El nombre introduit no és un natural.");
			}
		} while (numero < 0);

		int contador = numero - 1;
		int resultat = numero;
		System.out.println("El factorial de " + numero + " és: ");
		for (; contador > 1; contador--) {
			resultat = resultat * contador;

		}
		System.out.println(resultat);

	}

	public void primer(int numero) {
		int contador;
		boolean primer=true;
		for (contador=(numero-1);contador>1;contador--){
			if ((numero%contador) == 0){
				System.out.println("El nombre no és primer.");
				primer=false;
				break;
			}
		}
			if (primer==true){
				System.out.println("El nombre introduït és primer.");
			}

	}

	public static void main(String[] args) {
		Exercici4 exercici = new Exercici4();
		boolean flag;
		do {
			flag = true;
			switch (LlegirSencer.llegirSencer("\n| 1 -> multiplicar \n| 2 -> dividir \n| 3 -> fractorial \n| 4 -> num primer \n| 5 -> Sortir \n| : ")) {
			case 1:
				exercici.taula(LlegirSencer.llegirSencer("Escriu un numero per veure la seva taula: "));
				break;
			case 2:
				exercici.divisor(LlegirSencer.llegirSencer("Escriu un numero per treure els seus divisors: "));
				break;
			case 3:
				exercici.fractorial(LlegirSencer.llegirSencer("Escriu un numero per treure el seu fractorial: "));
				break;
			case 4:
				exercici.primer(LlegirSencer.llegirSencer("Escriu un numero per veure si es primer: "));
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

}
