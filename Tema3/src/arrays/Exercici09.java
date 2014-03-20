/** Exercici 9

 * Tenim un hotel amb 20 habitacions, on les habitacions estan anomenades per lletres. 
 * Per a cada habitació volem saber quantes places té i a quina planta es troba.
 * Utilitzarem un vector noms per el nom de les habitacions(1 vector de caràcters) i 
 * una matriu dades de sencers de 20 files(1 per habitació) i 2 columnes( 
 * la primera per les places i la segona per la planta. Així si noms[1]=B dades[1][0] 
 * són les places de l'habitació B i dades[1][1] és la planta on es troba l'habitació.
 * 
Creau un mètode que inicialitzi la informació dels vectors. Si voleu podeu utilitzar Math.random();
Feis un mètode que mostri la llista de les habitacions amb tota la informació: nom, places i planta.
Creau un mètode que mostri el nom de totes les habitacions d'una determinada planta, 
passant-la com a paràmetre.

Escriviu un mètode que ens digui quantes habitacions tenim d'un determinat nombre de places 
i quines són.
Afegiu ara un vector de booleans que indiquin si les habitacions estan ocupades o no. 
Volem saber les habitacions d'un nombre determinat de places que tenim buides. 
Si no n'hi ha cap ens ha d'avisar.
 * @author Guillem Arrom

 */

package arrays;

import utilitats.UtilitatsConsola;

public class Exercici09 {
	public void rellenar(int[][] dades, String[] noms, boolean[] ocupacio) {
		char letra = 'A';
		// Bucle per ficar dades per tot
		for (int contador = 0; contador < noms.length; contador++, letra++) {
			noms[contador] = (letra + "");
			dades[contador][0] = 1 + (int) (Math.random() * ((6 - 1) + 1));
			dades[contador][1] = 0 + (int) (Math.random() * ((2 - 0) + 1));
			if ((0 + (int) (Math.random() * ((1 - 0) + 1))) == 0) {
				ocupacio[contador] = false;
			} else {
				ocupacio[contador] = true;
			}
		}

	}

	public void mostrarTot(int[][] dades, String[] noms, boolean[] ocupacio) {
		// Bucle per mostrar totes les habitacions
		for (int contador = 0; contador < noms.length; contador++) {
			System.out.print("La habitació " + noms[contador]
					+ " está en la planta número " + dades[contador][1]
					+ " i hi caben " + dades[contador][0] + " persones. ");
			if (ocupacio[contador]) {
				System.out.println("está ocupada");
			} else {
				System.out.println("Esta desocupada");
			}

		}

	}

	public void mostrarHabitacionsPlanta(int[][] dades, String[] noms,
			boolean[] ocupacio) {
		UtilitatsConsola utilitats = new UtilitatsConsola();
		int planta;
		// Deman el numero de la planta que volem mostrar
		do {
			planta = utilitats
					.llegirSencer("Quina planta voleu veure? (0 = pb)");
		} while ((planta <= 0) && (planta >= 3));
		// Miram habitacio per habitacio y comprovam si esta en la planta que li
		// hem indicat
		// Si es aixi, la mostra per pantalla
		for (int contador = 0; contador < noms.length; contador++) {
			if (dades[contador][1] == planta) {
				System.out.print("La habitació " + noms[contador]
						+ " está en la planta número " + dades[contador][1]
						+ " i hi caben " + dades[contador][0] + " persones. ");
				if (ocupacio[contador]) {
					System.out.println("está ocupada");
				} else {
					System.out.println("Esta desocupada");
				}
			}

		}

	}

	public void mostrarHabitacionsPlasa(int[][] dades, String[] noms,
			boolean[] ocupacio) {
		UtilitatsConsola utilitats = new UtilitatsConsola();
		int plasa;
		// Deman el numero de la planta que volem mostrar
		do {
			plasa = utilitats
					.llegirSencer("Quantes places voleu veure? (1 - 6)");
		} while ((plasa < 1) && (plasa > 6));
		// Miram habitacio per habitacio y comprovam si esta en la planta que li
		// hem indicat
		// Si es aixi, la mostra per pantalla
		for (int contador = 0; contador < noms.length; contador++) {
			if (dades[contador][0] == plasa) {
				System.out.print("La habitació " + noms[contador]
						+ " está en la planta número " + dades[contador][1]
						+ " i hi caben " + dades[contador][0] + " persones. ");
				if (ocupacio[contador]) {
					System.out.println("está ocupada");
				} else {
					System.out.println("Esta desocupada");
				}
			}

		}

	}

	public void comprovarBuides(int[][] dades, String[] noms, boolean[] ocupacio) {
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		boolean repetir = true;
		UtilitatsConsola utilitats = new UtilitatsConsola();
		Exercici09 exercici = new Exercici09();
		String[] noms = new String[20];
		int[][] dades = new int[20][2];
		boolean[] ocupacio = new boolean[20];
		exercici.rellenar(dades, noms, ocupacio);
		do {
			switch (utilitats
					.llegirSencer("| 1 -> mostrar totes les habitacions | 2 -> mostrar les habitacions de la planta | 3 -> mostrar les habitacions segons les places | 20 -> Sortir")) {
			case 1:
				exercici.mostrarTot(dades, noms, ocupacio);
				break;
			case 2:
				exercici.mostrarHabitacionsPlanta(dades, noms, ocupacio);
				break;
			case 3:
				exercici.mostrarHabitacionsPlasa(dades, noms, ocupacio);
				break;
			case 4:

				break;
			case 20:
				repetir = false;
				break;

			default:
				System.out.println("Valor erroni");
				break;
			}
		} while (repetir);

	}

}
