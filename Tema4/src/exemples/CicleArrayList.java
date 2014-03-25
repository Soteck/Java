package exemples;

import java.util.ArrayList;

public class CicleArrayList {
	private String nom;
	private int alumnes, maximModuls;
	public ArrayList<Modul> llistaModuls;

	public String getNom() {
		return nom;
	}

	public boolean afegirModul(Modul modul) {
		if (llistaModuls.size() < maximModuls) {
			llistaModuls.add(modul);
			return true;
		} else {
			
			return false;
		}

	}
	
	public void mostraLlista() {
		for(Modul modul : llistaModuls){
			System.out.println(modul.getNom());
		}

	}

	public Modul tornaModul(String titol) {
		for (Modul d : llistaModuls) {
			if (d.getNom() == titol) {
				return d;
			}
		}
		return null;

	}

	public boolean eliminaModul(String titol) {
		for (Modul d : llistaModuls) {
			if (d.getNom() == titol) {
				llistaModuls.remove(d);
				return true;
			}
		}
		return false;

	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAlumnes() {
		return alumnes;
	}

	public void setAlumnes(int alumnes) {
		this.alumnes = alumnes;
	}

	public CicleArrayList(String nom, int maximModuls) {
		super();
		this.nom = nom;
		llistaModuls = new ArrayList<>();
		this.maximModuls = maximModuls;
	}

}
