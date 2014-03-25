package exemples;

import java.util.ArrayList;

public class ProvesArrayList {

	public ArrayList<Modul> llistaModuls;


	public void proves() {
		llistaModuls.add(new Modul("Programacio", 10));
		llistaModuls.add(new Modul("Sistemes", 20));
		llistaModuls.add(new Modul("BDD", 20));
		llistaModuls.add(new Modul("llenguatges", 5));
		mostraLlista();
		/*recuperam el modul numero 3 i mostram per pantalla*/
		System.out.println("A la posicio 3 hi ha: " +llistaModuls.get(3).getNom());
		llistaModuls.remove(2);
		mostraLlistaIndex();
		Modul nou = new Modul("FOL", 5);
		llistaModuls.set(2,nou);
		mostraLlistaIndex();
		llistaModuls.remove(nou);
		mostraLlistaIndex();
		Modul altre = new Modul ("Entorns", 20);
		llistaModuls.set(1, altre);
		mostraLlistaIndex();
	}

	public void mostraLlistaIndex() {
		for (int index = 0; index < llistaModuls.size(); index++) {
			System.out.println(llistaModuls.get(index).getNom() + " "+ index);

		}

	}

	public void mostraLlista() {
		for(Modul modul : llistaModuls){
			System.out.println(modul.getNom());
		}

	}

	public static void main(String[] args) {
		ProvesArrayList exercici = new ProvesArrayList();
		exercici.proves();

	}

	public ProvesArrayList() {
		super();
		llistaModuls = new ArrayList<>();
	}

}
