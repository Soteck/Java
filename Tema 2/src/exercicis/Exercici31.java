/** Exercici 31

*Donada una frase comprovau si �s un pal�ndrom, �s a dir sim�trica, com pot ser

S'�s o no s'�s

per evitar problemes amb espais i maj�scules podeu tractar pr�viament la cadena amb una instrucci� com

cadena=cadena.replaceAll(" ", "").toLowerCase();

 * @author Cristian

 */

package exercicis;

public class Exercici31 {

	public static void main(String[] args) {
		String frase = "Ses o no ses";
		frase=frase.replaceAll(" ", "").toLowerCase();
		System.out.println(frase);
		int posicio;
		int comparacio=frase.length()-1;
		boolean palindrom=true;
		for (posicio=0; posicio<=(frase.length()-1);posicio++){
			if (frase.charAt(posicio)!=frase.charAt(comparacio)){
				palindrom=false;
				break;
			}
			comparacio--;
		}
		if (palindrom==true){
			System.out.println("�s palindrom");
		} else {
			System.out.println("No �s palindrom");
		}
	}

}
