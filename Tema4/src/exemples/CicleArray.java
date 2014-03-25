package exemples;

public class CicleArray {
	private String nom;
	private int alumnes, horesSetmanals, numeroModuls;
	private Modul[] moduls;

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

	public CicleArray(String nom, int horesSetmanals, int maximModuls) {
		super();
		this.nom = nom;
		this.horesSetmanals = horesSetmanals;
		moduls = new Modul[maximModuls];
		setNumeroModuls(0);
	}

	public boolean afegirModul(Modul nou) {
		if (getNumeroModuls() < (moduls.length - 1)) {
			moduls[getNumeroModuls()] = nou;
			setNumeroModuls(getNumeroModuls() + 1);
			return true;
		} else {
			return false;
		}

	}

	public Modul tornaModul(String nom) {
		for (int contador = 0; contador < getNumeroModuls(); contador++) {
			if (moduls[contador].getNom() == nom) {
				return moduls[contador];
			}
		}

		return null;

	}
	public void mostrarModuls(){
		for (int contador=0; contador < getNumeroModuls(); contador++){
			System.out.println((contador +1)+" " + moduls[contador].getNom());
		}
	
	}

	public boolean esborrarModul(String nom) {
		System.out.println("Hi ha: " + getNumeroModuls() + " numero de moduls ");
		boolean estat = false;
		for (int contador = 0; contador < getNumeroModuls(); contador++) {
			if (moduls[contador].getNom() == nom) {
				estat = true;
				for (int contador1 = contador; contador1 < getNumeroModuls(); contador1++) {
					moduls[contador1] = moduls[(contador1 + 1)];
				}
				setNumeroModuls(getNumeroModuls() - 1);
				moduls[getNumeroModuls()] = null;
				System.out.println("Ara hi ha: " + getNumeroModuls()
						+ " numero de moduls ");

			} else {
				estat = false;
			}
		}

		return estat;
	}

	public int getNumeroModuls() {
		return numeroModuls;
	}

	public void setNumeroModuls(int numeroModuls) {
		this.numeroModuls = numeroModuls;
	}

}
