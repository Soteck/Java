package exemples;

import java.util.ArrayList;

public class Alumne {
	private ArrayList<Modul> matriculats;
	private ArrayList<Integer> notes;
	private int nExpedient;
	private String nom, llinatges;
	
	public int matricular(Modul modul){
		matriculats.add(modul);
		notes.add(matriculats.indexOf(modul), 0);
		return matriculats.indexOf(modul);
	}
	public void anotar(int index,int nota){
		notes.set(index, nota );
	}
	
	public void mostrarModuls(){
		for(Modul d : matriculats){
			System.out.println("Esta matriculat al modul "+d.getNom());
		}
	}
	public void mostrarNotes(){
		for(Modul d : matriculats){
			System.out.println("Modul " + d.getNom() + " amb la nota: ");
			System.out.println(notes.get(matriculats.indexOf(d)));
		}
	}

	
	public String getNom() {
		return nom;
	}

	public String getLlinatges() {
		return llinatges;
	}
	public int getExpedient() {
		return nExpedient;
	}

	
	public Alumne(String nom, String llinatges, int nExpedient) {
		super();
		matriculats = new ArrayList<>();
		notes= new ArrayList<>();
		this.nExpedient = nExpedient;
		this.nom = nom;
		this.llinatges = llinatges;
	}
	

}
