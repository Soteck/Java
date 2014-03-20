/**

Exercici 37

* Escriviu un altre classe que generi aleatòriament la longitud de dos arrays(mínim 2). 
* Creau els arrays d'aquestes longituds i comparau-los. Evidentment si no tenen la mateixa longitud no són iguals.
		*/

package exercicis;

public class Exercici37 {

	public static void main(String[] args) {
		int numero=10 + (int)(Math.random() * ((20 - 10) + 1));
		int numero2=10 + (int)(Math.random() * ((20 - 10) + 1));
		int[] v1 = new int[numero];
		int[] v2 = new int[numero2];
		int index,contador;
		contador=1;
if ((v1.length)!=(v2.length)) {
	System.out.println("No són iguals.");
} else {
		for (index=0;index<(v1.length);index++){
			v1[index]=contador;
			v2[index]=contador;
			contador++;

		}
		boolean comparacio=true;
		for (index=0;index<(v1.length);index++) {
			if (v1[index]!=v2[index]){
				comparacio=false;
				break;
			}
		}
			if(comparacio){
				System.out.println("Són iguals.");}
				else {
					System.out.println("No són iguals.");
				}

	}
	}
}
