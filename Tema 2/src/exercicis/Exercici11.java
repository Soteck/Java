/** Exercici 11

* A l'exercici 5 afegeix el codi necessari per calcular l'IRPF. Suposa que si el salari no arriba a 300€ l'IRPF=10%, si esta entre 300 i 500 és el 20% i si és major o igual és el 30%. Mostra al final el salari brut, l'import de l'IRPF i el salari net.

* @author Cristian

*/

package exercicis;

public class Exercici11 {

	public static void main(String[] args) {
		int hores=33;
		double preu=15;
		double preuextra=preu*2;
		double sou;
		
		if (hores>40) {
			int extra=hores-40;
			double souextra=extra*preuextra;
			sou=(40*preu)+souextra;
			}
			else {
				sou=preu*hores;
				
				}
		double brut=sou;
		double net;
		double irpf;
		if (brut < 300) {
			irpf=brut*0.10;
			net=brut-irpf;
		}
		else if (brut < 500) {
			irpf=brut*0.20;
			net=brut-irpf;
		}
		else {
			irpf=brut*0.30;
			net=brut-irpf;
		}
		System.out.println("Sou net: " + net);
		System.out.println("Sou brut: " + brut);
		System.out.println("IRPF: " + irpf);
	}
}

