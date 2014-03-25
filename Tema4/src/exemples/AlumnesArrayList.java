package exemples;

import java.util.ArrayList;

public class AlumnesArrayList {
	private ArrayList<Alumne> alumnes;

	public void afegirAlumne(Alumne alumne) {
		alumnes.add(alumne);
	}

	public boolean modificarAlumne(int expedient, Alumne alumne) {
		int index = 0;
		for (Alumne d : alumnes) {
			if (d.getExpedient() == expedient) {
				index = alumnes.indexOf(d);
			} else {
				return false;
			}
		}
		alumnes.add(index, alumne);
		return true;
	}
	
	public void mostrarAlumnes(){
		for (Alumne d : alumnes){
			System.out.println("Nom: "+d.getNom()+" " +d.getLlinatges()+" amb l'expedient: "+ d.getExpedient()  );
		}
	}
	


	public AlumnesArrayList() {
		super();
		alumnes = new ArrayList<>();

	}

}
