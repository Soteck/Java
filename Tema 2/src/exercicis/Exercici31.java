/** Exercici 31

*Donada una frase comprovau si és un palíndrom, és a dir simètrica, com pot ser

S'és o no s'és

per evitar problemes amb espais i majúscules podeu tractar prèviament la cadena amb una instrucció com

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
			System.out.println("És palindrom");
		} else {
			System.out.println("No és palindrom");
		}
	}

}
