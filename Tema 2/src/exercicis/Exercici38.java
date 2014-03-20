/**

Exercici 38

*Escriviu una classe que ompli aleatòriament un un array de tres sencers i l'ordeni (com a l'exercici 12. 
*Heu d'assegurar-vos que l'array tengui tres posicions. 
*Si es pot ordenar ha de mostrar per pantalla l'array ordenat. Si no ha d'avisar que no ho pot ordenar.
		*/

package exercicis;

public class Exercici38 {

	public static void main(String[] args) {
		int[] v1 = new int[3];
		for (int index=0;index<(v1.length);index++){
			int numero=10 + (int)(Math.random() * ((20 - 10) + 1));
			v1[index]=numero;
			System.out.println(v1[index]);
		}
		int temporal,a,b,c;
		a=v1[0];
		b=v1[1];
		c=v1[2];
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
		v1[0]=a;
		v1[1]=b;
		v1[2]=c;
		System.out.println(" ");
		for (int index=0;index<(v1.length);index++){
			System.out.println(v1[index]);
		}
	}

}
