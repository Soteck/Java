/** Exercici 7
 * 
*Repeteix l'exercici anterior amb tres sencers.

* @author Cristian

*/

package exercicis;

public class Exercici07 {

	public static void main(String[] args) {

		int a=7;
		int b=7;
		int c=7;
		
		if (a>b && a>c)
		{
			System.out.println("El major �s a.");}
		else if (b>a && b>c)
		{			System.out.println("El major �s b.");}
		else if (c>a && c>b)
		{			System.out.println("El major �s c.");}
		else if (a==b && a>c)
		{		System.out.println("a i b s�n iguals i son els majors.");}
		else if (a==c && a>b)
		{		System.out.println("a i c s�n iguals i son els majors.");}
		else if (b==c && c>a)
		{		System.out.println("b i c s�n iguals i son els majors.");}
		else
		{		System.out.println("A, b i c s�n iguals");}


	}

}
