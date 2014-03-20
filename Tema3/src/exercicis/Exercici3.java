/** Exercici 3

 * Realitzau un programa que mostri les seg�ents opcions.
	Trobar el major de dos sencers.
	Trobar el major de tres sencers.
	Mostrar la relaci� entre dos sencers a<b o a=b o a> b
	Acabar.
Per a cada una d'elles heu de crear un m�tode que faci els c�lculs necessaris. El main s'encarregar� de
	Mostrar les opcions.
	Llegir la que ha pitjat l'usuari.
	Per a cada opci� llegir les dades necess�ries.
	Cridar al m�tode adequat passant-li les dades necess�ries com a par�metres.

 * @author Guillem Arrom

 */

package exercicis;

public class Exercici3 {

	public void major(int a, int b) {

		if (a > b) {
			System.out.println("El major �s " + a);
		}

		else if (b > a) {
			System.out.println("El major �s " + b);
		} else {
			System.out.println("S�n iguals");
		}

	}

	public void major3(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("El major �s " + a);
		} else if (b > a && b > c) {
			System.out.println("El major �s " + b);
		} else if (c > a && c > b) {
			System.out.println("El major �s " + c);
		} else if (a == b && a > c) {
			System.out.println(a + " (a) i " + b
					+ " (b) s�n iguals i son els majors.");
		} else if (a == c && a > b) {
			System.out.println(a + " (a) i " + c
					+ " (c) s�n iguals i son els majors.");
		} else if (b == c && c > a) {
			System.out.println(b + " (b) i " + c
					+ " (c) s�n iguals i son els majors.");
		} else {
			System.out.println("els tres s�n iguals");
		}

	}

	public void relacio(int a, int b) {
		if (a > b) {
			System.out.println("(a) " + a + " > " + b + " (b)");
		} else if (b > a) {
			System.out.println("(a) " + a + " < " + b + " (b)");
		} else {
			System.out.println("(a) " + a + " = " + b + " (b)");
		}
	}

	public static void main(String[] args) {
		Exercici3 exercici = new Exercici3();
		boolean flag;
		do {
			flag = true;
			switch (LlegirSencer
					.llegirSencer("| 1 -> Comprovar major de 2 \n| 2 -> comprovar major de 3 \n| 3 -> comprovar relacio entre 2 nombres \n| 4 -> Sortir \n| : ")) {
			case 1:
				exercici.major(LlegirSencer.llegirSencer("Introdueix el valor a :"),
						LlegirSencer.llegirSencer("Introdueix el valor b :"));
				break;
			case 2:
				exercici.major3(LlegirSencer.llegirSencer("Introdueix el valor a :"),
						LlegirSencer.llegirSencer("Introdueix el valor b :"),
						LlegirSencer.llegirSencer("Introdueix el valor c :"));
				break;
			case 3:
				exercici.relacio(LlegirSencer.llegirSencer("Introdueix el valor a :"),
						LlegirSencer.llegirSencer("Introdueix el valor b :"));
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("Valor erroni.");
				flag = false;
				break;

			}

		} while (flag == true);

	}
}
