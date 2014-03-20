package utilitats;

public class prova {

	public static void main(String[] args) {
		UtilitatsConsola utilitats = new UtilitatsConsola();

		String[] opcions = { "Opcio 1", "Opcio 2 " };

		int resultat;
		resultat = utilitats.gestionarMenu("Titol del menu", opcions,
				"Elegeix el menu");
		System.out.println(resultat);

	}

}
