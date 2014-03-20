/** Exercici 12

* Donats tres números, a, b i c ordena-los de forma que al final a<=b<=c.

* @author Cristian

*/

package exercicis;

public class Exercici12 {

	public static void main(String[] args) {
		int a=9;
		int b=8;
		int c=7;
		int temporal;
		
		if (a>b){
			temporal=a;
			a=b;
			b=temporal;
		}
		if (a>c){
			temporal=a;
			a=c;
			c=temporal;
		}
		if (b>c){
			temporal=b;
			b=c;
			c=temporal;
		}
		System.out.println(a + " " + b + " "+ c);
	}

}
