/** Exercici 7

 * Escriviu una classe que demani el nombre de notes d'un alumne i les guardi dins un array de double. 
 * Afegiu un mètode que mostri les notes i un altre que calculi la mitjana. 
 * Podeu utilitzar la classe UtilitatsTeclat per a demanar les dades a l'usuari.

 * @author Guillem Arrom

 */


package arrays;

import utilitats.UtilitatsConsola;

public class Exercici07 {
	public double media (double[] array){
		double mitja = 0 ;
		double suma = 0;
		int contador = 0;
		for (;contador<array.length; contador++){
			suma = suma + array[contador];
		}
		mitja = suma/contador;
		
		
		return mitja;
	}
	public void mostrar(double[] array){
		for (int contador = 0; contador<array.length; contador++){
			System.out.println("La nota numero "+ (contador+1)+" es " + array[contador]+".");
			
		}
		
		
	}

	public static void main(String[] args) {
		UtilitatsConsola utilitats = new UtilitatsConsola();
		Exercici07 exercici = new Exercici07();
		System.out.println("Benvingut");
		int n_notes = utilitats.llegirSencer("Diga'm quantes notes te l'alumne: ");
		double[] notes = new double[n_notes];
		for (int contador =0; contador <= (n_notes-1); contador++){
			notes[contador]=utilitats.llegirDouble("Escriume la nota nº " + (contador+1)+" ");			
		}
		exercici.mostrar(notes);
		double mitja = exercici.media(notes);
		
		System.out.println("La mitja es: " + mitja);
		
		

	}

}
