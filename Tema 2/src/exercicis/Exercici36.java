/**

Exercici 36

* Escriviu una classe que generi dos vectors de sencers de la mateixa longitud i els inicialitzi.

Comparau-los amb una igualtat v1==v2. Funciona? Escriviu l'explicació per pantalla utilitzant un println.

Comparau-los correctament. Utilitzau una variable booleana per a guardar el resultat. 
Imprimiu un println que ens informi del resultat de la comparació.
		*/

package exercicis;

public class Exercici36 {

	public static void main(String[] args) {
		int[] v1 = new int[10];
		int[] v2 = new int[10];
		int index,contador;
		contador=1;
		for (index=0;index<(v1.length);index++){
			v1[index]=contador;
			v2[index]=contador;
			contador++;

		}
		boolean comparacio=true;
		for (index=0;index<(v1.length);index++) {
			if (v1[index]!=v2[index]){
				comparacio=false;
			}
		}
			if(comparacio){
				System.out.println("Són iguals.");}
				else {
					System.out.println("No són iguals.");
				}
			}
		}
	


