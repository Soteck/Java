package exemples;

import java.util.ArrayList;

public class Institut {

	public static void main(String[] args) {

		// /////////////////////////////
		// Proves de Cicle            //
		// /////////////////////////////

		/*
		 * Modul programacio; Cicle daw; daw = new Cicle("DAW", 30); programacio
		 * = new Modul("pepe", 2); programacio.setNom("pepe");
		 * programacio.setHoresSetmanals(2);
		 * 
		 * System.out.println(programacio.getNom() +
		 * programacio.getHoresSetmanals()); System.out.println(programacio);
		 * System.out.println(programacio.toString());
		 * System.out.println(daw.getNom
		 * ()+" "+daw.getHoresSetmanals()+" "+daw.getAlumnes());
		 */

		// /////////////////////////////
		// Proves de CicleArray       //
		// /////////////////////////////

		/*
		 * //cream 2 moduls Modul modul = new Modul("Programacio", 10); Modul
		 * modul2 = new Modul("Sistemes", 30); //cream un cicle CicleArray cicle
		 * = new CicleArray("DAW", 20, 5); //afegim els dos moduls al cicle
		 * cicle.afegirModul(modul); cicle.afegirModul(modul2); //demanam el
		 * modul amb un nom i ho mostram si se ha trobat Modul modul3 =
		 * cicle.tornaModul("Programacio"); if (modul3 == null) {
		 * System.out.println("Modul no trobat"); } else {
		 * System.out.println(modul3.getNom()); } //esborram el modul amb el nom
		 * indicat i mostram per pantalla el bolea (true si sa esborrat, //false
		 * si no) cicle.mostrarModuls();
		 * System.out.println(cicle.esborrarModul("Programacio"));
		 * cicle.mostrarModuls(); //Cercam el modul amb el mateix nom que
		 * l'anterior, teoricament no l'auria de trobar Modul modul4 =
		 * cicle.tornaModul("Programacio"); if (modul4 == null) {
		 * System.out.println("Modul no trobat"); } else {
		 * System.out.println(modul3.getNom()); } //tornam a afegir el primer
		 * modul i ho mostram, aixi es comprova que no hi ha cap error i que el
		 * troba cicle.afegirModul(modul); Modul modul5 =
		 * cicle.tornaModul("Sistemes"); if (modul5 == null) {
		 * System.out.println("Modul no trobat"); } else {
		 * System.out.println(modul5.getNom()); }
		 */

		// /////////////////////////////
		// Proves de CicleArrayList   //
		// /////////////////////////////
		String nomCicles = "S1W";
		int maximModulsCicles = 6;
		CicleArrayList cicles = new CicleArrayList(nomCicles, maximModulsCicles);
		AlumnesArrayList alumnes = new AlumnesArrayList();
		if (cicles.afegirModul(new Modul("Sistemes", 20))) {
			System.out.println("Modul sistemes afegit amb exit");
		} else {
			System.out.println("Adhesio del modul de sistemes ha fallat");
		}
		if (cicles.afegirModul(new Modul("FOL", 10))) {
			System.out.println("Modul fol afegit amb exit");
		} else {
			System.out.println("Adhesio del modul de fol ha fallat");
		}
		if (cicles.afegirModul(new Modul("LLDM", 10))) {
			System.out.println("Modul lldm afegit amb exit");
		} else {
			System.out.println("Adhesio del modul de lldm ha fallat");
		}
		if (cicles.afegirModul(new Modul("PRO", 20))) {
			System.out.println("Modul pro afegit amb exit");
		} else {
			System.out.println("Adhesio del modul de pro ha fallat");
		}
		if (cicles.afegirModul(new Modul("ENTORNS", 20))) {
			System.out.println("Modul entorns afegit amb exit");
		} else {
			System.out.println("Adhesio del modul de entorns ha fallat");
		}
		if (cicles.afegirModul(new Modul("BDD", 20))) {
			System.out.println("Modul bdd afegit amb exit");
		} else {
			System.out.println("Adhesio del modul de bdd ha fallat");
		}
		if (cicles.afegirModul(new Modul("peta", 20))) {
			System.out.println("Modul peta afegit amb exit");
		} else {
			System.out.println("Adhesio del modul de peta ha fallat");
		}
		
		System.out.println();
		//probant el tornamodul
		System.out.println("Tornarem el modul amb nom sistemes" + cicles.tornaModul("Sistemes").getNom());
		//robant el eliminamodul
		cicles.mostraLlista();
		System.out.println("Eliminam el modul BDD" + " " +cicles.eliminaModul("BDD"));
		cicles.mostraLlista();
		//probant alumnes...
		
		System.out.println();
		System.out.println("Probant alumnes");
		//cream un alumne
		Alumne joan = new Alumne("Joan", "prueba", 654564856);
		//el matriculam
		int inpro = joan.matricular(cicles.tornaModul("PRO"));
		//li posam nota
		joan.anotar(inpro, 10);
		int insin = joan.matricular(cicles.tornaModul("Sistemes"));
		joan.anotar(insin, 10);
		System.out.println("Mostrant moduls: ");
		joan.mostrarModuls();
		System.out.println("Mostrant notes: ");
		joan.mostrarNotes();
		//cream un altre alumne
		Alumne tomeu = new Alumne("Tomeu", "prueba", 223123);
		inpro = joan.matricular(cicles.tornaModul("PRO"));
		joan.anotar(inpro, 2);
		insin = joan.matricular(cicles.tornaModul("Sistemes"));
		joan.anotar(insin, 4);
		
		//afegim els alumnes a l'arraylist d'alumnes
		alumnes.afegirAlumne(joan);
		alumnes.afegirAlumne(tomeu);
		//mostram els alumnes
		alumnes.mostrarAlumnes();
		
		
		
		



	}

}
