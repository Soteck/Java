/** Exercici 9
 * 
 *Donats tres sencers mostra el valor m�xim i el m�nim.

 * @author Cristian

 */

package exercicis;

public class Exercici09 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 3;
		int maxim = a;
		int minim = a;

		if (b>maxim){
			maxim=b;}
		else if (b<minim) {
			minim=b;
		}
		
		if (c>maxim){
			maxim=c;}
		else if (c<minim) {
			minim=c;
		}
		
		System.out.println("El major �s " + maxim + " i el menor �s " + minim);
		
		
		
		
		
		
		
		
		
		
		
		}
	}
