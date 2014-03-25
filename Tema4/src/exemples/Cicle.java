package exemples;

public class Cicle {
	private String nom;
	private int alumnes, horesSetmanals;

	public String getNom() {
		return nom;
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

	public int getHoresSetmanals() {
		return horesSetmanals;
	}

	public void setHoresSetmanals(int horesSetmanals) {
		this.horesSetmanals = horesSetmanals;
	}

	public Cicle(String nom, int horesSetmanals) {
		super();
		this.nom = nom;
		this.horesSetmanals = horesSetmanals;
	}

}
